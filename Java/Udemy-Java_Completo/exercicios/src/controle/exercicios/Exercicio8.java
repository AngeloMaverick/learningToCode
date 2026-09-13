package controle.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	// Crie um programa que recebe 10 valores e ao final imprima o maior número
	public static void main(String[] args) {

		int maior = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe um número: ");
			int numero = entrada.nextInt();

			if (numero > maior) {
				maior = numero;
			}
		}

		System.out.println("Maior número informado: " + maior);
		entrada.close();
	}
}
