package ej5_chatInstituto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensaje {

	/* ======================= ATRIBUTOS ======================= */
	private int idMensaje;
	private Persona remitente;
	private String texto;
	private LocalDateTime fechaPublicacion;
	
	
	/* /\/\/\/\ ESTÁTICOS /\/\/\/\ */
	private static int NUMERO_SIGUIENTE_MENSAJE = 1;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Mensaje (Persona remitente, String texto) throws Exception {
		
		if ((remitente != null) && (texto != null) 
				&& (!texto.trim().isBlank())) {
			
			this.idMensaje = NUMERO_SIGUIENTE_MENSAJE++;
			this.remitente = remitente;
			this.texto = texto;
			this.fechaPublicacion = LocalDateTime.now();
		
		}else {
			throw new Exception ("El mensaje tiene datos no válidos.");
		}
	}
	
	

	/* ==================== GETTERS/SETTERS ==================== */
	public int getIdMensaje() {
		return idMensaje;
	}
	
	
	public Persona getRemitente() {
		return remitente;
	}
	
	
	public String getTexto() {
		return texto;
	}
	
	
	public LocalDateTime getFechaPublicacion() {
		return fechaPublicacion;
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	public String toString() {
		
		return String.format(
				"Mensaje %s\n"
				+ "De %s\n"
				+ "Texto: '%s'\n"
				+ "Fecha y hora: %s",
				
				this.idMensaje,
				this.remitente.getNombre(),
				this.texto,
				this.fechaPublicacion.format(DateTimeFormatter.ofPattern("dd-mm-yyyy HH:MM")));
	}

}
