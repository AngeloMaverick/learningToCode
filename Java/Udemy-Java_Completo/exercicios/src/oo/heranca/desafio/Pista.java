package oo.heranca.desafio;

public class Pista {

	public static void main(String[] args) {

		Ferrari ferrari = new Ferrari();
		Civic civic = new Civic();

		ferrari.acelerar();
		civic.acelerar();
		System.out.println("Ferrari: " + ferrari.velocidadeAtual + " Km/h");
		System.out.println("Civic: " + civic.velocidadeAtual + " Km/h");

		ferrari.acelerar();
		civic.acelerar();
		System.out.println("Ferrari: " + ferrari.velocidadeAtual + " Km/h");
		System.out.println("Civic: " + civic.velocidadeAtual + " Km/h");

		ferrari.frear();
		civic.frear();
		System.out.println("Ferrari: " + ferrari.velocidadeAtual + " Km/h");
		System.out.println("Civic: " + civic.velocidadeAtual + " Km/h");

		ferrari.frear();
		civic.frear();
		System.out.println("Ferrari: " + ferrari.velocidadeAtual + " Km/h");
		System.out.println("Civic: " + civic.velocidadeAtual + " Km/h");

		ferrari.frear();
		civic.frear();
		System.out.println("Ferrari: " + ferrari.velocidadeAtual + " Km/h");
		System.out.println("Civic: " + civic.velocidadeAtual + " Km/h");

		ferrari.frear();
		civic.frear();
		System.out.println("Ferrari: " + ferrari.velocidadeAtual + " Km/h");
		System.out.println("Civic: " + civic.velocidadeAtual + " Km/h");
	}
}
