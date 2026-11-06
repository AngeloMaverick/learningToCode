package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> soma = (acumulador, numeroAtual) -> acumulador + numeroAtual;

		// Reduce é um método finalizador assim como o Foreach
		// Quando não passa o valor inicial para o reduce precisa usar o .get()
		Integer total1 = nums.parallelStream().reduce(soma).get();
		System.out.println(total1); // 45

		// Passando um valor inicial para o acumulador
		Integer total2 = nums.parallelStream().reduce(100, soma);
		System.out.println(total2); // 945
		// Pois será chamado o valor 100 para cada laço no parallelStream

		// Integer a = null;
		// int b = a; // NullPointerException, pois não é possível aplicar null no
		// primitivo int

		Integer total3 = nums.stream().reduce(100, soma);
		System.out.println(total3); // 145

		// Resultado foi um Optional<Integer>...
		nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);

	}
}
