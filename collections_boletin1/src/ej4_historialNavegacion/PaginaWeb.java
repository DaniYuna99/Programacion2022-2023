package ej4_historialNavegacion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaginaWeb {
	
	/* ======================= ATRIBUTOS ======================= */
	private String url;
	private LocalDateTime fechaHora;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public PaginaWeb (String url) {
		
		if ((url != null) && (!url.trim().isBlank())) {
			this.url = url;
			this.fechaHora = LocalDateTime.now();
		}
	}
	

	
	/* ==================== GETTERS/SETTERS ==================== */
	public String getUrl() {
		return url;
	}
	
	
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
		
	
		
	/* ======================= EQUALS() ======================== */
	@Override
	public boolean equals (Object obj) {
		
		boolean sonIguales = (this == obj);
		
		
		if ((sonIguales == false) && (obj instanceof PaginaWeb) && (obj != null)) {
			
			PaginaWeb otro = (PaginaWeb) obj;
			
			
			if (this.url.equals(otro.getUrl())) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String fecha = formatter.format(fechaHora);
				
		
		return String.format(
				"Página web con URL '%s'\n"
				+ "Fecha de visita: %s",
				
				this.url,
				fecha);
	}


}
