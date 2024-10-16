import { funcionGuardarNombre } from "../cookies/localStorage/localStorage";

let inicioNombreLocalStorage = localStorage.getItem("nombre");

let nombreCliente = () => {window.prompt("Buenas, Inserte su Nombre");}

let mensajeBienvenida = (nombreCliente) => {
    
    if(nombreCliente){
        return `<h2>¡Bienvenido, ${nombreCliente} !</h2>`;
    } else {
        return  `<h2>¡Bienvenido!</h2>`;
    }
}

let mensajeBienvenidaLocalStorage = (inicioNombreLocalStorage) =>{
     if (inicioNombreLocalStorage){
        `<h2>¡Bienvenido, ${inicioNombreLocalStorage} !</h2>`;
     } else{
        alert("No se ha encontrado ningun nombre");
     }
}
export { mensajeBienvenida, inicioNombreLocalStorage, mensajeBienvenidaLocalStorage, nombreCliente};

