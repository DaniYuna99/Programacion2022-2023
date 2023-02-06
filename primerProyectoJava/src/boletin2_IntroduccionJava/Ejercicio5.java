package boletin2_IntroduccionJava;

public class Ejercicio5 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*5. Realizar un método llamado esMultiplo que recibirá dos 
		 * números y devuelva True si el primer número es múltiplo 
		 * del segundo.*/
		
		
		System.out.println(esMultiplo(3,6));	//true
		System.out.println(esMultiplo(50,10));	//true
		System.out.println(esMultiplo(3,11));	//false
		System.out.println(esMultiplo(250,7));	//false
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ======================= Función esMultiplo () ======================= */
	public static boolean esMultiplo (int num1, int num2) {
		
		boolean esCierto = (num1 >= num2) 
				? (num1 % num2 == 0)
				: (num2 % num1 == 0);

		
		return (esCierto);
		
	}
	
}
