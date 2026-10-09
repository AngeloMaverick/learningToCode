package oo.composicao.desafio;

public class Item {

	Produto produto;
	// Compra compra;

	Integer quantidade;

	Item() {

	}

	Item(Produto produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
