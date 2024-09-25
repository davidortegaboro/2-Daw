import { alumnos } from "../main.js";

export let buscarAlumno = (alumnos) => {

    nombreAlumno = prompt("Inserte el nombre del Alumno");

    if (nombreAlumno){
        let indice = alumnos.indexOF(nombreAlumno);
        let nombreDeArray = alumnos[indice];

        nombreDeArray ? alert(nombreDeArray) : alert ("Ha habido un error");
        
    } else {
        alert("Ha habido un error");
    }
}