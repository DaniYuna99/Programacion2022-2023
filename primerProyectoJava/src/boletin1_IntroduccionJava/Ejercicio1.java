package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*1. Realiza un método que reciba dos números y 
		 * devuelva True si uno es múltiplo del otro.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un número: ");
		int num1 = Integer.valueOf(sc.nextLine());
		
		System.out.println("Escribe un segundo número: ");
		int num2 = Integer.valueOf(sc.nextLine());
		
		
		if ((num1 % num2 == 0) || (num2 % num1 == 0)) {
			System.out.println("El número " + num1
							   + " es múltiplo de " + num2 
							   + ".");
		}else {
			System.out.println("El número " + num1
					   + " NO es múltiplo de " + num2 
					   + ".");
		}
		
		
		sc.close();
		

	}

}
