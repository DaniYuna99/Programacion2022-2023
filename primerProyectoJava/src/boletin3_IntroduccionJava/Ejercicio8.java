package boletin3_IntroduccionJava;

public class Ejercicio8 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*8. Diseñar una función que reciba como parámetro tres 
		 * cadenas, la primera será una frase y deberá buscar 
		 * si existe la palabra que recibe como segundo 
		 * parámetro y reemplazarla por la tercera.*/
		
		System.out.println(reemplazarCadenas("hola  que   tal", "que", "asdf"));
	}
	


	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================== Función reemplazarCadenas () ================== */
	public static String reemplazarCadenas (String frasePrincipal, String parteAReemplazar, String reemplazo) {
		
		StringBuilder sb = new StringBuilder();
		boolean esLaPalabra = false;
		int contadorInterno = 0;
		
		
		if ((frasePrincipal != null && !frasePrincipal.isEmpty())
			&& (parteAReemplazar != null && !parteAReemplazar.isEmpty())
			&& (reemplazo != null && !reemplazo.isEmpty())) {
			
			for (int i = 0; i < frasePrincipal.length(); i++) {
				
				if (frasePrincipal.charAt(i) == parteAReemplazar.charAt(0)) {
					
					for (int j = 0; j < parteAReemplazar.length(); j++) {
						
						if (frasePrincipal.charAt(i + j) == parteAReemplazar.charAt(j)) {
							esLaPalabra = true;
							
						}else {
							esLaPalabra = false;
							j = parteAReemplazar.length();
						}
					}
					
					
				}
				
				
				if (esLaPalabra == true) {
					sb.append(reemplazo);
					contadorInterno = parteAReemplazar.length() - 1;
					esLaPalabra = false;
					
				}else if (contadorInterno != 0) {
					contadorInterno--;
					
				}else {
					sb.append(frasePrincipal.charAt(i));
					
				}
			}
		}
		
		
		return (sb.toString());
	}
}

	