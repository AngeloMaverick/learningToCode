package oo.heranca.desafio;

public class Carro {

	Integer velocidadeAtual = 0;

	void acelerar() {
		velocidadeAtual += 5;
	}

	void frear() {
		if (velocidadeAtual > 0) {
			velocidadeAtual -= 5;
		}
	}
}
