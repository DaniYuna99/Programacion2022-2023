package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio14 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*14. Realiza un programa que vaya pidiendo números hasta 
		 * que se introduzca un número negativo y nos diga cuántos 
		 * números se han introducido, la media de los impares y el 
		 * mayor de los pares. El número negativo sólo se utiliza 
		 * para indicar el final de la introducción de datos pero no 
		 * se incluye en el cómputo.*/
		
		
		pedirNumerosYMostrarMediaYDemas();

	}

	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ============== Función pedirNumerosYMostrarMediaYDemas () =============== */
	public static void pedirNumerosYMostrarMediaYDemas () {
		
		Scanner sc = new Scanner(System.in);
		int sumaNumerosImpares = 0, numeroMaximoPares = 0, 
			cantidadNumerosImpares = 0, numeroIntroducido = 0;
		
		
		do {
			
			System.out.println("Dime un número. Para salir, pon uno negativo: ");
			numeroIntroducido = Integer.valueOf(sc.nextLine());
			
			
			if ((numeroIntroducido % 2 == 0) && (numeroMaximoPares < numeroIntroducido) 
					&& (numeroIntroducido >= 0)) {
				numeroMaximoPares = numeroIntroducido;
			}
			
			
			if ((numeroIntroducido % 2 == 1) && (numeroIntroducido >= 0)) {
				sumaNumerosImpares += numeroIntroducido;
			}
			
			
			if ((numeroIntroducido >= 0) && (numeroIntroducido % 2 == 1)) {
				cantidadNumerosImpares++;
			}
			
		}while(numeroIntroducido >= 0);
		
		
		//PRINT EN LA CONSOLA
		String respuesta = "";
		System.out.println("------------------------------------");
		System.out.println("Has salido del programa.");
		
		
		if (sumaNumerosImpares != 0 && numeroMaximoPares != 0) {
			
			respuesta += (numeroMaximoPares == 0) 
				? "No se ha introducido ningún número par" 
				: "El número par más alto introducido es " + numeroMaximoPares;
			
			
			respuesta += (sumaNumerosImpares == 0) 
				? ", y no se ha introducido un número impar."
				: ", y la media de los números impares es " + (sumaNumerosImpares / cantidadNumerosImpares) + ".";
			
			
			System.out.println(respuesta);
			
		}
		
		
		sc.close();
		
	}
	
}
