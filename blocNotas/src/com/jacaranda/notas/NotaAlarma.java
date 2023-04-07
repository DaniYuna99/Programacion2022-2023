package com.jacaranda.notas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NotaAlarma extends Nota implements Activable {

	/* ======================= ATRIBUTOS ======================= */
	private LocalDateTime fechaAlarma;
	private int minutosRepetir;
	private boolean activado;
	
		
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final int MINUTOS_REPETIR_POR_DEFECTO = 5;


	
	/* ===================== CONSTRUCTORES ===================== */
	
	//Constructor 1, se establece minutosRepetir al valor de la constante
	public NotaAlarma (String texto, LocalDateTime fechaAlarma) {
		
		super(texto);
		
		try {
			setFechaAlarma(fechaAlarma);
			
		}catch (NotaAlarmaException e) {
			System.out.println(e.getMessage());
		}
		
		this.minutosRepetir = MINUTOS_REPETIR_POR_DEFECTO;
		this.activado = true;
	}
	

	//Constructor 2, con atributo minutosRepetir
	public NotaAlarma (String texto, LocalDateTime fechaAlarma, int minutosRepetir) {
		
		super(texto);
		
		try {
			setFechaAlarma(fechaAlarma);
			
		}catch (NotaAlarmaException e) {
			System.out.println(e.getMessage());
		}
		
		this.minutosRepetir = minutosRepetir;
		this.activado = true;
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* -------------- Función activar () ------------- */
	@Override
	public void activar() {
		this.activado = true;
	}
	
	
	/* ------------ Función desactivar () ------------ */
	@Override
	public void desactivar() {
		this.activado = false;
	}


	
	/* ==================== GETTERS/SETTERS ==================== */
	public boolean isActivado() {
		return activado;
	}
	
	
	public static int getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	
	/* ----------- Setter setFechaAlarma () ---------- */
	public void setFechaAlarma(LocalDateTime fechaAlarma) throws NotaAlarmaException {
		
		if (fechaAlarma.isAfter(LocalDateTime.now())) {
			this.fechaAlarma = fechaAlarma;
			
		}else {
			throw new NotaAlarmaException("No se puede establecer una alarma de una fecha pasada.	");
		}
	}
	
	
		
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		
		DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaAlarma = this.getFechaCreacion().format(formatterFecha);
        
        String activada = (this.activado == true) 
        				? "Sí"
        				: "No";
        
        
		return super.toString() + "\n"
				+ "Fecha de la alarma: " + fechaAlarma + "\n"
				+ "Minutos para que se repita: " + this.minutosRepetir + "\n"
				+ "Está la alarma activada: " + activada;
	}
	
}













