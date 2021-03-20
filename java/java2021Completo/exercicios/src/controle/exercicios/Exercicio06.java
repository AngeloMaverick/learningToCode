package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		//Jogo da Adivinha��o
		
		Scanner entrada = new Scanner(System.in);
		Random random = new Random(); //Declara��o Random
		
		int numero = random.nextInt(100); //Delimitando
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("\nQual seu palpite: ");
			int digitado = entrada.nextInt();		
			
			if(digitado > numero) {
				System.out.println("O n�mero secreto � MENOR!");
			}else if (digitado < numero) {
				System.out.println("O n�mero secreto � MAIOR!");
			}else {
				System.out.println("PARAB�NS VOC� CONSEGUIU!!!");
				System.out.printf("O n�mero secreto era %d!", numero);
				break;
			}
			
			if(i<10) {
				System.out.printf("-----Restam %d tentativas!-----\n", 10-i);
			} else {
				System.out.printf("-----FIM DE JOGO!-----");
				
			}
			
		}
		
		entrada.close();
	}
}
