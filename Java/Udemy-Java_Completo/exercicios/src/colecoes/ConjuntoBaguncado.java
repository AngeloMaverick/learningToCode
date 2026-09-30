package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		// Conversão automática
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character

		System.out.println("Tamanho é " + conjunto.size());
		// 5

		conjunto.add("Teste");
		conjunto.add('x');
		// Se colocar Aspas é String, se colocar apóstrofe é char
		System.out.println("Tamanho é " + conjunto.size());
		// Continua sendo 5 pois não aceita repetição

		System.out.println("Remover teste: " + conjunto.remove("teste"));
		System.out.println("Remover Teste: " + conjunto.remove("Teste"));
		System.out.println("Remover x: " + conjunto.remove('x'));
		// Se conseguir remover retorna true (Set é case sensitive)

		System.out.println("Tamanho é " + conjunto.size());
		// 3
		System.out.println(conjunto.contains('x'));
		// false
		System.out.println(conjunto.contains(1));
		// true
		System.out.println(conjunto.contains(true));
		// true

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		// [1, 2, 3]
		System.out.println(conjunto);
		// [1.2, 1, true]

		conjunto.addAll(nums); // União entre dois conjuntos
		System.out.println(conjunto);
		// [1.2, 1, 2, 3, true]

		conjunto.remove(2);
		conjunto.remove(3);

		conjunto.retainAll(nums); // Reter somente a intersecção
		System.out.println(conjunto);
		// [1]

		conjunto.clear(); // Zera o Set
		System.out.println(conjunto);
		// []

	}
}
