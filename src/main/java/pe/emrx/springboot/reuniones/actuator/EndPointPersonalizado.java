package pe.emrx.springboot.reuniones.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "personalizado")
public class EndPointPersonalizado {
    
    @ReadOperation
    public String getActuatorPersonalizado() {
        return "Bienvenido a mi endpoint personalizado";
    }

}
