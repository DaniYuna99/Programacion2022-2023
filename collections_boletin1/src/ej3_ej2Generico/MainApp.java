package ej3_ej2Generico;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	/* ===== EJERCICIO 3 =====
	3. Modificar la clase anterior para que Equipo sea una clase genérica y 
	se pueda aplicar a cualquier tipo de equipo. Realizar dos programas que 
	prueben la clase Equipo parametrizada con la clase Alumno y
	otro que lo pruebe con la clase Integer.*/
	
	
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
