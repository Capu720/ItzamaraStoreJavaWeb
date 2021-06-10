package Administracion;
import Conexion.Conexion;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Equipo Bambi&Fork
 */
public class UsuarioDAO {
    Connection conexion;
    
    public UsuarioDAO(){
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
     public boolean insertar(Usuario usuario){
        
        PreparedStatement ps;
        try{
            String comando = "INSERT INTO `itzamaras`.`usuario` (`contra`, `nombre`, `apPat`, `apMat`, `telefono`, `correo`, `admin`) VALUES (?,?,?,?,?,?,?)";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, usuario.getContra());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApPat());
            ps.setString(4, usuario.getApMat());
            ps.setString(5, usuario.getTelefonoClt());
            ps.setString(6, usuario.getCorreoClt());
            ps.setInt(7, 0);
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }
     
     public boolean login(Usuario usuario){
     
        PreparedStatement ps;
        try{
            String correo = usuario.getCorreoClt();
            String password = usuario.getContra();
            String comando = "select * from itzamaras.usuario where correo = '" + correo+"' and contra = '"+password+"' ";
            ps = conexion.prepareStatement(comando);
            ResultSet rs = ps.executeQuery();
            return rs.next();
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
     
     }
     
    public String adminUsua(Usuario usuario){
        
        PreparedStatement ps;
        ResultSet rs;
        String admin = null;
       
        try{
            String correo = usuario.getCorreoClt();
            String password = usuario.getContra();
            String comando = "select * from itzamaras.usuario where correo = '" + correo+"' and contra = '"+password+"' ";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                admin = rs.getString("admin");
            }
            
            return admin;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        } 
        
     
     
     }
}
