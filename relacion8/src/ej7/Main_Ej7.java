package ej7;

import java.util.Scanner;

public class Main_Ej7 {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos alumnos vas a introducir? ");
		int numAlumnos = Integer.valueOf(sc.nextLine());
		
		while (numAlumnos <= 0) {
			System.out.println("Cantidad inválida. Introduce el número de nuevo: ");
			numAlumnos = Integer.valueOf(sc.nextLine());
		}
		
		
		String[] alumnos = new String[numAlumnos];
		double[] notas = new double[numAlumnos];
		int indiceDual = 0;
		int opcionMenu = 0;

		
		for (int i = 0; i < numAlumnos; i++) {
			
			System.out.println("Introduce el nombre del alumno: ");
			String nombre = sc.nextLine();
			alumnos[indiceDual] = nombre;
			
			System.out.println("Introduce la nota del alumno: ");
			double nota = Double.valueOf(sc.nextLine());
			
			while(nota < 0 || nota > 10) {
				System.out.println("Negativos ni superiores a 10 no, gracias. De nuevo: ");
				nota = Double.valueOf(sc.nextLine());
			}
			
			notas[indiceDual] = nota;
			indiceDual++;
		}

		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while ((opcionMenu != 1) && (opcionMenu != 2) && (opcionMenu != 3) 
					&& (opcionMenu != 4) && (opcionMenu != 5) && (opcionMenu != 6) 
					&& (opcionMenu != 7)) {
				System.out.println("Te has equivocado. Introduce la opción de nuevo: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			//Opcion 1: Mostrar nombre y nota de los alumnos aprobados
			if (opcionMenu == 1) {
				
				boolean encontrado = false;
				
				for (int i = 0; i < alumnos.length; i++) {
					
					if (notas[i] >= 5) {
						System.out.println("Alumno: " + alumnos[i] + " con nota " + notas[i] + ".");
						encontrado = true;
					}
				}
				
				
				if (encontrado == false) {
					System.out.println("No hay alumnos aprobados.");
				}
			
				
			//Opcion 2: Mostrar nombre y nota de los alumnos suspensos
			}else if (opcionMenu == 2) {
				
				boolean encontrado = false;
				
				for (int i = 0; i < alumnos.length; i++) {
					
					if (notas[i] < 5) {
						System.out.println("Alumno: " + alumnos[i] + " con nota " + notas[i] + ".");
						encontrado = true;
					}
				}
				
				
				if (encontrado == false) {
					System.out.println("No hay alumnos suspensos.");
				}
				
				
			//Opcion 3: Mostrar nota media de la clase			
			}else if (opcionMenu == 3) {
				
				double sumaNotas = 0;
			
				for (int i = 0; i < alumnos.length; i++) {
					sumaNotas += notas[i];
				}
				
				System.out.println("La nota media de la clase es: " + (sumaNotas / numAlumnos) + ".");
			
				
			//Opcion 4: Mostrar alumnos con una nota X
			}else if (opcionMenu == 4) {
			
				boolean encontrado = false;
				System.out.println("Dime la nota: ");
				double notaABuscar = Double.valueOf(sc.nextLine());
				
				while(notaABuscar < 0 || notaABuscar > 10) {
					System.out.println("Negativos ni superiores a 10 no, gracias. De nuevo: ");
					notaABuscar = Double.valueOf(sc.nextLine());
				}
				
				
				for (int i = 0; i < notas.length; i++) {
					
					if (notas[i] >= notaABuscar) {
						System.out.println("Alumno: " + alumnos[i] + " con nota " + notas[i] + ".");
						encontrado = true;
					}
				}
				
				
				if (encontrado == false) {
					System.out.println("No se ha encontrado a un alumno con esa nota.");
				}
				
				
			//Opcion 5: Mostrar el alumno con la nota maxima y la minima
			}else if (opcionMenu == 5) {
				
				double notaMaxima = notas[0];
				double notaMinima = notas[0];
				indiceDual = 0;
				StringBuilder alumnoNotaMinima = new StringBuilder(alumnos[indiceDual] + " con nota " + notas[indiceDual]);
				StringBuilder alumnoNotaMaxima = new StringBuilder(alumnos[indiceDual] + " con nota " + notas[indiceDual]);

				
				for (double nota : notas) {
					
					if (notaMaxima < nota) {
						notaMaxima = nota;
						
						if (alumnoNotaMaxima.toString().length() != 0) {
							alumnoNotaMaxima.delete(0, alumnoNotaMaxima.toString().length());
						}
						
						alumnoNotaMaxima.append(alumnos[indiceDual] + " con nota " + notas[indiceDual]);
						
					}else if (notaMinima > nota) {
						notaMinima = nota;
						
						if (alumnoNotaMinima.toString().length() != 0) {
							alumnoNotaMinima.delete(0, alumnoNotaMinima.toString().length());
						}
						
						alumnoNotaMinima.append(alumnos[indiceDual] + " con nota " + notas[indiceDual]);
					}
					
					
					indiceDual++;
				}
			
				System.out.println("El alumno con la nota mínima es " + alumnoNotaMinima.toString() 
									+ ", y el alumno con la máxima es " + alumnoNotaMaxima.toString() + ".");
				
				
			//Opcion 6: Mostrar listado ordenado de forma creciente por nota [INCOMPLETO]
			}else if (opcionMenu == 6) {
				System.out.println("No supe hacer este.");
			}
			
		}while (opcionMenu != 7);
		
		
		System.out.println(SEPARADOR);
		System.out.println("Saliste del programa.");
		sc.close();
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* \/\/\/\ CONSTANTES /\/\/\/\ */
	public static final String SEPARADOR = "----------------------------";
	
	public static final String MENU = SEPARADOR + "\n"
									+ "¿Qué quieres hacer?\n\n"
									+ "1. Mostrar el nombre y la nota de los alumnos aprobados\n"
									+ "2. Mostrar el nombre y la nota de los alumnos suspensos\n"
									+ "3. Mostrar la nota media de la clase\n"
									+ "4. Mostrar los alumnos que tienen más de una nota X\n"
									+ "5. Mostrar el alumno con la nota máxima y mínima\n"
									+ "6. Mostrar un listado ordenado de forma creciente por la nota\n"
									+ "7. Salir\n"
									+ SEPARADOR + "\n"
									+ "Elige: ";
	
	
	/* ============== Función ordenarBurbuja () =============== */
	
}
