<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Ganancias</title>
    
    <link rel="stylesheet" href="assets/css/style-1.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <script src="assets/js/ganancias.js" type="text/javascript"></script>
</head>

<body class="body-form">

    <!--Barra de navegación-->
    <div class="nav-titulo-pagina-principal">
        <a class="a-pagina-inicio" href="index.html"><strong>IZ</strong></a>
    </div>
    <h1 class="h1-titulo" id="ttlGanancias" name = "ttlGanancias">Ganancias</h1>

    <!--Formulario-->
    <form id="idDatos" name="idDatos" class="needs-validation" autocomplete="off" novalidate="">
        <div class="campos">
            <ul class="grid-tres-columnas">
                <li>
                    <div class="col-7 centrado">
                        <label class="form-label">Fecha de inicio</label>
                        <input class="form-control" type="date" id="txtInicio" name="txtInicio" required="">
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback"></div>
                    </div>
                </li>
                <li>
                    <div class="col-7 centrado">
                        <label class="form-label">Fecha de fin</label>
                        <input class="form-control" type="date" id="txtFin" name="txtFin" required="">
                        <div class="valid-feedback"></div>
                        <div class="invalid-feedback"></div>
                    </div>                  
                </li>
                <li>
                    <button class="btn btn-outline-dark" id="btnCalcular" name="btnCalcular" type="submit">Calcular ganancias</button>
                </li>
            </ul>
        </div>
    </form>

    <!--Ventas y ganancias-->
    <section id="seccionVentas" name="seccionVentas" class="ventas">

        <div class="campos">
            <ul class="grid-tres-columnas">
                <li id="idGanancias" name = "idGanancias">Ganancias: $ </li>
                <li id="idIngresos" name = "idIngresos">Ingresos: $ </li>
                <li id="idCostos" name = "idCostos">Costos: $ </li>
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
                <tr>
                    <td>33900</td>
                    <td>10-Jul-2000</td>
                    <td>$5000</td>
                    <td>$4000</td>
                    <td>4</td>
                </tr>
                <tr>
                    <td>2565</td>
                    <td>10-Jul-2001</td>
                    <td>$5020</td>
                    <td>$4000</td>
                    <td>8</td>
                </tr>
            </table>
        </div>
        <div class="div-btn texto-derecha">
            <button class="btn btn-outline-dark" onclick="location='ganancias.jsp'" type="submit">Regresar</button>
        </div>
    </section>
    <script src="assets/js/validacion.js"></script>
</body>
</html>