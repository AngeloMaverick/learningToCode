package lambdas.interfacesFuncionais;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		// Interface Funcional Function: Recebe um parametro e retorna um valor que são
		// declarados no generics.
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + "!!!";

		Function<String, String> duvida = valor -> valor + "???";

		// As funções podem ser concatenadas dessa forma, porém o apply deve ser
		// declarado no final, e seu valor é aplicado na primeira função da sentença.
		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(33);

		System.out.println(parOuImpar.apply(33));
		System.out.println(parOuImpar.apply(32));
		System.out.println(resultadoFinal1);
		System.out.println(resultadoFinal2);
	}
}
