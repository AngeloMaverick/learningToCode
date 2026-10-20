package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Pista {

	public static void main(String[] args) {

		// Os métodos são chamados da instância criada e não do tipo da variável que
		// você definiu, ou seja, o código abaixo e Ferrari ferrari = new Ferrari() tem
		// exatamente o mesmo comportamento. E esse tipo de declaração é permitido pois
		// tipo Carro é pai de Ferrari.
		// Carro ferrari = new Ferrari(25);
		Ferrari ferrari = new Ferrari(400);
		Civic civic = new Civic(8);

		ferrari.ligarTurbo();
		// ferrari.ligarAr();

		ferrari.acelerar();
		civic.acelerar();
		System.out.println("Ferrari: " + ferrari);
		System.out.println("Civic: " + civic);

		ferrari.acelerar();
		civic.acelerar();
		System.out.println("Ferrari: " + ferrari);
		System.out.println("Civic: " + civic);

		ferrari.frear();
		civic.frear();
		System.out.println("Ferrari: " + ferrari);
		System.out.println("Civic: " + civic);

		ferrari.frear();
		civic.frear();
		System.out.println("Ferrari: " + ferrari);
		System.out.println("Civic: " + civic);

		ferrari.frear();
		civic.frear();
		System.out.println("Ferrari: " + ferrari);
		System.out.println("Civic: " + civic);

		ferrari.frear();
		civic.frear();
		System.out.println("Ferrari: " + ferrari);
		System.out.println("Civic: " + civic);
	}
}
