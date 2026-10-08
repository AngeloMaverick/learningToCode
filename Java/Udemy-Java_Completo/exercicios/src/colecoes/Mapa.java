package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();

		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println(usuarios.size()); // 4
		System.out.println(usuarios.isEmpty()); // false

		System.out.println(usuarios.keySet()); // [1,3,20,4]
		System.out.println(usuarios.values()); // Roberto, Rafaela,Ricardo, Rebeca]
		System.out.println(usuarios.entrySet()); // [1=Roberto, 3=Rafaela, 20=Ricardo, 4=Rebeca]

		System.out.println(usuarios.containsKey(20)); // true
		System.out.println(usuarios.containsValue("Rebeca")); // true

		System.out.println(usuarios.get(4)); // Rebeca

		System.out.println(usuarios.remove(1)); // Roberto
		System.out.println(usuarios.remove(4, "Gui")); // false

		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}

	}
}
