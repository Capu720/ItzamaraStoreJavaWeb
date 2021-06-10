window.addEventListener("load", load, false);

function load() {
    document.getElementById("op1").addEventListener("click", function () { mostrar(1); });
    document.getElementById("op2").addEventListener("click", function () { mostrar(2); });
    //Se les asigana a todos los botones con Name="verProductos", la función mostrar(2);
    let botones = [];
    botones = document.getElementsByName("verProductos");
    for (let i = 0; i < botones.length; i++){
        botones[i].addEventListener("click", function () { verProductos(); });
    }
    document.getElementById("op1").style.color =  "#2d2b2b";
    document.getElementById("op2").style.color =  "#2d2b2b";
    mostrar(1);
}

function mostrar(i) {
    switch (i) {
        case 1:
            document.getElementById("misCatalogos").style.display = "block";
            document.getElementById("Crear").style.display = "none";
            document.getElementById("op1").style.color =  "#e7abad";
            document.getElementById("op2").style.color =  "#2d2b2b";
            break;
        case 2:
            document.getElementById("misCatalogos").style.display = "none";
            document.getElementById("Crear").style.display = "block";
            document.getElementById("op1").style.color =  "#2d2b2b";
            document.getElementById("op2").style.color =  "#e7abad";s
            break;
    }
}

function verProductos() {
    alert("Funcion en proceso");
}

