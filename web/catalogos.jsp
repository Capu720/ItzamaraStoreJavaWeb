<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Catálogo</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/styles-2.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    <script src="assets/js/catalogos.js" type="text/javascript"></script>
</head>
<body>
    <div class="encabezado">
        <h1><a href="AdministradorController"><img src="assets/Iconos/proximo.svg" class="iconos-tam inline"></a>Catálogos</h1>
    </div>
    <div id= "opciones">
        <ul class="dos-apartados">
            <li class="op btnOp" id="op1">Mis catálogos</li>
            <li class="op btnOp" id="op2">Crear</li>
        </ul>
    </div>
    <div id="misCatalogos" class="seccion">
        <table class="table table-hover" id="tCatalogos">
            <thead>
                <tr>
                    <th>Clave</th>
                    <th>Nombre</th>
                    <th>Agregar Productos</th> <!--Se podrán eliminar y agregar productos-->
                    <th>Imprimir</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            
            <tbody>
                <c:forEach var="catalogo" items="${lista}">
                    <tr>  
                        <td><c:out value="${catalogo.claveCata}"/></td>
                        <td><c:out value="${catalogo.nombreCata}"/></td>
                        <td><a href="AdministradorController?accion=verCataProducto&claveCata=<c:out value="${catalogo.claveCata}"/>"><img src="assets/Iconos/caja.svg" class="iconos-tam"></a></td>
                         <td><a href="AdministradorController?accion=impCatalogo&claveCata=<c:out value="${catalogo.claveCata}"/>"><img src="assets/Iconos/imprimir.png" class="iconos-tam"></a></td>
                        <td><a href=""><img src="assets/Iconos/eliminar.svg" class="iconos-tam"></a></td>
                    </tr>
                </c:forEach>
               
            </tbody>
        </table>
    </div>
    <div id="verProductos" class="seccion">
        <label for="lProductoCatalogo" class="pink">Productos del Catálogo</label>
        <table class="table table-hover" id="tProductos">
            <thead>
                <tr>
                    <th>Clave</th>
                    <th>Nombre</th>
                    <th>Descripción</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>Arracadas de oro</td>
                    <td>Par de arracadas de 14 kilates con incrustaciones de esmeralda</td>
                    <td><a href=""><img src="assets/Iconos/eliminar.svg" class="iconos-tam"></a></td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Pulseras amigos</td>
                    <td>Set de dos pulseras de corazón para compartir con amigo</td>
                    <td><a href=""><img src="assets/Iconos/eliminar.svg" class="iconos-tam"></a></td>
                </tr>
            </tbody>
        </table>
        <br><br>
        <label for="lProductos" class="pink">Todos los productos</label>
        <table class="table table-hover" id="tProductos">
            <thead>
                <tr>
                    <th>Clave</th>
                    <th>Nombre</th>
                    <th>Descripción</th>
                    <th>Agregar</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>Botella rosa</td>
                    <td>Botella de plástico rosa con 1 litro de capacidad</td>
                    <td><a href=""><img src="assets/Iconos/anadir.svg" class="iconos-tam"></a></td>
                </tr>
            </tbody>
        </table>
        <br><br>
        <div id="FC3">
            <button type="button" class="btn btn-outline-dark" id="btnRegresar">Regresar</button>
        </div>
        <br><br>
    </div>
    <div id="Crear" class="seccion">
        <!--Formulario de bootstrap-->
        <form class="needs-validation" autocomplete="off" novalidate="" id="idCrear">
            <div id="FC2">
                <div>
                    <label for="lClave">Clave</label>
                    <input type="text" class="form-control" id="tClave" required>
                </div> 
                <div>
                    <label for="lNombre">Nombre</label>
                    <input type="text" class="form-control" id="tNombre"  required>
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