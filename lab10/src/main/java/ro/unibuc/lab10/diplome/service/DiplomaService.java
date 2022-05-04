package ro.unibuc.lab10.diplome.service;

import ro.unibuc.lab10.diplome.model.Diploma;
import ro.unibuc.lab10.diplome.repository.DiplomaInMemoryRepository;
import ro.unibuc.lab10.diplome.repository.DiplomaRepository;

import java.util.List;

public class DiplomaService {
    private DiplomaRepository diplomaRepository = new DiplomaInMemoryRepository();

    public void save(Diploma diploma) {
        diplomaRepository.save(diploma);
    }

    public List<Diploma> getAll() {
        return diplomaRepository.getAll();
    }
}
