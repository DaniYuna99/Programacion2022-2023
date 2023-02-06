package boletin3_IntroduccionJava;

public class Ejercicio6 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*6. Haciendo uso de la función anterior crea una 
		 * función esCapicúa que acepte números tanto enteros 
		 * como decimales.*/
		
		
		System.out.println(esCapicua(1111));			//true
		System.out.println(esCapicua(12345));			//false
		
		System.out.println(esCapicua(110.011));			//true
		System.out.println(esCapicua(123.123));			//false
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================== Función esCapicua () ================== */
	/**
	 * Devuelve un boolean true si la <b>variable String</b> pasada por parámetro 
	 * es un palíndromo (un palíndromo es una palabra que se lee igual escrita
	 * correctamente y al revés) <br> <br>
	 * 
	 * <u>Método sobrecargado</u>. <br> <br>
	 * 
	 * Métodos que utiliza: <br>
	 * - invertirCadena() <br>
	 * - sustituirVocalesConTilde()
	 * 
	 * @param posiblePalindromo
	 * @return boolean
	 */
	public static boolean esCapicua (String posiblePalindromo) {
		
		String cadenaInvertida = invertirCadena(posiblePalindromo);
		cadenaInvertida = cadenaInvertida.replace(" ", "");
		
		return (sustituirVocalesConTilde(cadenaInvertida).equals
				(sustituirVocalesConTilde(posiblePalindromo).replace(" ", "")));
		
	}
	
	
	
	/**
	 * Devuelve un boolean true si la <b>variable int</b> pasada por parámetro 
	 * es un palíndromo (un palíndromo es una palabra que se lee igual escrita
	 * correctamente y al revés) <br> <br>
	 * 
	 * <u>Método sobrecargado</u>. <br> <br>
	 * 
	 * Métodos que utiliza: <br>
	 * - invertirCadena() <br>
	 * - sustituirVocalesConTilde()
	 * 
	 * @param posiblePalindromo
	 * @return boolean
	 */
	public static boolean esCapicua (int posiblePalindromo) {
		
		String cadenaInvertida = invertirCadena(posiblePalindromo);
		cadenaInvertida = cadenaInvertida.replace(" ", "");
		
		return (sustituirVocalesConTilde(cadenaInvertida).equals
				(sustituirVocalesConTilde(String.valueOf(posiblePalindromo)).replace(" ", "")));
		
	}
	
	
	
	/**
	 * Devuelve un boolean true si la <b>variable Double</b> pasada por parámetro 
	 * es un palíndromo (un palíndromo es una palabra que se lee igual escrita
	 * correctamente y al revés) <br> <br>
	 * 
	 * <u>Método sobrecargado</u>. <br> <br>
	 * 
	 * Métodos que utiliza: <br>
	 * - invertirCadena() <br>
	 * - sustituirVocalesConTilde()
	 * 
	 * @param posiblePalindromo
	 * @return boolean
	 */
	public static boolean esCapicua (double posiblePalindromo) {
		
		String cadenaInvertida = invertirCadena(posiblePalindromo);
		cadenaInvertida = cadenaInvertida.replace(" ", "");
		
		return (sustituirVocalesConTilde(cadenaInvertida).equals
				(sustituirVocalesConTilde(String.valueOf(posiblePalindromo)).replace(" ", "")));
		
	}
	
	
	
	/* ================== Función invertirCadena () ================== */
	/**
	 * Invierte y devuelve la <b>variable String</b> pasada por parámetro. <br> <br>
	 * 
	 * <u>Método sobrecargado</u>. <br> <br>
	 * 
	 * Métodos que usan esta función: <br>
	 * - esCapicua() 
	 * 
	 * @param cadenaAInvertir
	 * @return String
	 */
	public static String invertirCadena (String cadenaAInvertir) {
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = (cadenaAInvertir.length() - 1); i >= 0; i--) {
			sb.append(cadenaAInvertir.charAt(i));
		}
		
		
		return (sb.toString());
	}
	
	
	
	/**
	 * Invierte y devuelve la <b>variable int</b> pasado por parámetro. <br> <br>
	 * 
	 * <u>Método sobrecargado</u>. <br> <br>
	 * 
	 * Métodos que usan esta función: <br>
	 * - esCapicua() 
	 * 
	 * @param cadenaAInvertir
	 * @return String
	 */
	public static String invertirCadena (int numeroAInvertir) {
		
		StringBuilder sb = new StringBuilder();
		String cadenaAInvertir = String.valueOf(numeroAInvertir);
		
		
		for (int i = (cadenaAInvertir.length() - 1); i >= 0; i--) {
			sb.append(cadenaAInvertir.charAt(i));
		}
		
		
		return (sb.toString());
	}
	
	
	
	/**
	 * Invierte y devuelve la <b>variable double</b> pasado por parámetro. <br> <br>
	 * 
	 * <u>Método sobrecargado</u>. <br> <br>
	 * 
	 * Métodos que usan esta función: <br>
	 * - esCapicua() 
	 * 
	 * @param cadenaAInvertir
	 * @return String
	 */
	public static String invertirCadena (double numeroAInvertir) {
		
		StringBuilder sb = new StringBuilder();
		String cadenaAInvertir = String.valueOf(numeroAInvertir);
		
		
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
	 * - esCapicua() 
	 * 
	 * @param cadenaConTildes
	 * @return String
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
