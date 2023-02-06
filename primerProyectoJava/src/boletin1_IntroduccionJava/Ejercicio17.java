package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio17 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*17. Escribe un programa que muestre los N primeros términos 
		 * de la serie de Fibonacci. El primer término de la serie de 
		 * Fibonacci es 1, el segundo es 1 y el resto se calcula sumando 
		 * los dos anteriores, por lo que tendríamos que los términos son 
		 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.*/

		sucesionFibonacci();
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/

	/* ==================== Función sucesionFibonacci () ====================== */
	public static void sucesionFibonacci () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos números de Fibonacci quieres ver? ");
		int numerosFibonacci = Integer.valueOf(sc.nextLine());
		
		int primeraPosicion = 1, segundaPosicion = 1, terceraPosicion = 2;
		
		
		for (int i = 1; i <= numerosFibonacci; i++) {
			
			if (i == 1 || i == 2) {
				System.out.println(primeraPosicion);
			}
			
			
			if (i > 2) {
				System.out.println(terceraPosicion);
				primeraPosicion = segundaPosicion;
				segundaPosicion = terceraPosicion;
				terceraPosicion = (primeraPosicion + segundaPosicion);
			}
			
		}
		
		sc.close();
		
	}
	
}
