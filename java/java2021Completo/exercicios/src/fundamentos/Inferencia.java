package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5; //declara��o e inicializa��o
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		//a = "..."; //O tipo n�o muda ap�s declarada, diferente do JS.
		
		var b = 4.5; //Infere o tipo pelo valor que inseriu, que nem JS
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		//c = 4.5; //O tipo n�o muda ap�s declarada com var, diferente do JS.
		
		double d; //vari�vel foi declarada
		d = 123.65; //vari�vel foi inicializada
		System.out.println(d); //usada!
		
		//var e;
		//e = 123.45; //Inferencia somente com declara��o e inicializa��o na mesma linha
		var e = 123.45;
		System.out.println(e);
		
		var f = 12; //inteiro
		//f = 12.01; //imposs�vel
		System.out.println(f);
		
	}
}