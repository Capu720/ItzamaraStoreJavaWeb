<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/styleCata.css">
    <script src="assets/js/html2pdf.bundle.min.js"></script>
    <script src="assets/js/imprimir.js"></script>
    <title>Catalogo</title>
</head>

<body onload="imprimir();">
    <section id="cata">

        <div class="logo">
            <h1>Itzamara Store</h1>
        </div>
        
        <c:forEach var="catalogoProd" items="${lista}">
            <div class="Producto">
                <div class="imagen">
                    <img src="<c:out value="${catalogoProd.imagen}"/>">
                </div>
                <div class="texto">
                    <p>Clave:<c:out value="${catalogoProd.claveProducto}"/></p>
                    <p>Nombre:<c:out value="${catalogoProd.nombre}"/></p>
                    <p>Descripcion:<c:out value="${catalogoProd.descripcion}"/></p>
                    <p>Precio:$<c:out value="${catalogoProd.precio}"/></p>
                </div>
            </div>
        </c:forEach>

    </section>
</body>

</html>
