let objeto1 = {
    id: 1,
    nombre: "Raul",
    apellido: "Gimenez"
};

let objeto2 = {
    nombre: "Raul",
    apellido: "Gimenez",
    id: 1,
};

//Convierte los objetos, a un array de clave valor en formato cadena
let keysArrayObjeto1 = Object.entries(objeto1);
let keysArrayObjeto2 = Object.entries(objeto2);

//Creamos dos objetos con cadenas vacias, es donde concatenaremos a continuacion
let cadenaObjeto1 = "";
let cadenaObjeto2 = "";

//Recorremos cada uno de los arrays de los objetos, los vamos recorriendo posicion a posicion y los vamos concatenando
for (i = 0; i < keysArrayObjeto1.length; i++) {
    cadenaObjeto1 += keysArrayObjeto1[i].join(",") + ",";;
}

for (e = 0; e < keysArrayObjeto2.length; e++) {
    cadenaObjeto2 += keysArrayObjeto2[e].join(",") + ",";
}

//Ahora vamos a quitarles los separadores, que en este caso es "," y vamos a ordenarlos alfabeticamente

cadenaObjeto1Ordenada = cadenaObjeto1.split(",").sort().join(",");
cadenaObjeto2Ordenada = cadenaObjeto2.split(",").sort().join(",");

//Ahora comparamos si son iguales o no.

console.log(cadenaObjeto1Ordenada);
console.log(cadenaObjeto2Ordenada);
if (cadenaObjeto1Ordenada === cadenaObjeto2Ordenada) {
    console.log("Los objetos son iguales");
} else {
    console.log("Los objetos no son iguales");
}





