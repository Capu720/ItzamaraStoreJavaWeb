/*
 * @author Equipo 1 Bambi&Fork
 */
package Servlets;
//import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.script.ScriptEngineManager;
import Administracion.UsuarioDAO;
import Administracion.Usuario;
import static java.lang.System.out;
import Mensajes.Mensaje;

@WebServlet(name = "UsuarioController", urlPatterns = {"/UsuarioController"})

public class UsuarioController extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Llamamos  a la clsae e instanciamos el objeo
        UsuarioDAO UsuarioDAO = new UsuarioDAO();
        String accion,nombre,paterno,materno,correo,telefono,contra;
        RequestDispatcher dispatcher = null;
        
        accion = request.getParameter("accion");
        
        //Jugamos con los valores que puede tener accion o basicamente lo que puede hacer el usuario
        if("insertar".equals(accion)){
            //Almaceamos el valor de los inputs en las variables
            nombre = request.getParameter("txtNombre");
            paterno = request.getParameter("txtApPat");
            materno = request.getParameter("txtApMat");
            correo = request.getParameter("txtCorreo");
            telefono = request.getParameter("txtTel");
            contra = request.getParameter("txtContra");
            
            //Creamos un objeto de tipo usuario para pasarle los parametros
            //int claveUsuario, String contra, String telefonoClt, String nombre, String apPat, String apMat, String correoClt
            Usuario usuario = new Usuario(0, contra, telefono, nombre, paterno, materno, correo);
            //Llamamos al metodo insertar
            boolean bandera = UsuarioDAO.validarRegistro(usuario);
            if(bandera == true)
            {
                Mensaje men = new Mensaje("Ese correo ya ha sido registrado. Intentelo con otro correo diferente", "Error");
                men.mostrarMensaje();
                dispatcher = request.getRequestDispatcher("registroClt.jsp");  
            }
            else{
                UsuarioDAO.insertar(usuario);
                Mensaje men = new Mensaje("Usuario registrado correctamente. Inicie sesion", "Listo");
                men.mostrarMensaje();
                //Regresa al menu de inicio de sesion
                dispatcher = request.getRequestDispatcher("inicioDeSesion.jsp");  
            }  
        }
        
        else if("login".equals(accion)){
            correo = request.getParameter("email");
            contra = request.getParameter("contra");
            Usuario usuario = new Usuario(0, contra, "", "", "", "", correo);
            boolean bandera = UsuarioDAO.login(usuario);
            
            if(bandera == true)//Encontro el registro y decie si es un admin o usuario 
            {
                String admin = UsuarioDAO.adminUsua(usuario);
                
                if("1".equals(admin)){//Es un administrador
                    dispatcher = request.getRequestDispatcher("administradorPrincipal.jsp"); 
                }
                else{//Es un cliente
                    dispatcher = request.getRequestDispatcher("clientesPrincipal.html"); 
                }
                
            }
            
            else{//No encontro el registro
                Mensaje men =  new Mensaje("Usuario o password incorrectos. Intente de nuevo", "Error");
                men.mostrarMensaje();
                dispatcher = request.getRequestDispatcher("inicioDeSesion.jsp"); 
                
            }
        }
        
        else{
            dispatcher = request.getRequestDispatcher("index.html");  
        }
     
        dispatcher.forward(request, response);
    
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
