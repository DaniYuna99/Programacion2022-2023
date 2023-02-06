package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*4. Calcular las calificaciones de un alumno con un 
		 * método que reciba la nota de la parte práctica, la 
		 * nota de los problemas y la parte teórica. La nota 
		 * final se calcula según el siguiente criterio: la parte 
		 * práctica vale el 10%; la parte de problemas vale el 50% 
		 * y la parte teórica el 40%. Las notas deben estar 
		 * entre 0 y 10, si no lo están, deberá devolver un 
		 * mensaje de error. Realiza el método que calcule la 
		 * media de tres notas y te devuelva la nota del boletín 
		 * (insuficiente, suficiente, bien, notable o sobresaliente).*/

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nota de la parte práctica: ");
		float notaPractica = Float.valueOf(sc.nextLine());
		
		System.out.println("Nota de la parte de los problemas: ");
		float notaProblemas = Float.valueOf(sc.nextLine());
		
		System.out.println("Nota de la parte teórica: ");
		float notaTeorica = Float.valueOf(sc.nextLine());
		
		
		
		if ((notaPractica >= 0 && notaPractica <= 10)
				&& (notaProblemas >= 0 && notaProblemas <= 10)
				&& (notaTeorica >= 0 && notaTeorica <= 10)) {
			
			float notaFinal = (float) ( (notaPractica * 0.10) + (notaProblemas * 0.50)
					+ (notaTeorica * 0.40) );
			
			
			if (notaFinal >= 0 && notaFinal <= 4) {
				System.out.println("Insuficiente.");
			
			}else if (notaFinal > 4 && notaFinal < 6) {
				System.out.println("Suficiente.");
				
			}else if (notaFinal > 5 && notaFinal < 7) {
				System.out.println("Bien.");
			
			}else if (notaFinal > 6 && notaFinal < 9) {
				System.out.println("Notable.");
			
			}else {
				System.out.println("Sobresaliente.");
			}
			
			
		}else {
			System.out.println("Alguna de las notas fueron más de 10 o menor que 0. Inténtalo de nuevo.");
		
		}
		
		
		sc.close();
		
		
	}

}
