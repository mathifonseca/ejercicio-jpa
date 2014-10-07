package ejercicio.jpa.ejb;

import ejercicio.jpa.domain.Compra;
import ejercicio.jpa.domain.Producto;
import ejercicio.jpa.domain.Usuario;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@LocalBean
public class SistemaBean {
    
    @PersistenceContext
    EntityManager em;
    
    private List<Producto> listaProductos;
    private List<Compra> listaCompras;
    private List<Usuario> listaUsuarios;
    
    @PostConstruct
    private void init() {
        
        Usuario u = new Usuario();
        u.setNombre("Juan");
        
        em.persist(u);
        
        //EJEMPLO
        
        //select * from compra where id = 1
        Compra c = em.find(Compra.class, 1);
        
        //select * from usuario
        List<Usuario> lista = em.createQuery("select u from Usuario u").getResultList();
        
        //select * from usuario where name = 'juan'
        int edadUsuario = 10;
        Usuario us = (Usuario) em.createQuery("select u from Usuario u where u.edad > :edadUsuario")
                .setParameter("nombreUsuario", "Juan")
                .setParameter("edadUsuario", 10)
                .getSingleResult();
        
        
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    void agregarCompra(Compra c) {
        listaCompras.add(c);
    }

}