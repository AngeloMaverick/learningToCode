package classe;

public class AreaCirc {
	//static faz a vari�vel pertencer somente a classe,
	//n�o mais a cada objeto criado.
	double raio;
	final static double PI = 3.1415;
	
	AreaCirc(double raioInicial){
		//pi = 3.14;
		raio = raioInicial;
	}
	
	double area(){
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
