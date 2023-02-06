package boletin3_IntroduccionJava;

public class Ejercicio7 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*7. Realizar una función que busque una palabra escondida 
		 * dentro de un texto. Por ejemplo, si la cadena es “shybaoxlna” 
		 * y la palabra que queremos buscar es “hola”, entonces si se 
		 * encontrará y deberá devolver True, en caso contrario deberá 
		 * devolver False. Las letras de la palabra escondida deben 
		 * aparecer en el orden correcto en la cadena que la oculta:
		 * 
		 * 	 shybaoxlna ⇒ hola: True
		 * 	 soybahxlna ⇒ hola: False*/
		
		
		System.out.println(buscarPalabraEscondida("shybaoxlna", "hola"));					//true
		System.out.println(buscarPalabraEscondida("soybahxlna", "hola"));					//false
		
		System.out.println(buscarPalabraEscondida("trestristestigres", "tristes"));			//true
		System.out.println(buscarPalabraEscondida("trestristestigres", "ggg"));				//false
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================== Función buscarPalabraEscondida () ================== */
	public static boolean buscarPalabraEscondida (String fraseDondeBuscar, String palabraABuscar) {
		
		int contadorPalabra = 0;
		StringBuilder palabraConstruida = new StringBuilder();
		
		
		for (int i = 0; i < fraseDondeBuscar.length(); i++) {
			
			if (fraseDondeBuscar.charAt(i) == palabraABuscar.charAt(contadorPalabra)) {
				palabraConstruida.append(fraseDondeBuscar.charAt(i));
				contadorPalabra++;
			}
			
			
			if (palabraConstruida.toString().length() == palabraABuscar.length()) {
				i = fraseDondeBuscar.length();
			}
				
		}
		
		
		return (palabraABuscar.equals(palabraConstruida.toString()));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
