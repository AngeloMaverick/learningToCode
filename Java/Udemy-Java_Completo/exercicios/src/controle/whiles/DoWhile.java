package controle.whiles;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// if(...) sentança; ou {}
		// while(...) sentença; ou {}
		// for(...; ...; ...) sentenca; ou {}

		// do sentenca; ou {} while(...);

		// Window > Preferences > Java > Editor > Templates
		// Atalhos de código personalizados

		Scanner entrada = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();

		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");
		entrada.close();
	}
}
