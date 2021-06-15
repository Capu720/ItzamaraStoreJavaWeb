/**
 * @author Equipo 1 Bambi&fork
 */
package Venta;
import Venta.Venta;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Conexion.Conexion;

public class EstadoDeResultados {
    private String fechaInicio, fechaFin;
    public double ganancias;
    public double costos;
    public double ventas;
    
    Connection conexion;
    
    public EstadoDeResultados(String fechaInicio, String fechaFin, double costos, double ventas, double ganancias){
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.ganancias = ganancias;
        this.costos = costos;
        this.ventas = ventas;
        
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public double getCostos() {
        return costos;
    }

    public void setCostos(double costos) {
        this.costos = costos;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    
    public List<Venta> mostarVenta(String fechaIni, String fechaFin){
        
        PreparedStatement ps;
        ResultSet rs;
        
        List<Venta> lista = new ArrayList<>();
        
        try{
            String comando = "SET lc_time_names = 'es_MX';";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();      
            System.out.println("fecha inicio: "+fechaIni);
            System.out.println("fecha fin: "+fechaFin);
            
            comando = "SELECT idVenta, DATE_FORMAT(fecha, '%d - %b - %Y') as fecha, montoTotal, montoPagado, Usuario_idUsuario from itzamaras.venta  where (fecha between '"+fechaIni+"' and '"+fechaFin+"');";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                int idVenta = rs.getInt("idVenta");
                String fecha = rs.getString("fecha");
                double montoTotal = rs.getDouble("montoTotal");
                double montoPagado = rs.getDouble("montoPagado");
                int idUsuario = rs.getInt("Usuario_idUsuario");
                //double montoTotal, double montoPagado, String fecha
                Venta venta = new Venta(idVenta, idUsuario, montoTotal, montoPagado, fecha, "","");
                lista.add(venta);
            }
            
            return lista;
            
        }catch(SQLException e){
            
            System.out.println(e.toString());
            return null;
        }
    
    }
    
    public EstadoDeResultados generarGanancia(String fechaini, String fechafin){
        
        PreparedStatement ps;
        ResultSet rs;
        double ventas = 0, costos = 0;
           
        try{
            String comando = "select SUM(montoPagado) as ventas from  itzamaras.venta where (fecha between '"+fechaini+"' and '"+fechafin+"')";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                ventas = rs.getDouble("ventas");
            }
            
            comando = "select SUM(itzamaras.producto.cantidad * itzamaras.producto.costo) as costos from itzamaras.producto";
            ps = conexion.prepareStatement(comando);
            rs = ps.executeQuery();
            
            while(rs.next()){
                //Aqui tienen que ir los nombres que pusimos en la tabla de mysql
                costos = rs.getDouble("costos");
            }
            
            double ganancias = ventas - costos;
            
            EstadoDeResultados estado = new EstadoDeResultados(fechaini, fechafin, costos, ventas, ganancias);
            
            return estado;
            
                 
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
}
