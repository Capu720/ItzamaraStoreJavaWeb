<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>is-jeje</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Contact-Form-Clean.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
    <link rel="stylesheet" href="assets/css/style-1.css">
<link rel="preconnect" href="https://fonts.gstatic.com"/>
<link href="https://fonts.googleapis.com/css2?family=Julius+Sans+One&display=swap" rel="stylesheet"/>
<link rel="preconnect" href="https://fonts.gstatic.com"/>
<link href="https://fonts.googleapis.com/css2?family=Inconsolata:wght@300&display=swap" rel="stylesheet"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>

<body class="body-inicio-sesion">
    <div class="nav-titulo-pagina-principal">
        <a class="a-pagina-inicio" href="index.html"><strong>IZ</strong></a>
    </div>
    <section class="text-start contact-clean" style="background: rgba(255,255,255,0);font-size: 16px;color: #2d2b2b;">
        <form class="needs-validation" action="UsuarioController?accion=login" method="POST" style="box-shadow: 0px 0px 5px 0px #bababa;border-radius: 21px;border-color: rgb(80, 94, 108);background: rgb(255, 255, 255);color: var(--bs-dark);" autocomplete="off" action="pagina-inicio.html" novalidate="">
            <h2 class="text-center" style="color: #2d2b2b;">Inicio de sesión</h2>
            <div class="div-campo-txt"><input class="form-control" type="email" id="txtCorreo" name="email" placeholder="Correo electrónico" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" maxlength="30" required=""><div class="valid-feedback"></div><div class="invalid-feedback"></div></div>
            <div class="div-campo-txt"><input class="form-control" type="password" id="txtContra" name="contra" placeholder="Contraseña" required="" maxlength="8" pattern="[A-Za-z0-9]{4,8}"><div class="valid-feedback"></div><div class="invalid-feedback"></div></div>
            <div><a href="registroClt.jsp" style="background: rgba(0,0,0,0);color: #2d2b2b;">¿Eres nuevo? Registrate aquí</a></div>
            <div class="text-center mb-3 div-boton"><button class="btn btn-primary" type="submit" style="background: linear-gradient(#2d2b2b 99%, white 100%);">Iniciar sesión</button></div>
        </form>
    </section>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-init.js"></script>
    <script src="assets/js/validacion.js"></script>
</body>

</html>
