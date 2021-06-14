package Administracion;

/**
 *
 * @author Bamb&fork
 */
public class ProductosCatalogo {
    private String claveProducto, nombre, descripcion;
    
    public ProductosCatalogo(String claveProducto, String nombre, String descripcion){
        this.claveProducto = claveProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getClaveProducto() {
        return claveProducto;
    }

    public void setClaveProducto(String claveProducto) {
        this.claveProducto = claveProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }
    
    
}
