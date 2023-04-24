package ej1_generico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		/* 1. Crear un método genérico reverse que devuelva un array 
		 * de objetos con la misma información, pero en orden inverso, 
		 * es decir donde en la primera posición esté la información 
		 * del último objeto, en la segunda la penúltima y así sucesivamente.

		protected static <T> T[] reverse ( T[] arrayOriginal)*/
		
		
		String[] nombres = {"Daniel", "Jose Manuel", "Yolanda", "Rocío", "Ronaldo"};
		System.out.println(Arrays.toString(reverse(nombres)));
		
		Integer[] numeros = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(reverseAlt(numeros)));
		
		Character[] caracteres = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(Arrays.toString(reverse(caracteres)));
		
		Double[] decimales = {3.99, 8.45, 9.02, 13.13};
		System.out.println(Arrays.toString(reverseAlt(decimales)));

	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
		
	/* ============== Función reverse () =============== */
	public static <T> T[] reverse (T[] arrayOriginal) {
		
		List<T> arrayReverse = new ArrayList<>();
		
		for (int i = arrayOriginal.length - 1; i >= 0; i--) {
			arrayReverse.add(arrayOriginal[i]);
		}
		
		
		return (T[]) (arrayReverse.toArray());
	}

	
	
	/* ============== Función reverseAlt () =============== */
	public static <T> T[] reverseAlt (T[] arrayOriginal) {
		
		T[] inversa = arrayOriginal.clone();
		
		for (int i = 0; i < arrayOriginal.length; i++) {
			inversa[i] = arrayOriginal[(arrayOriginal.length - 1) - i];
		}
		
		
		return (inversa);
	}

}
