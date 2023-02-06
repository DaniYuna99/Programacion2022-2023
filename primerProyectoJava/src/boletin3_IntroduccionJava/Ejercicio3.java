package boletin3_IntroduccionJava;

public class Ejercicio3 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*3. Diseña un programa que cuente el número de veces que aparece 
		 * una palabra en una cadena de texto.*/
		
		
		System.out.println(contarPalabrasEnCadena("afaholafafholaholaholafasfhola", "hola"));
		System.out.println(contarPalabrasEnCadena("ggggagggaggaaga", "a"));
		System.out.println(contarPalabrasEnCadena("rerPA adfpaER PA", "PA"));
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================== Función contarPalabrasEnCadena () ================== */
	public static int contarPalabrasEnCadena (String cadena, String palabraABuscar) {
		
		int numeroApariciones = 0;
		int indiceInterno = 0;
		boolean esPalabra = false;
		
		
		for (int i = 0; i < cadena.length(); i++) {
			
			if (cadena.charAt(i) == palabraABuscar.charAt(0)) {
				
				for (int j = 0; j < palabraABuscar.length(); j++) {
					
					if (cadena.charAt(i + indiceInterno) == palabraABuscar.charAt(j)) {
						esPalabra = true;
						indiceInterno++;
						
					}else {
						esPalabra = false;
						j = palabraABuscar.length() - 1;
					}
					
				}
				
				indiceInterno = 0;
				
				
				if (esPalabra == true) {
					numeroApariciones++;
				}
			}
		}
		
		
		return (numeroApariciones);
	}

}
