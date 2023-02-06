package boletin2_IntroduccionJava;

public class Ejercicio4 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*4. Elabora un programa que codifique una cadena, de tal modo que en 
		 * el resultado se inviertan cada 2 caracteres. Los caracteres intercambiados 
		 * no pueden volver a intercambiarse. Ejemplo:
		 * 
			 * Entrada -> Hola mundo
			 * Salida -> oHalm nuod*/
		
		
		System.out.println(invertirCadena("Hola mundo"));
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ==================== Función invertirCadena () ==================== */
	public static String invertirCadena (String cadenaAInvertir) {
		
		StringBuilder cadenaInvertida = new StringBuilder();
		
		
		if (cadenaAInvertir != null && !cadenaAInvertir.isEmpty()) {
			
			for (int i = 0; i < cadenaAInvertir.length() - 1; i += 2) {
				
				cadenaInvertida.append(cadenaAInvertir.charAt(i + 1));
				cadenaInvertida.append(cadenaAInvertir.charAt(i));
				
				
				if (cadenaAInvertir.length() % 2 == 1) {
					cadenaInvertida.append(cadenaAInvertir.charAt(cadenaAInvertir.length() - 1));
				}
			}
		}
		
		
		return (cadenaInvertida.toString());
		
	}
	
}




































