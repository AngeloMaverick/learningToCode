package classe;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		// a1.pi = 10;

		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 100;
		// a2.pi = 5;

		// AreaCirc.PI = 3.1415;

		// o out é um atributo da classe System
		System.out.println(a1.area());

		System.out.println(a2.area());
		// Não tem necessidade de instânciar um objeto para acessar um atributo ou
		// método de classe
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}
}
