package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Quantas notas você quer informar? ");
		int qtdNotas = entrada.nextInt();
		double[] notas = new double[qtdNotas];
		double soma = 0;

		for (int i = 0; i < qtdNotas; i++) {
			System.out.printf("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}

		for (double nota : notas) {
			soma += nota;
		}

		System.out.println("Média final: " + soma / qtdNotas);

		entrada.close();
	}
}
