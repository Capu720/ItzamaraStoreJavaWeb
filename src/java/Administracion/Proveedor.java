package Administracion;

/**
 *
 * @author Equipo 1 Bambi&Fork
 */
public class Proveedor {
    private int claveProv, telefonoProv;
    private String nombreProv, correoProv;
    
    public Proveedor(int claveProv, int telefonoProv, String nombreProv, String correoProv){
        this.claveProv = claveProv;
        this.telefonoProv = telefonoProv;
        this.nombreProv = nombreProv;
        this.correoProv = correoProv;
    }

    public int getClaveProv() {
        return claveProv;
    }

    public void setClaveProv(int claveProv) {
        this.claveProv = claveProv;
    }

    public int getTelefonoProv() {
        return telefonoProv;
    }

    public void setTelefonoProv(int telefonoProv) {
        this.telefonoProv = telefonoProv;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getCorreoProv() {
        return correoProv;
    }

    public void setCorreoProv(String correoProv) {
        this.correoProv = correoProv;
    }
    
}
