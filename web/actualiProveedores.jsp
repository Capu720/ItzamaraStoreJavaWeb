<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Proveedores</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/css/styles-2.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="encabezado">
            <h1>Proveedores</h1>
        </div>
        
        <div id="actualizaProveedor" class="seccion">
            <form class="needs-validation" autocomplete="off" action="AdministradorController?accion=atualizarProv" method="POST">
                <div id="FC1">
                    <div>
                        <label for="lClave">Clave</label>
                        <input type="text" class="form-control" id="taClave" name="taClave" required="required" readonly="readonly" value="<c:out value="${prove.claveProv}"/>">
                    </div> 
                    <div>
                        <label for="lNombre">Nombre</label>
                        <input type="text" class="form-control" id="taNombre" name="taNombre" required value="<c:out value="${prove.nombreProv}"/>">
                    </div>  
                    <div>
                        <label for="lTelefono">Telefono</label>
                        <input type="text" class="form-control" id="taTelefono" name="taTelefono" required value="<c:out value="${prove.telefonoProv}"/>" >
                    </div>        
                </div>
                <br>
                <div id="FC3">
                    <button type="button" class="btn btn-outline-dark" id="btnRegresar">Regresar</button>
                    <button type="submit" class="btn btn-outline-dark" id="btnActualizar">Actualizar</button>
                </div>
            </form> 
        </div>
        
        <script src="assets/js/validacion.js"></script>
    </body>
</html>
