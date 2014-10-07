package ejercicio.jpa.domain;

import java.util.List;

public class Usuario {
    
    private String nombre;
    private List<Compra> listaCompras;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }
    
}