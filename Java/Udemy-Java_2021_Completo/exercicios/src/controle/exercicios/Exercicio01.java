package controle.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Criar um programa que receba um n�mero
		// e verifique se ele est� entre o 0 e 10 e � par

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		int num = entrada.nextInt();

		if (num >= 0 && num <= 10 && num % 2 == 0 ) {
			System.out.println("O n�mero digitado est� entre o 0 e 10 e � par");
		}

		entrada.close();
	}
}
