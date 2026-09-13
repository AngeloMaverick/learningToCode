package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	// Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("===[CONVERSOR DE FAHRENHEIT PARA CELSIUS]===");		
		System.out.print("Insira a temperatura em Fahrenheit: ");
		double f = entrada.nextDouble();
		
		double p1 = (double) f - 32;
		double p2 = (double) 9/5;
		double c =  p1 / p2;
		
		System.out.printf("%.2f°F = %.2f°C", f, c);
		
		entrada.close();
	}
}
