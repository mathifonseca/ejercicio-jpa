package ejercicio.jpa.domain;

import java.math.BigDecimal;

public class Producto {
    
    private String nombre;
    private Float precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
}