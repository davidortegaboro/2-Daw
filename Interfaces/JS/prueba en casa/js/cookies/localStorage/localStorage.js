import { nombreCliente } from "../../jsBienvenida/bienvenida.js";

export function funcionGuardarNombre (nombreCliente) {
    if (nombreCliente){
        let guardarNombre = confirm("¿Desea guardar su nombre?");
            if (guardarNombre){
                localStorage.setItem("nombre", nombreCliente);
                  let nombreLocalStorage = localStorage.getItem("nombre");
                  return nombreLocalStorage;
            }
    } 
}
