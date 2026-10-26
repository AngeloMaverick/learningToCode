package lambdas.interfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {

		// Interface funcional Supplier: Não recebe nenhum parâmetro e retorna um valor.
		// Colocar parenteses em uma expressão lambda só é obrigatório se não tiver
		// nenhum parâmetro ou quando tiver mais de um parãmetro.
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println(umaLista.get());
	}
}
