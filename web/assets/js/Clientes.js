window.addEventListener("load", load, false);

function load() {
    //document.getElementById("op1").addEventListener("click", function () { mostrar(1); });
    document.getElementById("btnRegresar").addEventListener("click", function () { mostrar(1); });
    //Se les asigana a todos los botones con Name="actualizar", la función mostrar(2);
    let botones = [];
    botones = document.getElementsByName("actualizar");
    for (let i = 0; i < botones.length; i++){
        botones[i].addEventListener("click", function () { mostrar(2); });
    }
    document.getElementById("op1").style.color =  "#2d2b2b";
    document.getElementById("op2").style.color =  "#2d2b2b";
    mostrar(1);
}

function mostrar(i) {
    switch (i) {
        case 1:
            document.getElementById("misClientes").style.display = "block";
            document.getElementById("actualizar").style.display = "none";
            document.getElementById("op1").style.color =  "#ff848a";
            document.getElementById("op2").style.color =  "#2d2b2b";
            break;
        case 2:
            document.getElementById("misClientes").style.display = "none";
            document.getElementById("actualizar").style.display = "block";
            document.getElementById("op1").style.color =  "#2d2b2b";
            document.getElementById("op2").style.color =  "#ff848a";
            break;
    }
}


