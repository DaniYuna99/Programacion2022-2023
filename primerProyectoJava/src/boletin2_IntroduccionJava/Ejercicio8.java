package boletin2_IntroduccionJava;

public class Ejercicio8 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*8. Realiza un método llamado toBinary que reciba un 
		 * número decimal como argumento y devuelva un String con 
		 * el número binario correspondiente.*/
		
		System.out.println(toBinary(40));	//101000
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/**
	 * Función que transforma un número entero en su equivalente en binario.
	 * Devuelve un String con el número entero en binario.<br><br>
	 * 
	 * Funciones invocadas: <br>
	 * - invertirCadena()
	 * 
	 * @param int numeroDecimal
	 * @return String numeroBinario
	 */
	/* ======================= Función toBinary () ======================= */
	public static String toBinary (int numeroDecimal) {
		
		String numeroBinario = "";
		
		
		while (numeroDecimal >= 1) {
			numeroBinario += String.valueOf(numeroDecimal % 2);
			numeroDecimal /= 2;
			
		}
		
		
		numeroBinario = invertirCadena(numeroBinario);
		
		
		return (numeroBinario);
		
	}
	
	
	/**
	 * Método que devuelve invertida una variable String.
	 * Creado para usarse en la función toBinary().
	 * 
	 * @param cadena
	 * @return cadenaInvertida
	 */
	/* ======================= Función invertirCadena () ======================= */
	public static String invertirCadena(String cadena) {
		
		String cadenaInvertida = "";
		
		
		for (int i = (cadena.length() - 1); i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		
		
		return (cadenaInvertida);
		
	}
	
}


























