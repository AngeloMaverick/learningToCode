package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (�F - 32) x 5/9 = �C
		//  VAR  CONST CONST VAR
		final int ajuste = 32;
		final double fator = 5/9.0;
		
		double fah = 86;
		double cel = (fah - ajuste)*fator;

		System.out.println("("+ fah + "�F - 32) x 5/9 = �C");
		System.out.println(cel + "�C");

		fah = 0;
		cel = (fah - ajuste)*fator;

		System.out.println("("+ fah + "�F - 32) x 5/9 = �C");
		System.out.println(cel + "�C");
	}
}
