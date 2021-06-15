package Venta;

/**
 *
 * @author Equipo 1 Bambi & Fork
 */
public class Venta {
    
    private int claveVta, claveClt;
    private String fecha, listaProd,nombre;
    private double montoTotal, montoPagado;
    
    public Venta(int claveVta, int claveClt, double montoTotal, double montoPagado, String fecha, String listaProd, String nombre){
        this.claveVta = claveVta;
        this.claveClt = claveClt;
        this.montoTotal = montoTotal;
        this.montoPagado = montoPagado;
        this.fecha = fecha;
        this.listaProd = listaProd;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClaveVta() {
        return claveVta;
    }

    public void setClaveVta(int claveVta) {
        this.claveVta = claveVta;
    }

    public int getClaveClt() {
        return claveClt;
    }

    public void setClaveClt(int claveClt) {
        this.claveClt = claveClt;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getListaProd() {
        return listaProd;
    }

    public void setListaProd(String listaProd) {
        this.listaProd = listaProd;
    }
    
    
    
    
    
}
