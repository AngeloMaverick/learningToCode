package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double valorDigitado = 0;
		double total = 0;
		int qtdNotasValidas = 0;
		double media;

		while (valorDigitado != -1) {
			System.out.println("Insira a nota de um aluno (ou -1 para sair): ");
			valorDigitado = entrada.nextDouble();

			if (valorDigitado >= 0 && valorDigitado <= 10) {
				total += valorDigitado;
				qtdNotasValidas++;
			} else if(valorDigitado != -1){
				System.out.println("Voc� inseriu uma nota inv�lida!\n");
			} 
		}

		System.out.println("Inser��o de notas encerrada!");
		media = total / qtdNotasValidas;
		System.out.printf("Quantidade de alunos: %d\n", qtdNotasValidas);
		System.out.printf("M�dia de todos os alunos �: %.2f", media);

		entrada.close();
	}
}
