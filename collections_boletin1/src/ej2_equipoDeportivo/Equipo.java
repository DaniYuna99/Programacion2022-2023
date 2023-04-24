package ej2_equipoDeportivo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Equipo {

	/* ======================= ATRIBUTOS ======================= */
	private String nombreEquipo;
	private Set<Alumno> listaAlumnos;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final String SEPARADOR = "--------------------------";
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Equipo (String nombreEquipo) throws EquipoException {
		
		if ((nombreEquipo != null) && (!nombreEquipo.trim().isBlank())) {
			this.nombreEquipo = nombreEquipo;
			this.listaAlumnos = new HashSet<>();
		
		}else if (nombreEquipo == null) {
			throw new EquipoException ("El nombre del equipo tiene valor nulo.");
		
		}else if (nombreEquipo.trim().isBlank()) {
			throw new EquipoException ("El nombre del equipo está vacío.");
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------------ Función addAlumno () ----------------- */
	public void addAlumno (Alumno alumnoAMeter) throws EquipoException {
		
		if (perteneceAEquipo(alumnoAMeter) == null) {
			listaAlumnos.add(alumnoAMeter);

		}else {
			throw new EquipoException ("El alumno ya existe.");
		}
	}
	
	
	
	/* ---------------- Función borrarAlumno () ---------------- */
	public void borrarAlumno (Alumno alumnoABorrar) throws EquipoException {
		
		//NOTA: Para borrar un elemento de una lista, SIEMPRE USAR UN ITERATOR. 
		//Porque al no hacerlo, saltan exceptions ya que sin él, compromete la 
		//estructura de la collection por alguna razón.
		
		if (listaAlumnos.isEmpty()) {
			throw new EquipoException ("No hay alumnos en la lista, por lo que no se puede borrar nada.");
		
		}else if (perteneceAEquipo(alumnoABorrar) == null) {
			throw new EquipoException ("No existe el alumno en la lista.");

		}else {		
			
			Iterator<Alumno> it = listaAlumnos.iterator();
			
			
			while (it.hasNext()) {
				
				Alumno alumno = (Alumno) it.next();
				
				if (alumno.equals(alumnoABorrar)) {
					it.remove();
				}
			}
		}
	}
	
	
	
	/* -------------- Función perteneceAEquipo () -------------- */
	//INTENTÉ HACER UN ELVIS USANDO .CONTAINS(), PERO NO FUNCIONABA Y SIEMPRE ME DABA NULL.
	public Alumno perteneceAEquipo (Alumno alumno2) {
		
		Alumno resultado = null;
		
		
		for (Alumno alumno : listaAlumnos) {
			
			if (alumno != null) {
				
				if (alumno.equals(alumno2)) {
					resultado = alumno2;
				}
			}
		}
		
		
		return (resultado);
	}

	
	
	/* ------------ Función mostrarListaAlumnos () ------------- */
	public String mostrarListaAlumnos () {
		
		StringBuilder sb = new StringBuilder();
		
		
		if (listaAlumnos.isEmpty()) {
			sb.append("No hay ningún alumno en la lista.");
			
		}else {
			
			for (Alumno alumno : listaAlumnos) {
				
				if (alumno != null) {
					sb.append("\n" + alumno.toString() + "\n" + SEPARADOR);
				}
			}
		}
		
		
		return (sb.toString());
	}
	
	
	
	/* ---------------- Función unionEquipos () ---------------- */
	public Equipo unionEquipos (Equipo equipoAUnir) {
		
		Equipo equipoUnion = null;
		Set<Alumno> unionAlumnos = new HashSet<>(this.listaAlumnos);
		
		
		try {
			equipoUnion = new Equipo(this.getNombreEquipo() + " + " + equipoAUnir.getNombreEquipo());
			
		} catch (EquipoException e) {
			System.out.println(e);
		}
				
		
		for (Alumno alumno : equipoAUnir.getListaAlumnos()) {
			
			if (perteneceAEquipo(alumno) == null) {
				unionAlumnos.add(alumno);
			}				
		}
		
	
		equipoUnion.listaAlumnos = unionAlumnos;
		
		
		return (equipoUnion);
	}


	
	/* ------------- Función interseccionEquipos () ------------ */
	public Equipo interseccionEquipos (Equipo equipoInterseccion) {
		
		Equipo interEquipos = null;
		Set<Alumno> interAlumnos = new HashSet<>();
		
		
		try {
			interEquipos = new Equipo(this.getNombreEquipo() + " + " + ((Equipo) equipoInterseccion).getNombreEquipo());
		
		} catch (EquipoException e) {
			e.printStackTrace();
		}
		
		
		for (Alumno thisAlumno : listaAlumnos) {
			
			for (Alumno otroAlumno : equipoInterseccion.getListaAlumnos()) {
				
				if (thisAlumno.equals(otroAlumno)) {
					interAlumnos.add((Alumno) thisAlumno);
				}
			}
		}
		
		
		interEquipos.listaAlumnos = interAlumnos;
		
		
		return (interEquipos);
	}


	
	/* ==================== GETTERS/SETTERS ==================== */
	public String getNombreEquipo() {
		return nombreEquipo;
	}


	public Set<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}
		
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "- Nombre del equipo: " + nombreEquipo + "\n"
					+ "- Alumnos que figuran en el equipo: " + "\n"
					+ mostrarListaAlumnos();
	}
	
}
