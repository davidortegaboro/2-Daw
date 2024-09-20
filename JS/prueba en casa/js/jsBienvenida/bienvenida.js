import { funcionGuardarNombre } from "../cookies/localStorage/localStorage";



let nombreCliente = window.prompt("Buenas, Inserte su Nombre");


let mensajeBienvenida = nombreCliente
    ? `<h2>¡Bienvenido, ${nombreCliente} !</h2>`
    : `<h2>¡Bienvenido!</h2>`;




export { nombreCliente, mensajeBienvenida };

