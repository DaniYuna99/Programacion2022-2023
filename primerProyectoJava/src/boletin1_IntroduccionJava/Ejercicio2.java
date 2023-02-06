package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*2. Escribe un método que reciba por parámetro el 
		 * día de la semana (Lunes, Martes, Miércoles, etc) 
		 * y devuelva qué asignatura toca a primera hora ese 
		 * día.*/

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el día de la semana: ");
		String dia = String.valueOf(sc.nextLine());
		
		
		if (dia.toUpperCase().equals("LUNES")) {
			System.out.println("El lunes a primera hora toca 'Entorno de Desarrollo'.");
		
		}else if (dia.toUpperCase().equals("MARTES")) {
			System.out.println("El martes a primera hora toca 'Formación y Orientación Laboral'.");
		
		}else if (dia.toUpperCase().equals("MIERCOLES") || (dia.toUpperCase().equals("MIÉRCOLES"))
				|| (dia.toUpperCase().equals("VIERNES"))) {
			System.out.println("El " + dia.toLowerCase() + " a primera hora toca 'Sistemas Informáticos'.");
		
		}else if (dia.toUpperCase().equals("JUEVES")) {
			System.out.println("El jueves a primera hora toca 'Bases de Datos'.");
		
		}else if (dia.toUpperCase().equals("SABADO") || (dia.toUpperCase().equals("SÁBADO")
				|| (dia.toUpperCase().equals("DOMINGO")))) {
			System.out.println("No hay clases.");
		
		}else {
			System.out.println("Te has equivocado al escribir.");
		}
		
		
		sc.close();
	}

}
