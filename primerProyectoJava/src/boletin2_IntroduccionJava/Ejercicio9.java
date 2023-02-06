package boletin2_IntroduccionJava;

public class Ejercicio9 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*9. Realiza un método llamado toDecimal que reciba un 
		 * String con un valor numérico en binario como argumento 
		 * y devuelva un número con el número decimal correspondiente.*/
		
		System.out.println(toDecimal("101000"));  	//40
		System.out.println(toDecimal(""));  	  	//-1
		System.out.println(toDecimal(null));  		//-1
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ======================= Función toDecimal () ======================= */
	public static int toDecimal(String numeroBinario) {
		
		int numeroDecimal = 0;
		int cantidadASumar = 1;
		
		
		if (numeroBinario != null && !numeroBinario.isEmpty()) {
			
			for (int i = (numeroBinario.length() - 1); i >= 0; i--) {
				
				if (numeroBinario.charAt(i) == '1') {
					numeroDecimal += cantidadASumar;
				}
				
				cantidadASumar *= 2;
			}
			
	
		}else {
			numeroDecimal = -1;
		}
		
		
		return (numeroDecimal);
		
	}
	
}
