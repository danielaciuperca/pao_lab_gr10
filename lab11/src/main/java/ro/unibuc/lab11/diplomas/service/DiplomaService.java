package ro.unibuc.lab11.diplomas.service;

import ro.unibuc.lab11.diplomas.model.Diploma;
import ro.unibuc.lab11.diplomas.repository.DiplomaInMemoryRepository;
import ro.unibuc.lab11.diplomas.repository.DiplomaRepository;

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
