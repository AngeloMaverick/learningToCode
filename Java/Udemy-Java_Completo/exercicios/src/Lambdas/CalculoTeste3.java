package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		// BinaryOperator = Interface do próprio java que recebe dois parametros e
		// retorna um valor, todos de mesmo tipo (Double)
		BinaryOperator<Double> calc = (x, y) -> x + y;
		System.out.println(calc.apply(2.0, 3.0));

		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));

		// (Integer)
		BinaryOperator<Integer> calc2 = (x, y) -> x + y;
		System.out.println(calc2.apply(2, 3));

		calc2 = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));
	}
}
