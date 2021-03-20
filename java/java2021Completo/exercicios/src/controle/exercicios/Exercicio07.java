package controle.exercicios;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		//Criar um programa que enquanto estiver recebendo
		//números positivos, imprime no console a soma
		//dos números inseridos, caso receba um número
		//negativo, encerre o programa. Tente utilizar
		//do while
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int soma = 0;
		
		do {
			System.out.println("Insira um valor: ");
			num = entrada.nextInt();
			
			if(num < 0) {
				break;
			}
			
			soma += num;
			System.out.printf("Soma dos números inseridos: %d\n\n", soma);
		}while(num >= 0);

		entrada.close();
	}
}
