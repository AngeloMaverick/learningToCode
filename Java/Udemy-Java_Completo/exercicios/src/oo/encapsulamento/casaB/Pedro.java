package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	Ana mae = new Ana();

	void testeAcessos() {
		// privado
		// System.out.println(mae.segredo);

		// default (package)
		// System.out.println(mae.facoDentroDeCasa);

		// Não da para acessar um atributo protected por meio da instância do pai,
		// dentro do filho, somente diretametne do filho
		System.out.println(formaDeFalar);

		// public
		System.out.println(mae.todosSabem);
		// ou
		System.out.println(todosSabem);
	}

}
