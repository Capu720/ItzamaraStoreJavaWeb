package Conexion;

//Clase para poder hacer la conexio con MySQL

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    public Connection getConexion() {
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/itzamaras?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";   
            Connection conexion = DriverManager.getConnection(url,"root","admin");
            return conexion;
            
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    }
}
