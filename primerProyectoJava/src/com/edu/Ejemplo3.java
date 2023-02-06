package com.edu;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		
		/*3. Realiza un programa (días del mes) que pregunte 
		 * por un mes y año y devuelva el número de días que 
		 * tiene ese mes para el año especificado.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un mes (número del 1 al 12 incluidos): ");
		int mes = Integer.valueOf(sc.nextLine());
		
		System.out.println("Introduce el año: ");
		int anyo = Integer.valueOf(sc.nextLine());
		
		
		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))
			&& (mes == 2)) {
			System.out.println("El mes tiene 29 días.");
			
		}else if (mes == 2) {
			System.out.println("El mes tiene 28 días.");
			
		}else if (mes == 1 || mes == 3 || mes == 5 || mes == 6
				|| mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			System.out.println("El mes tiene 31 días.");
			
		}else {
			System.out.println("El mes tiene 30 días.");
		}
		
		
		sc.close();

	}

}
