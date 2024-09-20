

const crearFraseFecha = () => {

    let fecha = new Date();

    let diasDeLaSemana = ["Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"];
    let numeroDeDiaDeLaSemana = fecha.getDay();
    let diaDeLaSemana = diasDeLaSemana[numeroDeDiaDeLaSemana];

    let mes = fecha.getMonth();

    let anyo = fecha.getFullYear();

    return `<p>Hoy es ${diaDeLaSemana}, del ${mes} de ${anyo}</p>`;
}

export { crearFraseFecha };
