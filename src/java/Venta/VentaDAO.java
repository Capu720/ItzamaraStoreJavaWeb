/**
 *
 * @author Bambi&Fork
 */
package Venta;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Conexion.Conexion;
import Producto.Producto;
import Venta.Venta;
import Venta.Pago;

public class VentaDAO {
    Connection conexion;
    
    public VentaDAO(){
        
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    
    public List<Venta>listaVentas(){
    
        PreparedStatement ps;
        ResultSet rs;
        
        List<Venta> lista = new ArrayList<>();
        
        try{
            String comando = "select idVenta, DATE_FORMAT(fecha, '%d - %b - %Y') as fecha, montoTotal, montoPagado, CONCAT(nombre,' ', apPat, ' ', apMat) as cliente from itzamaras.venta, itzamaras.usuario where (Usuario_idUsuario = idUsuario)";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                int id = rs.getInt("idVenta");
                String fecha = rs.getString("fecha");
                double total = rs.getDouble("montoTotal");
                double pagado = rs.getDouble("montoPagado");
                String cliente = rs.getString("cliente");
                //int claveVta, int claveClt, double montoTotal, double montoPagado, String fecha, String listaProd, String nombre
                Venta venta = new Venta(id, 0, total, pagado, fecha, "",cliente);
                lista.add(venta);
                
            }
        
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public Venta ventaCliente(int _id){
    
        PreparedStatement ps;
        ResultSet rs;
        Venta venta = null;
        List<Venta> lista = new ArrayList<>();
        
        try{
            String comando = "select montoTotal, montoPagado, entregado from itzamaras.venta where (idVenta ="+_id+" )";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                String entregado = "";
                double total = rs.getDouble("montoTotal");
                double pagado = rs.getDouble("montoPagado");
                int cliente = rs.getInt("entregado");
                if(cliente == 0){
                    entregado = "No";
                }
                else{
                    entregado = "Si";
                }
                
                //int claveVta, int claveClt, double montoTotal, double montoPagado, String fecha, String listaProd, String nombre
                venta = new Venta(_id, 0, total, pagado, "", "",entregado);
                
            }
        
            return venta;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
    public List<Pago>ventaPagos(int _id){
    
        PreparedStatement ps;
        ResultSet rs;
        
        List<Pago> lista = new ArrayList<>();
        
        try{
            String comando = "select folio, DATE_FORMAT(itzamaras.pago.fecha, '%d - %b - %Y') as fecha, monto from itzamaras.pago ,itzamaras.venta where(itzamaras.venta.idVenta = "+_id+" and itzamaras.venta.idVenta = itzamaras.pago.Venta_idVenta) \n" +
"";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                
                int folio = rs.getInt("folio");
                String fecha = rs.getString("fecha");
                double monto = rs.getDouble("monto");
             
             //int folio, String fecha, double monto, String numRastreo, int idVenta, int idBanco
             Pago pago = new Pago(folio, fecha,monto,"",0,0);   
             lista.add(pago);
                
            }
            
            return lista;
            
        }catch(SQLException e){
            
            System.out.println(e.toString());
            return null;
        }
    }
    
    public List<Producto>ventaProductos(int _id){
    
        PreparedStatement ps;
        ResultSet rs;
        
        List<Producto> lista = new ArrayList<>();
        
        try{
            String comando = "select nombre, descripcion, imagen from itzamaras.imagen, itzamaras.producto , itzamaras.venta, itzamaras.venta_has_producto\n" +
"where(itzamaras.venta.idVenta = "+_id+" and itzamaras.venta.idVenta = itzamaras.venta_has_producto.Venta_idVenta \n" +
"and itzamaras.venta_has_producto.Producto_idProducto = itzamaras.producto.idProducto\n" +
"and itzamaras.venta_has_producto.Producto_idProducto = itzamaras.imagen.Producto_idProducto)";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String imagen = rs.getString("imagen");
               
             //int claveProdcto, int cantidad, String nombreProd, String descripcionProd, String marcaProd, String categoriaProd, double costoProd, double precioProd, String imagen
             Producto producto = new Producto(0,0,nombre,descripcion,"","",0,0,imagen);   
             lista.add(producto);
                
            }
           
            return lista;
            
        }catch(SQLException e){
            
            System.out.println(e.toString());
            return null;
        }
    }
    
    public boolean pagoEfectivo(Pago pago){
         
        PreparedStatement ps;
        ResultSet rs = null;
        double monto = 0;
        try{
            
            String comando = "INSERT INTO `itzamaras`.`pago` (`fecha`, `monto`, `Venta_idVenta`) VALUES (?, ?, ?);";
            ps = conexion.prepareStatement(comando);
            ps.setString(1, pago.getFecha());
            ps.setDouble(2, pago.getMonto());
            ps.setInt(3, pago.getIdVenta());
            ps.execute();
            
            comando = "select SUM(monto) as monto from itzamaras.pago where itzamaras.pago.Venta_idVenta = "+pago.getIdVenta();
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            while(rs.next()){
                monto = rs.getDouble("monto");
            }
            
            System.out.println("monto:"+monto);
            
            comando = "UPDATE `itzamaras`.`venta` SET `montoPagado` = '"+monto+"' WHERE (`idVenta` = '"+pago.getIdVenta()+"');";
            ps = conexion.prepareStatement(comando);
            ps.execute();
            
            return true;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
     
    }
    
}
     

