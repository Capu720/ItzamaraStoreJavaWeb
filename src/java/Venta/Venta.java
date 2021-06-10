package Venta;

/**
 *
 * @author Equipo 1 Bambi & Fork
 */
public class Venta {
    
    private int claveVta, claveClt, montoTotal, montoPagado;
    private String fecha, listaProd;
    
    public Venta(int claveVta, int claveClt, int montoTotal, int montoPagado, String fecha, String listaProd){
        this.claveVta = claveVta;
        this.claveClt = claveClt;
        this.montoTotal = montoTotal;
        this.montoPagado = montoPagado;
        this.fecha = fecha;
        this.listaProd = listaProd;
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

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(int montoPagado) {
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
