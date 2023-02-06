package boletin2_IntroduccionJava;

public class Ejercicio10 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*10. Realiza un método llamado gcd (greaterCommonDivisor) 
		 * que recibirá dos números y devuelva el máximo común divisor 
		 * según el algoritmo de Euclides.*/
		
		System.out.println(gcd(18, 24));	//6
		System.out.println(gcd(1220, 516));	//4
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ======================= Función gcd () ======================= */
	public static int gcd (int num1, int num2) {
		
		int a = num1;
		int b = num2;
		int resto = 0;
		
		
		do {
			
			resto = a % b;
			a = b;
			b = resto;
			
		}while (resto != 0);
		
		
		return (a);
	}
	
}
