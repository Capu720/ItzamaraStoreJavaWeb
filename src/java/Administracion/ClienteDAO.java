package Administracion;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Equipo 1 Bambi&Fork
 */


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
    
    
}
