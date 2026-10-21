package oo.heranca.desafio;

public interface Luxo {

	// todo método dentro de interface é public e abstract por padrão
	public void ligarAr();

	abstract void desligarAr();

	// método de interface com retorno default (Não é obrigatório a sua
	// implementação)
	default int velocidadeDoAr() {
		return 1;
	};
}
