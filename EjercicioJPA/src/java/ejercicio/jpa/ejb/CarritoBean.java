package ejercicio.jpa.ejb;

import ejercicio.jpa.domain.Compra;
import ejercicio.jpa.domain.Producto;
import ejercicio.jpa.domain.Usuario;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;

@Stateful
@LocalBean
public class CarritoBean {
    
    Usuario usuario;
    List<Producto> productos;
    
    @EJB
    SistemaBean sistema;
    
    @EJB
    ProductoBean productoBean;
    
    public void login(String nombreUsuario) {
        
        for (Usuario u : sistema.getListaUsuarios()) {
            
            if (u.getNombre().equals(nombreUsuario)) {
                
                usuario = u;
                
            }
            
        }
        
    }
    
    public void agregarProducto(String nombre, int cantidad) {
        
        List<Producto> resultados = productoBean.buscarProductoPorNombre(nombre);
        
        if (resultados.size() == 1) {
            
            while (cantidad > 0) {
                
                productos.add(resultados.get(0));
                
                cantidad--;
                
            }
            
        }
        
    }
    
    public void registrarCompra() {
        
        Compra c = new Compra();
        
        c.setUsuario(usuario);
        c.setProductos(productos);
        c.setDate(new Date());
        
        Float total = 0F;
        
        for (Producto p : productos) {
            
            total += p.getPrecio();
            
        }
        
        c.setTotal(total);
        
        sistema.agregarCompra(c);
        
    }

}