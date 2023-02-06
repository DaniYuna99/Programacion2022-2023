package boletin3_IntroduccionJava;

public class Ejercicio5 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*5. Diseña una función llamada esPalindromo que 
		 * reciba una cadena de caracteres y determine si 
		 * constituye un palíndromo o no. Una palabra es 
		 * un palíndromo si puede leerse del mismo modo de 
		 * izquierda a derecha que de derecha a izquierda. 
		 * Obvia los espacios en blanco y caracteres separadores, 
		 * así como tildes, etc. Ejemplos de palíndromos: 
		 * ‘Ligar es ser ágil’, ‘Somos o no somos’.*/
		
		
		System.out.println(esPalindromo("Ligar es ser ágil"));						//true
		System.out.println(esPalindromo("Somos o no somos"));						//true
		System.out.println(esPalindromo("girafarig"));								//true
		
		System.out.println(esPalindromo("afasdfsdfwerwegbhwg"));					//false
		
		System.out.println(sustituirVocalesConTilde("Ligar es ser ágil"));			//ligar es ser agil
		System.out.println(sustituirVocalesConTilde("estó tiéne múchás tíldés"));	//esto tiene muchas tildes
		
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================== Función esPalindromo () ================== */
	/**
	 * Devuelve un boolean true si la variable String pasada por parámetro 
	 * es un palíndromo (un palíndromo es una palabra que se lee igual escrita
	 * correctamente y al revés) <br> <br>
	 * 
	 * Métodos que utiliza: <br>
	 * - invertirCadena() <br>
	 * - sustituirVocalesConTilde()
	 * 
	 * @param posiblePalindromo
	 * @return
	 */
	public static boolean esPalindromo (String posiblePalindromo) {
		
		String cadenaInvertida = invertirCadena(posiblePalindromo);
		cadenaInvertida = cadenaInvertida.replace(" ", "");
		
		return (sustituirVocalesConTilde(cadenaInvertida).equals
				(sustituirVocalesConTilde(posiblePalindromo).replace(" ", "")));
		
	}
	
	
	
	/* ================== Función invertirCadena () ================== */
	/**
	 * Invierte y devuelve la cadena pasada por parámetro. <br> <br>
	 * 
	 * Métodos que usan esta función: <br>
	 * - esPalindromo() 
	 * 
	 * @param cadenaAInvertir
	 * @return sb.toString()
	 */
	public static String invertirCadena (String cadenaAInvertir) {
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = (cadenaAInvertir.length() - 1); i >= 0; i--) {
			sb.append(cadenaAInvertir.charAt(i));
		}
		
		
		return (sb.toString());
	}
	
	
	
	/* ================== Función sustituirVocalesConTilde () ================== */
	/**
	 * Cambia las vocales que tienen tildes por su equivalente sin tilde. Devuelve la 
	 * cadena pasada por parámetro sin tildes y con los <u> caracteres en minúscula</u>. 
	 * <br> <br>
	 * 
	 * Métodos que usan esta función: <br>
	 * - esPalindromo() 
	 * 
	 * @param cadenaConTildes
	 * @return String sb.toString()
	 */
	public static String sustituirVocalesConTilde (String cadenaConTildes) {
		
		StringBuilder sb = new StringBuilder();
		cadenaConTildes = cadenaConTildes.toLowerCase();
		String vocalesConTilde = "áéíóú";
		String vocalesSinTilde = "aeiou";
		int esperarSiguiente = 0;
		
		
		for (int i = 0; i < cadenaConTildes.length(); i++) {
			
			for (int j = 0; j < vocalesConTilde.length(); j++) {
				
				if (cadenaConTildes.charAt(i) == vocalesConTilde.charAt(j)) {
					sb.append(vocalesSinTilde.charAt(j));
					esperarSiguiente = 1;
				}
			}
			
			
			if (esperarSiguiente > 0) {
				esperarSiguiente--;
				
			}else {
				sb.append(cadenaConTildes.charAt(i));
				
			}
		}
		
		
		return (sb.toString());
	}
	
}














