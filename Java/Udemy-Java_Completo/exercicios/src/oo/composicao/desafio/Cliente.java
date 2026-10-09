package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	// Cliente 1 - N Compra
	// Compra 1 - N Item
	// Item N - 1 Produto
	// Não precisa de relação bidirecional
	List<Compra> compras = new ArrayList<>();

	String nome;

	Cliente() {

	}

	Cliente(List<Compra> compras, String nome) {
		this.compras = compras;
		this.nome = nome;
	}

	double obterValorTotal() {
		double total = 0;

		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}

		return total;
	}
}
