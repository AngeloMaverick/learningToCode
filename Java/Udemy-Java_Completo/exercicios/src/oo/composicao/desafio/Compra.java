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

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.produto.preco * item.quantidade;
		}

		return total;
	}
}
