package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// MINHA RESPOSTA
		System.out.println(nums); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

		// 1. Número para string binária... 6 => "110"
		List<String> bin = nums.stream().map(n -> Integer.toBinaryString(n)).toList();
		System.out.println(bin); // [1, 10, 11, 100, 101, 110, 111, 1000, 1001]

		// 2. Inverter a string... "110" => "011"
		bin = bin.stream().map(n -> n = new StringBuilder(n).reverse().toString()).toList();
		System.out.println(bin); // [1, 01, 11, 001, 101, 011, 111, 0001, 1001]

		// 3. Converter de volta para inteiro => "011" => 3
		nums = bin.stream().map(n -> Integer.valueOf(n, 2)).toList();
		System.out.println(nums); // [1, 1, 3, 1, 5, 3, 7, 1, 9]

		// RESPOSTA DO DESAFIO:
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);

		System.out.println("\nReposta do Desafio");
		nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioParaInt).forEach(System.out::println);

	}
}
