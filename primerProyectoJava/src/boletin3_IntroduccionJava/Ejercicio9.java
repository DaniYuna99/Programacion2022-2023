package boletin3_IntroduccionJava;

public class Ejercicio9 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*9. Escribir una función que devuelva el número de palabras, 
		 * frases y párrafos que existen en una cadena de texto que recibe 
		 * como parámetro. Ten en cuenta que entre dos palabras puede haber 
		 * más de un blanco, las frases se separan por puntos y los
		 * párrafos por saltos de línea.*/
		
		System.out.println(contarPalabras("hola que tal"));
		System.out.println(contarPalabras("    hola      que       tal        a"));
		
		System.out.println(contarLineas("hola. que tal."));
		System.out.println(contarLineas("   hola.        q.   ue tal"));
		
		System.out.println(contarParrafos("hola\n que tal\n"));
		System.out.println(contarParrafos("      hola    \n     que tal        \n"));
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================== Función contarPalabrasYLineas () ================== */
	public static int contarTexto (String textoIntroducido) {
		
		return (-1);
	}
	
	
	
	/* ================== Función contarPalabras () ================== */
	public static int contarPalabras (String textoIntroducido) {
		
		int palabrasTotales = 0;
		boolean esBlanco = false;
		
		
		if (textoIntroducido != null && !textoIntroducido.isEmpty()) {
			
			for (int i = 0; i < textoIntroducido.length(); i++) {
				
				if (textoIntroducido.charAt(i) == ' ' && esBlanco == false) {
					esBlanco = true;	
					
				}else if ((esBlanco == true) && (Character.isAlphabetic(textoIntroducido.charAt(i)))
						|| (Character.isDigit(textoIntroducido.charAt(i)))
						|| (esBlanco == false) && (i == (textoIntroducido.length() - 1))) {
					palabrasTotales++;
					esBlanco = false;
				}
			}
		}
		
		
		return (palabrasTotales);
	}
	
	
	
	/* ================== Función contarLineas () ================== */
	public static int contarLineas (String textoIntroducido) {
		
		int lineasTotales = 0;
		
		
		if (textoIntroducido != null && !textoIntroducido.isEmpty()) {
			
			for (int i = 0; i < textoIntroducido.length(); i++) {
				
				if (textoIntroducido.charAt(i) == '.') {
					lineasTotales++;
				}
			}
		}
		
		
		return (lineasTotales);
	}
	
	
	/*LE FALTA*/
	/* ================== Función contarParrafos () ================== */
	public static int contarParrafos (String textoIntroducido) {
		
		int parrafosTotales = 0;
		
		
		for (int i = 0; i < textoIntroducido.length(); i++) {
			
			if ((textoIntroducido.charAt(i) == 92) && (textoIntroducido.charAt(i + 1) == 'n')) {
				parrafosTotales++;
			}
		}
		
		
		return (parrafosTotales);
	}
	
	
	
	
	
	
	
	
	
	
	
}

























