package ej4_historialNavegacion;

import java.time.LocalDate;
import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		/*Realizar un programa que permita almacenar un historial de páginas web consultadas por
		un usuario. De cada página web se almacenará su url y la fecha y hora (LocalDateTime) en
		la que se visitó.
		
		
		Se debe realizar un menú de este tipo:
		
		1. Nueva página consultada: Se solicitará el nombre de la página y se tomará la fecha
		y hora del sistema añadiendo ésta al historial. No se permitirá introducir una fecha y
		hora anterior a la última almacenada.
		
		2. Consultar historial completo.
		
		3. Consultar historial de un día.
		
		4. Borrar todo el historial.
		
		5. Borrar visitas a una página.
		
		6. Salir.
		
		
		Se pide:
		
		a. Decidir la estructura de almacenamiento más indicada para este ejercicio. No debe
		establecerse ningún límite de entradas en el historial.
		
		b. Implementar la clase PaginaWeb, así como la clase Historial y el programa Principal.*/
		
					
		Scanner sc = new Scanner(System.in);
		int opcionMenu = 0;
		Historial historial = new Historial();
		
		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while((opcionMenu != 1) && (opcionMenu != 2) 
					&& (opcionMenu != 3) && (opcionMenu != 4)
					&& (opcionMenu != 5) && (opcionMenu != 6)) {
				
				System.out.println("Te has equivocado. Elige de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			//Opcion 1: Introducir página
			if (opcionMenu == 1) {
				
				System.out.println("Dime el URL de la página web: ");
				String urlWeb = sc.nextLine();
				
				
				if (historial.addPaginaWeb(new PaginaWeb(urlWeb)) == true) {
					System.out.println("Página añadida.");
					
				}else {
					System.out.println("La página no se ha añadido porque la URL no es válida.");
				}
				
				
			//Opcion 2: Consultar historial completo
			}else if (opcionMenu == 2) {
				
				System.out.println(historial.mostrarHistorialCompleto());
				
				
			//Opcion 3: Consultar historial de un día
			}else if (opcionMenu == 3) {
			
				System.out.println("Dime el día que quieres consultar: ");
				int dia = Integer.valueOf(sc.nextLine());
				
				while (dia <= 0 || dia > 31) {
					System.out.println("Error. Dime el día de nuevo (1-31): ");
					dia = Integer.valueOf(sc.nextLine());
				}
				
				
				System.out.println("Dime el mes que quieres consultar (1-12): ");
				int mes = Integer.valueOf(sc.nextLine());
				
				while (mes <= 0 || mes > 12) {
					System.out.println("Error. Dime el mes de nuevo (1-12): ");
					mes = Integer.valueOf(sc.nextLine());
				}
				
				
				System.out.println("Dime el año que quieres consultar: ");
				int anyo = Integer.valueOf(sc.nextLine());
				
				while (anyo <= 0 || anyo > LocalDate.now().getYear()) {
					System.out.println("Error. Dime el año de nuevo: ");
					anyo = Integer.valueOf(sc.nextLine());
				}
				
				
				System.out.println(historial.consultarHistorialDia(LocalDate.of(anyo, mes, dia).atStartOfDay()));
				
				
			//Opcion 4: Borrar todo el historial
			}else if (opcionMenu == 4) {
				
				historial.borrarHistorial();
				System.out.println("Historial borrado.");
			
				
			//Opcion 5: Borrar visitas a una página
			}else if (opcionMenu == 5) {
				
				System.out.println("Dime la URL de la web que quieres borrar: ");
				String urlWeb = sc.nextLine();

				
				if (historial.borrarPagina(new PaginaWeb(urlWeb)) == true) {
					System.out.println("Página borrada del historial.");
					
				}else {
					System.out.println("El URL no existe en el historial.");
				}
			}
			
			
			System.out.println("\n");
			
			
		}while (opcionMenu != 6);
		
		
		System.out.println("\n" + SEPARADOR + "\n" + "Has salido del programa.");
		sc.close();

	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final String SEPARADOR = "----------------------------";

	private static final String MENU = SEPARADOR + "\n"
									 + "¿Qué eliges?" + "\n"
									 + SEPARADOR + "\n"
									 + "1. Nueva página consultada\n"
									 + "2. Consultar historial completo\n"
									 + "3. Consultar historial de un día\n"
									 + "4. Borrar todo el historial\n"
									 + "5. Borrar visitas a una página\n"
									 + "6. Salir\n"
									 + SEPARADOR + "\n"
									 + "Elige: ";
	
	
}
