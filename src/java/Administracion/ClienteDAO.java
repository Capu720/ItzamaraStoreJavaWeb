/**
 *
 * @author Equipo 1 Bambi&Fork
 */

package Administracion;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Conexion.Conexion;

public class ClienteDAO {
        
    Connection conexion;
    
    public ClienteDAO(){
    
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
    public List<Cliente>listaClientes(){
    
        PreparedStatement ps;
        ResultSet rs;
        
        List<Cliente> lista = new ArrayList<>();
        
        try{
            String comando = "select idUsuario, nombre, apPat, apMat, telefono, correo from itzamaras.usuario where admin = 0";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                int id = rs.getInt("idUsuario");
                String nombre = rs.getString("nombre");
                String paterno = rs.getString("apPat");
                String materno = rs.getString("apMat");
                String telefono = rs.getString("telefono");
                String correo = rs.getString("correo");
        
                Cliente cliente = new Cliente(id, "", telefono, nombre, paterno, materno, correo);
                lista.add(cliente);
            
            }
            
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
   
    }
    
    public Cliente selCliente(int _id){
    
        PreparedStatement ps;
        ResultSet rs;
        Cliente cliente = null;
       
        try{
            String comando = "select idUsuario, nombre, apPat, apMat, telefono, correo from itzamaras.usuario where idUsuario ="+_id;
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                int id = rs.getInt("idUsuario");
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String paterno = rs.getString("apPat");
                String materno = rs.getString("apMat");  
                String correo = rs.getString("correo");
                //int claveUsuario, String contra, String telefonoClt, String nombre, String apPat, String apMat, String correoClt
                cliente = new Cliente(id, "", telefono, nombre, paterno, materno,correo);
                
            }
            
            return cliente;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    
    }
    
    public boolean actualizarCliente(Cliente cliente){
    
        PreparedStatement ps;
        
        try{
            String comando = "UPDATE itzamaras.usuario SET nombre =?, apPat =?, apMat =?, telefono =?, correo =? WHERE (idUsuario = ?)";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApPat());
            ps.setString(3, cliente.getApMat());
            ps.setString(4, cliente.getTelefonoClt());
            ps.setString(5, cliente.getCorreoClt());
            ps.setInt(6, cliente.getClaveUsuario());
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    
    
    }
    
    public boolean eliminarCliente(String _id){
        
        PreparedStatement ps;
        try{
            
            String comando = "DELETE FROM `itzamaras`.`usuario` WHERE (`idUsuario` = ?)";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, _id);
         
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }
    
    
}
