<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Registro de clientes</title>
    
    <link rel="stylesheet" href="assets/css/style-1.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <script src="assets/js/registroClt.js" type="text/javascript"></script>
</head>

<body class="body-registroClt">

    <!-- Barra de navegación simple-->
    <div class="nav-titulo-pagina-principal">
        <a class="a-pagina-inicio" href="index.html"><strong>IZ</strong></a>
    </div>
    
    <div>
        <h1 class="h1-titulo">Registrarme en itzamara store</h1>
    </div>
    <form id="idFormRegistroClt" name="idFormRegistroClt" class="needs-validation form-datos-rc" autocomplete="off" novalidate="" action="UsuarioController?accion=insertar" method="POST">
        <div class="col-6 div-txt">
            <div class="div-datos">
                <label class="form-label">Nombre</label>
                <input class="form-control" type="text" id="txtNombre" name="txtNombre" pattern="[A-Za-zÁÉÍÓÚáéíóúñÑ ]{3,30}" required="" maxlength="30" minlength="3">
                <div class="valid-feedback"></div>
                <div class="invalid-feedback"></div>
            </div>
            <div class="div-datos">
                <label class="form-label">Apellido Paterno</label>
                <input class="form-control" type="text" id="txtApPat" name="txtApPat" required="" maxlength="20" minlength="3" pattern="[A-Za-zÁÉÍÓÚáéíóúñÑ]{3,20}">
                <div class="valid-feedback"></div>
                <div class="invalid-feedback"></div>
            </div>
            <div class="div-datos">
                <label class="form-label">Apellido Materno</label>
                <input class="form-control" type="text" id="txtApMat" name="txtApMat" minlength="3" maxlength="20" pattern="[A-Za-zÁÉÍÓÚáéíóúñÑ]{3,20}" required="">
                <div class="valid-feedback"></div>
                <div class="invalid-feedback"></div>
            </div>
        </div>
        <div class="col-6 div-txt">
            <div class="div-datos">
                <label class="form-label">Correo electrónico</label>
                <input class="form-control" type="email" id="txtCorreo" name="txtCorreo" required="" maxlength="30" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$">
                <div class="valid-feedback"></div>
                <div class="invalid-feedback"></div>
            </div>
            <div class="div-datos">
                <label class="form-label">Teléfono celular (WhatsApp)</label>
                <input class="form-control" type="tel" id="txtTel" name="txtTel" pattern="[0-9]{10,13}" required="" maxlength="13">
                <div class="valid-feedback"></div>
                <div class="invalid-feedback"></div>
            </div>
            <div class="div-datos"><label class="form-label">Contraseña</label>
                <input class="form-control" type="text" id="txtContra" name="txtContra" maxlength="8" required="" pattern="[A-Za-z0-9]{4,8}">
                <div class="valid-feedback"></div>
                <div class="invalid-feedback"></div>
            </div>
        </div>
        <div class="text-center">
            <button class="btn btn-outline-dark btn-rgC" id="btnRegistrar" name="btnRegistrar" type="submit">Registrar datos</button>
        </div>
    </form>
    <script src="assets/js/validacion.js"></script>
</body>
</html>