window.addEventListener("load", load, false);

function load() {
    document.getElementById("btnCalcular").addEventListener("click", function () { mostrarGanancias(); });
    document.getElementById("seccionVentas").style.display = "none";
}

function mostrarGanancias(){

    form = document.getElementById("idDatos");

    if (!form.checkValidity()) {
        alert("Ingrese las fechas correctamente");
    }
    else{
        document.getElementById("idDatos").style.display = "none";
        document.getElementById("seccionVentas").style.display = "block";

        let fechaInicio = document.getElementById("txtInicio").value;
        let fechaFin = document.getElementById("txtFin").value;

        document.getElementById("ttlGanancias").innerHTML = "Ganancias del " + fechaInicio + " al " + fechaFin;

        form.addEventListener('submit', 
            function (event) {
                event.preventDefault()
                event.stopPropagation()
            }, 
        false);
    }
}
