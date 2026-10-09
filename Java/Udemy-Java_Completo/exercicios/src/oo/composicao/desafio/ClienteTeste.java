package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		// 1 cliente
		// 2 compras
		// cada compra com 2 itens
		// cada item com produtos diferentes
		// itens na compra
		// compra ao cliente
		// obterValorTotal

		Produto tesoura = new Produto(5.0, "Tesoura");
		Produto caneta = new Produto(2.5, "Caneta");
		Produto toalha = new Produto(38.0, "Toalha");
		Produto guardaChuva = new Produto(40.0, "Guarda-Chuva");

		Item item1 = new Item(tesoura, 2);
		Item item2 = new Item(caneta, 5);
		Item item3 = new Item(toalha, 1);
		Item item4 = new Item(guardaChuva, 1);

		Compra compra1 = new Compra();
		compra1.itens.add(item1);
		compra1.itens.add(item2);
		Compra compra2 = new Compra();
		compra2.itens.add(item3);
		compra2.itens.add(item4);

		Cliente cliente1 = new Cliente();
		cliente1.nome = "Teste";
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);

		System.out.println(cliente1.obterValorTotal());
	}
}
