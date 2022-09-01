
package cr.com.gm.controler;

import cr.com.gm.domain.Persona;
import cr.com.gm.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class Controlador {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var personas = personaService.ListarPersona();
        
        model.addAttribute("personas", personas);
        return "index";
    }
    
    
    @GetMapping("/agregar")
    public String modificar(Persona persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardarPersona(Persona persona){
        personaService.guardarPersona(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPersona}")
    public String editarPersona(Persona persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar")
    public String eliminar (Persona persona){
        personaService.eliminarPersona(persona);
        return "redirect:/";
    }
}
