import { alumnos } from "../main.js";

export let anyadirAlumno = (alumnos) => {

   let nombreAlumno = prompt("Inserte el nombre del Alumno");

   nombreAlumno ? alumnos.push(nombreAlumno) : alert("adios");
}