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
		
		
		System.out.println(contarPalabras("hola que tal"));								//3 palabras
		System.out.println(contarPalabras("    hola      que       tal        a"));		//4 palabras
		
		System.out.println(contarLineas("hola. que tal."));								//2 lineas
		System.out.println(contarLineas("   hola.        q.   ue tal"));				//2 lineas
		
		System.out.println(contarParrafos("hola\n que tal\n"));							//2 parrafos
		System.out.println(contarParrafos("      hola    \n     que tal        \n"));	//2 parrafos
		
		
		contarTexto("      hola    \n     que tal        \n. Me llamo     Daniel.");
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================== Función contarPalabrasYLineas () ================== */
	public static void contarTexto (String textoIntroducido) {
		
		System.out.println("El texto introducido contiene " + contarPalabras(textoIntroducido)
							+ " palabras, " + contarLineas(textoIntroducido) + " líneas, y "
							+ contarParrafos(textoIntroducido) + " párrafos.");
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
						|| ((esBlanco == false) && (i == (textoIntroducido.length() - 1))
						&& (Character.isAlphabetic(textoIntroducido.charAt(i))))) {
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
	
	

	/* ================== Función contarParrafos () ================== */
	public static int contarParrafos (String textoIntroducido) {
		
		int parrafosTotales = 0;
		
		
		for (int i = 0; i < textoIntroducido.length(); i++) {
			
			if (textoIntroducido.charAt(i) == '\n') {
				parrafosTotales++;
			}
		}
		
		
		return (parrafosTotales);
	}
	
	
	
	
	
	
	
	
	
	
	
}

























