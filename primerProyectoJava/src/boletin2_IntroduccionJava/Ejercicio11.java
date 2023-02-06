package boletin2_IntroduccionJava;

public class Ejercicio11 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*11. Realizar un método llamado minimoComunMultiplo 
		 * que reciba dos números y calcule el mínimo común múltiplo 
		 * de dos números. Con el máximo común divisor de una pareja 
		 * de números podemos obtener fácilmente el mínimo común 
		 * múltiplo de dicha pareja. El mínimo común múltiplo de dos 
		 * números es igual al producto de los números dividido 
		 * entre su máximo común divisor. Por ejemplo, el máximo 
		 * común divisor de 24 y 36 es 12, por tanto el mínimo 
		 * común múltiplo de 24 y 36 es (24 × 36) / 12 = 72*/
		
		
		System.out.println(minimoComunMultiplo(24, 36));	//72
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================= Función minimoComunMultiplo () ================= */
	public static int minimoComunMultiplo (int num1, int num2) {
		
		return ((num1 * num2) / gcd(num1, num2));
		
	}
	
	
	
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
