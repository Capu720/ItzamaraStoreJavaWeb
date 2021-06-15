<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clientes</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/styles-2.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <script src="assets/js/clientes.js" type="text/javascript"></script>
</head>
<body>
    <div class="encabezado">
        <h1><a href="AdministradorController"><img src="assets/Iconos/proximo.svg" class="iconos-tam inline"></a>Clientes</h1>
    </div>
    <div id= "opciones">
        <ul class="dos-apartados">
            <li class="op" id="op1">Mis clientes</li>
            <li class="op" id="op2">Actualizar</li>
        </ul>
    </div>
    <div id="misClientes">
        <table class="table table-hover" id="tClientes">
            <thead>
                <tr>
                    <th>Clave</th>
                    <th>Nombre</th>
                    <th>Apellido Paterno</th>
                    <th>Apellido Materno</th>
                    <th>Correo</th>
                    <th>Telefono</th>
                    <th>Actualizar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            
            <tbody>
                <!<!--var es el objeto item el mismo que los controllers -->
                 <c:forEach var="cliente" items="${lista}">
                     <!<!--Es a la clase principal donde declaramos atributos getter y setters-->
                     <tr>  
                        <td><c:out value="${cliente.claveUsuario}"/></td>
                        <td><c:out value="${cliente.nombre}"/></td>
                        <td><c:out value="${cliente.apPat}"/></td>
                        <td><c:out value="${cliente.apMat}"/></td>
                        <td><c:out value="${cliente.correoClt}"/></td>
                        <td><c:out value="${cliente.telefonoClt}"/></td>
                        <td><a href="AdministradorController?accion=verCliente&claveUsuario=<c:out value="${cliente.claveUsuario}"/>"><img src="assets/Iconos/actualizar.svg" class="iconos-tam" name="actualizar"></a></td>
                        <td><a href="AdministradorController?accion=eliminarClinte&claveUsuario=<c:out value="${cliente.claveUsuario}"/>"><img src="assets/Iconos/eliminar.svg" class="iconos-tam"></a></td>
                     </tr>
                </c:forEach>
                
            </tbody>
           
        </table>
    </div>
    <div id="actualizar">
        
    </div>
    <script src="assets/js/val-clientes.js"></script>
</body>
</html>