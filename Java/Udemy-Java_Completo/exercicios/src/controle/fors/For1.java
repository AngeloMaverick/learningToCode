package controle.fors;

public class For1 {

	public static void main(String[] args) {

		for (int contador = 0; contador <= 20; contador += 2) {
			System.out.printf("i = %d\n", contador);
		}

		// For com declaração de variável e atribuidor fora do contexto for
//		int x = 2;
//		for (; x < 10;) {
//			System.out.println("x = " + x);
//			x++;
//		}

		// Laço infinito (ou for(;true;))
//		for (;;) {
//			System.out.println("Fim!");
//		}
	}
}
