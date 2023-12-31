package pe.emrx.springboot.reuniones.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.emrx.springboot.reuniones.services.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String getAllReuniones(Model model) {
        model.addAttribute("personas", personaService.getAllPersonas());
        return "personas";
    }
    
}
