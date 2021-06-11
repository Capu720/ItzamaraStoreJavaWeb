<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Registro de pago por transferencia</title>
    <link rel="stylesheet" href="assets/css/style-1.css">
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="preconnect" href="https://fonts.gstatic.com"/>
    <link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet"/>
    <link rel="preconnect" href="https://fonts.gstatic.com"/>
    <link href="https://fonts.googleapis.com/css2?family=Inconsolata:wght@300&display=swap" rel="stylesheet"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>

<body class="body-form">
    <div class="nav-titulo-pagina-principal">
        <a class="a-pagina-inicio" href="index.html"><strong>IZ</strong></a>
    </div>
    <div>
        <h1 class="h1-titulo">Registro de pago por transferencia</h1>
    </div>
    <form class="needs-validation" autocomplete="off" novalidate="">
        <div class="col-6 centrado">
            <div class="div-datos">
                <label class="form-label">Clave de rastreo</label>
                <input class="form-control" type="text" id="txtClave" name="txtClave" pattern="[0-9]{5,30}" required="" maxlength="30" minlength="5">
                <div class="valid-feedback"></div>
                <div class="invalid-feedback"></div>
            </div>

            <div class="div-datos">
                <label class="form-label">Banco</label>
                <select id="txtBanco" name="txtBanco" class="form-select" aria-label="Default select example">
                    <option selected>Selecciona un banco</option>
                    <option value="1">Banorte</option>
                    <option value="2">Banamex</option>
                    <option value="3">Santander</option>
                </select>
            </div>
        </div>
        <div class="text-center">
            <button class="btn btn-outline-dark btn-rgC" type="submit">Registrar datos</button>
        </div>
    </form>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-init.js"></script>
    <script src="assets/js/validacion.js"></script>
</body>
</html>