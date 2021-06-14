<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Ganancias</title>
    
    <link rel="stylesheet" href="assets/css/style-1.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    
</head>

<body class="body-form">

    <!--Barra de navegación-->
    <div class="nav-titulo-pagina-principal">
        <a class="a-pagina-inicio" href="index.html"><strong>IZ</strong></a>
    </div>
    <h1 class="h1-titulo" id="ttlGanancias" name = "ttlGanancias">Ganancias</h1>

    <!--Formulario-->
    <form id="idDatos" name="idDatos" class="needs-validation" autocomplete="off" novalidate="" method="POST" action="AdministradorController?accion=generarGanancia">
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
                    <button class="btn btn-outline-dark" id="btnCalcular" type="submit">Calcular ganancias</button>
                </li>
            </ul>
        </div>
    </form>

    <script src="assets/js/validacion.js"></script>
</body>
</html>