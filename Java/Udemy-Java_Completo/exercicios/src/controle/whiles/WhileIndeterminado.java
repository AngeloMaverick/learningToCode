package controle.whiles;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = "";

		// Meu código
//		do {
//			System.out.print("Você diz: ");
//			texto = entrada.nextLine();
//		} while (!texto.equalsIgnoreCase("sair"));

		while (!texto.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			texto = entrada.nextLine();
		}

		System.out.println("Fim");
		entrada.close();

	}
}
