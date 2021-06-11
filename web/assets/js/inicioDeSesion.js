window.addEventListener("load", load, false);

function load() {
    document.getElementById("btnInicioSesion").addEventListener("click", function () { validacion(); });
}

function validacion(){

    form = document.getElementById("form-InicioSesion");

    if (!form.checkValidity()) {
        alert("Ingrese los datos correctamente");
    }
}