package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio12 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*12. Realiza un programa que pida números hasta que se 
		 * teclee uno negativo y muestre cuántos números se han 
		 * introducido.*/
		
		
		int cantidadNumeros = pedirNumerosYDevolverCantidadIntroducidos();
		System.out.println("Has introducido " + cantidadNumeros + " número(s).");

	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ========= Función pedirNumerosYDevolverCantidadIntroducidos () ========= */
	public static int pedirNumerosYDevolverCantidadIntroducidos () {
		
		Scanner sc = new Scanner(System.in);
		int cantidadNumeros = 0;
		
		System.out.println("Introduce un número. Pon uno negativo para salir: ");
		int numeroIntroducido = Integer.valueOf(sc.nextLine()); 
		
		
		while (numeroIntroducido >= 0) {
			
			cantidadNumeros++;
			
			System.out.println("Introduce un número. Pon uno negativo para salir: ");
			numeroIntroducido = Integer.valueOf(sc.nextLine());
			
		}
		
		
		System.out.println("----------------------");
		System.out.println("Has salido del programa.");
		sc.close();
		
		
		return (cantidadNumeros);
		
	}
}
