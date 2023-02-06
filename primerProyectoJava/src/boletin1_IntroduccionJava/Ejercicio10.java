package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio10 {
	
	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/

	public static void main(String[] args) {

		/*10. Realiza un programa que sume los 100 números siguientes a un 
		número entero y positivo introducido por teclado. Se debe comprobar 
		que el dato introducido es correcto (que es un número positivo).*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número, y le sumaré los 100 siguientes: ");
		int numeroIntroducido = Integer.valueOf(sc.nextLine());
		
		System.out.println("-----------------------------------");
		
		
		if (numeroIntroducido < 0) {
			System.out.println("Has introducido un número negativo, y no está permitido.");
			
		}else {
			sumar100NumerosSiguientes (numeroIntroducido);
				
		}
		
		
		sc.close();
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ======= Función sumar100NumerosSiguientes (int numeroIntroducido) ======= */
	public static void sumar100NumerosSiguientes (int numeroIntroducido) {
		
		int numeroSiguiente = numeroIntroducido + 1;
		int sumaTotal = numeroIntroducido;
		
		
		for (int i = 1; i <= 99; i++) {
			sumaTotal += numeroSiguiente; 
			numeroSiguiente += 1;
		}
		
		System.out.println("El número " + numeroIntroducido + " más sus 100 siguientes da " + sumaTotal + ".");
	
	}
	
}


















