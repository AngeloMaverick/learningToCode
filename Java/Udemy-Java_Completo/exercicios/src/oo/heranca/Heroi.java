package oo.heranca;

public class Heroi extends Jogador {

	Heroi(int x, int y) {
		super(x, y);
	}

	// É possível sobrescrever um método da classe pai
	boolean atacar(Jogador oponente) {

		// É possível chamar um método da classe pai com o "super"
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
}
