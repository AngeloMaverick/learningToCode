package controle.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	// Criar um programa que receba um número e diga se ele é um número primo.
	// (Número que só é divisível por 1 ou ele mesmo)
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira um número positivo: ");
		int numero = entrada.nextInt();

		int i;

		for (i = 2; i < numero; i++) {
			if (numero % i == 0) {
				System.out.println("O número NÃO é primo");
				break;
			}
		}

		if (i == numero) {
			System.out.println("O número É PRIMO");
		}
		if (numero == 1) {
			System.out.println("O número NÃO é primo");
		}

		System.out.println("Fim!");
		entrada.close();
	}
}
