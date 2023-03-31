package com.rec;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

import com.rec.model.BackendProgrammer;
import com.rec.model.Candidate;
import com.rec.model.ContractType;
import com.rec.model.FullStackDeveloper;
import com.rec.model.WebDesigner;

public class MainEmpresa {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		/*Hay que crear 11 empleados, de los cuales: 
		 * - 3 son diseñadores web, y 1 de ellos es a tiempo parcial
		 * - 6 son desarrolladores de backend, y 2 de ellos a tiempo parcial
		 * - 2 son desarrolladores full stack*/
		
		Candidate[] empleados = new Candidate[11];
		FullStackDeveloper empFull = null;
		BackendProgrammer empBack = null;
		WebDesigner empFront = null;
		
		
		try {
			
			//2 FullStack
			empFull = new FullStackDeveloper(LocalDate.of(1999, 10, 30), LocalDateTime.now().minusDays(3), 
										"12345678F", "Daniel", "Carpintero", ContractType.PARTIAL, false);
			empleados[0] = empFull;
			
			empFull = new FullStackDeveloper(LocalDate.of(1970, 7, 10), LocalDateTime.now().minusMonths(5), 
										"22222222G", "Antonio", "Recio", ContractType.FULLTIME, true);
			empleados[1] = empFull;

			
			//6 Backend, 2 a tiempo parcial
			empBack = new BackendProgrammer(LocalDate.of(1902, 7, 10), LocalDateTime.now().minusMonths(6), 
										"33333333T", "Liara", "T'Soni", ContractType.PARTIAL, true);
			
			empleados[2] = empBack;
			
			
			empBack = new BackendProgrammer(LocalDate.of(1998, 3, 6), LocalDateTime.now().minusYears(2), 
										"44444444R", "Kasumi", "Goto", ContractType.FULLTIME, false);

			empleados[3] = empBack;

			
			empBack = new BackendProgrammer(LocalDate.of(1990, 1, 3), LocalDateTime.now().minusMonths(11), 
										"55555555U", "Tali'Zorah", "vas Normandy", ContractType.PARTIAL, true);

			empleados[4] = empBack;
			
			
			empBack = new BackendProgrammer(LocalDate.of(1902, 7, 10), LocalDateTime.now().minusMonths(3), 
										"66666666P", "Fernando", "Gómez", ContractType.FULLTIME, true);
			
			empleados[5] = empBack;
			
			
			empBack = new BackendProgrammer(LocalDate.of(1997, 4, 29), LocalDateTime.now().minusMonths(9), 
										"77777777B", "Martín", "Campos", ContractType.FULLTIME, true);
			
			empleados[6] = empBack;
			
			
			empBack = new BackendProgrammer(LocalDate.of(1991, 6, 2), LocalDateTime.now().minusYears(2), 
										"88888888T", "Margarita", "Santos", ContractType.FULLTIME, false);
			
			empleados[7] = empBack;

			
			//3 WebDesigner, 1 a tiempo parcial
			empFront = new WebDesigner(LocalDate.of(1987, 7, 10), LocalDateTime.now().minusYears(7), 
										"99999999M", "Leticia", "Martínez", ContractType.FULLTIME, true);

			empleados[8] = empFront;

			
			empFront = new WebDesigner(LocalDate.of(1984, 7, 10), LocalDateTime.now().minusYears(4), 
										"10101010Q", "Jose Luis", "Cortés", ContractType.FULLTIME, true);
			
			empleados[9] = empFront;
			
			
			empFront = new WebDesigner(LocalDate.of(1980, 7, 10), LocalDateTime.now().minusYears(10), 
										"21212121A", "Rosa", "Villareal", ContractType.FULLTIME, false);
			
			empleados[10] = empFront;

			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//Menu
		Scanner sc = new Scanner(System.in);
		int opcionMenu = 0;
		
		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while ((opcionMenu != 1) && (opcionMenu != 2) && (opcionMenu != 3)) {
				System.out.println("Has elegido incorrectamente. Hazlo de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			//1. Buscar empleado por DNI
			if (opcionMenu == 1) {
				
				System.out.println("Introduce el DNI del empleado que quieres buscar: ");
				String dniABuscar = sc.nextLine();
				System.out.println(mostrarEmpleado(dniABuscar, empleados));
				
				int posicionEmpleado = obtenerPosicionEmpleado(empleados, dniABuscar);
				
				
				if (posicionEmpleado != -1) {
					System.out.println("\n" + "Su sueldo es de " + empleados[posicionEmpleado].computeGrossSalary() + " euros.");
				}
			
				
			//2. Mostrar y ordenar empleados segun experiencia profesional
			}else if (opcionMenu == 2) {
				
				Arrays.sort(empleados);
				System.out.println(mostrarTodosLosEmpleados(empleados));
			}
			
			
			System.out.println("\n");
			
		}while (opcionMenu != 3);
		
		
		System.out.println("\n" + "Has salido del programa. Hasta luego.");
		sc.close();
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final String SEPARADOR = "---------------------";
	
	private static final String MENU = SEPARADOR + "\n"
									+ "¿Qué vas a hacer?\n"
									+ SEPARADOR + "\n"
									+ "1. Consultar información de un empleado según su DNI, y calcular su salario\n"
									+ "2. Ordenar y mostrar empleados según su experiencia profesional\n"
									+ "3. Salir\n"
									+ SEPARADOR + "\n"
									+ "Elige: ";
	
	
	
	/* ------------ Función mostrarEmpleado () ------------ */
	public static String mostrarEmpleado (String dniABuscar, Candidate[] empleados) {
		
		StringBuilder sb = new StringBuilder();
		
		
		if (obtenerPosicionEmpleado(empleados, dniABuscar) != -1) {
			
			for (int i = 0; i < empleados.length; i++) {
				
				if (empleados[i] != null) {
					
					if (empleados[i].getDni().equals(dniABuscar)) {
						sb.append("\n" + SEPARADOR + "\n" + empleados[i].toString());
					}
				}
			}
		
		}else {
			sb.append("No se ha encontrado ningún empleado con ese DNI.");
		}
		
		
		return (sb.toString());
	}
	
	
	
	/* ------------ Función mostrarTodosLosEmpleados () ------------ */
	public static String mostrarTodosLosEmpleados (Candidate[] empleados) {
		
		StringBuilder sb = new StringBuilder("\n" + SEPARADOR + "\n\n");
		
		
		for (int i = 0; i < empleados.length; i++) {
				
			if (empleados[i] != null) {
				sb.append(empleados[i].toString()).append("\n\n" + SEPARADOR + "\n\n");
			}
		}
		
		
		return (sb.toString());
	}
	
	
	
	/* ------------ Función ordenarEmpleadosPorExperiencia () ------------ */
	public static void ordenarEmpleadosPorExperiencia (Candidate[] empleados) {
		Arrays.sort(empleados);
	}
	
	
	
	/* ------------ Función obtenerPosicionEmpleado () ------------ */
	public static int obtenerPosicionEmpleado (Candidate[] empleados, String dniABuscar) {
		
		int resultado = -1;
		
		
		for (int i = 0; i < empleados.length; i++) {
			
			if (empleados[i] != null) {
				
				if (empleados[i].getDni().equals(dniABuscar)) {
					resultado = i;
				}
			}
		}
		
		
		return (resultado);
	}

}
