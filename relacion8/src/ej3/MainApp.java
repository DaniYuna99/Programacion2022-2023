package ej3;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	/* //////// CONSTANTES \\\\\\\\ */
	public static final String DIGITOS = "0123456789";
	

	public static void main(String[] args) {
		
		/*3. Realizar un programa que solicite por teclado números entre 1 y 1000
		hasta que el usuario informe de que ya no desea introducir más
		números. Después debe mostrar:
		- La media de los números leídos.[HECHO, PERO HAY QUE MOSTRARLO]
		- Cuántos números terminan en cada uno de los dígitos (0 .. 9).
		- El dígito en el que más números terminan.
		- En qué dígitos no ha terminado ningún número.*/
	
		
		Scanner sc = new Scanner(System.in);	
		int[] cantidadDigitos = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		String respuesta = "";
		int numeroIntroducido = 0;
		int mediaNumeros = 0;
		int cantidadNumeros = 0;
		String numeroString = "";
		
		
		do {
			
			System.out.println("Introduce un número: ");
			numeroIntroducido = Integer.valueOf(sc.nextLine());
			
			while (numeroIntroducido < 1 || numeroIntroducido >= 1000) {
				System.out.println("No se permiten los números inferiores a 1 ni mayores que 1000. Introdúcelo de nuevo: ");
				numeroIntroducido = Integer.valueOf(sc.nextLine());
			}
			
			//APARTADO 1: Media de los números leídos
			mediaNumeros += numeroIntroducido;
			cantidadNumeros++;
			
			
			//APARTADO 2: Cuantos números terminan en cada uno de los dígitos (0 .. 9)
			numeroString = String.valueOf(numeroIntroducido);
			char ultimoDigito = numeroString.charAt(numeroString.length() - 1);
			
			for (int i = 0; i < DIGITOS.length(); i++) {
				
				if (ultimoDigito == DIGITOS.charAt(i)) {
					cantidadDigitos[i]++;
				}
			}

			
			//Pregunta si salir o no del programa
			System.out.println("¿Metes más números? (S/N): ");
			respuesta = String.valueOf(sc.nextLine());
			
			while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N")) {
				System.out.println("Te has equivocado; introduce S o N: ");
				respuesta = String.valueOf(sc.nextLine());
			}
			
		}while (respuesta.equalsIgnoreCase("S"));
		
		
		
		System.out.println(Arrays.toString(cantidadDigitos));
		System.out.println(mediaNumeros / cantidadNumeros);
		sc.close();
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* //////// CONSTANTES \\\\\\\\ */
	
	
	/* ============== Función comoSeLlameLaFuncion () =============== */
}
