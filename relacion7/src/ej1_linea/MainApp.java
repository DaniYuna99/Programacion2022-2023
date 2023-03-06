package ej1_linea;

import java.util.Scanner;

public class MainApp {
	
	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Introduce la coordenada X del punto A: ");
		double coordX_A = Double.valueOf(sc.nextLine());
		System.out.println("Introduce la coordenada Y del punto A: ");
		double coordY_A = Double.valueOf(sc.nextLine());
		System.out.println("Introduce la coordenada X del punto B: ");
		double coordX_B = Double.valueOf(sc.nextLine());
		System.out.println("Introduce la coordenada Y del punto B: ");
		double coordY_B = Double.valueOf(sc.nextLine());
		
		Linea linea = new Linea(new Punto(coordX_A, coordY_A), new Punto(coordX_B, coordY_B));
		
		
		int opcionMenu = 1;
		String opcionMenuMoverLinea = "";
		
		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while((opcionMenu != 1) && (opcionMenu != 2) 
					&& (opcionMenu != 3)) {
				System.out.println("Te has equivocado. Elige de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			if (opcionMenu == 1) {
				
				System.out.println("\n" + MENU_MOVER_LINEA);
				opcionMenuMoverLinea = String.valueOf(sc.nextLine());
				opcionMenuMoverLinea = opcionMenuMoverLinea.toUpperCase();
				
				while((opcionMenuMoverLinea.equals("A")) && (opcionMenuMoverLinea.equals("B"))
					&& (opcionMenuMoverLinea.equals("I")) && (opcionMenuMoverLinea.equals("D"))) {
					System.out.println("La opción introducida no es válida. Prueba de nuevo: ");
					opcionMenuMoverLinea = String.valueOf(sc.nextLine());
					opcionMenuMoverLinea = opcionMenuMoverLinea.toUpperCase();
				}
				
				
				System.out.println("Indica el movimiento que quieres que se desplace la línea: ");
				double movimiento = Double.valueOf(sc.nextLine());
				
				
				if (opcionMenuMoverLinea.equals("A")) {
					linea.moverArriba(movimiento);
					System.out.println("La línea se ha movido hacia arriba.");
				
				}else if (opcionMenuMoverLinea.equals("B")) {
					linea.moverAbajo(movimiento);
					System.out.println("La línea se ha movido hacia abajo.");
				
				}else if (opcionMenuMoverLinea.equals("I")) {
					linea.moverIzquierda(movimiento);
					System.out.println("La línea se ha movido hacia la izquierda.");
				
				}else if (opcionMenuMoverLinea.equals("D")) {
					linea.moverDerecha(movimiento);
					System.out.println("La línea se ha movido hacia la derecha.");
				}
				
				
				System.out.println("\n");
				
				
			}else if (opcionMenu == 2) {
				System.out.println("\n" + linea.toString());
				
			}
			
		}while (opcionMenu != 3);
		
		
		System.out.println("\n" + SEPARADOR + "\n" + "Has salido del programa.");
		sc.close();
		
	}	
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* //////// CONSTANTES \\\\\\\\ */
	public static final String SEPARADOR = "-----------------------------";
	
	public static final String MENU = SEPARADOR + "\n"
									  + "¿Qué quieres hacer?\n\n"
									  + "1. Mover línea\n"
									  + "2. Mostrar línea\n"
									  + "3. Salir\n"
									  + SEPARADOR + "\n"
									  + "Elige: ";
	
	public static final String MENU_MOVER_LINEA = "¿Hacia dónde quieres mover la línea?\n"
												 + "A. Arriba\n"
												 + "B. Abajo\n"
												 + "I. Izquierda\n"
												 + "D. Derecha\n"
												 + SEPARADOR + "\n"
												 + "Elige: ";
	
	

}
