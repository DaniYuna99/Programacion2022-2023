package ej4;

import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Fecha f; 
		
		try {
			
			System.out.println("Introduce el día: ");
			int dia = Integer.valueOf(sc.nextLine());
			System.out.println("Introduce el mes: ");
			int mes = Integer.valueOf(sc.nextLine());
			System.out.println("Introduce el año: ");
			int anyo = Integer.valueOf(sc.nextLine());
			
			f = new Fecha(dia, mes, anyo);
			System.out.println("--------------------");
			System.out.println(f.pasarAFormatoLargo());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
		
	}
	
}
