package ro.unibuc.lab11.diplomas.repository;

import ro.unibuc.lab11.diplomas.model.Diploma;

import java.util.List;

public interface DiplomaRepository {

    void save(Diploma diploma);

    List<Diploma> getAll();

}
