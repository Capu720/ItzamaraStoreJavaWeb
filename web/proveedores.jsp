<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proveedores</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/styles-2.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <script src="assets/js/proveedores.js" type="text/javascript"></script>
</head>
<body>
    <div class="encabezado">
        <h1>Proveedores</h1>
    </div>
    <div id= "opciones">
        <ul class="dos-apartados">
            <li class="op btnOp" id="op1">Mis proveedores</li>
            <li class="op btnOp" id="op2">Crear</li>
        </ul>
    </div>
    <div id="misProveedores" class="seccion">
        <table class="table table-hover" id="tProveedores">
            <thead>
                <tr>
                    <th>Clave</th>
                    <th>Nombre</th>
                    <th>Telefono</th>
                    <th>Actualizar</th> 
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <!--var es el objeto item el mismo que los controllers --!>
                 <c:forEach var="prove" items="${lista}">
                     <!--Es a la clase principal donde declaramos atributos getter y setters-->                  
                     <tr>  
                        <td><c:out value="${prove.claveProv}"/></td>
                        <td><c:out value="${prove.nombreProv}"/></td>
                        <td><c:out value="${prove.telefonoProv}"/></td>
                        <td><a href="AdministradorController?accion=modificarProveedor&claveProv=<c:out value="${prove.claveProv}"/>"><img src="assets/Iconos/actualizar.svg" class="iconos-tam"></a></td>
                        <td><a href="AdministradorController?accion=eliminarProvedor&claveProv=<c:out value="${prove.claveProv}"/>""><img src="assets/Iconos/eliminar.svg" class="iconos-tam"></a></td>
                     </tr>
                </c:forEach>
                
            </tbody>
        </table>
    </div>
    <div id="actualizaProveedor" class="seccion">
        <form class="needs-validation" autocomplete="off" novalidate="" id="idActualizar" action="AdministradorController?accion=actuaProveedor">
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
    <div id="Crear" class="seccion">
        <!--Formulario de bootstrap-->
        <form class="needs-validation" autocomplete="off" novalidate="" id="idCrear" action="AdministradorController?accion=crearProveedor" method="POST">
            <div id="FC1">
                <div>
                    <label for="lClave">Clave</label>
                    <input type="text" class="form-control" id="tcClave" name="tcClave" required>
                </div> 
                <div>
                    <label for="lNombre">Nombre</label>
                    <input type="text" class="form-control" id="tcNombre"  name="tcNombre" required>
                </div>  
                <div>
                    <label for="lTelefono">Telefono</label>
                    <input type="text" class="form-control" id="tcTelefono" name="tcTelefono" required>
                </div>        
            </div>
            <div id="FC3">
                <button type="submit" class="btn btn-outline-dark" id="btnCrear">Crear</button>
            </div>
        </form> 
    </div>
    <script src="assets/js/validacion.js"></script>
</body>
</html>