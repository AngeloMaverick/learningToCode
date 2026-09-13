package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		//FAHRENHEIT PARA CELSIUS
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();;
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.printf("Resultado em Celsius: %.2fF°", celsius);
		
		entrada.close();
	}
}
