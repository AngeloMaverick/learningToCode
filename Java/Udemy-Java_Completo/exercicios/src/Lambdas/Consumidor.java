package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		// Interface Consumer, recebe uma parametro e não retorna nada. <T> -> void
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

		Produto p1 = new Produto("Caneta", 12.34, 0.09);

		// Método accept executa o Consumer
		imprimirNome.accept(p1);

		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 7.80, 0.18);
		Produto p5 = new Produto("Lapis", 4.39, 0.19);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		// Se passar o mouse no método forEach percebe-se que ele recebe um Consumer
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);

	}
}
