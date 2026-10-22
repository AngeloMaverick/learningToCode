package Lambdas;

//Só pode ter um único método ABSTRATO e é possível utilizar expressões lamba
@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);

	// método com retorno default
	default String legal() {
		return "legal";
	}

	// Método static; método da Interface e não do objeto que implementa a
	// Interface.
	static String muitoLegal() {
		return "muito legal";
	}
}
