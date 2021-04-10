package classe;

public class ValorNulo {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!"));
		
		//Data d1 = null;
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		//d1.mes = 3;
		//Cannot assign field "mes" because "d1" is null
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		//String s2 = null;
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		//System.out.println(s2.concat("????"));
		// NullPointerException = Erro de acesso a m�todos ou atributos de 
		//um objeto nulo(sem endere�o de mem�ria). 
		if(s2 != null) {
			System.out.println(s2.concat("????"));
		}
	}
}
