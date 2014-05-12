package com.logica.sb;

import com.persistencia.entity.User;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class UserSB {
    
    @PersistenceContext
    EntityManager em;
    
    public void crearPersona(String nombre) {
        
        User p = new User();
        
        p.setFirstName(nombre);
        
        em.persist(p);
        
    }

}
