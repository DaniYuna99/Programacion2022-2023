package ej2_equipoDeportivo;

import static org.junit.Assert.assertEquals;

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
			equipoA.addAlumno(new Alumno("JM", "56565689M"));
			
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
			alumno = new Alumno("JM", "56565689M");
			
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

	
}
