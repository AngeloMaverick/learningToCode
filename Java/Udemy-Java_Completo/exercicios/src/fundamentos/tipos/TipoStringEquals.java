package fundamentos.tipos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2"); // true
		
		String s1 = new String("2");
		System.out.println("2" == s1); // false
		System.out.println("2".equals(s1)); // true
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.nextLine();	
		System.out.println(s2);
		System.out.println("2" == s2.trim()); // 2? false
		System.out.println("2".equals(s2.trim())); // 2? true
		// trim() -> Elimina espaços em branco
		// next() -> Ja elimina espaços em branco
		// nextLine() -> Não elimna espaços em branco
		// Nunca compare strings com == e sempre com .equals
		entrada.close();
	}
}
