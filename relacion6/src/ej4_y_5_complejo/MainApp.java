package ej4_y_5_complejo;

import java.util.Scanner;

public class MainApp {
	
	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int opcionMenu = 0;
		
		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while ((opcionMenu != 1) && (opcionMenu != 2) && (opcionMenu != 3)) {
				System.out.println("Te has equivocado al elegir. Elige 1, 2 o 3: ");
			}
			
			
			if (opcionMenu == 1) {
				Complejo com1 = crearComplejo(sc);
				Complejo com2 = crearComplejo(sc);
				
				System.out.println("\n");
				System.out.println(com1.sumarComplejo(com2));
				
				
			}else if (opcionMenu == 2) {
				Complejo com1 = crearComplejo(sc);
				Complejo com2 = crearComplejo(sc);
				
				System.out.println("\n");
				System.out.println(com1.restarComplejo(com2));
			}
			
		}while(opcionMenu != 3);
		
		
		System.out.println("\n" + SEPARADOR);
		System.out.println("Has salido del programa.");
		sc.close();
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* //////// CONSTANTES \\\\\\\\ */
	public static final String SEPARADOR = "-------------------------------";
	
	public static final String MENU = SEPARADOR + "\n" 
									  + "¿Qué quieres hacer?\n\n"
									  + "1. Sumar complejos\n"
									  + "2. Restar complejos\n"
									  + "3. Salir\n"
									  + SEPARADOR + "\n"
									  + "Elige: ";

	
	/* =========== Función crearComplejo () ============ */
	public static Complejo crearComplejo (Scanner sc) {
		
		System.out.println("Dime la parte real del número complejo: ");
		double parteReal = Double.valueOf(sc.nextLine());
		System.out.println("Dime la parte imaginaria del número complejo: ");
		double parteImaginaria = Double.valueOf(sc.nextLine());
		
		
		return (new Complejo(parteReal, parteImaginaria));
	}

}

























