package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Construtor padrão
	Produto() {

	}

	//Construtor Explícito
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		//desconto = descontoInicial;
	}

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
