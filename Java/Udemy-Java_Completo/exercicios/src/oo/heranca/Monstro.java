package oo.heranca;

public class Monstro extends Jogador {

	// Uma classe filha sempre chama o construtor da classe pai, seja de forma
	// implícita ou de forma explícita

	Monstro() {
		super(0, 0);
	}

	Monstro(int x, int y) {
		super(x, y);
	}

}
