package Venta;

/**
 *
 * @author Equipo 1 Bambi&fork
 */
public class EstadoDeResultados {
    private String fechaInicio, fechaFin;
    
    public EstadoDeResultados(String fechaInicio, String fechaFin){
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
