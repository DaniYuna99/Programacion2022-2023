package com.edu;

import java.util.Scanner;

public class Principal {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce algo: ");
		String cadena = String.valueOf(sc.nextLine());
		System.out.println("El contenido de la cadena es: " + cadena);
		
		System.out.println("Introduzca algo más: ");
		cadena = String.valueOf(sc.nextLine());
		System.out.println("El contenido de la cadena es: " + cadena);
		
		sc.close();
		
	}
}
