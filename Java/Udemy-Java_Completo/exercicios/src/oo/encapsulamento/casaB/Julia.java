package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();

	void testeAcessos() {
		// private
		// System.out.println(esposa.segredo);

		// default (package)
		// System.out.println(sogra.facoDentroDeCasa);

		// protected
		// System.out.println(sogra.formaDeFalar);

		// public
		System.out.println(sogra.todosSabem);
	}
}
