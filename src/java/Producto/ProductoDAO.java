/**
 *
 * @author Bambi&Fork
 */
package Producto;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Producto.Producto;
import Conexion.Conexion;

public class ProductoDAO {
    Connection conexion;
    
    public ProductoDAO(){
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
    
    public List<Producto>listaProdutos(){
    
        PreparedStatement ps;
        ResultSet rs;
        
        List<Producto> lista = new ArrayList<>();
        
        try{
            String comando = "SELECT * FROM itzamaras.producto";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                int id = rs.getInt("idProducto");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                double costo = rs.getDouble("costo");
                
               //String claveProducto, int cantidad, String nombreProd, String descripcionProd, String marcaProd, String categoriaProd, double costoProd, double precioProd, String imagen
                Producto producto = new Producto(id, cantidad, nombre, descripcion, "", "", costo, precio,"");
                lista.add(producto);
            }
            
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public Producto selProd(int _id){
    
        PreparedStatement ps;
        ResultSet rs;
        Producto producto = null;
       
        try{
            String comando = "select idProducto, nombre, descripcion, cantidad, precio, costo, imagen from itzamaras.producto, itzamaras.imagen where idProducto = "+_id+" and Producto_idProducto = "+_id;
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                int id = rs.getInt("idProducto");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                int cantidad = rs.getInt("cantidad");
                double precio = rs.getDouble("precio");
                double costo = rs.getDouble("costo");
                String imagen = rs.getString("imagen");
                
                //String claveProducto, int cantidad, String nombreProd, String descripcionProd, String marcaProd, String categoriaProd, double costoProd, double precioProd, String imagen
                producto = new Producto(id, cantidad, nombre, descripcion, "", "", costo,precio,imagen);
                
            }
            
            return producto;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
    
    public boolean actualizarProducto(Producto producto){
    
        PreparedStatement ps;
        
        try{
            
            String comando = "UPDATE `itzamaras`.`producto` SET `nombre` = ?, `descripcion` =?, `cantidad` =?, `precio` =? WHERE (`idProducto` =?)";
            ps = conexion.prepareStatement(comando);
            ps.setString(1,producto.getNombreProd());
            ps.setString(2,producto.getDescripcionProd());
            ps.setDouble(3,producto.getCantidad());
            ps.setDouble(4,producto.getPrecioProd());
            ps.setInt(5,producto.getClaveProdcto());
            ps.execute();
            
            String comando1 = "UPDATE `itzamaras`.`imagen` SET `imagen` =? WHERE (`idImagen` = ?)";
            ps = conexion.prepareStatement(comando1);
            ps.setString(1, "assets/img/Productos/"+producto.getImagen());
            ps.setInt(2, producto.getClaveProdcto());
            ps.execute();
            
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
    
    public boolean insertarProducto(Producto producto){
     
     PreparedStatement ps;
        try{
            
            String comando = "INSERT INTO `itzamaras`.`producto` (`idProducto`, `nombre`, `descripcion`, `cantidad`, `precio`, `costo`, `Proveedor_idProveedor`) VALUES (?, ?, ?, ?, ?, ?, ?);";
            ps = conexion.prepareStatement(comando);
            ps.setInt(1, producto.getClaveProdcto());
            ps.setString(2, producto.getNombreProd());
            ps.setString(3, producto.getDescripcionProd());
            ps.setInt(4, producto.getCantidad());
            ps.setDouble(5, producto.getPrecioProd());
            ps.setDouble(6, producto.getCostoProd());
            ps.setInt(7, 1);
            ps.execute();
            
            comando = "INSERT INTO `itzamaras`.`imagen` (`imagen`, `Producto_idProducto`) VALUES (?,?)";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, "assets/img/Productos/"+producto.getImagen());
            ps.setInt(2, producto.getClaveProdcto());
            ps.execute();
            
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
     
    }
     
     
    public boolean eliminarProducto(String _id){
        
        PreparedStatement ps;
        try{
            
            String comando = "DELETE FROM `itzamaras`.`imagen` WHERE (`Producto_idProducto` =?)";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, _id);
            ps.execute();
            
            comando = "DELETE FROM `itzamaras`.`producto` WHERE (`idProducto` =?)";
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
