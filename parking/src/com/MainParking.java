package com;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.enumerados.Combustible;
import com.enumerados.TipoVehiculo;
import com.exceptions.VehiculoException;
import com.model.Parking;
import com.model.Vehiculo;


public class MainParking {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) throws VehiculoException {
		
		Scanner sc = new Scanner(System.in);
		Parking p = new Parking();
		int opcionMenu = 0;

		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while ((opcionMenu != 1) && (opcionMenu != 2) 
					&& (opcionMenu != 3) && (opcionMenu != 4) 
					&& (opcionMenu != 5) && (opcionMenu != 6)) {
				System.out.println("Error: te has equivocado al elegir. Elige de nuevo:");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			//1. Insertar vehiculo
			if (opcionMenu == 1) {
				
				//Marca
				System.out.println("Inserta la marca del vehículo: ");
				String marca = sc.nextLine();
				
				while (marca.isEmpty()) {
					System.out.println("No has introducido nada. Introduce algo: ");
					marca = sc.nextLine();
				}
				
				
				//Modelo
				System.out.println("Inserta el modelo del vehículo: ");
				String modelo = sc.nextLine();
				
				while (modelo.isEmpty()) {
					System.out.println("No has introducido nada. Introduce algo: ");
					modelo = sc.nextLine();
				}
				
				
				//Matricula
				System.out.println("Inserta la matrícula del vehículo: ");
				String matricula = sc.nextLine();
				
				while (matricula.isEmpty()) {
					System.out.println("No has introducido nada. Introduce algo: ");
					matricula = sc.nextLine();
				}
				
				
				//Combustible
				System.out.println("Inserta el combustible del vehículo (Gasolina, electrico, gasoil, hibrido): ");
				String combustibleString = sc.nextLine().toUpperCase();
				
				while ((!combustibleString.equals("GASOLINA")) && (!combustibleString.equals("ELECTRICO"))
						&& (!combustibleString.equals("GASOIL")) && (!combustibleString.equals("HIBRIDO"))
						|| (combustibleString.isEmpty())) {
					System.out.println("Te has equivocado al escribir. Introduce algo: ");
					combustibleString = sc.nextLine().toUpperCase();
				}
				
				Combustible combustible = Combustible.valueOf(combustibleString);
				
				
				//Fecha
				
				//anyo
				System.out.println("Inserta el año de entrada del vehículo: ");
				int anyo = Integer.valueOf(sc.nextLine());
				
				while (anyo <= 0 || anyo > LocalDateTime.now().getYear()) {
					System.out.println("Error. El año no es válido, introdúcelo de nuevo: ");
					anyo = Integer.valueOf(sc.nextLine());
				}
				
				//mes
				System.out.println("Inserta el mes de entrada del vehículo: ");
				int mes = Integer.valueOf(sc.nextLine());
				
				while (mes <= 0 || mes > 12) {
					System.out.println("Error. El mes no es válido, introdúcelo de nuevo: ");
					mes = Integer.valueOf(sc.nextLine());
				}
				
				//dia
				System.out.println("Inserta el día de entrada del vehículo: ");
				int dia = Integer.valueOf(sc.nextLine());
				
				//comprobacion si la fecha es valida, si no, se piden los datos de nuevo
				while (esFechaValida(dia, mes, anyo) == false) {
					
					System.out.println("Error. La fecha no es válida, introdúcelo de nuevo.");

					
					System.out.println("Inserta el año de entrada del vehículo: ");
					anyo = Integer.valueOf(sc.nextLine());
					
					while (anyo <= 0 || anyo > LocalDateTime.now().getYear()) {
						System.out.println("Error. El año no es válido, introdúcelo de nuevo: ");
						anyo = Integer.valueOf(sc.nextLine());
					}
					
					
					System.out.println("Inserta el mes de entrada del vehículo: ");
					mes = Integer.valueOf(sc.nextLine());
					
					while (mes <= 0 || mes > 12) {
						System.out.println("Error. El mes no es válido, introdúcelo de nuevo: ");
						mes = Integer.valueOf(sc.nextLine());
					}
					
					
					System.out.println("Inserta el día de entrada del vehículo: ");
					dia = Integer.valueOf(sc.nextLine());
				}
				
				
				//minutos
				System.out.println("Inserta los minutos de entrada del vehículo: ");
				int minutos = Integer.valueOf(sc.nextLine());
				
				while (minutos < 0 || minutos > 59) {
					System.out.println("Error. Los minutos introducidos no son válidos: ");
					minutos = Integer.valueOf(sc.nextLine());
				}
				
				
				//hora
				System.out.println("Inserta la hora de entrada del vehículo: ");
				int hora = Integer.valueOf(sc.nextLine());
				
				while ((hora <= 0) || (hora > 23)) {
					System.out.println("Error. La hora introducida no es válida: ");
					hora = Integer.valueOf(sc.nextLine());
				}
				
				
				LocalDateTime fechaEntrada = LocalDateTime.of(anyo, mes, dia, hora, minutos);
				
				
				//TipoVehiculo
				System.out.println("Inserta el tipo de vehículo (Automovil, ciclomotor, transporte_colectivo, transporte_mercancias): ");
				String tipoVehiculoString = String.valueOf(sc.nextLine()).toUpperCase();
				
				while ((!tipoVehiculoString.equals("AUTOMOVIL")) && (!tipoVehiculoString.equals("CICLOMOTOR"))
						&& (!tipoVehiculoString.equals("TRANSPORTE_COLECTIVO")) 
						&& (!tipoVehiculoString.equals("TRANSPORTE_MERCANCIAS"))
						|| (tipoVehiculoString.isEmpty())) {
					
					System.out.println("Te has equivocado al escribir. Introduce algo: ");
					tipoVehiculoString = sc.nextLine().toUpperCase();
				}
				
				
				TipoVehiculo tipoVehiculo = TipoVehiculo.valueOf(tipoVehiculoString);
				
				
				//Insercion de vehículo en el atributo array "vehiculos"
				p.insertarVehiculo(new Vehiculo(marca, modelo, matricula, combustible, fechaEntrada, tipoVehiculo));
				
				
			//2. Mostrar vehiculos por fecha de entrada
			}else if (opcionMenu == 2) {
				p.ordenarPorFechaEntrada();
				System.out.println(p);
				
				
			//3. Mostrar vehiculos por marca y modelo				
			}else if (opcionMenu == 3) {
				p.ordenarPorMarcaYModelo();
				System.out.println(p);
				
				
			//4. Mostrar vehiculos por tipo vehiculo y combustible
			}else if (opcionMenu == 4) {
				p.ordenarPorTipoYCombustible();
				System.out.println(p);
			
				
			//5. Mostrar vehiculos por matricula
			}else if (opcionMenu == 5) {
				p.ordenarPorMatricula();
				System.out.println(p);
			}
			
			
		}while (opcionMenu != 6);
		
		
		System.out.println(SEPARADOR + "\n" + "Saliste del programa.");
		sc.close();
	}
	
	
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final String SEPARADOR = "--------------------------";
	
	public static final String MENU = SEPARADOR + "\n"
									+ "Elige una opción:\n"
									+ SEPARADOR + "\n"
									+ "1. Insertar un vehículo\n"
									+ "2. Mostrar vehículos ordenados por su fecha de entrada\n"
									+ "3. Mostrar vehículos ordenados por su marca y modelo\n"
									+ "4. Mostrar vehículos ordenados por su tipo de vehículo y combustible\n"
									+ "5. Mostrar vehículos ordenados por su matrícula\n"
									+ "6. Salir\n"
									+ SEPARADOR + "\n"
									+ "Elige: ";
	
	
	
	/* ============== Función esFechaValida () =============== */
	//Copiada del ejercicio 4 del boletín Relacion 8
	public static boolean esFechaValida (int dia, int mes, int anyo) {
		
		boolean esValida = false;
		
		
		if ( ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) 
				|| (mes == 8) || (mes == 10) || (mes == 12) 
				&& ((dia >= 1) && (dia <= 31)))
					
				|| ((mes == 2) && (esAnyoBisiesto(anyo) == false) 
				&& (dia >= 1) && (dia <= 28))
				|| ((mes == 2) && (esAnyoBisiesto(anyo) == true) 
				&& ((dia >= 1) && (dia <= 29)))
			
				|| ((mes == 4)) || (mes == 6) || (mes == 9) || (mes == 11) 
				&& ((dia >= 1) && (dia <= 30))
		
				&& ((mes >= 1) && (mes <= 12))) {
			
			esValida = true;
		}
		
		
		return (esValida);
	}
	
	
	
	/* ============== Función esAnyoBisiesto () =============== */
	//Copiada del ejercicio 4 del boletín Relacion 8
	public static boolean esAnyoBisiesto (int anyo) {
		
		boolean esBisiesto = false;
		
		
		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
			esBisiesto = true;
		}
		
		
		return (esBisiesto);
	}
	
}








