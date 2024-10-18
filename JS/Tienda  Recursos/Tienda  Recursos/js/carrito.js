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
				<td></td>
				<td>nombre</td>
				<td>descripcion</td>
				<td>precio</td>
				<td>total</td>
				<td></td>
			</th>`;
			this.#listaAriculos.forEach(a => {
				//Ahora hay que pintar los articulos

				innerArticulos +=

					<tr>
						<td><img>${a.codigo}.jpg</img></td>
						<td>${a.nombre}</td>
						<td>${a.descripcion}</td>
						<td>${a.precio}</td>
						<td>${a.total}</td>
						<td>
							<button class="btn btn-primary"></button>
							<button class="btn btn-warning"></button>
							<button class="btn btn-danger"></button>
						</td>
					</tr>

			})
		}


	}
}
