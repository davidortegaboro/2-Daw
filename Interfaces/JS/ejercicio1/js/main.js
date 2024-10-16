//Tabla de multiplicar

let num;

do {
    num = prompt("Dime un número entre el 1 y el 10");
    num = parseInt(num); // Convertir a entero
} while (isNaN(num) || num < 1 || num > 10); // Validar si es NaN o fuera de rango

let miTabla = `<table border="1"><tr>`;
for (let i = 0; i <= 10; i++) {
    miTabla += `<td><p>número: ${num} x ${i} = ${num * i}</p></td>`;
}
miTabla += `</tr></table>`; // Cerrar la tabla

document.getElementById("divTabla").innerHTML = miTabla; // Asegúrate de que el ID sea correcto

////////////////////////////////////////////////////////////////////////////////////////////////////////

//Para sacar la Fecha

//Creo un objeto llamado fecha de tipo Date
let fecha = new Date();

//Cojo el numero de dia de la semana, de Lunes, Martes, etc. (0-6)
let numberOfDay = fecha.getDay();

//Creo un array de Domingo a sabado y con el numberOfDay recorro el array y guardo el nombre del dia
const daysOfWekk = ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"];
let nameOfDay = daysOfWekk[numberOfDay];

//Guardo el numero de dia del mes (0-31)
let numberDayInMonth = fecha.getDate();

//Guardo el numero de año
let year = fecha.getFullYear();

//Guardo el numero de mes (0-11) y creo un array con los nombres de los meses lo recorro con el numero de mes y guardo el nombre del mes en otra variable
let month = fecha.getMonth();
const monthsOfYear = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
let nameOfMonth = monthsOfYear[month];

let miFechaJs = `<h2>Hoy es ${nameOfDay}, ${numberDayInMonth} de ${nameOfMonth} de ${year} </h2>`;

document.getElementById("fechaActual").innerHTML = miFechaJs;

////////////////////////////////////////////////////////////////////////////////////////////////////////


// Para sacar un calendario del mes

//Creo un objeto de tipo array con todos los meses y sus atributos
const meses = [
    {id: 0, nombre: enero, dias : 31},
    {id: 1, nombre: febero, dias : 28},
    {id: 2, nombre: marzo, dias : 31},
    {id: 3, nombre: abril, dias : 30},
    {id: 4, nombre: mayo, dias: 30},
    {id: 5, nombre: junio, dias : 30},
    {id: 6, nombre: julio, dias : 31},
    {id: 7, nombre: agosto, dias : 31},
    {id: 8, nombre: septiembre, dias : 30},
    {id: 9, nombre: octubre, dias : 30},
    {id: 10, nombre: noviembre, dias : 30},
    {id: 11, nombre: diciembre, dias : 31}
];

//Creo un objeto de tipo Date
const fecha2 = new Date();

//Guardo el numero del mes (0-11)
let numeroMesActual = fecha2.getMonth();

//Con el numero del mes actual recorro el array de los meses para recoger los Datos
let mesActual = meses[numeroMesActual];

//Creo un array con los dias de la seamana
const diasDeLaSemana = ["Lunes", "Martes", "Miercoes", "Jueves", "Viernes", "Sabado", "Domingo"]

//Guardo el dia del mes actual
let numeroDiaActual = fecha2.getDate();

//Creo la tabla y muestro los atributos

const tablaMes = `<table border="1"><tr>`
for (let n = 0; n <= 7; n++){
   tablaMes += `<th>${diasDeLaSemana[n]}</th>`
}
tablaMes `</tr><tr>`
for(let m = 0; m<=31; m++){
    if( m % 7 === 0){
        tablaMes += `</tr><tr>`
    }
    tablaMes += `<td>`
        if(m === numeroDiaActual){
            tablaMes += `<p>X</p></td>`
        } else{
            tablaMes += `<p>${m}</p></td>`
        }
} 
    tablaMes += `</tr></table>`

document.getElementById("CalendarioMesActual").innerHTML = tablaMes;