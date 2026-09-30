package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>(); // Pode colocar explícitamente
		// <String> ou <> (operador Diamond)
		// na
		// declaração de instância que ele vai entender que é o mesmo tipo da
		// variável

		// <String> = Generics
		SortedSet<String> listaAprovados = new TreeSet<>(); // TreeSet é um HashSet que garante a ordem de inserção
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		// nums.get(1); Não é possível acessar pelo índice

		for (int n : nums) {
			System.out.println(n);
		}
	}
}
