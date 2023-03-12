package ej2;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		/*2. Realiza un programa que cargue un vector con de 10 números enteros.
		El programa debe imprimir los elementos del vector y después
		desplazarlos una posición, de tal forma que el último pase a la primera
		posición, el primero a la segunda, el segundo a la tercera, y así
		sucesivamente.*/
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce el número en la posición (" 
							   + (i + 1) + "/10): ");
			int numero = Integer.valueOf(sc.nextLine());
			numeros[i] = numero;
		}
		
		
		desplazarDerecha(numeros);
		
		
		System.out.println(Arrays.toString(numeros));
		sc.close();

	}
	
	
	public static void desplazarDerecha(int[] numeros) {
		
		int ultimo = numeros[numeros.length - 1];
		
		for(int i = numeros.length - 2; i >= 0; i--) {
			numeros[i + 1] = numeros[i];
		}
		
		numeros[0] = ultimo;
	}
	
}
