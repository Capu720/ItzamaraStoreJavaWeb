package Administracion;

/**
 *
 * @author Equipo 1 Bambi & Fork
 */
public class Usuario {
    private int claveUsuario;
    private String nombre, apPat, apMat, correoClt, contra,telefonoClt;
    
    public Usuario(int claveUsuario, String contra, String telefonoClt, String nombre, String apPat, String apMat, String correoClt){
        this.claveUsuario = claveUsuario;
        this.contra = contra;
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.telefonoClt = telefonoClt;
        this.correoClt = correoClt;
    }

    public int getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(int claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getTelefonoClt() {
        return telefonoClt;
    }

    public void setTelefonoClt(String telefonoClt) {
        this.telefonoClt = telefonoClt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public String getCorreoClt() {
        return correoClt;
    }

    public void setCorreoClt(String correoClt) {
        this.correoClt = correoClt;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
}
