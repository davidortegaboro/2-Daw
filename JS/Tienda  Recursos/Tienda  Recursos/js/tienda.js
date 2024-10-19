import { listaArticulos } from "./datos.js";
import { Carrito } from "./carrito.js";

let criterios = ["Sin ordenar", "Ascendente por precio", "Descendente por precio"];
let carrito = new Carrito(1);

function creaListaCriterios() {
	let selectProductos = document.getElementById("criteriosOrdenacion");
	let opcionesSelect = ``;

	for (let i = 0; i < criterios.length; i++) {
		opcionesSelect += `<option value="${i}">${criterios[i]}</option>`;
	}

	selectProductos.innerHTML = opcionesSelect;

	selectProductos.addEventListener("change", function () {
		pintaArticulos(selectProductos.value);
	});
}

const copiaLista = [...listaArticulos];

function pintaArticulos(orden) {
	let innerArticulos = ``;
	let contenedorArticulos = document.getElementById("contenedor");
	let opcionLista = [];

	switch (orden) {
		case "0":
			opcionLista = [...copiaLista];
			break;

		case "1":
			opcionLista = [...listaArticulos].sort((a, b) => a.precio - b.precio);
			break;

		case "2":
			opcionLista = [...listaArticulos].sort((a, b) => b.precio - a.precio);
			break;

		default:
			opcionLista = [...copiaLista];
	}

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

	contenedorArticulos.innerHTML = innerArticulos;

	setTimeout(() => {
		opcionLista.forEach((a, index) => {
			document.querySelector(`#addArticle-${index}`).addEventListener('click', function () {
				ponArticuloEnCarrito(a);
			});
		});
	}, 0);
}

function ponArticuloEnCarrito(articulo) {
	carrito.anyadeArticulo(articulo);
}

function verCarro() {
	carrito.verCarrito();
}

function cerrarCarro() {
	let dialogo = document.getElementById("miDialogo");
	dialogo.close();
}

function efectuaPedido() {
	// Generar el objeto de pedido directamente en esta función
	const pedido = {
		id: carrito.id, // Accede al ID del carrito
		articulos: carrito.listaArticulos, // Accede a los artículos en el carrito
		total: carrito.listaArticulos.reduce((total, articulo) => total + articulo.total, 0) // Calcular el total
	};

	console.log(JSON.stringify(pedido, null, 2)); // Imprime el objeto JSON en consola
	cerrarCarro(); // Cerrar el diálogo
}

window.onload = () => {
	pintaArticulos(0);
	creaListaCriterios();

	let carritoListener = document.getElementById("imgCart");
	carritoListener.addEventListener("click", verCarro);

	let cerrarDialogo = document.getElementById("btnCierraDialog");
	cerrarDialogo.addEventListener("click", cerrarCarro);

	let btnEfectuaPedido = document.getElementById("btnEfectuaPedido");
	btnEfectuaPedido.addEventListener("click", efectuaPedido); // Cambiado aquí
}



