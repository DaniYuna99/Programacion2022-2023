package boletin3_IntroduccionJava;

public class Ejercicio1 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*1. Escribe una función que reciba una cadena de texto 
		 * y una variable bandera (par/impar) e imprima solo los 
		 * caracteres que se encuentran situados en las posiciones 
		 * pares o impares (según indique la variable bandera). 
		 * Desarrolla el código con un bucle for y después modifica 
		 * el código para que utilice una estructura while y do-while.*/
		
		
		System.out.println(darCaracteresParesOImparesFor("HoLaQuEtAl", "par"));
		System.out.println(darCaracteresParesOImparesFor("HoLaQuEtAl", "impar"));
		System.out.println(darCaracteresParesOImparesFor("HoLaQuEtAl", "error"));
		
		System.out.println(darCaracteresParesOImparesWhile("HoLaQuEtAl", "par"));
		System.out.println(darCaracteresParesOImparesWhile("HoLaQuEtAl", "impar"));
		System.out.println(darCaracteresParesOImparesWhile("HoLaQuEtAl", "error"));
		
		System.out.println(darCaracteresParesOImparesDoWhile("HoLaQuEtAl", "par"));
		System.out.println(darCaracteresParesOImparesDoWhile("HoLaQuEtAl", "impar"));
		System.out.println(darCaracteresParesOImparesDoWhile("HoLaQuEtAl", "error"));
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ============== Función darCaracteresParesOImparesFor () ============== */
	public static String darCaracteresParesOImparesFor (String cadenaRecibida, String parONo) {
		
		String cadenaParONo = "";
		
		
		if (parONo.toUpperCase().equals("PAR")) {
			
			for (int i = 0; i <= (cadenaRecibida.length() - 1); i+=2) {
				cadenaParONo += cadenaRecibida.charAt(i);
			}
			
			
		}else if (parONo.toUpperCase().equals("IMPAR")) {
			
			for (int i = 1; i <= (cadenaRecibida.length() - 1); i+=2) {
				cadenaParONo += cadenaRecibida.charAt(i);
			}
			
			
		}else {
			System.out.println("No has escrito bien si es par o no.");
			
		}
		
		
		return (cadenaParONo);
		
	}
	
	
	
	/* ============== Función darCaracteresParesOImparesWhile () ============== */
	public static String darCaracteresParesOImparesWhile (String cadenaRecibida, String parONo) {
		
		String cadenaParONo = "";
		
		
		if (parONo.toUpperCase().equals("PAR")) {
			
			int contador = 0;
			
			
			while (contador <= (cadenaRecibida.length()) - 1){ 
				cadenaParONo += cadenaRecibida.charAt(contador);
				contador += 2;
			}
			
			
		}else if (parONo.toUpperCase().equals("IMPAR")) {
			
			int contador = 1;
			
			
			while (contador <= (cadenaRecibida.length()) - 1){ 
				cadenaParONo += cadenaRecibida.charAt(contador);
				contador += 2;
			}
			
			
		}else {
			System.out.println("No has escrito bien si es par o no.");
			
		}
		
		
		return (cadenaParONo);
		
	}
	
	
	
	/* ============== Función darCaracteresParesOImparesDoWhile () ============== */
	public static String darCaracteresParesOImparesDoWhile (String cadenaRecibida, String parONo) {
		
		String cadenaParONo = "";
		
		
		if (parONo.toUpperCase().equals("PAR")) {
			
			int contador = 0;
			
			
			do { 
				cadenaParONo += cadenaRecibida.charAt(contador);
				contador += 2;
				
			}while(contador <= (cadenaRecibida.length() - 1));
			
			
		}else if (parONo.toUpperCase().equals("IMPAR")) {
			
			int contador = 1;
			
			
			do { 
				cadenaParONo += cadenaRecibida.charAt(contador);
				contador += 2;
				
			}while(contador <= (cadenaRecibida.length() - 1));
			
			
		}else {
			System.out.println("No has escrito bien si es par o no.");
			
		}
		
		
		return (cadenaParONo);
		
	}
}
