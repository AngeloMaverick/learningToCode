package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();
	// Cliente cliente;

	Compra() {

	}

	Compra(List<Item> itens) {
		this.itens = itens;
	}

	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}

	void adicionarItem(double preco, String nome, int qtde) {
		var produto = new Produto(preco, nome);
		this.itens.add(new Item(produto, qtde));
	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.produto.preco * item.quantidade;
		}

		return total;
	}
}
