window.addEventListener("load", load, false);

function load() {
    document.getElementById("btnRegistrar").addEventListener("click", function () { validacion(); });
}

function validacion(){

    form = document.getElementById("idFormRegistroClt");

    if (!form.checkValidity()) {
        alert("Ingrese los datos correctamente");
    }
}