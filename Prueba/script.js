//Variables
const boton = document.getElementById("asunto")
const send = document.getElementById("enviar");
const ul = document.querySelector("ul");
const vacio = document.querySelector(".sinAsunto");

let asunto;
let asunto2;
let botomDelet;
let cont=0;
let cont2=50;
let cont3=100;
//Funciones

function obtenerDatos(){

    asunto = document.getElementById("asunto").value;
    asunto2 = document.getElementById("asunto2").value;

    console.log(asunto);
    console. log(asunto2);
}

send.addEventListener("click",(e) => {
    console.log("Hola mundo");

    const li = document.createElement("li");
    const h3 = document.createElement("h3");
    const p = document.createElement("p");

    h3.textContent = asunto;
    p.textContent = asunto2;

    li.appendChild(h3);
    li.appendChild(p);
    li.appendChild(eliminarLista());
    li.appendChild(prioBaja());
    li.appendChild(prioMedia());
    li.appendChild(prioAlta());
    ul.appendChild(li);

})


function prioBaja(){
    const baja = document.createElement("button");
    baja.textContent = "Prioridad baja";

    baja.addEventListener("click", (e) => {
        const item = e.target.parentElement;
        let ay = cont++;
        let ey = "hola"+ay;
        item.setAttribute('id',ey);
        console.log(ey);
        document.getElementById(ey).style.backgroundColor = '#FF8700';
    });
    return baja;
}

function prioMedia(){
    const media = document.createElement("button");
    media.textContent = "Prioridad media";

    media.addEventListener("click", (e) => {
        const item = e.target.parentElement;
        let iy = cont2++;
        let oy = "adios"+iy;
        item.setAttribute('id',oy);
        console.log(oy);
        document.getElementById(oy).style.backgroundColor = '#EAF11F';
    });
    return media;
}

function prioAlta(){
    const alta = document.createElement("button");
    alta.textContent = "Prioridad alta";

    alta.addEventListener("click", (e) => {
        const item = e.target.parentElement;
        let au = cont3++;
        let eu = "adios"+au;
        item.setAttribute('id',eu);
        console.log(eu);
        document.getElementById(eu).style.backgroundColor = '#FF2727';
    });
    return alta;
}
    
function eliminarLista(){
    botomDelet = document.createElement("button");
    botomDelet.textContent = "Eliminar tarea pendiente";

    botomDelet.addEventListener("click", (e) => {
        const item = e.target.parentElement; //Eliminamos el elemento padre, el que contiene el item
        ul.removeChild(item);
    });
    return botomDelet;
}