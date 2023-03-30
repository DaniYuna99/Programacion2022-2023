package com;

import java.util.Scanner;

import com.model.Coche;
import com.model.Combustible;
import com.model.FurgonetaCarga;
import com.model.Gama;
import com.model.Microbus;
import com.model.Vehiculo;


public class Main_Vehiculos {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		/*Coche coche = new Coche ("ASDF", Gama.ALTA, Combustible.DIESEL);
		System.out.println(coche);
		System.out.println(coche.calcularPrecioAlquiler(coche.getMatricula(), 5));
		System.out.println(SEPARADOR);
		
		FurgonetaCarga fc = new FurgonetaCarga ("ASDFG", Gama.BAJA, 200);
		System.out.println(fc);
		System.out.println(fc.calcularPrecioAlquiler(fc.getMatricula(), 5));
		System.out.println(SEPARADOR);
		
		Microbus microbus = new Microbus ("ASDFH", Gama.MEDIA, 20);
		System.out.println(microbus);
		System.out.println(microbus.calcularPrecioAlquiler(microbus.getMatricula(), 5));
		System.out.println(SEPARADOR);*/
		
		
		Scanner sc = new Scanner(System.in);	
		int opcionMenu = 0;
		String tipoVehiculo = "";
		Vehiculo[] vehiculos = new Vehiculo[200];
		int indiceInsercion = 0;
		
		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while ((opcionMenu != 1) && (opcionMenu != 2) && (opcionMenu != 3)) {
				System.out.println("Opción incorrecta. Elige de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			//1. Alta de vehículo
			if (opcionMenu == 1) {
				
				//Si IndiceInsercion es menor que 199
				if (indiceInsercion < 199) {
					
					System.out.println("Dime el tipo de vehículo que quieres dar de alta (Coche, furgoneta, microbus): ");
					tipoVehiculo = sc.nextLine();
					
					while ((!tipoVehiculo.equalsIgnoreCase("COCHE")) 
							&& (!tipoVehiculo.equalsIgnoreCase("MICROBUS"))
							&& (!tipoVehiculo.equalsIgnoreCase("FURGONETA"))) {
						
						System.out.println("Error al introducir el tipo de vehículo. Introdúcelo de nuevo: ");
						tipoVehiculo = sc.nextLine();

					}
					
					
					System.out.println("Introduce la matrícula del vehículo: ");
					String matricula = sc.nextLine();
					System.out.println("Introduce la gama del vehículo (Alta, media, baja): ");
					String gamaString = sc.nextLine().toUpperCase();
					
					while ((!gamaString.equalsIgnoreCase("ALTA")) 
							&& (!gamaString.equalsIgnoreCase("MEDIA")) 
							&& (!gamaString.equalsIgnoreCase("BAJA"))) {
						System.out.println("Error. Introduce la gama de nuevo: ");
						gamaString = sc.nextLine().toUpperCase();
					}
					
					
					Gama gama = Gama.valueOf(gamaString);
					
					
					//Insercion de Coche
					if (tipoVehiculo.equalsIgnoreCase("COCHE")) {
						
						System.out.println("Introduce el tipo de combustible que usa el coche (Gasolina o Diesel): ");
						String combustibleString = sc.nextLine();
						
						while ((!combustibleString.equalsIgnoreCase("GASOLINA")) 
								&& (!combustibleString.equalsIgnoreCase("DIESEL"))) {
							System.out.println("Error. Introduce el combustible de nuevo: ");
							combustibleString = sc.nextLine().toUpperCase();
						}
						
						
						Combustible combustible = Combustible.valueOf(combustibleString);
						Coche coche = new Coche(matricula, gama, combustible);
						
						
						if (existeVehiculo(vehiculos, matricula) == false) {
							vehiculos[indiceInsercion] = coche;
							System.out.println("El nuevo coche está dado de alta.");
							
						}else {
							System.out.println("Un vehículo con esa matrícula ya existe.");
						}
					
						
					//Insercion de Furgoneta
					}else if (tipoVehiculo.equalsIgnoreCase("FURGONETA")) {
						
						System.out.println("Introduce el PMA de la furgoneta de carga: ");
						double PMA = Double.valueOf(sc.nextLine());
						
						while (PMA <= 0) {
							System.out.println("Error. Introduce el PMA de nuevo: ");
							PMA = Double.valueOf(sc.nextLine());
						}
						
						
						FurgonetaCarga fc = new FurgonetaCarga(matricula, gama, PMA);
						
						if (existeVehiculo(vehiculos, matricula) == false) {
							vehiculos[indiceInsercion] = fc;
							System.out.println("La nueva furgoneta está dado de alta.");
							
						}else {
							System.out.println("Un vehículo con esa matrícula ya existe.");
						}

						
						
					//Insercion de Microbus
					}else if (tipoVehiculo.equalsIgnoreCase("MICROBUS")) {
						
						System.out.println("Introduce las plazas totales del microbús: ");
						int plazas = Integer.valueOf(sc.nextLine());
						
						while (plazas <= 0) {
							System.out.println("Error. Introduce las plazas de nuevo: ");
							plazas = Integer.valueOf(sc.nextLine());
						}
						
						
						Microbus microbus = new Microbus(matricula, gama, plazas);
						
						
						if (existeVehiculo(vehiculos, matricula) == false) {
							vehiculos[indiceInsercion] = microbus;
							System.out.println("El nuevo microbús está dado de alta.");
							
						}else {
							System.out.println("Un vehículo con esa matrícula ya existe.");
						}
						
					}
					
					
					indiceInsercion++;
					
					
				//Si IndiceInsercion es mayor que 199
				}else {
					System.out.println("No se pueden dar de alta más vehículos.");
				}
				

			//2. Calculo precio alquiler
			}else if (opcionMenu == 2) {
				
				boolean encontrado = false;
				System.out.println("Dime la matrícula del vehículo que quieres buscar: ");
				String matricula = sc.nextLine();
				System.out.println("Dime los días que quieres alquilar: ");
				int diasAlquiler = Integer.valueOf(sc.nextLine());
				
				while (diasAlquiler <= 0) {
					System.out.println("Error. Introduce de nuevo los días de alquiler: ");
					diasAlquiler = Integer.valueOf(sc.nextLine());
				}
				
				
				for (Vehiculo vehiculo : vehiculos) {
					
					if (vehiculo != null) {
						
						if (vehiculo.getMatricula().equals(matricula)) {
							System.out.println("El precio de alquiler del vehículo cuya matrícula es '" + matricula 
											  + "' es " + vehiculo.calcularPrecioAlquiler(matricula, diasAlquiler) + " euros.");
							encontrado = true;
						}
					}
				}
				
				
				if (encontrado == false) {
					System.out.println("No se ha encontrado un vehículo con la matrícula '" + matricula + "'.");
				}
			}
			
			
		}while (opcionMenu != 3);

		
		System.out.println(SEPARADOR + "\n" + "Has salido del programa.");
		sc.close();

	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final String SEPARADOR = "--------------------------";
	
	public static final String MENU = SEPARADOR + "\n"
									+ "¿Qué quieres hacer?\n"
									+ SEPARADOR + "\n"
									+ "1. Alta de vehículo\n"
									+ "2. Cálculo de precio de alquiler\n"
									+ "3. Salir\n"
									+ SEPARADOR + "\n"
									+ "Elige: ";
	
	
	
	/* ------------ Función existeVehiculo () ------------ */
	public static boolean existeVehiculo (Vehiculo[] vehiculos, String matricula) {
		
		boolean existeYa = false;
		
		
		for (Vehiculo vehiculo : vehiculos) {
			
			if (vehiculo != null) {
				
				if (vehiculo.getMatricula().equals(matricula)) {
					existeYa = true;
				}
			}
		}
		
		
		return (existeYa);
	}

}
