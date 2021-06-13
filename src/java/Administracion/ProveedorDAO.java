/**
 *
 * @author Bambi&Fork
 */
package Administracion;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Administracion.Proveedor;
import Conexion.Conexion;

public class ProveedorDAO {
    Connection conexion;
    
    public ProveedorDAO(){
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
    public List<Proveedor>listaProveedores(){
    
        PreparedStatement ps;
        ResultSet rs;
        
        List<Proveedor> lista = new ArrayList<>();
        
        try{
            String comando = "SELECT * FROM itzamaras.proveedor;";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                int id = rs.getInt("idProveedor");
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
               
                Proveedor proveedor = new Proveedor(id, telefono, nombre);
                lista.add(proveedor);
            }
            
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public Proveedor selProve(int _id){
    
        PreparedStatement ps;
        ResultSet rs;
        Proveedor proveedor = null;
       
        try{
            String comando = "SELECT idProveedor, nombre, telefono FROM itzamaras.proveedor where idProveedor = '" +_id+"'";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                int id = rs.getInt("idProveedor");
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                
                proveedor = new Proveedor(id, telefono, nombre);
                
            }
            
            return proveedor;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    
    }
    
    public boolean actualizarProveedor(Proveedor proveedor){
    
        PreparedStatement ps;
        
        try{
            
            String comando = "UPDATE itzamaras.proveedor SET nombre =?, telefono =? WHERE (idProveedor =?);";
            ps = conexion.prepareStatement(comando);
            ps.setString(1,proveedor.getNombreProv());
            ps.setString(2,proveedor.getTelefonoProv());
            ps.setDouble(3,proveedor.getClaveProv());
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    
    
    }
    
    public boolean eliminarProveedor(String _id){
        
        PreparedStatement ps;
        try{
            
            String comando = "DELETE FROM `itzamaras`.`proveedor` WHERE (`idProveedor` =?)";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, _id);
         
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }
    
     public boolean insertarProveedor(Proveedor proveedor){
     
     PreparedStatement ps;
        try{
            
            String comando = "INSERT INTO `itzamaras`.`proveedor` (`idProveedor`, `nombre`, `telefono`) VALUES (?,?,?)";
            ps = conexion.prepareStatement(comando);
            ps.setInt(1, proveedor.getClaveProv());
            ps.setString(2, proveedor.getNombreProv());
            ps.setString(3, proveedor.getTelefonoProv());
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
     
     }
    
    
    
    
}
