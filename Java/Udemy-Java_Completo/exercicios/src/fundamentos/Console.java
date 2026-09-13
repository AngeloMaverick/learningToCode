package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		// PRINT
		System.out.print("Bom");
		System.out.print(" dia!\n\n");

		// PRINTLN
		System.out.println("Bom");
		System.out.println("dia!");

		// PRINTF
		// /n ou %n quebra linha
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "João");

		// SCANNER SYSTEM IN
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

		// Quando abrir um Scanner deve se fechar ele ao terminar de usar
		entrada.close();
		
		// Lembrando que o nextInt e nextDouble deixam um \n pra trás ao dar ENTER, então é importante deixar um .nextLine() para coletar esse \n após um nextInt ou nextDouble e não dar problema nos next que virão a seguir.

	}
}
