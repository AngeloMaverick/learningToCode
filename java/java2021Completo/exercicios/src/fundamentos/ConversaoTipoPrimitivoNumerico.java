package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1;
		// convers�o impl�cita (imposs�vel perder informa��es)
		System.out.println(a);
		
		// CAST = convers�o expl�cita (H� probabilidade de perder informa��es)
		//float b = 1.123456788888f;
		//float b = 1.123456788888F;
		float b = (float) 1.123456788888; 
		System.out.println(b);
		
		// CAST
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		// CAST
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}
}
