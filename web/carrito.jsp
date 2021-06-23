<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Mi carrito</title>

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
            <h1 class="h1-titulo">Mi carrito</h1>
        </div>
        
        <div class="tabla-carritos">
            <table class="table table-hover" id="tVentas" name="tVentas">
                <thead>
                    <tr>
                        <th>Producto</th>
                        <th>Nombre</th>
                        <th>Cantidad</th>
                        <th>Monto</th>
                        <th>Quitar</th>
                    </tr>
                </thead>
                <tr>
                    <td><img class="imagenCarrito" src="assets/img/Productos/bbCream.jpg" alt="prod"></td>
                    <td>Cremita para la piel</td>
                    <td>2</td>
                    <td>$ 5.00</td>
                    <td><a href="carrito.jsp"><img class="iconoCarrito" src="assets/Iconos/menos.svg" alt=""></a></td>
                </tr>
            </table>

            <div class="div-btn texto-derecha">
                <button class="btn btn-outline-dark" onclick="location='mis-compras.jsp'" type="submit">Confirmar compra</button>
            </div>
        </div>
    </div>

</body>
</html>