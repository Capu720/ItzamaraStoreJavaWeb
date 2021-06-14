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
import Administracion.ProveedorDAO;
import Producto.Producto;
import Producto.ProductoDAO;
import Administracion.Catalogo;
import Administracion.CatalogoDAO;
import Administracion.ProductosCatalogo;
import Venta.Venta;
import Venta.EstadoDeResultados;
import Mensajes.Mensaje;

@WebServlet(name = "AdministradorController", urlPatterns = {"/AdministradorController"})

public class AdministradorController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Llamamos  a la clsae e instanciamos los objetos que tiene el administrador
        ClienteDAO clienteDAO =  new ClienteDAO();
        ProveedorDAO ProveedorDAO = new ProveedorDAO();
        ProductoDAO ProductoDAO = new ProductoDAO();
        CatalogoDAO CatalodoDAO = new CatalogoDAO();
        EstadoDeResultados EstadoDeResultados = new EstadoDeResultados("","",0,0,0);
        String accion,nombre,paterno,materno,correo,telefono,contra, descripcion, imagen;
        int cantidad, catalogo = 0;
        double precio, costo;
        RequestDispatcher dispatcher = null;
        
        accion = request.getParameter("accion");
        System.out.println("accion:"+accion);
        //Jugamos con los valores que puede tener accion o basicamente lo que puede hacer el usuario
        //Mostramos todos los datos
        
         /*TODO LO DE CLIENTES*/
        
        if("verClientes".equals(accion)){
           //Cargamos la pagina de clientes con todos los que haya para eso la lista
           dispatcher = request.getRequestDispatcher("Clientes.jsp");
           List<Cliente> listaclientes = clienteDAO.listaClientes();
           request.setAttribute("lista", listaclientes);
        }
        
        else if("verCliente".equals(accion)){
            dispatcher = request.getRequestDispatcher("actualiClientes.jsp");
            int id = Integer.parseInt(request.getParameter("claveUsuario"));
            Cliente cliente = clienteDAO.selCliente(id);
            request.setAttribute("cliente", cliente);
        }
        
        else if("actualizarCliente".equals(accion)){
            
            int clave = Integer.parseInt(request.getParameter("tClave"));
            nombre = request.getParameter("tNombre");
            telefono = request.getParameter("telefono");
            paterno = request.getParameter("tApPaterno");
            materno = request.getParameter("tApMaterno");
            correo = request.getParameter("tCorreo");
            Cliente cliente = new Cliente(clave, "", telefono, nombre, paterno, materno,correo);
            clienteDAO.actualizarCliente(cliente);
            dispatcher = request.getRequestDispatcher("Clientes.jsp");
            List<Cliente> listaclientes = clienteDAO.listaClientes();
            request.setAttribute("lista", listaclientes);
     
        }
        
        else if("eliminarClinte".equals(accion)){
        
            String id = request.getParameter("claveUsuario");
            clienteDAO.eliminarCliente(id);
            System.out.println("Elimado exitosamente");
            dispatcher = request.getRequestDispatcher("Clientes.jsp");
            List<Cliente> listaclientes = clienteDAO.listaClientes();
            request.setAttribute("lista", listaclientes);
        }
        
        /*TODO LO DE PROVEEDORES*/
             
        else if("verProveedores".equals(accion)){
            dispatcher = request.getRequestDispatcher("proveedores.jsp");
            List<Proveedor> listaProveedores = ProveedorDAO.listaProveedores();
            request.setAttribute("lista", listaProveedores);
        }
        
        else if("modificarProveedor".equals(accion)){
            dispatcher = request.getRequestDispatcher("actualiProveedores.jsp");
            int id = Integer.parseInt(request.getParameter("claveProv"));
            Proveedor proveedor = ProveedorDAO.selProve(id);
            request.setAttribute("prove", proveedor);
        
        }
                
        else if("eliminarProvedor".equals(accion)){
        
            String id = request.getParameter("claveProv");
            ProveedorDAO.eliminarProveedor(id);
            System.out.println("Elimado exitosamente");
            dispatcher = request.getRequestDispatcher("proveedores.jsp");
            List<Proveedor> listaProveedores = ProveedorDAO.listaProveedores();
            request.setAttribute("lista", listaProveedores);
        }
        
        else if("crearProveedor".equals(accion)){
            int clave = Integer.parseInt(request.getParameter("tcClave"));
            nombre = request.getParameter("tcNombre");
            telefono = request.getParameter("tcTelefono");
            Proveedor proveedor = new Proveedor(clave, telefono, nombre);
            ProveedorDAO.insertarProveedor(proveedor);
            dispatcher = request.getRequestDispatcher("proveedores.jsp");
            List<Proveedor> listaProveedores = ProveedorDAO.listaProveedores();
            request.setAttribute("lista", listaProveedores);
        }
        
        else if("atualizarProv".equals(accion)){
            int clave = Integer.parseInt(request.getParameter("taClave"));
            nombre = request.getParameter("taNombre");
            telefono = request.getParameter("taTelefono");
            Proveedor proveedor = new Proveedor(clave,telefono,nombre);
            ProveedorDAO.actualizarProveedor(proveedor);
            dispatcher = request.getRequestDispatcher("proveedores.jsp");
            List<Proveedor> listaProveedores = ProveedorDAO.listaProveedores();
            request.setAttribute("lista", listaProveedores);
          
        }
        
        /*TODO LO DE PRODUCTOS*/
        
        else if("verProductos".equals(accion)){
            dispatcher = request.getRequestDispatcher("productos.jsp");
            List<Producto> listaProductos = ProductoDAO.listaProdutos();
            request.setAttribute("lista", listaProductos);
        }
        
        else if("modificarProducto".equals(accion)){
           
            dispatcher = request.getRequestDispatcher("actualiProducto.jsp");
            int id = Integer.parseInt(request.getParameter("claveProd"));
            Producto producto = ProductoDAO.selProd(id);
            request.setAttribute("produ", producto);
        }
        
        else if("actualizarProd".equals(accion)){
            int clave = Integer.parseInt(request.getParameter("taClave"));
            nombre = request.getParameter("taNombre");
            telefono = request.getParameter("taTelefono");
            cantidad = Integer.parseInt(request.getParameter("taCantidad"));
            precio = Double.parseDouble(request.getParameter("taPrecio"));
            costo = Double.parseDouble(request.getParameter("taCosto"));
            descripcion = request.getParameter("txtaDescripcion");
            imagen = request.getParameter("faImagen");
            //int claveProdcto, int cantidad, String nombreProd, String descripcionProd, String marcaProd, String categoriaProd, double costoProd, double precioProd, String imagen
            Producto producto = new Producto(clave, cantidad, nombre, descripcion, "","", costo, precio, imagen);
            ProductoDAO.actualizarProducto(producto);
            
            dispatcher = request.getRequestDispatcher("productos.jsp");
            List<Producto> listaProductos = ProductoDAO.listaProdutos();
            request.setAttribute("lista", listaProductos);
          
        }
         
        else if("insertaProducto".equals(accion)){
             
            int clave = Integer.parseInt(request.getParameter("tcClave"));
            nombre = request.getParameter("tcNombre");
            telefono = request.getParameter("tcTelefono");
            cantidad = Integer.parseInt(request.getParameter("tcCantidad"));
            precio = Double.parseDouble(request.getParameter("tcPrecio"));
            costo = Double.parseDouble(request.getParameter("tcCosto"));
            descripcion = request.getParameter("txtcDescripcion");
            imagen = request.getParameter("fcImagen");
            System.out.println("precio:"+precio);
            //int claveProdcto, int cantidad, String nombreProd, String descripcionProd, String marcaProd, String categoriaProd, double costoProd, double precioProd, String imagen
            Producto producto = new Producto(clave, cantidad, nombre, descripcion, "","", costo, precio, imagen);
            ProductoDAO.insertarProducto(producto);
            
            dispatcher = request.getRequestDispatcher("productos.jsp");
            List<Producto> listaProductos = ProductoDAO.listaProdutos();
            request.setAttribute("lista", listaProductos);
         
        }
         
        else if("eliminarProducto".equals(accion)){
             
            String id = request.getParameter("claveProd");
            ProductoDAO.eliminarProducto(id);
            System.out.println("Elimado exitosamente");
            dispatcher = request.getRequestDispatcher("productos.jsp");
            List<Producto> listaProductos = ProductoDAO.listaProdutos();
            request.setAttribute("lista", listaProductos);

        }
        
        /*TODO LO DE CATALOGOS*/
        
        else if("verCatalogos".equals(accion)){
            dispatcher = request.getRequestDispatcher("catalogos.jsp");
            List<Catalogo> listaCatalogos = CatalodoDAO.listaCatalogos();
            request.setAttribute("lista", listaCatalogos);
        }
        
        
        else if("verCataProducto".equals(accion)){
           
            dispatcher = request.getRequestDispatcher("agregarProductosCatalogo.jsp");
            int id1 = Integer.parseInt(request.getParameter("claveCata"));
            catalogo = id1;
            List<ProductosCatalogo> listaProCat = CatalodoDAO.listaProdCatalogos(id1);
            request.setAttribute("lista", listaProCat);
            List<ProductosCatalogo> listaNoProCat = CatalodoDAO.listaProdNoCatalogos();
            request.setAttribute("lista1", listaNoProCat); 
            
        }
        
        else if("eliminarProdCat".equals(accion)){
            String id = request.getParameter("claveProd");
            CatalodoDAO.eliminarProCat(id);
            System.out.println("Elimado exitosamente");
            dispatcher = request.getRequestDispatcher("agregarProductosCatalogo.jsp");
            System.out.println("catalogo:"+id);
            List<ProductosCatalogo> listaProCat = CatalodoDAO.listaProdCatalogos(1);
            request.setAttribute("lista", listaProCat);
            List<ProductosCatalogo> listaNoProCat = CatalodoDAO.listaProdNoCatalogos();
            request.setAttribute("lista1", listaNoProCat); 
        
        }
        
        else if("insertarProdCat".equals(accion)){
            String id = request.getParameter("claveProd");
            CatalodoDAO.insertarProdCat(1, id);
            dispatcher = request.getRequestDispatcher("agregarProductosCatalogo.jsp");
            List<ProductosCatalogo> listaProCat = CatalodoDAO.listaProdCatalogos(1);
            request.setAttribute("lista", listaProCat);
            List<ProductosCatalogo> listaNoProCat = CatalodoDAO.listaProdNoCatalogos();
            request.setAttribute("lista1", listaNoProCat); 
        
        }
        
        else if("impCatalogo".equals(accion)){
            dispatcher = request.getRequestDispatcher("ImprimirCatalogo.jsp");
            int id1 = Integer.parseInt(request.getParameter("claveCata"));
            List<ProductosCatalogo> listaProCat = CatalodoDAO.listaProdCataImp(id1);
            request.setAttribute("lista", listaProCat);
        }
        
        /*TODO LO DE GANACIAS*/
        
        else if("verGana".equals(accion)){
            dispatcher = request.getRequestDispatcher("ganancias.jsp");
        }
        
        else if("generarGanancia".equals(accion)){
            String fechaIni = request.getParameter("txtInicio");
            String fechaFin = request.getParameter("txtFin");
         
            dispatcher = request.getRequestDispatcher("verGanancias.jsp");
            List<Venta> listaventas = EstadoDeResultados.mostarVenta(fechaIni, fechaFin);
            request.setAttribute("lista", listaventas);
           
            dispatcher = request.getRequestDispatcher("verGanancias.jsp");
            EstadoDeResultados est = EstadoDeResultados.generarGanancia(fechaIni, fechaFin); 
            
            request.setAttribute("estado", est);
        }
        
        /*TODO LO DE VENTAS*/
        
        else if("verVentas".equals(accion)){
            dispatcher = request.getRequestDispatcher("ventas.html");
        
        }
        
        
        
        
        else{
            dispatcher = request.getRequestDispatcher("administradorPrincipal.jsp");  
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
