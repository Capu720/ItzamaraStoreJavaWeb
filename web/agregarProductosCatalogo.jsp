<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Productos al Catálogo</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/styles-2.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
    
</head>
<body>
    <div class="encabezado">
        <h1>CATÁLOGO</h1>
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
                <c:forEach var="catalogoProd" items="${lista}">
                    <tr>  
                        <td><c:out value="${catalogoProd.claveProducto}"/></td>
                        <td><c:out value="${catalogoProd.Nombre}"/></td>
                        <td><c:out value="${catalogoProd.Descripcion}"/></td>
                        <td><a href=""><img src="assets/Iconos/eliminar.svg" class="iconos-tam"></a></td>
                    </tr>
                </c:forEach>
                
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
                <c:forEach var="catalogoProd1" items="${lista1}">
                    <tr>  
                        <td><c:out value="${catalogoProd1.claveProducto}"/></td>
                        <td><c:out value="${catalogoProd1.Nombre}"/></td>
                        <td><c:out value="${catalogoProd1.Descripcion}"/></td>
                        <td><a href=""><img src="assets/Iconos/eliminar.svg" class="iconos-tam"></a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <br><br>
        <div id="FC3">
            <button type="button" class="btn btn-outline-dark" id="btnRegresar">Regresar</button>
        </div>
        <br><br>
    </div>
    
    
    
    </body>
</html>
