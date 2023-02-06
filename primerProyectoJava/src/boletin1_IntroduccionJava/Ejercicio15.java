package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio15 {
	
	/*CONSTANTES*/
	public static final String SEPARADOR = "----------------------------";
	
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*15. Crea un programa que permita sumar N números. El usuario 
		 * decide cuándo termina de introducir números al indicar la 
		 * palabra ‘fin’.*/
		
		
		introducirYSumarHastaEscribirFin();
		
		/*
		System.out.println(comprobarSiElStringEsUnNumero("1234")); //true
		System.out.println(comprobarSiElStringEsUnNumero("12aa")); //false
		System.out.println(comprobarSiElStringEsUnNumero("2134235")); //true
		System.out.println(comprobarSiElStringEsUnNumero("afds4")); //false
		*/

	}
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/**
	 * Función que pide que introduzcas por consola números infinitamente, hasta que 
	 * pones "fin". Después, muestra la suma de los números introducidos.
	 */
	/* ============== Función introducirYSumarHastaEscribirFin () =============== */
	public static void introducirYSumarHastaEscribirFin () {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número. Introduce 'fin' si quieres parar: ");
		String respuesta = String.valueOf(sc.nextLine());
		
		int sumaNumerosIntroducidos = 0, numerosIntroducidos = 0;
		
		
		while (!respuesta.toLowerCase().equals("fin")) {
			
			if (comprobarSiElStringEsUnNumero(respuesta)) {
				sumaNumerosIntroducidos += Integer.valueOf(respuesta);
				numerosIntroducidos++;
				
			}else {
				System.out.println("Te has equivocado al escribir.");
				
			}
			
			
			System.out.println("Introduce un número. Introduce 'fin' si quieres parar: ");
			respuesta = String.valueOf(sc.nextLine());
			
		}
		
		
		//PRINT DE CONSOLA
		System.out.println(SEPARADOR);
		System.out.println("Has salido del programa.");
		
		
		if (numerosIntroducidos != 0) {
			System.out.println("La suma de los números introducidos da " + sumaNumerosIntroducidos + ".");
		}
		
		
		sc.close();
		
	}
	
	
	
	/* ============== Función comprobarSiElStringEsUnNumero () =============== */
	/**
	 * Esta función comprueba si la variable String recibida está compuesta de dígitos.
	 * 
	 * @param String posibleNumero
	 * @return boolean laCadenaEsUnNumero
	 */
	public static boolean comprobarSiElStringEsUnNumero (String posibleNumero) {
		
		boolean laCadenaEsUnNumero = false;
		boolean esUnNumero = false;
		
		
		for (int i = 0; i < posibleNumero.length(); i++) {
			
			esUnNumero = (Character.isDigit(posibleNumero.charAt(i)))
						? true
						: false;
			
			
			if (esUnNumero == false) {
				i = posibleNumero.length();
			}
			
		}
		
		
		if (esUnNumero == true) {
			laCadenaEsUnNumero = true;
		}
		
		
		return (laCadenaEsUnNumero);
		
	}
	
}




























