package boletin3_IntroduccionJava;

public class Ejercicio4 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*4. Crea tres funciones cuyo comportamiento sea 
		 * como el de los métodos de String startsWirth, 
		 * contains y endsWith, pero sin utilizar ninguno 
		 * de ellos.*/
		
		
		System.out.println(empiezaPor("raton", "rat"));							//true
		System.out.println(empiezaPor("externocleidomastoideo", "esterno"));	//false
		
		System.out.println(contiene("raton", "ato"));							//true
		System.out.println(contiene("externocleidomastoideo", "cleydo"));		//false
		
		System.out.println(terminaPor("raton", "on"));							//true
		System.out.println(terminaPor("externocleidomastoideo", "idea"));		//false
		
	}

	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================== Función empiezaPor () ================== */
	public static boolean empiezaPor (String cadenaABuscar, String palabra) {
		
		return (cadenaABuscar.substring(0, (palabra.length())).equals(palabra));
	}
	
	
	
	/* ================== Función contiene () ================== */
	/**
	 * Método modificado del Ejercicio 3.
	 * 
	 * @param cadenaABuscar
	 * @param palabra
	 * @return
	 */
	public static boolean contiene (String cadenaABuscar, String palabra) {
		
		boolean siContiene = false;
		int indiceInterno = 0;
		
		
		for (int i = 0; i < cadenaABuscar.length(); i++) {
			
			if (cadenaABuscar.charAt(i) == palabra.charAt(0)) {
				
				for (int j = 0; j < palabra.length(); j++) {
					
					if (cadenaABuscar.charAt(i + indiceInterno) == palabra.charAt(j)) {
						siContiene = true;
						indiceInterno++;
						
					}else {
						siContiene = false;
						j = palabra.length() - 1;
					}
					
				}
				
				
				indiceInterno = 0;
				
			}
		}
		

		return (siContiene);
	}
	
	
	
	/* ================== Función terminaPor () ================== */
	public static boolean terminaPor (String cadenaABuscar, String palabra) {
		
		return (cadenaABuscar.substring((cadenaABuscar.length() - palabra.length())).equals(palabra));
	}
}


















