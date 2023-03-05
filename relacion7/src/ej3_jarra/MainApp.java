package ej3_jarra;

import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcionMenu = 0;
		String opcionSegundaria = "";
		
		
		//Creación Jarra j1
		System.out.println("Introduce el tamaño de la jarra A: ");
		int tamanoJarra = Integer.valueOf(sc.nextLine());
		
		while (tamanoJarra <= 0) {
			System.out.println("Una jarra no puede tener un tamaño negativo. Inténtalo de nuevo: ");
			tamanoJarra = Integer.valueOf(sc.nextLine());
		}
		
		Jarra j1 = new Jarra(tamanoJarra);
		
		
		//Creación Jarra j2
		System.out.println("Introduce el tamaño de la jarra B: ");
		tamanoJarra = Integer.valueOf(sc.nextLine());
		
		while (tamanoJarra <= 0) {
			System.out.println("Una jarra no puede tener un tamaño negativo. Inténtalo de nuevo: ");
			tamanoJarra = Integer.valueOf(sc.nextLine());
		}
		
		Jarra j2 = new Jarra(tamanoJarra);
		

		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while (opcionMenu != 1 && opcionMenu != 2 
					&& opcionMenu != 3 && opcionMenu != 4
					&& opcionMenu != 5 && opcionMenu != 6) {
				System.out.println("No has elegido bien. Hazlo de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			//Ifs con las opciones
			if (opcionMenu == 1) {
				
				System.out.println("¿Cuál jarra quieres llenar? (A/B): ");
				opcionSegundaria = String.valueOf(sc.nextLine());
				
				while (!opcionSegundaria.equalsIgnoreCase("A") 
						&& !opcionSegundaria.equalsIgnoreCase("B")) {
					System.out.println("Elige A o B, te has equivocado: ");
					opcionSegundaria = String.valueOf(sc.nextLine());
				}
				
				
				if (opcionSegundaria.equalsIgnoreCase("A")) {
					j1.llenarJarra();
					
				}else {
					j2.llenarJarra();
				}
				
				
				System.out.println("Jarra " + opcionSegundaria.toUpperCase() + " llenada.");
			
			
			}else if (opcionMenu == 2) {
				
				System.out.println("¿Cuál jarra quieres vaciar? (A/B): ");
				opcionSegundaria = String.valueOf(sc.nextLine());
				
				while (!opcionSegundaria.equalsIgnoreCase("A") 
						&& !opcionSegundaria.equalsIgnoreCase("B")) {
					System.out.println("Elige A o B, te has equivocado: ");
					opcionSegundaria = String.valueOf(sc.nextLine());
				}
				
				
				if (opcionSegundaria.equalsIgnoreCase("A")) {
					j1.vaciarJarra();
					
				}else {
					j2.vaciarJarra();
				}
				
				
				System.out.println("Jarra " + opcionSegundaria.toUpperCase() + " vaciada.");
			
			
			}else if (opcionMenu == 3) {
				
				if (j1.volcarJarra(j2) == true) {
					System.out.println("La jarra A se ha volcado en la jarra B.");
				
				}else {
					System.out.println("La jarra A no se ha podido volcar en la jarra B. "
							+ "Puede que la jarra A esté vacía, o que la jarra B esté totalmente llena.");
				}
			
			
			}else if (opcionMenu == 4) {
				
				if (j2.volcarJarra(j1) == true) {
					System.out.println("La jarra B se ha volcado en la jarra A.");
				
				}else {
					System.out.println("La jarra B no se ha podido volcar en la jarra A. "
							+ "Puede que la jarra B esté vacía, o que la jarra A esté totalmente llena.");
				}
			
			
			}else if (opcionMenu == 5) {
				System.out.println("Jarra A: " + j1.toString() + "\n"
								  + "Jarra B: " + j2.toString());
			}
			
		}while (opcionMenu != 6);
		
		
		System.out.println(SEPARADOR + "\n" + "Has salido del programa. "
						  + "El total de agua que se ha gastado llenando jarras "
						  + "ha sido " + j1.getAguaTotal() + " litros.");
		sc.close();
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* //////// CONSTANTES \\\\\\\\ */
	public static final String SEPARADOR = "------------------------------";
	
	public static final String MENU = SEPARADOR + "\n"
									+ "¿Qué quieres hacer con las jarras?\n"
									+ SEPARADOR + "\n"
									+ "1. Llenar jarra\n"
									+ "2. Vaciar jarra\n"
									+ "3. Volcar jarra A en B\n"
									+ "4. Volcar jarra B en A\n"
									+ "5. Ver estado en las jarras\n"
									+ "6. Salir\n"
									+ SEPARADOR + "\n"
									+ "Elige: ";
	
}






