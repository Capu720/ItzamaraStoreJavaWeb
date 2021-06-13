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
            String comando = "select idProducto, nombre, descripcion, cantidad, precio, costo, imagen from itzamaras.producto, itzamaras.imagen where idProducto = "+_id+" and idImagen = "+_id;
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
}
