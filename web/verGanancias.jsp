<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/style-1.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <title>Ganancias</title>
    </head>
    <body>
        <div class="nav-titulo-pagina-principal">
            <a class="a-pagina-inicio" href="index.html"><strong>IZ</strong></a>
        </div>
        <h1 class="h1-titulo" id="ttlGanancias" name = "ttlGanancias">Ganancias del <c:out value="${estado.fechaInicio}"/> al <c:out value="${estado.fechaFin}"/> </h1>
        
        <section id="seccionVentas" name="seccionVentas" class="ventas">
            
            <div class="campos">
                <ul class="grid-tres-columnas">
                    <li id="idGanancias" name = "idGanancias">Ganancias: $<c:out value="${estado.ganancias}"/> </li>
                    <li id="idIngresos" name = "idIngresos">Ingresos: $<c:out value="${estado.ventas}"/> </li>
                    <li id="idCostos" name = "idCostos">Costos: $<c:out value="${estado.costos}"/> </li>
                </ul>
            </div>

            <p>Resumen de ventas</p>
            <div class="tabla-ventas">
                <table class="table table-hover" id="tVentas" name="tVentas">
                    <thead>
                        <tr>
                            <th>Folio</th>
                            <th>Fecha</th>
                            <th>Monto total</th>
                            <th>Monto pagado</th>
                            <th>Cliente</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="venta" items="${lista}">
                        <tr>
                            <th><c:out value="${venta.claveVta}"/></th>
                            <th><c:out value="${venta.fecha}"/></th>
                            <th>$<c:out value="${venta.montoTotal}"/></th>
                            <th>$<c:out value="${venta.montoPagado}"/></th>
                            <th><c:out value="${venta.claveClt}"/></th>
                        </tr>
                        </c:forEach>
                    </tbody>

                </table>
                </div>
                <div class="div-btn texto-derecha">
                    <button class="btn btn-outline-dark" onclick="location='ganancias.jsp'" type="submit">Regresar</button>
                </div>
        </section>
    </body>
</html>
