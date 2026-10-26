package lambdas.interfacesFuncionais;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {

		// Interface Funcional Operador Unário: Recebe um valor e retorna outro valor,
		// ambos do mesmo tipo.
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;

		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		System.out.println(resultado1);

		// compose tem o mesmo comportamento que o andThen, só que no sentido invertido.
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		System.out.println(resultado2);

	}
}
