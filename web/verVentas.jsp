<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ventas</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/styles-2.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
</head>
<body>
    <div class="encabezado">
        <h1><a href="AdministradorController"><img src="assets/Iconos/proximo.svg" class="iconos-tam inline"></a>Ventas</h1>
    </div>
    <div id="misVentas" class="seccion">
        <form class="needs-validation" autocomplete="off" novalidate="" id="idBuscarC">
            <div id="FC3">
                <!--Seleccionar al cliente-->
                <!--Se planea que cuando la caja de texto se encuentra sin valor y al cargar la página, se muestre la tabla correspondiente a todos los clientes-->
                <label for="lCl" class="tamL pink">Cliente: </label>
                <input type="text" class="form-control" id="taClave">
                <button type="submit" class="btn btn-outline-dark" id="btnActualizar">Buscar</button>
            </div>
        </form>
        <br>
        <table class="table table-hover" id="tVentas">
            <thead>
                <tr>
                    <th>Folio</th>
                    <th>Fecha</th>
                    <th>Monto Total</th>
                    <th>MontoPagado</th> 
                    <th>Cliente</th> 
                    <th>Ver venta</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="ventas" items="${lista}">
                    <tr>
                        <th><c:out value="${ventas.claveVta}"/></th>
                        <th><c:out value="${ventas.fecha}"/></th>
                        <th>$<c:out value="${ventas.montoTotal}"/></th>
                        <th>$<c:out value="${ventas.montoPagado}"/></th>
                        <th><c:out value="${ventas.nombre}"/></th>
                        <td><a href="AdministradorController?accion=verVentaCliente&claveVenta=<c:out value="${ventas.claveVta}"/>"><img src="assets/Iconos/visibilidad.svg" class="iconos-tam"></a></td>
                    </tr>
                </c:forEach>
                
            </tbody>
        </table>
    </div>
    <!--Si quieres validar la caja de texto ocupa esto-->
    <!--<script src="assets/js/validacion.js"></script>-->
</body>
</html>
