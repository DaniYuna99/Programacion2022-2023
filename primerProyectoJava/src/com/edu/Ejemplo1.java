package com.edu;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {

		/*1. Diseña un programa que pregunte por la edad de 
		 * una persona e imprima si es mayor de edad*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu edad? ");
		int edad = Integer.valueOf(sc.nextLine());
		
		System.out.println("-----------------------------");
		
		
		if (edad < 18) {
			System.out.println("Eres menor de edad.");
			
		}else {
			System.out.println("Eres mayor de edad.");
		}
		
		
		sc.close();
		
	}

}
