package ejercicio.jpa.ejb;

import ejercicio.jpa.domain.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class ProductoBean {
    
    @EJB
    SistemaBean sistema;
    
    public List<Producto> buscarProductoPorNombre(String nombre) {
        
        List<Producto> resultados = new ArrayList<>();
        
        for (Producto p : sistema.getListaProductos()) {
            
            if (p.getNombre().contains(nombre)) {
                
                resultados.add(p);
                
            }
            
        }
        
        return resultados;
        
    }
    
    public List<Producto> buscarProductoPorPrecioMayorA(Float min) {
        
        List<Producto> resultados = new ArrayList<>();
        
        for (Producto p : sistema.getListaProductos()) {
            
            if (p.getPrecio() > min) {
                resultados.add(p);
            }
            
        }
        
        return resultados;
        
    }
    
    public List<Producto> buscarProductoPorPrecioEntre(Float min, Float max) {
        
        List<Producto> resultados = new ArrayList<>();
        
        for (Producto p : sistema.getListaProductos()) {
            
            if (p.getPrecio() > min && p.getPrecio() < max) {
                resultados.add(p);
            }
            
        }
        
        return resultados;
        
    }

}