package boletin2_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio2 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*2. Realiza un programa que pida un número por teclado 
		 * y que después muestre ese número al revés.*/
		
		
		mostrarNumeroAlReves();
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ============ Función mostrarNumeroAlReves () ============ */
	public static void mostrarNumeroAlReves () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número, y lo mostraré al revés: ");
		String numeroIntroducido = String.valueOf(sc.nextLine());
		String numeroAlReves = "";
		
		
		for (int i = (numeroIntroducido.length() - 1); i >= 0 ; i--) {
			numeroAlReves += numeroIntroducido.charAt(i);
		}
		
		
		System.out.println("El número al revés es " + numeroAlReves + ".");
		sc.close();
		
	}
	
}
