package classe.desafioModulo;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida){
		if(comida != null) {
			this.peso += comida.peso;
			System.out.printf("%s comeu %s \n", this.nome, comida.nome);
		}
	}
	
	void mostrarPeso(){
		System.out.printf("Peso atual do %s é %.1fKg \n", this.nome, this.peso);
	}
}
