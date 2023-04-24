package ej7_almacen;

import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Almacen almacen = new Almacen();
		int opcionMenu = 0;
		
		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while ((opcionMenu != 1) && (opcionMenu != 2) && (opcionMenu != 3) 
					&& (opcionMenu != 4) && (opcionMenu != 5)) {
				
				System.out.println("Error. Introduce la opción de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			//1. Abrir caja
			if (opcionMenu == 1) {
				
				System.out.println("Introduce el número de la caja que quieres abrir: ");
				int numCaja = Integer.valueOf(sc.nextLine());
				
				
				try {
					almacen.abrirCaja(numCaja);
					
				} catch (AlmacenException e) {
					e.printStackTrace();
				}
			
				
			//2. Cerrar caja
			}else if (opcionMenu == 2) {
			
				System.out.println("Introduce el número de la caja que quieres cerrar: ");
				int numCaja = Integer.valueOf(sc.nextLine());
				
				
				try {
					almacen.cerrarCaja(numCaja);
					
				} catch (AlmacenException e) {
					e.printStackTrace();
				}
			
				
			//3. Asignar caja a un cliente
			}else if (opcionMenu == 3) {
			
				System.out.println(almacen.addCliente());
				
				
			//4. Atender a cliente de una caja
			}else if (opcionMenu == 4) {
				
				System.out.println("Introduce el número de la caja que quieres que atienda a un cliente: ");
				int numCaja = Integer.valueOf(sc.nextLine());
				
				
				try {
					System.out.println(almacen.atenderCliente(numCaja));
					
				} catch (AlmacenException e) {
					e.printStackTrace();
				}
			}
			
		}while (opcionMenu != 5);
		
		
		System.out.println("\n" + SEPARADOR + "\n" + "Has salido del programa.");
		sc.close();
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final String SEPARADOR = "--------------------------";
	
	private static final String MENU = SEPARADOR + "\n"
									 + "Menú del almacén (que funciona como un supermercado)\n"
									 + SEPARADOR + "\n"
									 + "1. Abrir una caja\n"
									 + "2. Cerrar una caja\n"
									 + "3. Asignar caja a un cliente nuevo\n"
									 + "4. Atender a un cliente de una caja\n"
									 + "5. Salir\n"
									 + SEPARADOR + "\n"
									 + "Elige una opción: ";
	
	/* ------------ Función comoSeLlameLaFuncion () ------------ */
	

}



























