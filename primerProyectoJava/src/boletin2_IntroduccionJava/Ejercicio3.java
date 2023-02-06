package boletin2_IntroduccionJava;

public class Ejercicio3 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*3. Diseña una función que, dada una cadena de entrada, 
		 * comprueba si es una contraseña fuerte o no. Se considera 
		 * que una contraseña es fuerte si contiene 8 o más caracteres, 
		 * y entre ellos al menos hay una mayúscula, una minúscula, 
		 * un signo de puntuación y al menos un dígito.*/
		
		System.out.println(esContrasenaFuerte("Ad4adf,6456"));  //true
		System.out.println(esContrasenaFuerte("adfg1DF:!"));	//true
		System.out.println(esContrasenaFuerte("Af0:"));			//false
		System.out.println(esContrasenaFuerte("AAAAAA,AA7"));   //false
		
	}
	
	
	/* --- CONSTANTES --- */
	public static final int LONGITUD_MINIMA_SEGURA = 8;
	public static final String SIGNOS_PUNTUACION = "?¿!¡:;.,'";
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ============ Función esContrasenaFuerte (String contrasena) ============ */
	
	/**
	 * Función que recorre una variable String, y devuelve un boolean true si 
	 * sería una contraseña fuerte.<br> <br>
	 * 
	 * Funciones invocadas aquí: <br>
	 * - esSignoPuntuacion()
	 * 
	 * @param String contrasena
	 * @return boolean esFuerte
	 */
	public static boolean esContrasenaFuerte (String contrasena) {
		
		boolean esFuerte = false;
		boolean hayMayus = false;
		boolean hayMinus = false;
		boolean haySigno = false;
		boolean hayDigito = false;
		
		
		if (contrasena.length() >= LONGITUD_MINIMA_SEGURA) {
			
			for (int i = (contrasena.length() - 1); i >= 0; i--) {
				
				if (Character.isUpperCase(contrasena.charAt(i))) {
					hayMayus = true;
				
				}else if (Character.isLowerCase(contrasena.charAt(i))) {
					hayMinus = true;
				
				}else if (Character.isDigit(contrasena.charAt(i))) {
					hayDigito = true;
					
				}else {
					haySigno = esSignoPuntuacion(contrasena.charAt(i));
					
				}	
			}
			
			
			if ((hayMayus == true) && (hayMinus == true) && (haySigno == true) && (hayDigito == true)) {
				esFuerte = true;
			}
		}
		
		
		return (esFuerte);
	}
	
	
	
	/* ==================== Función esSignoPuntuacion () ==================== */
	
	/**
	 * Función que recibe un carácter, y recorre una variable constante llamada 
	 * "SIGNOS_PUNTUACION" que contiene signos de puntuacion, y devuelve un booleano 
	 * true si hay una coincidencia. <br> <br>
	 * 
	 * Esta función es utilizada por: <br> 
	 * - esContrasenaFuerte()
	 *
	 * @param char posibleSigno
	 * @return boolean haySigno
	 */
	public static boolean esSignoPuntuacion (char posibleSigno) {
		
		boolean haySigno = false;
		
		
		for (int j = 0; j <= (SIGNOS_PUNTUACION.length() - 1); j++) {
			
			if (SIGNOS_PUNTUACION.charAt(j) == posibleSigno) {
				haySigno = true;
			}
		}
		
		
		return (haySigno);
	}
}




















