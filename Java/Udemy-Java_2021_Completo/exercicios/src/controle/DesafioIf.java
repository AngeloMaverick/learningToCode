package controle;

public class DesafioIf {
	
	public static void main(String[] args) {
		
		double nota = 1.3;
		
		// n�o usar ; em estruturas de controle (tem uma exce��o)
		if(nota >= 9.0); {
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � fera!!!");
		}
		
		//O problema � o ponto e v�rgula na linha 9
		//Pois finaliza a express�o if antes do desejado
	}
}
