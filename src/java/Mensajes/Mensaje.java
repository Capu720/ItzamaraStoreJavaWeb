package Mensajes;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Equipo1 Bambi&Fork
 */
public class Mensaje {
    private String mensaje,titulo;
    
    public Mensaje(String mensaje, String titulo){
        this.mensaje = mensaje;
        this.titulo = titulo;
    }
    
    public void mostrarMensaje(){
        UIManager UI = null;
        UI.put("OptionPane.background", new Color(250, 222, 222));
        UI.put("Panel.background", new Color(250, 222, 222));
        JOptionPane.showMessageDialog(null, mensaje,
                titulo, JOptionPane.PLAIN_MESSAGE, icono("imgs/error.png", 40, 40));
        
    }
    
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
}
