import { verAlumnos } from "./botones/verAlumno.js";
import { anyadirAlumno } from "./botones/anyadirAlumno.js";
import { borrarAlumno } from "./botones/borrarAlumno.js";
import { buscarAlumno } from "./botones/buscarAlumno.js";

 export let alumnos = ["jose", "pepe", "carla", "manuel"];

 document.getElementById("verAlumno").addEventListener('click', verAlumnos(alumnos));

 document.getElementById("anyadirAlumno").addEventListener('click', anyadirAlumno(alumnos));

 document.getElementById("borrarAlumno").addEventListener('click', borrarAlumno(alumnos));

 document.getElementById("buscarAlumno").addEventListener('click', buscarAlumno(alumnos));
