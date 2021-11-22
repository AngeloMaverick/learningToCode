package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		//underline para facilitar leitura
		//ap�s chegar na casa do long deve utilizar a letra l no final do valor
		long pontosAcumulados = 3_134_845_223L; //Literal Long
		
		
		// Tipos num�ricos reais
		float salario = 11_445.44F; //Literal Float, com F ao final
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; //S� aceita true ou false. nada de 1 e 0.
		
		// Tipo caractere
		char status = 'A'; //ativo
		
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha --> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
