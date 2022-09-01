
package cr.com.gm.services;

import cr.com.gm.dao.PersonaDao;
import cr.com.gm.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceImplements implements  PersonaService{

    @Autowired
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> ListarPersona() {
    return (List<Persona>) personaDao.findAll();
    }

    @Override
    public void guardarPersona(Persona persona) {
       personaDao.save(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.delete(persona);
    }  

    @Override
    public Persona encontrarPersona(Persona persona) {
       return personaDao.findById(persona.getIdPersona()).orElse(persona);
    }
    
}
