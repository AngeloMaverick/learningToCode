package classe.desafioModulo;

public class Jantar {
	
	public static void main(String[] args) {
		Pessoa pessoa01 = new Pessoa("Angelo", 72);
		//pessoa01.nome = "Angelo";
		//pessoa01.peso = 72;
		
		Comida comida01 = new Comida("Strogonoff", 0.4);
		//comida01.nome = "Strogonoff";
		//comida01.peso = 0.4;
		
		Comida comida02 = new Comida("Mocot�", 0.9);
		//comida02.nome = "Mocot�";
		//comida02.peso = 0.9;
		
		//System.out.println(pessoa01.peso);
		pessoa01.mostrarPeso();
		pessoa01.comer(comida01);
		pessoa01.mostrarPeso();
		pessoa01.comer(comida02);
		pessoa01.mostrarPeso();
	}
}
