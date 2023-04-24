package ej4_historialNavegacion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Historial {
	
	/* ======================= ATRIBUTOS ======================= */
	private ArrayList<PaginaWeb> historial;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final String SEPARADOR = "----------------------------";
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Historial () {
		this.historial = new ArrayList<>();
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* --------- Función mostrarHistorialCompleto () --------- */
	public String mostrarHistorialCompleto() {
		
		StringBuilder sb = new StringBuilder();
		
		
		if (historial.isEmpty()) {
			sb.append("No hay registro de ninguna página.");
		
		}else {
			
			sb.append("Las páginas visitadas fueron:\n\n" + SEPARADOR);
		
			
			for (PaginaWeb pagina : historial) {
				
				if (pagina != null) {
					sb.append("\n" + pagina.toString() + "\n" + SEPARADOR);
				}
			}
		}
		
		
		return (sb.toString());
	}

	
	
	/* --------- Función consultarHistorialDia () --------- */
	public String consultarHistorialDia (LocalDateTime fecha) {
		
		StringBuilder sb = new StringBuilder();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fechaString = formatter.format(fecha);
		
		
		if (historial.isEmpty()) {
			sb.append("No hay registro de ninguna página.");
			
		}else {
			
			sb.append("Las páginas visitadas en el día " + fechaString + " fueron:\n\n" + SEPARADOR);
		
			
			for (PaginaWeb pagina : historial) {
				
				if ((pagina != null) && (pagina.getFechaHora().toLocalDate().equals(fecha.toLocalDate()))) {
					sb.append("\n" + pagina.toString() + "\n" + SEPARADOR);
				}
			}
		}
		
		
		return (sb.toString());
	}

	
	
	/* --------- Función addPaginaWeb () --------- */
	public boolean addPaginaWeb (PaginaWeb paginaAMeter) {
		
		boolean isAdded = false;
		
		
		if ((paginaAMeter != null) && (paginaAMeter.getFechaHora().compareTo(LocalDateTime.now()) == -1)) {
			historial.add(paginaAMeter);
			isAdded = true;
		}
		
		
		return (isAdded);
	}

	
	
	/* --------- Función borrarHistorial () --------- */
	public void borrarHistorial () {
		historial.clear();
	}

	
	
	/* --------- Función borrarPagina () --------- */
	public boolean borrarPagina (PaginaWeb paginaABorrar) {
		
		Iterator<PaginaWeb> it = historial.iterator();
		boolean isDeleted = false;
		
		
		while (it.hasNext()) {
			
			PaginaWeb pagina = it.next();
			
			if (pagina.equals(paginaABorrar)) {
				it.remove();
				isDeleted = true;
			}
		}
		
		
		return (isDeleted);
	}

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public ArrayList<PaginaWeb> getHistorial() {
		return historial;
	}

	
		
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString () {
		return mostrarHistorialCompleto();
	}


}
