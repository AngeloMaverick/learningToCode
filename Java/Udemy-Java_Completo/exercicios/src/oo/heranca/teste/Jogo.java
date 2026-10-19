package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro(10, 10);
		Heroi heroi = new Heroi(10, 11);

		System.out.println("Monstro tem => " + monstro.exibirVida());
		System.out.println("Herói tem => " + heroi.exibirVida());

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("Monstro tem => " + monstro.exibirVida());
		System.out.println("Herói tem => " + heroi.exibirVida());

	}

}
