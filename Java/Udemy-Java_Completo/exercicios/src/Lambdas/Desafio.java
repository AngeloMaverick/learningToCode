package lambdas;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		Function<Produto, Double> getPrecoReal = produto -> produto.getPreco() * (1 - produto.getDesconto());
		UnaryOperator<Double> getImpostoMunicipal = precoReal -> precoReal >= 2500 ? (precoReal * 0.085) : 0;
		BinaryOperator<Double> getFrete = (precoReal, impostoMunicipal) -> precoReal + impostoMunicipal >= 3000 ? 100.0
				: 50.0;

		Function<Double, String> arredondar = valor -> String.format("%.2f", valor);
		Function<Double, String> formatar = valor -> ("R$" + arredondar.apply(valor)).replace(".", ",");
		BinaryOperator<String> organizarTexto = (texto, valorStr) -> texto + ": " + valorStr;
		BiConsumer<String, Double> exibirNoConsole = (texto, valor) -> System.out
				.println(organizarTexto.apply(texto, formatar.apply(valor)));

		Produto p = new Produto("iPad", 3235.89, 0.13);

		// 1. A partir do produto calcular o preco real (com desconto)
		Double precoReal = getPrecoReal.apply(p);
		exibirNoConsole.accept("Preço Real", precoReal);

		// 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
		Double impostoMunicipal = getImpostoMunicipal.apply(precoReal);
		exibirNoConsole.accept("Imposto Municipal", impostoMunicipal);

		// 3. Frete: >= 3000 (100)/ < 3000 (50)

		Double frete = getFrete.apply(precoReal, impostoMunicipal);
		exibirNoConsole.accept("Frete", frete);

		// 4. Arrendondar: Deixar duas casas decimais
		// Função arrendondar

		// 5. Formatar: R$1234,56
		// Função formatar

		Double totalAPagar = precoReal + impostoMunicipal + frete;
		exibirNoConsole.accept("Total a Pagar", totalAPagar);

		// RESPOSTA DA AULA -------------------------------------------
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal2 = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete2 = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar2 = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar2 = preco -> ("R$" + preco).replace(".", ",");

		Produto p2 = new Produto("iPad", 3235.89, 0.13);
		String preco = precoFinal.andThen(impostoMunicipal2).andThen(frete2).andThen(arredondar2).andThen(formatar2)
				.apply(p2);
		System.out.println("-------------------------");
		System.out.println("O preço final é " + preco);
	}
}
