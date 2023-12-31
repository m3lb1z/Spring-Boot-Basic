package pe.emrx.springboot.reuniones.data;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.emrx.springboot.reuniones.models.Reunion;

public interface ReunionRepository extends JpaRepository<Reunion, Long> {
    
}
