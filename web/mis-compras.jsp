<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Mis compras</title>

    <link rel="stylesheet" href="assets/css/style-1.css">
    <link rel="stylesheet" href="assets/css/styles-productos.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/style-navbar.css">

    <script src="assets/js/pago-transferencia.js" type="text/javascript"></script>
</head>

<body>

    <!-- Barra de navegación-->
    <nav class="barraNav">
        <div class="logo">
            <a href="clientesPrincipal.html">IZ</a>
        </div>
        
        <div class="opciones">
            <ul>
                <li><a href="mis-compras.jsp">Mis compras</a></li>
                <li><a href="index.html">Cerrar sesión</a></li>
                <li><a href="carrito.jsp"><img src="assets/Iconos/carrito-de-compras-negro.png" class="tamIconos"></a></li>
            </ul>
        </div>
    </nav>

    <div class="seccionCarrito">
        <div>
            <h1 class="h1-titulo">Mis compras</h1>
        </div>
        
        <div class="tabla-carritos">
            <table class="table table-hover" id="tVentas" name="tVentas">
                <thead>
                    <tr>
                        <th>Folio</th>
                        <th>Fecha de compra</th>
                        <th>Monto total</th>
                        <th>Monto pagado</th>
                        <th>Ver compra</th>
                    </tr>
                </thead>
                <tr>
                    <td>120504</td>
                    <td>2021-06-12</td>
                    <td>$diepeso</td>
                    <td>$cincopeso</td>
                    <td><a href="carrito.jsp"><img class="iconoCarrito" src="assets/Iconos/visibilidad.svg" alt=""></a></td>
                </tr>
                <tr>
                    <td>120504</td>
                    <td>2021-06-12</td>
                    <td>$diepeso</td>
                    <td>$cincopeso</td>
                    <td><a href="carrito.jsp"><img class="iconoCarrito" src="assets/Iconos/visibilidad.svg" alt=""></a></td>
                </tr>
            </table>
        </div>
    </div>

</body>
</html>