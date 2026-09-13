package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// Conversor de Fahrenheit para Celsius
		// (°F - 32) x 5/9 = °C
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double fahrenheit = 60.8;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(fahrenheit + "°F = " + celsius + "°C");
		
		fahrenheit = 86;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(fahrenheit + "°F = " + celsius + "°C");
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(fahrenheit + "°F = " + celsius + "°C");
		
		// ALT + (CIMA || BAIXO) ==> Move a linha selecionada
		// CTRL + ALT + (CIMA || BAIXO) ==> Duplica a linha selecionada		
	}
}
