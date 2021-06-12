window.addEventListener("load", load, false);

function load() {
    document.getElementById("op1").addEventListener("click", function () { mostrar(1); });
    document.getElementById("op2").addEventListener("click", function () { mostrar(2); });
    document.getElementById("btnCrear").addEventListener("click", function () { crear(); });
    document.getElementById("btnRegresar").addEventListener("click", function () { regresar(); });
    document.getElementById("btnActualizar").addEventListener("click", function () { actualizar(); });
    //Se les asigana a todos los botones con Name="actualizaProveedor", la función mostrar(2);
    let botones = [];
    botones = document.getElementsByName("actualizaProveedor");
    for (let i = 0; i < botones.length; i++){
        botones[i].addEventListener("click", function () { actualizaProveedor(); });
    }
    document.getElementById("op1").style.color =  "#2d2b2b";
    document.getElementById("op2").style.color =  "#2d2b2b";
    mostrar(1);
}

function mostrar(i) {
    switch (i) {
        case 1:
            document.getElementById("misProveedores").style.display = "block";
            document.getElementById("Crear").style.display = "none";
            document.getElementById("actualizaProveedor").style.display = "none";
            document.getElementById("op1").style.color =  "#ff848a";
            document.getElementById("op2").style.color =  "#2d2b2b";
            break;
        case 2:
            document.getElementById("misProveedores").style.display = "none";
            document.getElementById("Crear").style.display = "block";
            document.getElementById("actualizaProveedor").style.display = "none";
            document.getElementById("op1").style.color =  "#2d2b2b";
            document.getElementById("op2").style.color =  "#ff848a";
            break;
    }
}

function actualizaProveedor() {
    document.getElementById("misProveedores").style.display = "none";
    document.getElementById("actualizaProveedor").style.display = "block";
}

function regresar(){
    mostrar(1);
}

function crear() {
    form = document.getElementById("idCrear");
    if (form.checkValidity()) {
        alert("Proveedor agregado");
    }
}

function actualizar() {
    form = document.getElementById("idActualizar");
    if (form.checkValidity()) {
        alert("Proveedor actualizado");
    }

}