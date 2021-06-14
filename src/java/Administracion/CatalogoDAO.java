/**
 *
 * @author Bambi&Fork
 */
package Administracion;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Conexion.Conexion;


public class CatalogoDAO {
    Connection conexion;
    
    public CatalogoDAO(){
    
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
    public List<Catalogo>listaCatalogos(){
    
        PreparedStatement ps;
        ResultSet rs;
        
        List<Catalogo> lista = new ArrayList<>();
        
        try{
            String comando = "SELECT * FROM itzamaras.catalogo";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                String id = rs.getString("idCatalogo");
                String nombre = rs.getString("nombreCat");
                Catalogo catalogo = new Catalogo(id, nombre);
                lista.add(catalogo);
            }
        
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public List<ProductosCatalogo>listaProdCatalogos(int _id){
    
        PreparedStatement ps;
        ResultSet rs;
        
        List<ProductosCatalogo> lista = new ArrayList<>();
        
        try{
            String comando = "select  Producto_idProducto, nombre, descripcion from itzamaras.producto, itzamaras.catalogo, itzamaras.catalogo_has_producto  where (Catalogo_idCatalogo = ? and Producto_idProducto = idProducto and idCatalogo = Catalogo_idCatalogo);  ";
            ps = conexion.prepareStatement(comando);
            ps.setInt(1,_id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                String id = rs.getString("Producto_idProducto");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                ProductosCatalogo catalogoprod = new ProductosCatalogo(id, nombre, descripcion,0,"");
                lista.add(catalogoprod);
            }
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public List<ProductosCatalogo>listaProdNoCatalogos(){
    
        PreparedStatement ps;
        ResultSet rs;
        
        List<ProductosCatalogo> lista = new ArrayList<>();
        
        try{
            String comando = "select idProducto, nombre, descripcion from itzamaras.producto, itzamaras.catalogo, itzamaras.catalogo_has_producto WHERE not exists (Select Producto_idProducto from catalogo_has_producto where producto.idProducto = catalogo_has_producto.Producto_idProducto) group by (idProducto)";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                String id = rs.getString("idProducto");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                ProductosCatalogo catalogoprod = new ProductosCatalogo(id, nombre, descripcion,0,"");
                lista.add(catalogoprod);
            }
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean eliminarProCat(String _id){
        
        PreparedStatement ps;
        try{
            
            String comando = "DELETE from itzamaras.catalogo_has_producto where(Producto_idProducto =?)";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, _id);
         
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
        
    }
    
    public boolean insertarProdCat(int catalogo, String prod){
     
     PreparedStatement ps;
        try{
            
            String comando = "insert into itzamaras.catalogo_has_producto values (?,?);";
            ps = conexion.prepareStatement(comando);
            ps.setInt(1, catalogo);
            ps.setString(2, prod);
            ps.execute();
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
     
    }
    
    public List<ProductosCatalogo>listaProdCataImp(int _id){
    
        PreparedStatement ps;
        ResultSet rs;
        
        List<ProductosCatalogo> lista = new ArrayList<>();
        
        try{
            String comando = "select itzamaras.catalogo_has_producto.Producto_idProducto, nombre, descripcion, precio, imagen from itzamaras.producto, itzamaras.catalogo, itzamaras.catalogo_has_producto, itzamaras.imagen where (Catalogo_idCatalogo = ? and itzamaras.catalogo_has_producto.Producto_idProducto = idProducto and idCatalogo = Catalogo_idCatalogo and itzamaras.catalogo_has_producto.Producto_idProducto = itzamaras.imagen.Producto_idProducto)";
            ps = conexion.prepareStatement(comando);
            ps.setInt(1,_id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                String id = rs.getString("Producto_idProducto");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                double precio = rs.getDouble("precio");
                String imagen = rs.getString("imagen");
                ProductosCatalogo catalogoprod = new ProductosCatalogo(id, nombre, descripcion, precio, imagen);
                lista.add(catalogoprod);
            }
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
     
    
}
