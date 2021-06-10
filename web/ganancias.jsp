<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Ganancias</title>
    <link rel="stylesheet" href="assets/css/style-1.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com"/>
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet"/>
    <link rel="preconnect" href="https://fonts.gstatic.com"/>
    <link href="https://fonts.googleapis.com/css2?family=Inconsolata:wght@300&display=swap" rel="stylesheet"/>
</head>

<body class="body-form">

    <!--Barra de navegación-->
    <div class="nav-titulo-pagina-principal">
        <a class="a-pagina-inicio" href="index.html"><strong>IZ</strong></a>
    </div>
    <div>
        <h1 class="h1-titulo">Ganancias</h1>
    </div>

    <!--Formulario-->
    <form class="needs-validation" autocomplete="off" novalidate="">
        <div class="campos">
            <ul class="form-ganancias">
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
                    <button class="btn btn-outline-dark" type="submit">Calcular ganancias</button>
                </li>
            </ul>
        </div>
    </form>

    <!--Ventas y ganancias-->
    <section id="seccionVentas" name="seccionVentas" class="ventas">
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
    </section>

    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-init.js"></script>
    <script src="assets/js/validacion.js"></script>
</body>
</html>