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
        <h1>Clientes</h1>
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
        <!--Formulario de bootstrap-->
        <form class="needs-validation" autocomplete="off" novalidate="">
            <div id="FC1">
                <div>
                    <label for="lClave">Clave</label>
                    <input type="text" class="form-control" id="tClave" required="required" readonly="readonly">
                </div> 
                <div>
                    <label for="lNombre">Nombre</label>
                    <input type="text" class="form-control" id="tNombre"  required>
                </div> 
                <div>
                    <label for="lApPaterno">Apellido Paterno</label>
                    <input type="text" class="form-control" id="tApPaterno"  required>
                </div>  
                <div>
                    <label for="lApMaterno">Apellido Materno</label>
                    <input type="text" class="form-control" id="tApMaterno"  required>
                </div>        
            </div>
            <div id="FC2">
                <div>
                    <label for="lCorreo">Correo</label>
                    <input type="email" class="form-control" id="tCorreo"  required>
                </div>
                <div>
                    <label for="lTelefono">Telefono</label>
                    <input type="number" class="form-control" id="telefono"  required>
                </div>
            </div>
            <div id="FC3">
                <button type="button" class="btn btn-outline-dark" id="btnRegresar">Regresar</button>
                <button type="submit" class="btn btn-outline-dark" id="btnActualizar">Actualizar</button>
            </div>
        </form> 
    </div>
    <script src="assets/js/val-clientes.js"></script>
</body>
</html>