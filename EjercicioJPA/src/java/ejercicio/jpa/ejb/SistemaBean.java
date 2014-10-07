package ejercicio.jpa.ejb;

import ejercicio.jpa.domain.Compra;
import ejercicio.jpa.domain.Producto;
import ejercicio.jpa.domain.Usuario;
import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;

@Singleton
@LocalBean
public class SistemaBean {
    
    private List<Producto> listaProductos;
    private List<Compra> listaCompras;
    private List<Usuario> listaUsuarios;

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