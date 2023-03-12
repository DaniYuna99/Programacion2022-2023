package ej1;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		/* 1. Realizar un programa que solicite diez números enteros y 
		 * cuando se termine de introducir el último los muestre 
		 * en el orden inverso al que se introdujeron.*/
		
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] numerosInvertidos = new int[10];
		int contador = 0;
		
		
		//For para introducir números por teclado e insertarlos en el array
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce el número: ");
			numeros[i] = Integer.valueOf(sc.nextLine());
		}
		
		
		//For para recorrer el array al revés, y poner los elementos en otro
		for (int j = (numeros.length - 1); j >= 0; j--) {
			numerosInvertidos[contador] = numeros[j];
			contador++;
		}
		
		
		System.out.println(Arrays.toString(numerosInvertidos));
		sc.close();
		
	}
	
}
