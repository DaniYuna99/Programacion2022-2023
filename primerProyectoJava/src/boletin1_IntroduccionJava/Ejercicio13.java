package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio13 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*13. Programa que reciba 10 números y nos indique 
		 * el valor máximo y mínimo.*/
		
		
		indicarMaximoYMinimoDe10Numeros();
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ============== Función indicarMaximoYMinimoDe10Numeros () =============== */
	public static void indicarMaximoYMinimoDe10Numeros () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número, y al final diré cuál fue el máximo y el mínimo: ");
		int numeroIntroducido = Integer.valueOf(sc.nextLine());
		
		int numeroMaximo = numeroIntroducido;
		int numeroMinimo = numeroIntroducido;
		
		
		for (int i = 1; i <= 9; i++) {
			
			System.out.println("Otro número: ");
			numeroIntroducido = Integer.valueOf(sc.nextLine());
			
			
			if (numeroIntroducido < numeroMinimo) {
				numeroMinimo = numeroIntroducido;
			}
			
			if (numeroIntroducido > numeroMaximo) {
				numeroMaximo = numeroIntroducido;
			}
			
		}
		
		
		System.out.println("-------------------------");
		System.out.println("El valor máximo introducido fue " + numeroMaximo + " y el valor mínimo fue " + numeroMinimo + ".");
		sc.close();
		
	}
	
}




















