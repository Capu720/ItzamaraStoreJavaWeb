<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Página principal de administrador</title>

    <link rel="stylesheet" href="assets/css/style-navbar.css">
    <link rel="stylesheet" href="assets/css/style-1.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>

<body class="sin-margen">
    <!--Barra de navegación para la señorona, doña Cucha-->
    <nav class="barraNav">
        <div class="logo">
            <a href="administradorPrincipal.jsp">IZ</a>
        </div>
        
        <div class="opciones">
            <ul>
                <li><a href="index.html">Cerrar sesión</a></li>
            </ul>
        </div>
        <div></div>
    </nav>

    <!--Menú con las opciones para la poderosa e imponente doña cucha-->
    <div class="menuAdmin">
        <div class="tituloAdmin">
            <h1>Administrador</h1>
        </div>
        <div class="opcionesAdmin">
            <div class="matriz">
                <div class="celda"><a href="ganancias.jsp">Ganancias</a></div>
                <div class="celda"><a href="catalogos.jsp">Gestionar catálogos</a></div>
                <div class="celda"><a href="Clientes.jsp">Gestionar clientes</a></div>
                <div class="celda"><a href="productos.jsp">Gestionar productos</a></div>
                <div class="celda"><a href="proveedores.jsp">Gestionar proveedores</a></div>
                <div class="celda"><a href="">Ventas</a></div>
            </div>
        </div>
    </div>
</body>
</html>