package boletin1_IntroduccionJava;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		/*6. Programar un sistema de calefacción-refrigeración 
		 * que compruebe en función del día y el mes, la estación 
		 * en la que estamos y dependiendo de la estación programe 
		 * la temperatura: Invierno→19º, Primavera→20º, Verano→24º, 
		 * Otoño→19º. El método deberá recibir como parámetro el 
		 * mes y el día actual y devolver los grados a los que 
		 * deberemos programar el sistema.*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el día: ");
		int dia = Integer.valueOf(sc.nextLine());
		
		System.out.println("Dime el mes: ");
		int mes = Integer.valueOf(sc.nextLine());
		
		
		if ((dia > 0 && dia <= 31) && (mes > 0 && mes <= 12)) {
			
			if ( (mes == 12 && (dia >= 21 && dia <= 31)
					|| (mes == 1) || (mes == 2) 
					|| (mes == 3 && (dia >= 1 && dia < 20)))) {
					System.out.println("Es invierno; la calefacción se ajustará a 19º.");
					
			}else if ( (mes == 3 && (dia >= 20 && dia <= 31)
					|| (mes == 4) || (mes == 5) 
					|| (mes == 6 && (dia >= 1 && dia < 21)))) {
				System.out.println("Es primavera; la calefacción se ajustará a 20º.");
						
			}else if ( (mes == 6 && (dia >= 21 && dia <= 31)
					|| (mes == 7) || (mes == 8) 
					|| (mes == 9 && (dia >= 1 && dia < 22)))) {
				System.out.println("Es verano; la calefacción se ajustará a 24º.");
						
			}else if ( (mes == 9 && (dia >= 22 && dia <= 31)
					|| (mes == 10) || (mes == 11) 
					|| (mes == 12 && (dia >= 1 && dia < 21)))) {
				System.out.println("Es otoño; la calefacción se ajustará a 19º.");
						
			}
			
		}else {
			System.out.println("Te has equivocado al introducir los datos.");
		}
		
		
		
		sc.close();

	}

}
