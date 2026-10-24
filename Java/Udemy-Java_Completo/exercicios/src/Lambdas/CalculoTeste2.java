package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		// Declarando o método executar de dentro da Interface Calculo por meio de
		// lambda function, isso só é possível pois só existem um método na interface.
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));

		// return implícito
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));

		// método default
		System.out.println(calc.legal());

		// método static
		System.out.println(Calculo.muitoLegal());
	}
}
