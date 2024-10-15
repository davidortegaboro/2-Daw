criterios = ["Sin ordenar", "Ascendente por precio", "Descendente por precio"]


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



function pintaArticulos(orden) {
	//Siguiente metodo
	if (orden === 0) {
	} else if (orden === 1) {
	} else {
	}

}


function ponArticuloEnCarrito() {

}


function verCarro() {

}

function efectuaPedido() {

}


window.onload = () => {
	creaListaCriterios();

}


