package ej2_equipoDeportivo;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	/* ===== EJERCICIO 2 =====
	2. Escribir un programa para gestionar grupos de alumnos apuntados a equipos deportivos. El
	programa dispondrá de:
	
	● La Clase Alumno, con los atributos: nombre y DNI de tipo String. Implementar
	constructor y los métodos toString() y equals.
	
	● La Clase Equipo. Cada equipo deportivo se representa en una clase que contiene el
	nombre del equipo y un grupo de alumnos.
	
	
	El equipo tiene operaciones para:
	
	- Añadir un alumno (recibe como parámetro el objeto alumno a insertar). Si el alumno
	ya existe en el equipo debe saltar una excepción.
	
	- Borrar un alumno (recibe como parámetro el objeto alumno a borrar). Si el alumno
	no existe en el equipo debe saltar una excepción.
	
	- Saber si un alumno pertenece al equipo. Recibe como parámetro el objeto alumno a
	buscar y devuelve null si no lo encuentra y el objeto alumno si existe.
	
	- Mostrar en pantalla la lista de personas del equipo.
	
	- Unión de equipos. El método lo llamará un equipo y se le pasará por parámetro el
	otro equipo con el que se quiere unir. Devuelve un equipo formado por los alumnos
	de ambos equipos.
	
	- Intersección de equipos. Idem al anterior pero devuelve un equipo formado por los
	alumnos que están en los dos equipos
	
	
	Se pide:
	
	1. Decidir la estructura de almacenamiento más indicada para este ejercicio. No debe
	establecerse ningún límite de jugadores en los equipos.
	
	2. Realizar las clases Alumno, Equipo así como un programa de prueba que cree
	varios equipos y prueba todas las operaciones mostrando en pantalla los resultados.*/	

	
	public static void main(String[] args) {
		
		Equipo e1 = null;
		Equipo e2 = null;

		
		try {
			
			e1 = new Equipo("Barcelona");
			e2 = new Equipo("Betis");

			
		} catch (EquipoException e) {
			System.out.println(e);
		}
		
		
		try {
			
			e1.addAlumno(new Alumno("Daniel", "12345678D"));
			e1.addAlumno(new Alumno("Alejandro", "24681357U"));
			e1.addAlumno(new Alumno("Rocío", "87654321E"));
			e1.addAlumno(new Alumno("Adachi", "44444444G"));

			
			e2.addAlumno(new Alumno("Daniel", "12345678D"));
			e2.addAlumno(new Alumno("Rocío", "87654321E"));
			e2.addAlumno(new Alumno("Alejandro", "24681357U"));

			System.out.println("Equipo antes de borrar Alumno Daniel" + "\n" + SEPARADOR);
			System.out.println(e1);

			System.out.println("\n" + "Método borrarAlumno(new Alumno(\"Daniel\", \"12345678D\"))" + "\n" + SEPARADOR);
			e1.borrarAlumno(new Alumno("Daniel", "12345678D"));
			System.out.println(e1);


			System.out.println("\n" + "Método perteneceAEquipo(new Alumno(\"Daniel\", \"12345678D\")))" + "\n" + SEPARADOR);
			System.out.println(e1.perteneceAEquipo(new Alumno("Daniel", "12345678D")));
			
			System.out.println("\n" + "Método perteneceAEquipo(new Alumno(\"Rocío\", \"87654321E\")))" + "\n" + SEPARADOR);
			System.out.println(e1.perteneceAEquipo(new Alumno("Rocío", "87654321E")));

			

		} catch (EquipoException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("\n" + "Método unionEquipos()" + "\n" + SEPARADOR);
		System.out.println(e1.unionEquipos(e2));
		
		System.out.println("\n" + "Método interseccionEquipos()" + "\n" + SEPARADOR);
		System.out.println(e1.interseccionEquipos(e2));
		
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final String SEPARADOR = "-----------------------";
	
}
