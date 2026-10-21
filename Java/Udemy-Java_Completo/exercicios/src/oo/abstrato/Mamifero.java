package oo.abstrato;

public abstract class Mamifero extends Animal {

	public abstract String mamar();

	// Se um método for final ele não pode ser sobrescrito
	@Override
	public String mover() {
		return "Saindo do lugar";
	}

}
