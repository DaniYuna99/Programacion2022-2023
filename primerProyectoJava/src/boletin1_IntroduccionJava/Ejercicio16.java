package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio16 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {
		
		/*16. Pedir 10 valores numéricos que representan el salario 
		 * mensual de 10 empleados. Mostrar su suma y cuantos hay mayores 
		 * de 1000€.*/
		
		pedirDiezSalarios();

	}
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/

	/* ================== Función pedirDiezSalarios () ==================== */
	public static void pedirDiezSalarios () {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0, numSalariosMayores = 0, salarioIntroducido = 0;
		
		
		do {
			
			System.out.println("Introduce un salario: ");
			salarioIntroducido = Integer.valueOf(sc.nextLine());
			
			if (salarioIntroducido > 1000) {
				numSalariosMayores++;
			}
			
			
			contador++;
			
		}while (contador <= 10); 
		
		
		System.out.println("-------------------------------");
		System.out.println("Hay un número de " + numSalariosMayores 
							+ " salarios que son mayores que 1000€.");
		sc.close();
		
	}
	
}




















