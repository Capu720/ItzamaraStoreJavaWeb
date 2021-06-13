<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Productos</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/styles-2.css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet">

</head>
    <body>
        <div class="encabezado">
            <h1>Productos</h1>
        </div>
        
        <div id="actualizaProducto" class="seccion">
             <div id="seccion-AP">
                 <div id="foto">
                     <img src="<c:out value="${produ.imagen}"/>" alt="">
                 </div>
                 <div id="campos">
                     <form class="needs-validation" autocomplete="off" novalidate="" id="idActualizar" method="POST">
                         <div id="FC1-1">
                             <div>
                                 <label for="lClave">Clave</label>
                                 <input type="text" class="form-control" id="taClave" name="taClave" required="required" readonly="readonly" value="<c:out value="${produ.claveProdcto}"/>">
                             </div> 
                             <div>
                                 <label for="lNombre">Nombre</label>
                                 <input type="text" class="form-control" id="taNombre" name="taNombre"  required value="<c:out value="${produ.nombreProd}"/>">
                             </div> 
                             <div>
                                 <label for="lCantidad">Cantidad</label>
                                 <input type="text" class="form-control" id="taCantidad" name="taCantidad" required value="<c:out value="${produ.cantidad}"/>">
                             </div>         
                         </div>
                         <div class="espacio"></div>
                         <div>
                             <label for="lDescripcion">Descripción</label>
                             <textarea class="form-control" id="txtaDescripcion" name="txtaDescripcion" rows="3" required ><c:out value="${produ.descripcionProd}"/></textarea>
                         </div>
                         <div class="espacio"></div>
                         <div id="FC1-1">
                             <div>
                                 <label for="lCosto">Costo</label>
                                 <input type="text" class="form-control" id="taCosto" name="taCosto" required value="<c:out value="${produ.costoProd}"/>">
                             </div> 
                             <div>
                                 <label for="lPrecio">Precio</label>
                                 <input type="text" class="form-control" id="taPrecio" name="taPrecio" required value="<c:out value="${produ.precioProd}"/>">
                             </div> 
                             <div>
                                 <label for="formFileMultiple" class="form-label">Añadir imagen</label>
                                 <input class="form-control" type="file" id="faImagen" name="faImagen" multiple required>
                             </div>      
                         </div>  
                         <div class="espacio"></div>
                         <div id="FC3">
                             <button type="button" class="btn btn-outline-dark" id="btnRegresar">Regresar</button>
                             <button type="submit" class="btn btn-outline-dark" id="btnActualizar">Actualizar</button>
                         </div>  
                     </form>
                 </div> 
             </div>
         </div>
        <script src="assets/js/validacion.js"></script>
    </body>
</html>
