
package cr.com.gm.dao;

import cr.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaDao extends CrudRepository<Persona, Long> {
    
}
