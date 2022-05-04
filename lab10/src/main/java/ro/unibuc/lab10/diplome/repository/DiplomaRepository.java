package ro.unibuc.lab10.diplome.repository;

import ro.unibuc.lab10.diplome.model.Diploma;

import java.util.List;

public interface DiplomaRepository {

    void save(Diploma diploma);

    List<Diploma> getAll();

}
