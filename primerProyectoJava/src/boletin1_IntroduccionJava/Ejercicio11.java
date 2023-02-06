package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio11 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*11. Realiza un programa que pida números y muestre su 
		 * cuadrado, repitiendo el proceso hasta que se introduzca 
		 * un número negativo.*/
		
		mostrarNumerosCuadrados();
		
	}

	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ============== Función mostrarNumerosCuadrados () =============== */
	public static void mostrarNumerosCuadrados () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pon un número, y te mostraré su cuadrado. Pon uno negativo para salir: ");
		int numeroIntroducido = Integer.valueOf(sc.nextLine());
		
		
		while (numeroIntroducido >= 0) {
			
			System.out.println("-------------------------");
			System.out.println("El cuadrado de " + numeroIntroducido + " es " + Math.pow(numeroIntroducido, 2) + ".");
			
			System.out.println("Pon un número, y te mostraré su cuadrado. Pon uno negativo para salir: ");
			numeroIntroducido = Integer.valueOf(sc.nextLine());
			
		}
		
		System.out.println("-------------------------");
		System.out.println("Has salido del programa.");
		sc.close();
		
	}
	
}
