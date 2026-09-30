package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	// Lista é uma estrutura ordenada que é possível acessar por meio de índice e
	// pode ter valor repetido
	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(3)); // acessar pelo índice
		// Bia

		System.out.println(">>>> " + lista.remove(1)); // Meu nome é Carlos
		System.out.println(lista.remove(new Usuario("Manu"))); // true
		System.out.println(lista.remove(new Usuario("Manu"))); // true
		System.out.println(lista.remove(new Usuario("Manu"))); // false

		System.out.println("Tem? " + lista.contains(new Usuario("Lia"))); // true
		System.out.println("Tem? " + lista.contains(u1)); // true

		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
	}
}
