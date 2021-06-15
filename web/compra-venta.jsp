<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ventas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="assets/css/styles-2.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">
</head>
<body>
    <div class="encabezado">
        <h1><a href="AdministradorController?accion=verVentas"><img src="assets/Iconos/proximo.svg" class="iconos-tam inline"></a>Venta</h1>
    </div>
    <div class="seccion-montos">
        <div id="cantidades">
            
            <div>
                <p class="inline n">Monto Total:$<c:out value="${ventas.montoTotal}"/> </p><p class="inline n" id="MT"></p>
            </div>
            <div>
                <p class="inline n">Monto Pagado:$<c:out value="${ventas.montoPagado}"/>  </p><p class="inline n" id="MP"></p>
            </div>
            <div>
                <p class="inline n">Productos entregados: <c:out value="${ventas.nombre}"/> </p><p class="inline n" id="MP"></p>
            </div>
            
            <br>
           
        </div>
        
        <div class="wrapper">
            <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                <p class="tamL pink">Productos vendidos</p>
                <div class="carousel-inner">
                    
                     <div class="carousel-item active">
                            <img src="assets/img/itza.PNG" class="d-block w-100 tamImg " alt="...">
                            <p class="prTitulo">Revisa los productos de tu cliente</p>
                    </div>
                    
                    
                    <c:forEach var="productos" items="${lista1}">
                        <div class="carousel-item">
                            <img src="<c:out value="${productos.imagen}"/>" class="d-block w-100 tamImg " alt="...">
                            <p class="prTitulo"><c:out value="${productos.nombreProd}"/></p>
                            <p><c:out value="${productos.descripcionProd}"/></p>
                        </div>
                    </c:forEach>
                    
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
                </button>
                <button type="submit" class="btn btn-outline-dark" id="btnPE">Productos entregados</button>
            </div>
            
            
            <div class="info">
                <p class="tamL pink">Pagos</p>
                <br>
                <table class="table table-hover" id="tVentas">
                    <thead>
                        <tr>
                            <th>Folio</th>
                            <th>Fecha</th>
                            <th>Monto</th>
                        </tr>
                    </thead>
                    <tbody>
                        
                        <c:forEach var="pagos" items="${lista}">
                            <tr>
                                <th><c:out value="${pagos.folio}"/></th>
                                <th><c:out value="${pagos.fecha}"/></th>
                                <th>$<c:out value="${pagos.monto}"/></th>
                            </tr>
                        </c:forEach>
                    
                    </tbody>
                </table>
                <br>
                <p class="tamL pink">Pagos en efectivo</p>
                <form class="needs-validation" autocomplete="off" novalidate="" id="idPago" method="POST" action="AdministradorController?accion=agregarPago">
                    <div id="pago">
                        <label for="lCl">Cantidad: </label>
                        <input type="number" class="form-control" id="idCantidad" name="idCantidad" required>
                        <button type="submit" class="btn btn-outline-dark" id="btnRegistrar">Registrar</button>
                        <input type="text" id="idVen" name="idVen" value="<c:out value="${ventas.claveVta}"/>" style="display: none">
                    </div>
                </form>
                <script src="assets/js/validacion.js"></script>
            </div>
        </div>    
    </div>
</body>
</html>
