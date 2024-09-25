import { alumnos } from "../main.js";

export let verAlumnos = (alumnos) => {
    
    let generalTabla = `<h2>Listado de alumnos </h2>`
     generalTabla += `<ul>`
    alumnos.forEach(element => {
        generalTabla +=`<li>${element}</li>`
        generalTabla += `</ul>`
    });

    document.getElementById("alumnos").innerHTML = generalTabla;
}
