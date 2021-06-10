<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Registro</title>
    </head>
    <body>
        <h1>Modificar Registro</h1>
        <form action="ProductosConroller?accion=actualizar" method="POST" autocomplete="off">
            <input id="id" name="id" type="hidden" value="<c:out value="${producto.id}"/>"/> 
            <p>Codigo: <input id="codigo" name="codigo" type="text" value="<c:out value="${producto.codigo}"/>" /> </p>
            <p>Nombre:  <input id="nombre" name="nombre" type="text"value="<c:out value="${producto.nombre}"/>" /></p>
            <p>Precio: <input id="precio" name="precio" type="text" value="<c:out value="${producto.precio}"/>" /></p>
            <p>Existencia: <input id="existencia" name="existencia" type="text" value="<c:out value="${producto.existencia}"/>" /></p>
            
            <br>
            <button id="guardar" name="guardar" type="submit">Modificar registro</button>
        </form>
    </body>
</html>
