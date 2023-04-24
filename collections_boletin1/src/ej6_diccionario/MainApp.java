package ej6_diccionario;

import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		/*Diccionario diccionario = new Diccionario();
		diccionario.addPalabra("galleta", "Alimento normalmente hecho con azúcar, que se suele consumir como postre o como picoteo entre horas");
		diccionario.addPalabra("galleta", "En uso coloquial, puede ser un sinónimo a 'golpear con la mano'");
		diccionario.addPalabra("telefono", "Dispositivo móvil y fácil de llevar que permite hacer llamadas");
		diccionario.addPalabra("monitor", "Pantalla que se usa junto a un ordenador para mostrar los procesos");
		diccionario.addPalabra("monitor", "Una persona encargada de dirigir y ayudar a un grupo de personas");
		diccionario.addPalabra("monitor", "Una especie de lagarto que es capaz de levantarse a dos patas");
		diccionario.addPalabra("moneda", "Trozo de metal de forma esférica, que se usa para intercambiar bienes y servicios");
		diccionario.addPalabra("monstruo", "Ser vivo con apariencia fuera de lo normal, tal que infunde miedo o terror a la vista");
		diccionario.addPalabra("monstruo", "Se usa para denominar a una persona cruel, o que ha cometido actos inmorales hacia otros seres vivos");



		System.out.println(diccionario.getDiccionario().toString());
		
		System.out.println(diccionario.buscarPalabra(""));
		System.out.println(diccionario.buscarPalabra("ERROR"));
		
		
		System.out.println(diccionario.borrarPalabra("telefono"));
		System.out.println(diccionario.getDiccionario().toString());
		System.out.println(diccionario.listarPalabras("d"));
		System.out.println(diccionario.listarPalabras("mon"));
		System.out.println(diccionario.listarPalabras(""));*/

		
		Scanner sc = new Scanner(System.in);
		Diccionario diccionario = new Diccionario();
		int opcionMenu = 0;
		
		
		//Entrada bucle Do-While
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while ((opcionMenu != 1) && (opcionMenu != 2) && (opcionMenu != 3) 
					&& (opcionMenu != 4) && (opcionMenu != 5)) {
				
				System.out.println("Te has equivocado. Elige de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			System.out.println(SEPARADOR);
			
			
			//1. Añadir palabra
			if (opcionMenu == 1) {
				
				System.out.println("Introduce la palabra que quieres introducir en el diccionario, o a la que quieres añadir una definición más: ");
				String palabra = sc.nextLine();
				
				while (palabra.trim().isBlank()) {
					System.out.println("Debes de introducir una palabra. Introdúcela de nuevo: ");
					palabra = sc.nextLine();
				}
				
				
				System.out.println("Introduce una definición de la palabra anterior: ");
				String definicion = sc.nextLine();
				
				while (definicion.trim().isBlank()) {
					System.out.println("Debes de introducir una definición. Introdúcela de nuevo: ");
					definicion = sc.nextLine();
				}
				
				
				diccionario.addPalabra(palabra, definicion);
				System.out.println("Se ha añadido la palabra y su definición, o sólo la definición.");
				
				
			//2. Buscar palabra
			}else if (opcionMenu == 2) {
				
				System.out.println("Introduce la palabra que quieres buscar: ");
				String palabra = sc.nextLine();
				
				
				System.out.println(diccionario.buscarPalabra(palabra));
				
				
			//3. Borrar palabra
			}else if (opcionMenu == 3) {
				
				System.out.println("Introduce la palabra que quieres borrar: ");
				String palabra = sc.nextLine();
				
				if (diccionario.borrarPalabra(palabra) == true) {
					System.out.println("La palabra '" + palabra + "' se ha borrado correctamente.");
				
				}else {
					System.out.println("No se ha encontrado la palabra '" + palabra + "' en el diccionario, por lo que no ha sido posible borrarse.");
				}
				
				
			//4. Listar palabras que empiecen por ...
			}else if (opcionMenu == 4) {
				
				System.out.println("Introduce unas letras, y se mostrarán las palabras que empiecen por esas letras: ");
				String palabra = sc.nextLine();
				
				
				System.out.println(diccionario.listarPalabras(palabra));
			}

			
			if (opcionMenu != 5) {
				System.out.println("\n");
			}
			
		//Salida del bucle Do-While	
		}while (opcionMenu != 5);
		
		
		System.out.println("Has salido del programa.");
		sc.close();
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final String SEPARADOR = "----------------------------";
	
	private static final String MENU = SEPARADOR + "\n"
									 + "¿Qué quieres hacer?\n"
									 + SEPARADOR + "\n"
									 + "1. Añadir una palabra al diccionario\n"
									 + "2. Buscar una palabra en el diccionario\n"
									 + "3. Borrar una palabra y sus definiciones\n"
									 + "4. Listado de palabras que empiecen por ...\n"
									 + "5. Salir\n"
									 + SEPARADOR + "\n"
									 + "Elige una opción: ";
	
	
}
