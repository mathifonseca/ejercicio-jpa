package ejercicio.jpa.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Compra {
    
    private Date date;
    private Usuario usuario;
    private List<Producto> productos;
    private Float total;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
    
}