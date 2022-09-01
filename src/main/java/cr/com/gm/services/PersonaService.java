
package cr.com.gm.services;

import cr.com.gm.domain.Persona;
import java.util.List;


public interface PersonaService {
    
    
    public List<Persona>ListarPersona();
    
    
    public void guardarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
