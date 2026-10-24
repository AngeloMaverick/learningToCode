package lambdas;

// Toda classe no Java extends Object por padrão, você declarando isso explícitamente ou não
public class Produto extends Object {

	final String nome;
	final double preco;
	final double desconto;

	// CTRL + SHIFT + S => Opções do Source
	// Generate Constructor using Fields...
	public Produto(String nome, double preco, double desconto) {
		// super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preço de R$" + precoFinal;
	}

}
