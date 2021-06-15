<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Clientes</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/css/styles-2.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="encabezado">
            <h1><a href="AdministradorController?accion=verClientes"><img src="assets/Iconos/proximo.svg" class="iconos-tam inline"></a>Clientes</h1>
        </div>
         <form class="needs-validation" autocomplete="off" novalidate="" method="POST" action="AdministradorController?accion=actualizarCliente">
            <div id="FC1">
                <div>
                    <label for="lClave">Clave</label>
                    <input type="text" class="form-control" id="tClave" name="tClave" required="required" readonly="readonly" value="<c:out value="${cliente.claveUsuario}"/>">
                </div> 
                <div>
                    <label for="lNombre">Nombre</label>
                    <input type="text" class="form-control" id="tNombre" name="tNombre" required value="<c:out value="${cliente.nombre}"/>">
                </div> 
                <div>
                    <label for="lApPaterno">Apellido Paterno</label>
                    <input type="text" class="form-control" id="tApPaterno" name="tApPaterno" required value="<c:out value="${cliente.apPat}"/>">
                </div>  
                <div>
                    <label for="lApMaterno">Apellido Materno</label>
                    <input type="text" class="form-control" id="tApMaterno" name="tApMaterno" required value="<c:out value="${cliente.apMat}"/>">
                </div>        
            </div>
            <div id="FC2">
                <div>
                    <label for="lCorreo">Correo</label>
                    <input type="email" class="form-control" id="tCorreo" name="tCorreo" required value="<c:out value="${cliente.correoClt}"/>">
                </div>
                <div>
                    <label for="lTelefono">Telefono</label>
                    <input type="number" class="form-control" id="telefono" name="telefono"  required value="<c:out value="${cliente.telefonoClt}"/>">
                </div>
            </div>
            <div id="FC3">
                <button type="button" class="btn btn-outline-dark" id="btnRegresar">Regresar</button>
                <button type="submit" class="btn btn-outline-dark" id="btnActualizar">Actualizar</button>
            </div>
        </form> 
    </body>
</html>
