package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		// setDelta(35);
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		// setDelta(15);
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
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
