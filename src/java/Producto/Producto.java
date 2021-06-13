package Producto;

/**
 *
 * @author Bambi&Fork
 */
public class Producto {
    
    private String nombreProd, descripcionProd, marcaProd, categoriaProd, imagen;
    private int cantidad,claveProdcto;
    private double costoProd, precioProd;
    
    public Producto(int claveProdcto, int cantidad, String nombreProd, String descripcionProd, String marcaProd, String categoriaProd, double costoProd, double precioProd, String imagen){
        this.claveProdcto = claveProdcto;
        this.cantidad = cantidad;
        this.nombreProd = nombreProd;
        this.descripcionProd = descripcionProd;
        this.marcaProd = marcaProd;
        this.categoriaProd = categoriaProd;
        this.imagen = imagen;
        this.costoProd = costoProd;
        this.precioProd = precioProd;
        
    }

    public int getClaveProdcto() {
        return claveProdcto;
    }

    public void setClaveProdcto(int claveProdcto) {
        this.claveProdcto = claveProdcto;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getDescripcionProd() {
        return descripcionProd;
    }

    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    public String getMarcaProd() {
        return marcaProd;
    }

    public void setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
    }

    public String getCategoriaProd() {
        return categoriaProd;
    }

    public void setCategoriaProd(String categoriaProd) {
        this.categoriaProd = categoriaProd;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCostoProd() {
        return costoProd;
    }

    public void setCostoProd(double costoProd) {
        this.costoProd = costoProd;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }
    
    
}
