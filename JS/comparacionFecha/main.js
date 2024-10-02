let fecha1 = "19/20/1998";
let fecha2 = "21/09/1998";

let compararFecha = () => {

    if (fecha1.split("/").reverse().join("") > fecha2.split("/").reverse().join("")) {
        alert("fecha1 es mas grande")
    } else if (fecha1.split("/").reverse().join("") < fecha2.split("/").reverse().join("")) {
        alert("fecha2 es mas grande")
    } else {
        alert("Las fechas son iguales")
    }
}