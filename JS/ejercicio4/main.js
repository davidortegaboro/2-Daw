let arrayDuplicado = [1,2,1,3,4,5,4,7,8,7];


let arraySinDuplicados = arrayDuplicado.filter((value,index) =>  arrayDuplicado.indexOf(numero => numero == value) == index );

alert(arraySinDuplicados);