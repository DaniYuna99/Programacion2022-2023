package main.java;

import java.util.Scanner;

import main.java.model.RegistroCasetas;
import main.java.xml.LectorXML;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RegistroCasetas rc = new RegistroCasetas();
		int opcionMenu = 0;
		
		
		//Esto crea el archivo JSON con todas las casetas
		LectorXML.escribirCasetas(rc.getListaCasetas(), "././files/casetasFeria.json");
		
		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while ((opcionMenu != 1) && (opcionMenu != 2) && (opcionMenu != 3) 
					&& (opcionMenu != 4) && (opcionMenu != 5) && (opcionMenu != 6) 
					&& (opcionMenu != 7) && (opcionMenu != 8)) {
				
				System.out.println("Te has equivocado. Introduce la opción de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			System.out.println("\n");
			
			
			//Opciones
			if (opcionMenu == 1) {
				
				System.out.println("Dime la calle en donde quieres buscar: ");
				String calle = sc.nextLine();
				
				System.out.println(rc.mostrarCasetasDeUnaCalle(calle));
				
				
			}else if (opcionMenu == 2) {
				System.out.println(rc.mostrarCasetasClaseFamiliar());
				
				
			}else if (opcionMenu == 3) {
				System.out.println(rc.mostrarCasetasClaseDistrito());

				
			}else if (opcionMenu == 4) {
				System.out.println(rc.mostrarCasetasQueNoSeanClaseFamiliarNiDistrito());

				
			}else if (opcionMenu == 5) {
				System.out.println(rc.mostrarNumeroCasetasClaseFamiliar());
				
				
			}else if (opcionMenu == 6) {
				System.out.println(rc.mostrarNumeroCasetasClaseDistrito());

				
			}else if (opcionMenu == 7) {
				
				System.out.println("Dime la calle donde está la caseta que quieres eliminar: ");
				String calle = sc.nextLine();
				System.out.println("Dime el número de la caseta: ");
				int numero = Integer.valueOf(sc.nextLine());
				
				try {
					rc.eliminarCaseta(calle, numero);
					System.out.println("Se ha eliminado la caseta, y se han desplazado las otras.");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
			System.out.println("\n");
			
			
		}while (opcionMenu != 8);


		System.out.println("\n" + SEPARADOR + "\n" + "Has salido de la aplicación.");
		sc.close();
	}
	
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final String SEPARADOR = "--------------------------";
	
	
	public static final String MENU = SEPARADOR + "\n"
									+ "    MENÚ DE SELECCIÓN\n"
									+ SEPARADOR + "\n"
									+ "1. Mostrar todas las casetas existentes en una calle\n"
									+ "2. Mostrar todas las casetas de clase Familiar\n"
									+ "3. Mostrar todas las casetas de clase Distrito\n"
									+ "4. Mostrar todas las casetas que no sean ni familiares ni distritos\n"
									+ "5. Mostrar el número de casetas de clase Familiar que hay en cada calle\n"
									+ "6. Mostrar el número de casetas de clase Distrito que hay en cada calle\n"
									+ "7. Eliminar una caseta, y que el resto se desplace\n"
									+ "8. Salir\n"
									+ SEPARADOR + "\n"
									+ "Elige una opción:";
	
}











