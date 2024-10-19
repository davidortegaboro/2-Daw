import { listaArticulos } from "./datos.js";

export class Carrito {
	#id;
	#listaAriculos;

	constructor(id) {
		this.#id = id;
		this.#listaAriculos = [];
	}

	anyadeArticulo(articulo) {
		let articuloExistente = this.#listaAriculos.find(a => a.codigo === articulo.codigo);
		if (!articuloExistente) {
			this.#listaAriculos.push({
				...articulo,
				unidades: 1,
				total: articulo.precio
			});
		} else {
			articuloExistente.unidades += 1;
			articuloExistente.total = articuloExistente.precio * articuloExistente.unidades;
		}
	}

	borraArticulo(codigo) {
		let indexArticulo = this.#listaAriculos.findIndex(articulo => articulo.codigo === codigo);
		this.#listaAriculos.splice(indexArticulo, 1);
		this.verCarrito();
	}

	modificaUnidades(codigo, n) {
		let indexArticulo = this.#listaAriculos.findIndex(articulo => articulo.codigo === codigo);
		if (indexArticulo === -1) {
			console.error(`Artículo con código ${codigo} no encontrado.`);
			return;
		}

		if (n === "add") {
			this.#listaAriculos[indexArticulo].unidades += 1;
		} else if (n === "drop") {
			this.#listaAriculos[indexArticulo].unidades -= 1;
			if (this.#listaAriculos[indexArticulo].unidades === 0) {
				this.borraArticulo(codigo);
			}
		}

		this.#listaAriculos[indexArticulo].total = this.#listaAriculos[indexArticulo].precio * this.#listaAriculos[indexArticulo].unidades;
		this.verCarrito();
	}

	verCarrito() {
		let dialogo = document.getElementById("miDialogo");
		dialogo.showModal();

		let pedido = {
			id: 1,
			total: 0,
			articulos: this.#listaAriculos
		};

		let innerIdPedido = "";
		innerIdPedido += `<h3>${pedido.id}</h3>`;
		let idPedido = document.getElementById("idPedido");
		idPedido.innerHTML = innerIdPedido;

		let dialogoContent = document.getElementById("dialogContent");
		let innerArticulos = ``;

		if (this.#listaAriculos.length === 0) {
			innerArticulos += `<p>La lista de Articulos esta vacia</p>`;
			dialogoContent.innerHTML = innerArticulos;
		} else {
			innerArticulos += `<table class="table table-striped">
			<th>
				<td>nombre</td>
				<td>descripcion</td>
				<td>precio</td>
				<td>total</td>
				<td>unidades</td>
				<td></td>
			</th>`;
			this.#listaAriculos.forEach(a => {
				pedido.total += a.precio * a.unidades;
				innerArticulos += `
					<tr>
						<td><img width="35px" src="assets/${a.codigo}.jpg"></img></td>
						<td>${a.nombre}</td>
						<td>${a.descripcion}</td>
						<td>${a.precio}</td>
						<td>${a.total}$</td>
						<td>${a.unidades}</td>
						<td>
							<button value="${a.codigo}" id="buttonAdd-${a.codigo}" class="btn btn-primary">+</button>
							<button value="${a.codigo}" id="buttonDrop-${a.codigo}" class="btn btn-warning">-</button>
							<button value="${a.codigo}" id="buttonDropAll-${a.codigo}" class="btn btn-danger">Borrar</button>
						</td>
					</tr>`;
			});
		}

		dialogoContent.innerHTML = innerArticulos;
		let innerTotalPedido = `<h3>${pedido.total}</h3>`;
		document.getElementById("total").innerHTML = innerTotalPedido;

		this.#listaAriculos.forEach(a => {
			document.getElementById(`buttonAdd-${a.codigo}`).addEventListener("click", () => {
				this.modificaUnidades(a.codigo, "add");
			});
			document.getElementById(`buttonDrop-${a.codigo}`).addEventListener("click", () => {
				this.modificaUnidades(a.codigo, "drop");
			});
			document.getElementById(`buttonDropAll-${a.codigo}`).addEventListener("click", () => {
				this.borraArticulo(a.codigo);
			});
		});
	}

	// Método para obtener la lista de artículos
	get listaArticulos() {
		return this.#listaAriculos;
	}
}
