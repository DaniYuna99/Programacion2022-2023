package ej3_maquinaCafe;

import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcionMenu = 0;
		MaquinaCafe mq = new MaquinaCafe();
		mq.llenarDeposito();
		
		
		do {
			
			System.out.println(MENU_MAQUINA);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while (opcionMenu != 1 && opcionMenu != 2 
					&& opcionMenu != 3 && opcionMenu != 4
					&& opcionMenu != 5) {
				System.out.println("Opción equivocada. Introduce la opcion de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			//Ifs con las opciones
			
			//CAFE
			if (opcionMenu == 1) {
				
				double dineroIntroducido = pedirDinero(sc);
				
				
				if ((mq.getMonedero().getUnC() == 0) && (dineroIntroducido != PRECIO_CAFE)) {
					System.out.println("La máquina no dispone de monedas para devolver tu cambio. Introduce la cantidad exacta, o usa otra máquina cercana.");
				
				}else if ((mq.getCafe() == 0) || (mq.getVasos() == 0)) {
					System.out.println("No hay almacenados los suficientes ingredientes en la máquina. Se te devuelve lo introducido.");
					
				}else if (dineroIntroducido < PRECIO_CAFE) {
					System.out.println("No has introducido la cantidad suficiente. Se te devuelve lo introducido.");
					
				}else {
					mq.getMonedero().almacenarDinero(dineroIntroducido);
					mq.getMonedero().devolverDinero(dineroIntroducido - PRECIO_CAFE);
					mq.setVasos(mq.getVasos() - 1);
					mq.setCafe(mq.getCafe() - 1);
					System.out.println("Producto servido: Café solo. Recoga sus " + (dineroIntroducido - PRECIO_CAFE) + " de cambio.");
				}
				
				
			//LECHE	
			}else if (opcionMenu == 2) {
				
				double dineroIntroducido = pedirDinero(sc);
				
				
				if ((mq.getMonedero().getUnC() == 0) && (dineroIntroducido != PRECIO_LECHE)) {
					System.out.println("La máquina no dispone de monedas para devolver tu cambio. Introduce la cantidad exacta, o usa otra máquina cercana.");
				
				}else if ((mq.getLeche() == 0) || (mq.getVasos() == 0)) {
					System.out.println("No hay almacenados los suficientes ingredientes en la máquina. Se te devuelve lo introducido.");
					
				}else if (dineroIntroducido < PRECIO_LECHE) {
					System.out.println("No has introducido la cantidad suficiente. Se te devuelve lo introducido.");
					
				}else {
					mq.getMonedero().almacenarDinero(dineroIntroducido);
					mq.getMonedero().devolverDinero(dineroIntroducido - PRECIO_LECHE);
					mq.setVasos(mq.getVasos() - 1);
					mq.setLeche(mq.getLeche() - 1);
					System.out.println("Producto servido: Leche sola. Recoga sus " + (dineroIntroducido - PRECIO_LECHE) + " de cambio.");
				}
				
				
			//CAFE CON LECHE	
			}else if (opcionMenu == 3) {
				
				double dineroIntroducido = pedirDinero(sc);
				
				
				if ((mq.getMonedero().getUnC() == 0) && (dineroIntroducido != PRECIO_CAFE_CON_LECHE)) {
					System.out.println("La máquina no dispone de monedas para devolver tu cambio. Introduce la cantidad exacta, o usa otra máquina cercana.");
				
				}else if (dineroIntroducido < PRECIO_CAFE_CON_LECHE) {
					System.out.println("No has introducido la cantidad suficiente. Se te devuelve lo introducido.");
					
				}else if ((mq.getCafe() == 0) || (mq.getLeche() == 0) || (mq.getVasos() == 0)) {
					System.out.println("No hay almacenados los suficientes ingredientes en la máquina. Se te devuelve lo introducido.");
					
				}else {
					mq.getMonedero().almacenarDinero(dineroIntroducido);
					mq.getMonedero().devolverDinero(dineroIntroducido - PRECIO_CAFE_CON_LECHE);
					mq.setVasos(mq.getVasos() - 1);
					mq.setCafe(mq.getCafe() - 1);
					mq.setLeche(mq.getLeche() - 1);
					System.out.println("Producto servido: Café con leche. Recoga sus " + (dineroIntroducido - PRECIO_CAFE_CON_LECHE) + " de cambio.");
				}
				
			}else if (opcionMenu == 4) {
				System.out.println(mq.toString());
			}
				
		}while (opcionMenu != 5);
		
		
		System.out.println("\n" + SEPARADOR);
		System.out.println("Has salido del programa.");
		sc.close();
		
	}

	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* //////// CONSTANTES \\\\\\\\ */
	public static final String SEPARADOR = "--------------------------------";
	
	public static final double PRECIO_CAFE = 1.00;
	public static final double PRECIO_LECHE = 0.80;
	public static final double PRECIO_CAFE_CON_LECHE = 1.50;
	
	public static final String MENU_MAQUINA = SEPARADOR + "\n"
											+ "1. Servir café solo (1.00 euros)\n" 
											+ "2. Servir leche (0.8 euros)\n"
											+ "3. Servir café con leche (1.5 euros)\n"
											+ "4. Consultar estado de máquina\n"
											+ "5. Apagar máquina y salir\n"
											+ SEPARADOR + "\n"
											+ "Elige: ";
	
	
	
	/* =========== Función pedirDinero () ============ */
	public static double pedirDinero(Scanner sc) {
		
		System.out.println("Introduce el dinero en la máquina: ");
		double dineroIntroducido = Double.valueOf(sc.nextLine());
		
		while (dineroIntroducido <= 0) {
			System.out.println("No se permiten cantidades negativas o cero. Introdúcelo de nuevo: ");
			dineroIntroducido = Double.valueOf(sc.nextLine());
		}
		
		
		return (dineroIntroducido);
	}
}
