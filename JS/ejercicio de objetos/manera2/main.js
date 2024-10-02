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

let compararObjetos = (obj1, obj2) => {

    let keysObj1 = Object.keys(obj1);
    let keysObj2 = Object.keys(obj2);

    if (keysObj1 !== keysObj2) {
        return false;
    }

    

}

compararObjetos(objeto1, objeto2);