import { listaArticulos } from "./datos.js";

let criterios = ["Sin ordenar", "Ascendente por precio", "Descendente por precio"]


function creaListaCriterios() {
	//Guarda el select del HTML en selectProductos
	let selectProductos = document.getElementById("criteriosOrdenacion");

	//Voy creando los option y los guardo en opcionesSelect, luego la inserto en el HTML
	let opcionesSelect = ``;
	for (let i = 0; i < criterios.length; i++) {
		opcionesSelect += `<option value="${i}">${criterios[i]}</option>`;
	}
	selectProductos.innerHTML = opcionesSelect;

	// Añadir el evento change
	selectProductos.addEventListener("change", function () {
		pintaArticulos(selectProductos.value);
	});
}

const copiaLista = [...listaArticulos];

function pintaArticulos(orden) {
	let innerArticulos = ``;
	let contenedorArticulos = document.getElementById("contenedor");
	let opcionLista = [];  // Inicializamos opcionLista como un array vacío

	switch (orden) {
		// sin ordenar
		case "0":
			opcionLista = [...copiaLista]; // Clonamos la lista original para no modificarla
			break;  // Añadimos el break para detener el flujo aquí

		// ascendente
		case "1":
			listaArticulos.sort((a, b) => a.precio - b.precio);
			opcionLista = listaArticulos;
			break;

		// descendente
		case "2":
			listaArticulos.sort((a, b) => b.precio - a.precio);
			opcionLista = listaArticulos;
			break;

		default:
			opcionLista = [...copiaLista];  // Si no coincide ningún caso, usamos la lista original
	}

	// Ahora pintamos los artículos de opcionLista
	opcionLista.forEach(a => {
		innerArticulos += `
        <div class="col">
            <div class="card">
                <img src="assets/${a.codigo}.jpg" class="card-img-top">
                <div class="card-body">
                    <h5 class="card-title">${a.nombre}</h5>
                    <p class="card-text">${a.descripcion}</p>
                    <b>
                    <p class="card-text text-center">${a.precio}$</p>
                    </b>
                </div>
                <button id="m1" class="btn-success">comprar</button>
            </div>
        </div>`;
	});

	// Asignamos el HTML generado al contenedor de artículos
	contenedorArticulos.innerHTML = innerArticulos;
}




function ponArticuloEnCarrito() {

}


function verCarro() {

}

function efectuaPedido() {

}


window.onload = () => {
	pintaArticulos(0);
	creaListaCriterios();

}


