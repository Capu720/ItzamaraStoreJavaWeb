/**
 *
 * @author Bambi&Fork
 */
package Venta;


public class Pago {
   
    private int folio, idVenta, idBanco;
    private double monto;
    private String fecha, numRastreo;
    
    public Pago(int folio, String fecha, double monto, String numRastreo, int idVenta, int idBanco){
    
        this.folio = folio;
        this.idVenta = idVenta;
        this.monto = monto;
        this.fecha = fecha;
        this.numRastreo = numRastreo;
        this.idBanco = idBanco;
       
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumRastreo() {
        return numRastreo;
    }

    public void setNumRastreo(String numRastreo) {
        this.numRastreo = numRastreo;
    }
    
    
}
