package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		//Jeito certo
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //5
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); //6
		
		//Short.toString();
		//Double.toString();
		
		// Gambiarra
		System.out.println(("" + num1).length()); //5
		System.out.println(("" + num2).length()); //6
		
	}
}