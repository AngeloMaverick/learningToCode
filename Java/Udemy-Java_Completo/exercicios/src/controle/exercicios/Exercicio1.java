package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e
	// é par;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		boolean isFaixa = false;
		boolean isPar = false;

		do {
			System.out.print("Insira um valor: ");
			int valor = entrada.nextInt();
			isFaixa = valor >= 0 && valor <= 10;
			isPar = valor % 2 == 0;

			System.out.println("Entre 0 e 10? " + isFaixa);
			System.out.println("Par? " + isPar);
			System.out.println();
		} while (!(isFaixa && isPar));

		System.out.println("Fim!");
		entrada.close();
	}
}
