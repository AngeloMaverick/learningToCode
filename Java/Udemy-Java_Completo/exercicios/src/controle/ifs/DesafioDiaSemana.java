package controle.ifs;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		// Domingo -> 1
		// Quarta -> 4
		// Terça -> 3
		// Englobar com acentos

		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o dia da semana por extenso: ");
		String diaSemana = entrada.next();

		if (diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("Dia da semana: " + 1);
		} else if (diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("Dia da semana: " + 2);
		} else if (diaSemana.equalsIgnoreCase("terça") || diaSemana.equalsIgnoreCase("terca")) {
			System.out.println("Dia da semana: " + 3);
		} else if (diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("Dia da semana: " + 4);
		} else if (diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("Dia da semana: " + 5);
		} else if (diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("Dia da semana: " + 6);
		} else if (diaSemana.equalsIgnoreCase("sábado") || diaSemana.equalsIgnoreCase("sabado")) {
			System.out.println("Dia da semana: " + 7);
		} else {
			System.out.println("Dia da semana inválido!");
		}

		System.out.println("Fim!");
		entrada.close();
	}
}
