package fundamentos.javac;

import java.util.Scanner;

public class Teste {

	public static void main(String[] x) {
		System.out.println("Olá terminal do computador!");

		Scanner entrada = new Scanner(System.in);

		String valor = entrada.nextLine();
		System.out.println("Valor é " + valor);
		
		System.out.println(x[0]);
		entrada.close();
		
		// $ java Teste que_legal
		// Olá terminal do computador!
		// $ Teste
		// Valor é Teste
		// que_legal
	}
}
