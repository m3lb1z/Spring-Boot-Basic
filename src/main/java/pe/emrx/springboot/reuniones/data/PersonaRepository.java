package pe.emrx.springboot.reuniones.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import pe.emrx.springboot.reuniones.models.Persona;

@RepositoryRestResource(path = "personas")
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
