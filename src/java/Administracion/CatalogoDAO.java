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
                ProductosCatalogo catalogoprod = new ProductosCatalogo(id, nombre, descripcion);
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
                ProductosCatalogo catalogoprod = new ProductosCatalogo(id, nombre, descripcion);
                lista.add(catalogoprod);
            }
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
     
    
}
