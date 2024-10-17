export class Carrito {

	_id;
	_listaAriculos;

	constructor(id) {
		this.id = id;
		this._listaAriculos = [];

	}

	anyadeArticulo(articulo) {


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


	}
}
