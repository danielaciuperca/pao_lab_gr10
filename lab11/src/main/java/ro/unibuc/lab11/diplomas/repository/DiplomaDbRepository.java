package ro.unibuc.lab11.diplomas.repository;

import ro.unibuc.lab11.diplomas.config.DbConnection;
import ro.unibuc.lab11.diplomas.model.Diploma;
import ro.unibuc.lab11.diplomas.model.Specialization;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    In DiplomaDbRepository vom defini toate query-urile pentru entitatea Diploma

    java.sql
    Connection
    Statement
    PreparedStatement
    ResultSet

 */
public class DiplomaDbRepository implements DiplomaRepository {

    private Connection connection;

    public DiplomaDbRepository() throws SQLException {
        this.connection = DbConnection.getInstance();
    }


    @Override
    public void save(Diploma diploma) {
        String query = "insert into diplomas values (null, ?, ?, ?, ?, ?, ?)";
        // try with resources

        try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, diploma.getSeries());
            preparedStatement.setString(2, diploma.getGraduate());
            preparedStatement.setInt(3, diploma.getYear());
            preparedStatement.setString(4, diploma.getFaculty());
            preparedStatement.setString(5, diploma.getSpecialization().toString());
            preparedStatement.setDouble(6, diploma.getGrade());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Diploma> getAll() {
        List<Diploma> diplomas = new ArrayList<>();
        String query = "select * from diplomas";
        try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                // citesc atributele pt fiecare record intors de select
                String series = resultSet.getString(2);
                String graduate = resultSet.getString("graduate");
                int year = resultSet.getInt("year");
                String faculty = resultSet.getString("faculty");
                String specialization = resultSet.getString("specialization");
                double grade = resultSet.getDouble("grade");
                diplomas.add(new Diploma(series, graduate, year, faculty, Specialization.valueOf(specialization), grade));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return diplomas;
    }
}
