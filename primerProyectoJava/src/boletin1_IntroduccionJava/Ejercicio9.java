package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio9 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {

		/*9. Método que pida 5 números e imprima si alguno es múltiplo de 3.*/
		
		
		pedir5NumerosEImprimirMultiplosDe3();
		
	}
	
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* =========== Función pedir5NumerosEImprimirMultiplosDe3 () ============ */
	public static void pedir5NumerosEImprimirMultiplosDe3 () {
		
		Scanner sc = new Scanner(System.in);
		int contador = 1;
		boolean hayMultiploDe3 = false;
		
		
		do {
			
			System.out.println("Dime un número, y te mostraré si alguno era múltiplo de 3: ");
			int numeroNuevo = Integer.valueOf(sc.nextLine());
			
			
			if (numeroNuevo % 3 == 0) {
				hayMultiploDe3 = true;
			}
			
			contador += 1;
			
		}while (contador <= 5);
		
		
		System.out.println("------------------------------------");
		
		
		if (hayMultiploDe3 == true) {
			System.out.println("Hay un múltiplo de 3 entre los números introducidos.");
		
		}else {
			System.out.println("No hay un múltiplo de 3 entre los números introducidos.");
		}
		
		
		sc.close();
		
	}
	
}













