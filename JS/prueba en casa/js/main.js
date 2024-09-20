import { nombreCliente, mensajeBienvenida } from "./jsBienvenida/bienvenida.js"
import { crearFraseFecha } from "./jsBienvenida/fecha.js";
import { efectoAnimacion } from "./efectos/efectoElementos.js";
import { funcionGuardarNombre } from "./cookies/localStorage/localStorage.js";

efectoAnimacion();



if (nombreStorage){

} else {
    document.getElementById("divBienvenida").innerHTML = mensajeBienvenida;

}

let nombreStorage = funcionGuardarNombre()

let fraseFecha = crearFraseFecha();
document.getElementById("divFecha").innerHTML = fraseFecha;




