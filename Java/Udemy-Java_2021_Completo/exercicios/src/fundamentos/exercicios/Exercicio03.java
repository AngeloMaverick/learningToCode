package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		//CALCULO IMC
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o peso (Kg): ");
		double peso = entrada.nextDouble();
		
		System.out.println("Insira a altura (Metros): ");
		double altura = entrada.nextDouble();
		
		double resultado = (peso/(altura*altura));
		System.out.printf("IMC = %.2f", resultado);
		
		entrada.close();
	}
}
