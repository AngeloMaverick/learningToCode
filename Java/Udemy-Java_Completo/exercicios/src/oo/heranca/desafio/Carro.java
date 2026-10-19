package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected Integer velocidadeAtual = 0;
	protected int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	// Método utilizado no vídeo resposta
	public String toString() {
		return velocidadeAtual + "Km/h";
	}
}
