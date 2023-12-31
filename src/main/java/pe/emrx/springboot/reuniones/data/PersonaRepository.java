package pe.emrx.springboot.reuniones.data;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.emrx.springboot.reuniones.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
