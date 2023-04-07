package com.jacaranda.bloc;

import java.util.Arrays;
import java.util.Objects;

import com.jacaranda.notas.Nota;
import com.jacaranda.notas.NotaAlarma;

public class Bloc {

	/* ======================= ATRIBUTOS ======================= */
	private int numNotas;	
	private String nombre;
	private Nota[] notas;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final int NUMERO_NOTAS_MAXIMA = 20;

	

	/* ===================== CONSTRUCTORES ===================== */
	public Bloc (String nombre) throws BlocException {
		
		if ((nombre != null) && (!nombre.trim().isBlank())) {
			this.nombre = nombre;
			this.notas = new Nota[NUMERO_NOTAS_MAXIMA];
			
		}else if (nombre == null) {
			throw new BlocException ("El nombre del bloc tiene valor nulo."); 
		
		}else if (nombre.trim().isBlank()) {
			throw new BlocException ("El nombre del bloc está vacío."); 
		}
	}

	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función getNota () ------------ */
	public String getNota (int codigoNota) {
		
		StringBuilder sb = new StringBuilder("No se ha encontrado una nota con ese código.");
		
		
		for (int i = 0; i < notas.length; i++) {
			
			if (notas[i] != null) {
				
				if (notas[i].getCodigo() == codigoNota) {
					sb.delete(0, sb.toString().length() - 1);
					sb.append(notas[i].toString());
				}
			}
		}
		
		
		return (sb.toString());
	}
	
	
	
	/* ------------ Función updateNota () ------------ */
	public void updateNota (int codigoNota, String textoNuevo) throws BlocException {
		
		boolean isUpdated = false;
		
		
		for (int i = 0; i < notas.length; i++) {
			
			if (notas[i] != null) {
				
				if (notas[i].getCodigo() == codigoNota) {
					notas[i].setTexto(textoNuevo);
					isUpdated = true;
				}
			}
		}
		
		
		if (isUpdated == false) {
			throw new BlocException ("No se ha encontrado una nota con ese código.");
		}
	}

	
	
	/* ------------ Función activar () ------------ */
	public void activar (int codigoNota) throws BlocException {
		
		boolean isActivated = false;
		
		
		for (int i = 0; i < notas.length; i++) {
			
			if (notas[i] != null) {
				
				if ((notas[i].getCodigo() == codigoNota) 
						&& (notas[i].getClass().getSimpleName().equalsIgnoreCase("NOTAALARMA"))) {
					
					((NotaAlarma) notas[i]).activar();;	
					isActivated = true;
				}
			}
		}
		
		
		if (isActivated == false) {
			throw new BlocException ("No se ha encontrado una nota con ese código.");
		}
	}

	
	
	/* ------------ Función desactivar () ------------ */
	public void desactivar (int codigoNota) throws BlocException {
		
		boolean isDeactivated = false;
		
		
		for (int i = 0; i < notas.length; i++) {
			
			if (notas[i] != null) {
				
				if ((notas[i].getCodigo() == codigoNota) 
						&& (notas[i].getClass().getSimpleName().equalsIgnoreCase("NOTAALARMA"))) {
					
					((NotaAlarma) notas[i]).desactivar();;	
					isDeactivated = true;
				}
			}
		}
		
		
		if (isDeactivated == false) {
			throw new BlocException ("No se ha encontrado una nota con ese código.");
		}
	}

	
	
	/* ------------ Función ordenarBloc () ------------ */
	public String ordenarBloc () {
		
		Arrays.sort(notas, new CodigoComparator());
		
		
		return (mostrarTodasLasNotas());
	}
	
	
	
	/*AÑADIDO PORQUE NO HABIA UNO EN EL UML*/
	
	/* ------------ Función anadirNota () ------------ */
	public boolean anadirNota (Nota notaAMeter) {
		
		boolean isAdded = false;
		
		
		if (numNotas < NUMERO_NOTAS_MAXIMA) {
			
			for (int i = 0; i < notas.length; i++) {
				
				if ((notas[i] == null) && (isAdded == false)) {
					notas[i] = notaAMeter;
					numNotas++;
					isAdded = true;
				}
			}	
		}
		
		
		return (isAdded);
	}
	
	
	
	/*AÑADIDO PORQUE NO HABIA UNO EN EL UML*/
	
	/* ------------ Función borrarNota () ------------ */
	public boolean borrarNota (int codigoNota) {
		
		boolean isDeleted = false;
		
		
		for (int i = 0; i < notas.length; i++) {
			
			if (notas[i] != null) {
				
				if (notas[i].getCodigo() == codigoNota) {
					
					notas[i] = null;
					Arrays.sort(notas, new CodigoComparator());
					isDeleted = false;
					numNotas--;
				}
			}
		}
		
		
		
		return (isDeleted);
	}

	
	
	/* ------------ Función mostrarTodasLasNotas () ------------ */
	public String mostrarTodasLasNotas () {
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < notas.length; i++) {
			
			if (notas[i] != null) {
				sb.append(notas[i].toString() + "\n" + "---------------------" + "\n");
			}
		}
		
		
		return (sb.toString());
	}
	


	/* ==================== GETTERS/SETTERS ==================== */
	public String getNombre() {
		return nombre;
	}


	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}
	
	
		
	/* ======================= HASH CODE() ===================== */
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	
	

	/* ======================== EQUALS() ======================= */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		
		if ((sonIguales == false) && (obj instanceof Bloc) && (obj != null)) {
			
			Bloc otro = (Bloc) obj;
			
			if (this.getNombre().equals(otro.getNombre())) {
				sonIguales = true;
			}
		}

		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString () {
		return "Bloc con nombre " + this.nombre + " tiene las siguientes notas:\n" 
				+ "---------------------\n" + mostrarTodasLasNotas();
	}

}

























