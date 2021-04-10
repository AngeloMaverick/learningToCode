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
		
		// Variáveis de classe vão ser iniciadas por padrão.
		// byte, short, int, long -> 0
		// float, double -> 0.0
		// boolean -> false
		// char -> '\u0000'
		// Objetos -> null
		
		// null = Essa variável não aponta para nenhum local de memória
		// String s = null;
		// Diferente da String vazia, onde aponta para um local de memória 
		//um valor vazio
		
		// Variáveis de métodos (locais) tem que ser iniciadas manualmente!
		//int a; 
		//System.out.println(a); [ERRO]
	}
	
	//this é utilizado para referênciar a variável
	//correspondente a instância da classe
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
	
	//Não da pra usar this em um método static
	//static void teste() {
	//	this.dia = 3;
	//}
}
