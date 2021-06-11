window.addEventListener("load", load, false);

function load() {
    document.getElementById("btnRegistrar").addEventListener("click", function () { validacion(); });
}

function validacion(){

    form = document.getElementById("form-pago");

    if (!form.checkValidity()) {
        alert("Ingrese los datos correctamente");
    }
}