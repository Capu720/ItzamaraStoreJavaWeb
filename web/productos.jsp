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
    <script src="assets/js/productos.js" type="text/javascript"></script>
</head>
<body>
    <div class="encabezado">
        <h1>Productos</h1>
    </div>
    <div id= "opciones">
        <ul class="dos-apartados">
            <li class="op btnOp" id="op1">Mis productos</li>
            <li class="op btnOp" id="op2">Crear</li>
        </ul>
    </div>
    <div id="misProductos" class="seccion">
        <table class="table table-hover" id="tProductos">
            <thead>
                <tr>
                    <th>Clave</th>
                    <th>Nombre</th>
                    <th>Descripción</th>
                    <th>Costo</th>
                    <th>Precio</th>
                    <th>Cantidad</th>
                    <th>Actualizar</th> 
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="producto" items="${lista}">
                    <tr>  
                        <td><c:out value="${producto.claveProdcto}"/></td>
                        <td><c:out value="${producto.nombreProd}"/></td>
                        <td><c:out value="${producto.descripcionProd}"/></td>
                        <td>$<c:out value="${producto.costoProd}"/></td>
                        <td>$<c:out value="${producto.precioProd}"/></td>
                        <td><c:out value="${producto.cantidad}"/></td>
                        <td><a href="AdministradorController?accion=modificarProducto&claveProd=<c:out value="${producto.claveProdcto}"/>"><img src="assets/Iconos/actualizar.svg" class="iconos-tam"></a></td>
                        <td><a href="AdministradorController?accion=eliminarProducto&claveProd=<c:out value="${producto.claveProdcto}"/>"><img src="assets/Iconos/eliminar.svg" class="iconos-tam"></a></td>
                    </tr>
                </c:forEach>
                    
            </tbody>
        </table>
    </div>
    <div id="actualizaProducto" class="seccion">
        <div id="seccion-AP">
            <div id="foto">
                <img src="assets/img/Productos/bbCream.jpg" alt="">
            </div>
            <div id="campos">
                <form class="needs-validation" autocomplete="off" novalidate="" id="idActualizar">
                    <div id="FC1-1">
                        <div>
                            <label for="lClave">Clave</label>
                            <input type="text" class="form-control" id="taClave" required="required" readonly="readonly">
                        </div> 
                        <div>
                            <label for="lNombre">Nombre</label>
                            <input type="text" class="form-control" id="taNombre"  required>
                        </div> 
                        <div>
                            <label for="lCantidad">Cantidad</label>
                            <input type="text" class="form-control" id="taCantidad"  required>
                        </div>         
                    </div>
                    <div class="espacio"></div>
                    <div>
                        <label for="lDescripcion">Descripción</label>
                        <textarea class="form-control" id="txtaDescripcion" rows="3" required></textarea>
                    </div>
                    <div class="espacio"></div>
                    <div id="FC1-1">
                        <div>
                            <label for="lCosto">Costo</label>
                            <input type="text" class="form-control" id="taCosto" required>
                        </div> 
                        <div>
                            <label for="lPrecio">Precio</label>
                            <input type="text" class="form-control" id="taPrecio"  required>
                        </div> 
                        <div>
                            <label for="formFileMultiple" class="form-label">Añadir imagen</label>
                            <input class="form-control" type="file" id="faImagen" multiple required>
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
    <div id="Crear" class="seccion">
        <!--Formulario de bootstrap-->
        <div id="camposCrear">
            <form class="needs-validation" autocomplete="off" novalidate="" id="idCrear" method="POST" action="AdministradorController?accion=insertaProducto">
                <div id="FC1-1">
                    <div class="FC1-espacio">
                        <label for="lClave">Clave</label>
                        <input type="text" class="form-control" id="tcClave" name="tcClave" required>
                    </div> 
                    <div>
                        <label for="lNombre">Nombre</label>
                        <input type="text" class="form-control" id="tcNombre" name="tcNombre" required>
                    </div>  
                    <div>
                        <label for="lCantidad">Cantidad</label>
                        <input type="text" class="form-control" id="tcCantidad" name="tcCantidad" required>
                    </div>           
                </div>
                <div class="espacio"></div>
                    <div>
                        <label for="lDescripcion">Descripción</label>
                        <textarea class="form-control" id="txtcDescripcion" name="txtcDescripcion" rows="3" required></textarea>
                    </div>
                    <div class="espacio"></div>
                    <div id="FC1-1">
                        <div>
                            <label for="lCosto">Costo</label>
                            <input type="text" class="form-control" id="tcCosto" name="tcCosto" required>
                        </div> 
                        <div>
                            <label for="lPrecio">Precio</label>
                            <input type="text" class="form-control" id="tcPrecio" name="tcPrecio"  required>
                        </div> 
                        <div>
                            <label for="formFileMultiple" class="form-label">Imagen</label>
                            <input class="form-control" type="file" id="fcImagen" name="fcImagen" multiple required>
                        </div>     
                    </div>  
                    <div class="espacio"></div>
                <div id="FC3">
                    <button type="submit" class="btn btn-outline-dark" id="btnCrear">Crear</button>
                </div>
            </form> 
        </div>  
    </div>
    <script src="assets/js/validacion.js"></script>
</body>
</html>