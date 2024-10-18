import { listaArticulos } from "./datos.js";

export class Carrito {

	#id;
	#listaAriculos;

	constructor(id) {
		this.#id = id;
		this.#listaAriculos = [];

	}

	anyadeArticulo(articulo) {

		this.#listaAriculos.push({
			...articulo,
			unidades: 1,
			total: articulo.precio
		});

	}

	borraArticulo(codigo) {
	}

	modificaUnidades(codigo, n) {

		if (n === "add") {
			let indexArticulo = this.#listaAriculos.findIndex(articulo => articulo.codigo === codigo);
			this.#listaAriculos[indexArticulo].unidades + 1;
		} else {

		}
	}

	verCarrito() {

		let dialogo = document.getElementById("miDialogo");

		dialogo.showModal();

		let pedido = {
			id: 1,
			total: 0
		}

		let innerIdPedido = "";

		innerIdPedido += `<h3>${pedido.id}</h3>`
		let idPedido = document.getElementById("idPedido");
		idPedido.innerHTML = innerIdPedido;

		let dialogoContent = document.getElementById("dialogContent");
		let innerArticulos = ``;

		if (this.#listaAriculos.length === 0) {
			innerArticulos += `<p>La lista de Articulos esta vacia</p>`
			dialogoContent.innerHTML = innerArticulos;

		} else {
			innerArticulos += `<table class="table table-striped">
			<th>
				
				<td>nombre</td>
				<td>descripcion</td>
				<td>precio</td>
				<td>total</td>
				<td></td>
			</th>`;
			this.#listaAriculos.forEach(a => {
				//Ahora hay que pintar los articulos

				innerArticulos +=

					`<tr>

						<td><img width="35px" src="assets/${a.codigo}.jpg"></img></td>
						<td>${a.nombre}</td>
						<td>${a.descripcion}</td>
						<td>${a.precio}</td>
						<td>${a.total}$</td>
						<td>
							<button value="${a.codigo}" id="buttonAdd" class="btn btn-primary">+</button>
							<button value="${a.codigo}" id="buttonDrop"class="btn btn-warning">-</button>
							<button value="${a.codigo}" id="buttonDropAll" class="btn btn-danger">Borrar</button>
						</td>
					</tr>`

			})
		}

		dialogoContent.innerHTML = innerArticulos;

		let butonAdd = document.getElementById("buttonAdd");
		let buttonDrop = document.getElementById("buttonDrop");
		let buttonDropAll = document.getElementById("buttonDropAll");

		butonAdd.addEventListener("click", function () { modificaUnidades(this.value, "add") });
		butonDrop.addEventListener("click", function () { modificaUnidades(this.value, "drop") });
		butonDropAll.addEventListener("click", function () { borraArticulo(this.value) });

	}
}
