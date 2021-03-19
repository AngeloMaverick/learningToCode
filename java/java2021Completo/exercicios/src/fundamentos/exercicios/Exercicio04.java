package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		//AO QUADRADO E AO CUBO
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		double n1 = entrada.nextDouble();
		System.out.printf("Resultado ao quadrado: %.2f\n", Math.pow(n1, 2));
		System.out.printf("Resultado ao cubo: %.2f", Math.pow(n1, 3));
		
		entrada.close();
	}
}
