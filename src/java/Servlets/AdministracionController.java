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
import Administracion.ClienteDAO;
import Administracion.Cliente;
import Administracion.Proveedor;

@WebServlet(name = "AdministradorController", urlPatterns = {"/AdministradorController"})

public class AdministracionController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Llamamos  a la clsae e instanciamos los objetos que tiene el administrador
        ClienteDAO clienteDAO =  new ClienteDAO();
        String accion,nombre,paterno,materno,correo,telefono,contra;
        RequestDispatcher dispatcher = null;
        
        accion = request.getParameter("accion");
        
        //Jugamos con los valores que puede tener accion o basicamente lo que puede hacer el usuario
        //Mostramos todos los datos
        if(accion == null || accion.isEmpty()){
            //Cargamos la pagina de clientes con todos los que haya para eso la lista
           dispatcher = request.getRequestDispatcher("Clientes.jsp");
           List<Cliente> listaclientes = clienteDAO.listaClientes();
           request.setAttribute("lista", listaclientes);
        }
        
        
        else if("verClientes".equals(accion)){
           //Cargamos la pagina de clientes con todos los que haya para eso la lista
           dispatcher = request.getRequestDispatcher("Clientes.jsp");
           List<Cliente> listaclientes = clienteDAO.listaClientes();
           request.setAttribute("lista", listaclientes);
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
