package fundamentos.exercicios;

import java.util.Scanner;

//import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		//�REA DE UM TRI�NGULO
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.println("Insira o valor da altura: ");
		double altura = entrada.nextDouble();
		
		System.out.printf("�rea: %.2fcm�", (base*altura)/2);
		
		entrada.close();
	}
}
