package boletin3_IntroduccionJava;

public class Ejercicio10 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	/* ====== CONSTANTES ====== */ 
	public static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz";
	
	
	public static void main(String[] args) {
		
		/*10. El cifrado César es un tipo de cifrado por 
		 * sustitución en el que una letra del alfabeto es 
		 * sustituida por otra que se encuentra situada en 
		 * el abecedario (abcdefghijklmnñopqrstuvwxyz) un 
		 * número dado de posiciones desde la primera, como 
		 * puede observarse en la siguiente imagen: 
		 * Así, por ejemplo, la palabra CASADO, con un cifrado 
		 * de tres posiciones pasaría a ser FDVDGR.
		 * 
		 * 		a. Realiza una función que cifre un carácter 
		 * 		según el cifrado César y un desplazamiento dado.
		 * 
				b. Elabora una función que, haciendo uso de la 
				anterior, reciba una palabra y un número fijo 
				de posiciones y la codifique según este algoritmo.
				
				c. Diseña otra función que reciba dos palabras y 
				compruebe si son equivalentes según este tipo de 
				cifrado e indique el nivel de sustitución utilizado, 
				es decir, si cifrando una de ellas podemos obtener 
				la otra.
				
				Ej: Si recibe CASADO y FDVDGR debe indicar que son 
				equivalentes y utilizan un nivel de codificación 3. 
				Si recibe CASADO y AAAABD debe indicar que no 
				son equivalentes. El programa no debe distinguir 
				entre mayúsculas y minúsculas.*/
		
		
		System.out.println(cifrarConCesar('y', 3));
		System.out.println(cifrarConCesar("casado", 3));
		
		System.out.println(sonCifradosEquivalentes("CASADO", "fdvdgr"));
		System.out.println(sonCifradosEquivalentes("fdvdgr", "CASADO"));
		System.out.println(sonCifradosEquivalentes("casado", "aaaaaa"));
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	//APARTADO A
	/* ============= Función cifrarConCesar () [SOBRECARGADO] ============= */
	public static char cifrarConCesar (char caracterACifrar, int desplazamiento) {
		
		int indiceCaracterFinal = ABECEDARIO.indexOf(Character.toLowerCase(caracterACifrar)) + desplazamiento;
		
		
		if (indiceCaracterFinal > ABECEDARIO.length() - 1) {
			indiceCaracterFinal = indiceCaracterFinal - ABECEDARIO.length() - 1;
		}
		
		
		if (indiceCaracterFinal < 0) {
			indiceCaracterFinal = -indiceCaracterFinal;
		}
		
		
		return (ABECEDARIO.charAt(indiceCaracterFinal));
	}
	
	
	
	//APARTADO B
	/* ============= Función cifrarConCesar () [SOBRECARGADO] ============= */
	public static String cifrarConCesar (String palabraACifrar, int desplazamiento) {
		
		StringBuilder sb = new StringBuilder();
		
		
		if (palabraACifrar != null && !palabraACifrar.isEmpty()) {
			
			for (int i = 0; i < palabraACifrar.length(); i++) {
				sb.append(cifrarConCesar(palabraACifrar.charAt(i), desplazamiento));
			}
		}
			
		
		return (sb.toString());
	}
	
	
	
	//APARTADO C
	/* ================== Función cifrarCaracter () ================== */
	public static String sonCifradosEquivalentes (String palabra1, String palabra2) {
		
		boolean sonEquivalentes = false;
		int nivelCifrado = 0;
		StringBuilder sb = new StringBuilder();
		
		
		if (palabra1 != null && !palabra1.isEmpty() 
				 && palabra2 != null && !palabra2.isEmpty()) {
			
			for (int i = 1; i < 27; i++) {
				
				if (cifrarConCesar(palabra1.toLowerCase(), i).equals(palabra2.toLowerCase())) {
					sonEquivalentes = true;
				}
				
				
				if (sonEquivalentes == true) {
					i = 26;
				}
				
				
				nivelCifrado++;
			}
		}
		
		
		if (sonEquivalentes == true) {
			sb.append("La palabra '" + palabra1 + "' es la palabra '" + palabra2 + "' cifrada "
						+ "con un nivel " + nivelCifrado + " de cifrado." );
			
		}else {
			sb.append("Las palabras '" + palabra1 + "' y '" + palabra2
						+ "' no son equivalentes.");
		}
		
		
		return (sb.toString());	
	}
}











