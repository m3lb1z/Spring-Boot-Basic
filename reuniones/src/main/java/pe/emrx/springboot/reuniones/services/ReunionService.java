package pe.emrx.springboot.reuniones.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import pe.emrx.springboot.reuniones.data.ReunionRepository;
import pe.emrx.springboot.reuniones.models.Reunion;

@Service
public class ReunionService {

    private final ReunionRepository reunionRepository;

    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }

    public List<Reunion> getAllReuniones() {
        return reunionRepository.findAll();
    }

    public Optional<Reunion> getById(long id) {
        return reunionRepository.findById(id);
    }
}
