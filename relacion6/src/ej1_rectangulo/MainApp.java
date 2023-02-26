package ej1_rectangulo;

import java.util.Scanner;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	/* ENUNCIADO: Crear una clase Rectangulo con los atributos longitud y ancho, 
	 * cada uno con un valor predeterminado igual a 1. Proporcionar los métodos 
	 * set y get para los atributos longitud y ancho respectivamente. El método 
	 * set debe verificar que longitud y ancho contengan números reales mayores 
	 * que cero y menores que 20. Además, proporcionar métodos que calculen el 
	 * perímetro y el área del rectángulo. Escribir un método main que solicite 
	 * los datos de un rectángulo y muestre cual es su área y su perímetro. 
	 * Probar a introducir un dato incorrecto (mayor o igual que 20).*/
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la longitud del rectángulo: ");
		double longitud = Double.valueOf(sc.nextLine());
		System.out.println("Dime el ancho del rectángulo: ");
		double ancho = Double.valueOf(sc.nextLine());
		
		Rectangulo rectangulo = new Rectangulo(longitud, ancho);
		
		int opcionMenu = 1;
		
		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while (opcionMenu != 1 && opcionMenu != 2 && opcionMenu != 3) {
				System.out.println("No has elegido bien. Inténtalo de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			System.out.println(SEPARADOR);
			
			if (opcionMenu == 1) {
				System.out.println("El perímetro del rectángulo es: " 
						+ rectangulo.calcularPerimetro() + ".");
			}else if (opcionMenu == 2) {
				System.out.println("El área del rectángulo es: " 
						+ rectangulo.calcularArea() + ".");
			}else {
				System.out.println("Has salido del programa.");
			}
			
		}while (opcionMenu != 3);
		
		
		sc.close();
	}
	
	
	
	/************************************************************************/
	/****************************** FUNCIONES *******************************/
	/************************************************************************/
	
	/* ====== CONSTANTES ====== */
	public static final String SEPARADOR = "----------------------------";
	
	
	public static final String MENU = SEPARADOR + "\n" 
									  + "1. Calcular su perímetro\n" 
									  + "2. Calcular su área\n"
									  + "3. Salir\n"
									  + SEPARADOR + "\n"
									  + "Elige: ";
	

}


























