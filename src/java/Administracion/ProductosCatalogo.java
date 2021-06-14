package Administracion;

/**
 *
 * @author Bamb&fork
 */
public class ProductosCatalogo {
    private String claveProducto, Nombre, Descripcion;
    
    public ProductosCatalogo(String claveProducto, String Nombre, String Descripcion){
        this.claveProducto = claveProducto;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public String getClaveProducto() {
        return claveProducto;
    }

    public void setClaveProducto(String claveProducto) {
        this.claveProducto = claveProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
}
