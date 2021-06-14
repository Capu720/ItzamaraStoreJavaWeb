/**
 *
 * @author Bambi&Fork
 */
package Administracion;


public class Catalogo {
    private String claveCata, nombreCata;
    
    public Catalogo(String claveCata, String nombreCata){
    
        this.claveCata = claveCata;
        this.nombreCata = nombreCata;
    
    }

    public String getClaveCata() {
        return claveCata;
    }

    public void setClaveCata(String claveCata) {
        this.claveCata = claveCata;
    }

    public String getNombreCata() {
        return nombreCata;
    }

    public void setNombreCata(String nombreCata) {
        this.nombreCata = nombreCata;
    }
    
    
}
