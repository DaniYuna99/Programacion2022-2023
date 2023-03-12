package ej8;

import java.util.Scanner;

public class Main_Ej8 {
	
	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Refranes refranes = new Refranes();
		int opcionMenu = 0;
		
		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while((opcionMenu != 1) && (opcionMenu != 2) 
					&& (opcionMenu != 3) && (opcionMenu != 4)) {
				System.out.println("Elección equivocada. Inténtalo de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			//1. Guardar refrán
			if (opcionMenu == 1) {
				
				if (refranes.getRefranes()[49] == null) {
					
					System.out.println("Escribe el refrán que quieres guardar: ");
					String textoRefran = sc.nextLine();
					
					refranes.guardarRefran(new Refran(textoRefran));
					
				}else {
					System.out.println("Ya se ha alcanzado el límite de refranes que se pueden guardar.");
				}
				
				
			//2. Buscar un refrán que contenga una palabra	
			}else if (opcionMenu == 2) {
				
				System.out.println("Escribe la palabra que quieres buscar: ");
				String palabraABuscar = sc.nextLine();
				
				if (refranes.buscarRefran(palabraABuscar) == false) {
					System.out.println("No se ha encontrado un refrán que contenga la palabra '" + palabraABuscar + "'");
				}
				
				
			//3. Listar refranes ordenados alfabeticamente [INCOMPLETO]
			}else if (opcionMenu == 3) {
				System.out.println("No supe cómo ordenarlos alfabéticamente, lo siento.");
				System.out.println(refranes.toString());
			}
			
		}while (opcionMenu != 4);
		
		
		System.out.println(SEPARADOR + "\n" + "Has salido del programa");
		sc.close();


	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final String SEPARADOR = "--------------------------------";
	
	public static final String MENU = SEPARADOR + "\n"
									+ "¿Qué quieres hacer?\n\n"
									+ "1. Guardar un refrán\n"
									+ "2. Buscar un refrán que contenga una palabra\n"
									+ "3. Listar refranes\n"
									+ "4. Salir\n"
									+ SEPARADOR + "\n"
									+ "Elige: ";
	
	
}
