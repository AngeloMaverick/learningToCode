package oo.heranca.desafio;

public class Pista {

	public static void main(String[] args) {

		// Os métodos são chamados da instância criada e não do tipo da variável que
		// você definiu, ou seja, o código abaixo e Ferrari ferrari = new Ferrari() tem
		// exatamente o mesmo comportamento. E esse tipo de declaração é permitido pois
		// tipo Carro é pai de Ferrari.
		Carro ferrari = new Ferrari(25);
		Civic civic = new Civic(8);

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
