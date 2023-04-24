package ej8_ampliacionEj2;

import java.time.LocalDateTime;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	// ===== >											  < =====
	// ===== >    TESTS DE EJERCICIO 8 EN "EQUIPOTEST"    < =====
	// ===== >											  < =====
	
	
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
			
			e1.addAlumno(new Alumno("Ataulfo", "12345678D", LocalDateTime.of(1997, 2, 4, 0, 0, 0), 'H', "Sevilla"));
			e1.addAlumno(new Alumno("Alejandro", "24681357U", LocalDateTime.of(2020, 6, 10, 0, 0, 0), 'H', "Sevilla"));
			e1.addAlumno(new Alumno("Rocío", "87654321E", LocalDateTime.of(2012, 8, 3, 0, 0, 0), 'M', "Málaga"));
			e1.addAlumno(new Alumno("Dojima", "44444444G", LocalDateTime.of(1980, 2, 21, 0, 0, 0), 'H', "Inaba"));
			e1.addAlumno(new Alumno("Garland", "66666666R", LocalDateTime.of(1523, 2, 21, 0, 0, 0), 'H', "Urkan Tapa"));
			e1.addAlumno(new Alumno("Walter", "52345245Q", LocalDateTime.of(2005, 2, 21, 0, 0, 0), 'H', "Reino Mikado del este"));

			
			e2.addAlumno(new Alumno("Rocío", "87654321E", LocalDateTime.of(2013, 8, 3, 0, 0, 0), 'M', "Barcelona"));
			e2.addAlumno(new Alumno("Gema", "77654321E", LocalDateTime.of(2016, 8, 3, 0, 0, 0), 'M', "Barcelona"));
			e2.addAlumno(new Alumno("Nina", "67654321E", LocalDateTime.of(2000, 8, 3, 0, 0, 0), 'M', "Wyndia"));
			e2.addAlumno(new Alumno("Jill", "17654321E", LocalDateTime.of(1996, 8, 3, 0, 0, 0), 'M', "Raccoon City"));
			e2.addAlumno(new Alumno("Rebecca", "27654321E", LocalDateTime.of(2003, 8, 3, 0, 0, 0), 'M', "Raccoon City"));
			e2.addAlumno(new Alumno("Claire", "37654321E", LocalDateTime.of(1993, 8, 3, 0, 0, 0), 'M', "Raccoon City"));

		} catch (EquipoException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
		
		
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final String SEPARADOR = "-----------------------";
	
}
