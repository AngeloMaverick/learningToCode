package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	//Constantes devem ser iniciadas!!!
	//final int x; [ERRO]
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
		
		// Vari�veis de classe v�o ser iniciadas por padr�o.
		// byte, short, int, long -> 0
		// float, double -> 0.0
		// boolean -> false
		// char -> '\u0000'
		// Objetos -> null
		
		// null = Essa vari�vel n�o aponta para nenhum local de mem�ria
		// String s = null;
		// Diferente da String vazia, onde aponta para um local de mem�ria 
		//um valor vazio
		
		// Vari�veis de m�todos (locais) tem que ser iniciadas manualmente!
		//int a; 
		//System.out.println(a); [ERRO]
	}
	
	//this � utilizado para refer�nciar a vari�vel
	//correspondente a inst�ncia da classe
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
		//return dia + "/" + mes + "/" + ano;
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada()); 
	}
	
	//N�o da pra usar this em um m�todo static
	//static void teste() {
	//	this.dia = 3;
	//}
}
