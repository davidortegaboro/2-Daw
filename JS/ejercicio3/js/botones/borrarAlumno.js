import { alumnos } from "../main.js";

export let borrarAlumno = (alumnos) => {
   
    nombreAlumno = prompt("Inserte el nombre del Alumno");

    if (nombreAlumno){
        let indice = alumnos.indexOF(nombreAlumno);

        alumnos.splice(indice, 1);
    } else{
        alert("Error");
    }
}