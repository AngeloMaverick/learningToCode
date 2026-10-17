package oo.heranca.desafio;

public class Ferrari extends Carro {

	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	// @Override só serve para validação que você realmente está sobrescrevendo um
	// método da classe pai, com o sem o Override a sobrescrita ocorrerá
	// normalmente.

	@Override
	void acelerar() {
		super.delta = 15;
		super.acelerar();
	}
}
