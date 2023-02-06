package com.edu;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		/*2. Modifica el programa anterior para que 
		 * indique el grupo de edad al que pertenece 
		 * (niñ@ < 18, adulto, ancian@ > 65).*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu edad? ");
		int edad = Integer.valueOf(sc.nextLine());
		
		System.out.println("-----------------------------");
		
		
		if (edad < 18) {
			System.out.println("Eres un niñ@.");
			
		}else if (edad >= 18 && edad < 65) {
			System.out.println("Eres un adult@.");
			
		}else {
			System.out.println("Eres un ancian@.");
		}
		
		
		sc.close();

	}

}
