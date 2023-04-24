package ej8_ampliacionEj2;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EquipoTest {
	
	@Test
	void testEquipoVacioAlPrincipio() {
		
		Equipo equipoA = null;
		
		try {
			equipoA = new Equipo("Test");
			
		} catch (EquipoException e) {
			e.printStackTrace();
		}
		
		assertEquals(equipoA.getListaAlumnos().size(), 0);
	}

	
	
	@Test
	void testAddAlumnoAtributosAumentaTamanio() {
		
		Equipo equipoA = null;
		
		
		try {
			equipoA = new Equipo("Test");
			equipoA.addAlumno(new Alumno("JM", "56565689M", LocalDateTime.of(1999, 10, 30, 0, 0, 0), 'H', "Sevilla"));
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		assertEquals(equipoA.getListaAlumnos().size(), 1);
		
	}

	
	
	@Test
	void testAddAlumnoClaseAumentaTamanio() {
		
		Equipo equipoA = null;
		
		
		try {
			equipoA = new Equipo("Test");
			
		} catch (EquipoException e2) {
			e2.printStackTrace();
		}
		
		
		Alumno alumno = null;
		
		
		try {
			alumno = new Alumno("JM", "56565689M", LocalDateTime.of(1999, 10, 30, 0, 0, 0), 'H', "Sevilla");
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		try {
			equipoA.addAlumno(alumno);
			
		} catch (EquipoException e) {
			e.printStackTrace();
		}
		
		
		assertEquals(equipoA.getListaAlumnos().size(), 1);
	}
	
	
	
	
	/******************************************************/
	/****************    EJERCICIO 8    *******************/
	/******************************************************/

	Equipo e1 = null;
	Equipo e2 = null;
	
	
	@BeforeEach
	void inicializarEquiposConAlumnos() {
		
		try {
			
			e1 = new Equipo("Barcelona");
			e2 = new Equipo("Betis");

			
		} catch (EquipoException e) {
			System.out.println(e);
		}
		
		
		try {
			
			//Equipo con 5 hombres, 1 mujer
			e1.addAlumno(new Alumno("Ataulfo", "12345678D", LocalDateTime.of(1997, 2, 4, 0, 0, 0), 'H', "Sevilla"));
			e1.addAlumno(new Alumno("Alejandro", "24681357U", LocalDateTime.of(2020, 6, 10, 0, 0, 0), 'H', "Sevilla"));	//H, menor
			e1.addAlumno(new Alumno("Rocío", "87654321E", LocalDateTime.of(2012, 8, 3, 0, 0, 0), 'M', "Málaga"));		//M, menor
			e1.addAlumno(new Alumno("Ryotaro", "44444444G", LocalDateTime.of(1990, 2, 21, 0, 0, 0), 'H', "Inaba"));
			e1.addAlumno(new Alumno("Garland", "66666666R", LocalDateTime.of(1523, 2, 21, 0, 0, 0), 'H', "Urkan Tapa"));
			e1.addAlumno(new Alumno("Walter", "52345245Q", LocalDateTime.of(2005, 2, 21, 0, 0, 0), 'H', "Reino Mikado del este"));

			//Equipo con todo mujeres
			e2.addAlumno(new Alumno("Rocío", "87654321E", LocalDateTime.of(2013, 8, 3, 0, 0, 0), 'M', "Barcelona"));	//M. menor
			e2.addAlumno(new Alumno("Gema", "77654321E", LocalDateTime.of(2016, 8, 3, 0, 0, 0), 'M', "Barcelona"));		//M, menor
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
	
	
	
	/* ----------- a) Función devolverVaronesMayoresDeEdad () ---------- */
	@Test
	void testDevolverVaronesMayoresDeEdad() {
		
		try {
			assertEquals(e1.devolverVaronesMayoresDeEdad().size(), 4);
			assertEquals(e2.devolverVaronesMayoresDeEdad().size(), 0);

		} catch (EquipoException e) {
			assert(false);
		}
	}
	
	
	
	/* ---------- b) Función devolverSiEquipoEsSoloMujeres () ---------- */
	@Test
	void testDevolverSiEquipoEsSoloMujeres() {
		
		try {
			assertEquals(e1.devolverSiEquipoEsSoloMujeres(), false);
			assertEquals(e2.devolverSiEquipoEsSoloMujeres(), true);

		} catch (EquipoException e) {
			assert(false);
		}
	}
	
	
	
	/* ----------- c) Función devolverMujeresMayoresDeEdad () ---------- */
	@Test
	void testDevolverMujeresMayoresDeEdad() {
		
		try {
			assertEquals(e1.devolverMujeresMayoresDeEdad().size(), 0);
			assertEquals(e2.devolverMujeresMayoresDeEdad().size(), 4);

		} catch (EquipoException e) {
			assert(false);
		}
	}
	
	
	
	/* ----- d) Función devolverMujerMasMayorEntreMayoresDeEdad () ----- */
	@Test
	void testDevolverMujerMasMayorEntreMayoresDeEdad() {
		
		try {
			assertEquals(e1.devolverMujerMasMayorEntreMayoresDeEdad(), null); //No hay mujer mayor de edad en "e1"
			assertEquals(e2.devolverMujerMasMayorEntreMayoresDeEdad().getNombre(), "Claire");

		} catch (EquipoException e) {
			assert(false);
		}
	}

	
	
	/* ----------- e) Función devolverVaronesMenoresDeEdad () ---------- */
	@Test
	void testDevolverVaronesMenoresDeEdad() {
		
		try {
			assertEquals(e1.devolverVaronesMenoresDeEdad().size(), 1);
			assertEquals(e2.devolverVaronesMenoresDeEdad().size(), 0);

		} catch (EquipoException e) {
			assert(false);
		}
	}

	
	
	/* -------- f) Función devolverMujeresOrdenadasPorNombre () -------- */
	@Test
	void testDevolverMujeresOrdenadasPorNombre() {
		
		try {
			assertEquals(e1.devolverMujeresOrdenadasPorNombre().get(0).getNombre(), "Rocío");
			
			assertEquals(e2.devolverMujeresOrdenadasPorNombre().get(0).getNombre(), "Claire");
			assertEquals(e2.devolverMujeresOrdenadasPorNombre().get(1).getNombre(), "Gema");
			assertEquals(e2.devolverMujeresOrdenadasPorNombre().get(2).getNombre(), "Jill");

		} catch (EquipoException e) {
			assert(false);
		}
	}


	
	/* -------------- g) Función existeMujerMayorEdad () --------------- */
	@Test
	void testExisteMujerMayorEdad () {
		
		try {
			assertEquals(e1.existeMujerMayorEdad(), false);
			assertEquals(e2.existeMujerMayorEdad(), true);
			
		} catch (EquipoException e) {
			assert(false);
		}
	}

	
	
	/* ------------- h) Función contarCiudadesDiferentes () ------------ */
	@Test
	void testContarCiudadesDiferentes () {
		
		try {
			assertEquals(e1.contarCiudadesDiferentes(), 5);
			assertEquals(e2.contarCiudadesDiferentes(), 3);
			
		} catch (EquipoException e) {
			assert(false);
		}
	}

}


































