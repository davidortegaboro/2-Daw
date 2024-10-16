import { nombreCliente, mensajeBienvenida, inicioNombreLocalStorage, mensajeBienvenidaLocalStorage  } from "./jsBienvenida/bienvenida.js"
import { crearFraseFecha } from "./jsBienvenida/fecha.js";
import { efectoAnimacion } from "./efectos/efectoElementos.js";
import { funcionGuardarNombre } from "./cookies/localStorage/localStorage.js";



efectoAnimacion();

let recordarNombre = confirm("Desea recuperar el nombre guardado?");
    
    if (recordarNombre){
        mensajeBienvenidaLocalStorage(inicioNombreLocalStorage);
     } else{
        let nombre = nombreCliente;
        funcionGuardarNombre(nombre);
        document.getElementById("divBienvenida").innerHTML = mensajeBienvenida(nombre);
     }

let fraseFecha = crearFraseFecha();
document.getElementById("divFecha").innerHTML = fraseFecha;




