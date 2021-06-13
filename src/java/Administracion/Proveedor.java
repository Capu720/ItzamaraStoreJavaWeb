package Administracion;

/**
 *
 * @author Equipo 1 Bambi&Fork
 */
public class Proveedor {
    private int claveProv;
    private String nombreProv, telefonoProv;
    
    public Proveedor(int claveProv, String telefonoProv, String nombreProv){
        this.claveProv = claveProv;
        this.telefonoProv = telefonoProv;
        this.nombreProv = nombreProv; 
    }

    public int getClaveProv() {
        return claveProv;
    }

    public void setClaveProv(int claveProv) {
        this.claveProv = claveProv;
    }

    public String getTelefonoProv() {
        return telefonoProv;
    }

    public void setTelefonoProv(String telefonoProv) {
        this.telefonoProv = telefonoProv;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    
}
