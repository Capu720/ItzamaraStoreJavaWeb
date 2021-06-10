package modelo;

import Conexion.Conexion;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO {
    
    Connection conexion;
    
    public ProductosDAO(){
        
        Conexion con = new Conexion();
        conexion = con.getConexion();
       
    }
   
    public List<Productos> listarProductos(){
        PreparedStatement ps;
        ResultSet rs;
        
        List<Productos> lista = new ArrayList<>();
        
        try{
            String comando = "SELECT id, codigo, nombre, precio, existencia FROM almacen";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                int id = rs.getInt("id");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                Double precio = rs.getDouble("precio");
                int existencia = rs.getInt("existencia");
                
                Productos prod = new Productos(id, codigo, nombre, precio, existencia);
                lista.add(prod);
            
            }
            
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }

    public Productos mostrarProducto(int _id){
        PreparedStatement ps;
        ResultSet rs;
        Productos producto = null;
       
        try{
            String comando = "SELECT id, codigo, nombre, precio, existencia FROM almacen where id=" + _id;
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                int id = rs.getInt("id");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                Double precio = rs.getDouble("precio");
                int existencia = rs.getInt("existencia");
                
                producto = new Productos(id, codigo, nombre, precio, existencia);
                
            
            }
            
            return producto;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }

    public boolean insertar(Productos producto){
        
        PreparedStatement ps;
        
       
        try{
            String comando = "INSERT INTO almacen (codigo, nombre, precio, existencia) VALUES (?,?,?,?)";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getExistencia());
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }

    public boolean actualizar(Productos producto){
        
        PreparedStatement ps;
       
        try{
            String comando = "UPDATE almacen SET codigo=? ,nombre=?, precio=?, existencia=? WHERE id=?";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getExistencia());
            ps.setInt(5,producto.getId());
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }

    public boolean eliminar(int _id){
        
        PreparedStatement ps;
    
       
        try{
            String comando = "DELETE FROM almacen WHERE id=?";
            ps = conexion.prepareStatement(comando);
            ps.setInt(1, _id);
         
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }
}
