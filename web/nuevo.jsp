<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Regitro</title>
    </head>
    <body>
        <h1>Registra tu nuevo articulo</h1>
       
        <form action="ProductosConroller?accion=insertar" method="POST" autocomplete="off">
            <p>Codigo: <input id="codigo" name="codigo" type="text" /> </p>
            <p>Nombre:  <input id="nombre" name="nombre" type="text" /></p>
            <p>Precio: <input id="precio" name="precio" type="text" /></p>
            <p>Existencia: <input id="existencia" name="existencia" type="text" /></p>
            
            <br>
            <button id="guardar" name="guardar" type="submit">Guardar registro</button>
        </form>
    </body>
</html>
