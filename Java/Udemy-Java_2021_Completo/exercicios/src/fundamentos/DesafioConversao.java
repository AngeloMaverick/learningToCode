package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro sal�rio:");
		String n1 = entrada.nextLine();
		n1 = n1.replace(",", ".");
		
		System.out.println("Insira o segundo sal�rio:");
		String n2 = entrada.nextLine();
		n2 = n2.replace(",", ".");
		
		System.out.println("Insira o terceiro sal�rio:");
		String n3 = entrada.nextLine();
		n3 = n3.replace(",", ".");
		
		double a = Double.parseDouble(n1);
		double b = Double.parseDouble(n2);
		double c = Double.parseDouble(n3);
		
		Double media = (a+b+c)/3;
		String resultado = media.toString().replace(".", ",");
		System.out.println("M�dia: R$" + resultado);
		
		entrada.close();
	}
}
