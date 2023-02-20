package avion;

import java.util.Scanner;

public class MainApp {
	
	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	/* ======== CONSTANTES ======== */
	public static final String SEPARADOR = "------------------------------";

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// ====== Input de la variable "opcionCreacion" ======
		menuCreacionAvion();
		int opcionCreacion = Integer.valueOf(sc.nextLine());
		
		while ((opcionCreacion != 1) && (opcionCreacion != 2)) {
			System.out.println("Te has equivocado al elegir. Introduce la opción de nuevo: ");
			opcionCreacion = Integer.valueOf(sc.nextLine());
		}
		
		
		Avion avion = new Avion();
		
		// ====== Input de la variable "IdAvion" ======
		System.out.println("Asigna un ID al nuevo avión: ");
		String idAvion = String.valueOf(sc.nextLine());
		
		// ====== Input de la variable "capacidad" ======
		System.out.println("Asigna una capacidad al nuevo avión: ");
		int capacidad = Integer.valueOf(sc.nextLine());
		
		while (capacidad <= 0) {
			System.out.println("Error: la capacidad de un avión no puede ser cero o negativa. Introdúcela de nuevo: ");
			capacidad = Integer.valueOf(sc.nextLine());
		}
		
		
		// ====== If que depende de la variable "opcionCreacion" ======
		if (opcionCreacion == 1) {
			avion = new Avion(idAvion, capacidad);
			
		}else {
			// ====== Input de la variable "compannia" ======
			System.out.println("Asigna la compañía propietaria del avión: ");
			String compannia = String.valueOf(sc.nextLine());
			
			avion = new Avion(idAvion, capacidad, compannia);
		}
		
		
		/* ==================== BUCLE ==================== */
		String opcionMenu = "a";
		System.out.println("\n" + SEPARADOR);
		
		
		do {
			
			menuOpcionesAvion();
			opcionMenu = String.valueOf(sc.nextLine());
			
			
			if (opcionMenu.toLowerCase().equals("a")) {
				
				//Input de la variable 'numAsientos'
				System.out.println("Asigna el número de asientos que se van a ocupar: ");
				int numAsientos = Integer.valueOf(sc.nextLine());
				
				while (numAsientos <= 0) {
					System.out.println("Error: el número de asientos asignados no puede ser cero o negativo. Introdúcelo de nuevo: ");
					numAsientos = Integer.valueOf(sc.nextLine());
				}
				
				//Input de la variable 'kmVolados'
				System.out.println("¿Cuántos kilómetros va a volar el avión? ");
				double kmVolados = Double.valueOf(sc.nextLine());
				
				while (kmVolados <= 0) {
					System.out.println("Error: los kilómetros volados no pueden ser cero o negativos. Introdúcelos de nuevo: ");
					kmVolados = Double.valueOf(sc.nextLine());
				}
			
				
				if (avion.asignarVuelo(numAsientos, kmVolados) == true) {
					System.out.println("Se ha asignado correctamente.");
					
				}else {
					System.out.println("No se ha asignado; hay un error en los datos, y no son válidos.");
				}
				
				
			}else if (opcionMenu.toLowerCase().equals("b")) {
				System.out.println("El número de vuelos realizados del avión '" + avion.getIdAvion() 
								  + "' han sido " + avion.obtenerNumVuelos() + ".");
				
				
			}else if (opcionMenu.toLowerCase().equals("c")) {
				System.out.println("Los kilómetros volados por el avión '" + avion.getIdAvion() 
								   + "' han sido " + avion.numKmVolados() + ".");
				
				
			}else if (opcionMenu.toLowerCase().equals("d")) {
				System.out.println("La media de kilómetros por vuelo del avión '" 
								   + avion.getIdAvion() + "' es de " 
								   + avion.obtenerMediaKmVolados() + ".");
				
				
			}else if (opcionMenu.toLowerCase().equals("e")) {
				
				System.out.println("¿Cuál es la compañía nueva del avión? ");
				String compannia = String.valueOf(sc.nextLine());
				
				avion.cambiarCompannia(compannia);
				
				
			}else if (opcionMenu.toLowerCase().equals("f")) {
				avion.mostrarInformacionAvion();
			}
			
			
			System.out.println("\n" + SEPARADOR);
			
			
		}while(!opcionMenu.toLowerCase().equals("g"));
		
		
		System.out.println("Has salido del programa.");
		sc.close();
	}
	
	
	
	
	
	/************************************************************************/
	/****************************** FUNCIONES *******************************/
	/************************************************************************/
	
	/* ================== Función menuCreacionAvion() ================== */
	
	/**
	 * Función que muestra un texto haciendo de menú, creado para 
	 * el primer menú de la aplicación, que consiste en elegir 
	 * si crear un objeto Avion con sólo un IdAvion, o con un 
	 * IdAvion y una Compannia.
	 */
	public static void menuCreacionAvion() {
		System.out.println("¿Qué quieres hacer?" + "\n"
						  + SEPARADOR + "\n" 
						  + "  1. Crear avión sólo con el identificador" + "\n"
						  + "  2. Crear avión con el identificador y la compañía"
						  + "\n" + SEPARADOR
						  + "\n" + "Elige: ");
	}
	
	
	/* ================== Función menuOpcionesAvion() ================== */
	
	/**
	 * Función que muestra un texto haciendo de menú, para el 
	 * menú principal de la aplicación. Está compuesto de diferentes 
	 * opciones para modificar o interactuar con el objeto Avion 
	 * recién creado.
	 */
	public static void menuOpcionesAvion () {
		System.out.println("Selecciona una opción: " + "\n"
						  + SEPARADOR + "\n"
						  + "  a) Asignar vuelo" + "\n"
						  + "  b) Obtener un número de vuelos" + "\n"
						  + "  c) Obtener el número de kilómetros" + "\n"
						  + "  d) Obtener la media de kilómetros por vuelo" + "\n"
						  + "  e) Cambio de compañía" + "\n"
						  + "  f) Mostrar información del avión" + "\n"
						  + "  g) Salir" + "\n"
						  + SEPARADOR + "\n"
						  + "Elige: ");
	}
}
