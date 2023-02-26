package ej2_cuenta;

import java.util.Scanner;

public class MainApp {
	
	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		/*FALTA EL ¿DE VERDAD QUIERES SALIR?, QUE RESPONDAS LO QUE RESPONDAS, SIEMPRE SALES.*/

		
		/* Realizar un programa que permita gestionar el saldo de una 
		 * cuenta corriente. Una vez introducido el saldo inicial, 
		 * se mostrará un menú que permitirá efectuar las siguientes 
		 * operaciones: 
		 * 
		 * 1. Hacer un reintegro, se pedirá la cantidad a retirar. 
		 * 
		 * 2. Hacer un ingreso, se pedirá la cantidad a ingresar.

		 * 3. Consultar el saldo y el número de reintegros e ingresos 
		 * realizados. 
		 * 
		 * 4. Finalizar las operaciones. Debe confirmar si realmente 
		 * desea salir e informar del saldo al final de todas las operaciones.
		 * 
		 * 
		 * Debe realizarse una clase Cuenta y la clase Principal.*/
		
		/*Cuenta cuenta = new Cuenta(300);
		
		System.out.println(cuenta.hacerReintegro(300));
		System.out.println(cuenta.getSaldoTotal());
		System.out.println(cuenta.hacerReintegro(1));
		System.out.println(cuenta.getSaldoTotal());
		
		System.out.println(cuenta.hacerIngreso(1000));
		System.out.println(cuenta.getSaldoTotal());
		System.out.println(cuenta.hacerIngreso(-32));
		System.out.println(cuenta.getSaldoTotal());
		
		System.out.println(cuenta.consultarCuenta());*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad inicial que va a tener tu cuenta bancaria: ");
		int saldoInicial = Integer.valueOf(sc.nextLine());
		
		while (saldoInicial <= 0) {
			System.out.println("No es válida una cantidad menor que cero o cero. Introdúcelo de nuevo: ");
			saldoInicial = Integer.valueOf(sc.nextLine());
		}
		
		Cuenta cuenta = new Cuenta(saldoInicial);
		String salirDeVerdad = "";
		
		/*System.out.println(MENU);
		int opcionMenu = Integer.valueOf(sc.nextLine());*/
		
		int opcionMenu = 1;
		
		
		do {
			
			System.out.println("\n" + MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			if (opcionMenu == 1) {
				
				System.out.println("Indica qué cantidad deseas sacar de tu cuenta: ");
				int cantidadARetirar = Integer.valueOf(sc.nextLine());
				
				while (cantidadARetirar <= 0) {
					System.out.println("La cantidad a reintegrar no puede ser negativa o cero. Introdúcelo de nuevo: ");
					cantidadARetirar = Integer.valueOf(sc.nextLine());
				}
				
				
				if (cuenta.hacerReintegro(cantidadARetirar) == true) {
					System.out.println("Se han retirado " + cantidadARetirar + " euros de tu cuenta.");
					
				}else {
					System.out.println("Tu cuenta no posee tanto saldo como para retirar la cantidad deseada.");
				}
				
				
			}else if (opcionMenu == 2) {
				
				System.out.println("Indica qué cantidad deseas ingresar en tu cuenta: ");
				int cantidadAIngresar = Integer.valueOf(sc.nextLine());
				
				while (cantidadAIngresar <= 0) {
					System.out.println("La cantidad a ingresar no puede ser negativa o cero. Introdúcelo de nuevo: ");
					cantidadAIngresar = Integer.valueOf(sc.nextLine());
				}
				
				cuenta.hacerIngreso(cantidadAIngresar);
				System.out.println("Se han ingresado " + cantidadAIngresar + " euros en tu cuenta.");
				
				
			}else if (opcionMenu == 3) {
				
				System.out.println(cuenta.consultarCuenta());
				
				
			}else if (opcionMenu == 4) {
				
				/*LE FALTA, MIRA ARRIBA EN EL MAIN PARA MÁS INFO*/
				System.out.println("¿De verdad quieres salir? (S/N)");
				salirDeVerdad = String.valueOf(sc.nextLine());
				
				while (!salirDeVerdad.equalsIgnoreCase("s") && !salirDeVerdad.equalsIgnoreCase("n")) {
					System.out.println("Tienes que responder S o N: ");
					salirDeVerdad = String.valueOf(sc.nextLine());
				}
			}
			
		
		}while(opcionMenu != 4 && !salirDeVerdad.equalsIgnoreCase("S"));
		
		
		System.out.println("Has salido del programa. ");
		sc.close();
	}

	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* //////// CONSTANTES \\\\\\\\ */
	public static final String SEPARADOR = "--------------------------------";
	
	public static final String MENU = SEPARADOR + "\n"
									  + "1. Hacer un reintegro\n"
									  + "2. Hacer un ingreso\n"
									  + "3. Consultar el saldo y el número de reintegros e ingresos realizados\n"
									  + "4. Finalizar operaciones\n"
									  + SEPARADOR + "\n"
									  + "Elige una opción: ";
	
	/* ============== Función comoSeLlameLaFuncion () =============== */
	
	
}
