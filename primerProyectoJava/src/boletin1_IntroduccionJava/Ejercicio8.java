package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio8 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*8. Método que pida 15 números y realice su suma.*/
		
		
		pedir15NumerosYSumarlos();
		
	}

	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ============== Función pedir15NumerosYSumarlos () =============== */
	public static void pedir15NumerosYSumarlos () {
		
		Scanner sc = new Scanner(System.in);

		int contador = 1;
		int sumaTotal = 0;
		
		
		while (contador <= 15) {
			
			System.out.println("Dime un número, y te los sumaré con los que introduzcas: ");
			int numeroNuevo = Integer.valueOf(sc.nextLine());
			
			sumaTotal += numeroNuevo;
			
			contador += 1;
			
		}
		
		
		System.out.println("La suma total de los 15 números introducidos da "+ sumaTotal + ".");
		sc.close();
		
	}
}
