import { listaArticulos } from "./datos.js";
import { Carrito } from "./carrito.js";
let criterios = ["Sin ordenar", "Ascendente por precio", "Descendente por precio"]

let carrito = new Carrito(1);

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
	opcionLista.forEach((a, index) => {
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
                <button id="addArticle-${index}" class="btn-success">comprar</button>
            </div>
        </div>`;
	});

	// Asignamos el HTML generado al contenedor de artículos
	contenedorArticulos.innerHTML = innerArticulos;

	//No entienes esto.
	setTimeout(() => {
		opcionLista.forEach((a, index) => {
			document.querySelector(`#addArticle-${index}`).addEventListener('click', function () {
				// Almacena el artículo en una lista o en el localStorage
				ponArticuloEnCarrito(a);
			});
		});
	}, 0);

}

function ponArticuloEnCarrito(articulo) {
	carrito.anyadeArticulo(articulo);

}


function verCarro(Carrito) {

	carrito.verCarrito();

}

function cerrarCarro() {

	let dialogo = document.getElementById("miDialogo");

	dialogo.close();
}

function efectuaPedido() {


}


window.onload = () => {
	pintaArticulos(0);

	creaListaCriterios();

	let carritoListener = document.getElementById("imgCart");
	carritoListener.addEventListener("click", function () { verCarro(carrito) });

	let cerrarDialogo = document.getElementById("btnCierraDialog");
	cerrarDialogo.addEventListener("click", cerrarCarro);

	let efectuaPedido = document.getElementById("btnEfectuaPedido");
	efectuaPedido.addEventListener("click", efectuaPedido);



}


