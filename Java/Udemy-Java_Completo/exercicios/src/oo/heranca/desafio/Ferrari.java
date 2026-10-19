package oo.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		super.delta = 15;
	}

	// @Override só serve para validação que você realmente está sobrescrevendo um
	// método da classe pai, com o sem o Override a sobrescrita ocorrerá
	// normalmente.

//	@Override
//	public void acelerar() {
//		super.delta = 15;
//		super.acelerar();
//	}

	// É possível sobrescrever um método para um modificador de acesso mais
	// permissivo que o seu original, mas nunca um mais restritivo
}
