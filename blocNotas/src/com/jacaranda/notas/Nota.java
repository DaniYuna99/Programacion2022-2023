package com.jacaranda.notas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Nota implements Comparable<Nota>{

	/* ======================= ATRIBUTOS ======================= */
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	
	/* /\/\/\/\ ESTÁTICOS /\/\/\/\ */
	private static int codigoSiguiente = 1;
	
	

	/* ===================== CONSTRUCTORES ===================== */
	public Nota (String texto) {
		
		if ((texto != null) && (!texto.trim().isBlank())) {
			this.codigo = codigoSiguiente++;
			this.texto = texto;
			this.fechaCreacion = LocalDateTime.now();
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ---------------- Función isModificado () ---------------- */
	public boolean isModificado () {
		return (this.fechaUltimaModificacion == null);
	}
	
	
	
	/* ------------------- Función isEmpty () ------------------ */
	public boolean isEmpty () {
		return (this.texto.trim().isBlank());
	}

	
	
	/* -------------- Función isCreadoAnterior () -------------- */
	public boolean isCreadoAnterior (Nota nota) {
		
		boolean esAnterior = false;
		
		
		if (nota != null) {
			
			if (this.fechaCreacion.compareTo(nota.getFechaCreacion()) > 0) {
				esAnterior = true;
			}
		}
		
		
		return (esAnterior);
	}

	
	
	/* ------------ Función isModificadoAnterior () ------------ */
	public boolean isModificadoAnterior (Nota nota) {
		
		boolean esAnterior = false;
		
		
		if ((nota != null) && (nota.getFechaUltimaModificacion() != null)) {
			
			if (this.fechaUltimaModificacion.compareTo(nota.getFechaUltimaModificacion()) > 0) {
				esAnterior = true;
			}
		}
		
		
		return (esAnterior);
	}

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public String getTexto() {
		return texto;
	}

	
	/* ------------ Setter setTexto () ------------ */
	public void setTexto(String texto) {
		
		if ((texto != null) && (!texto.trim().isBlank())) {
			this.texto = texto;
			this.fechaUltimaModificacion = LocalDateTime.now();
		}
	}


	public int getCodigo() {
		return codigo;
	}


	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}


	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}


	
	/* ===================== COMPARE TO() ====================== */
	@Override
	public int compareTo(Nota o) {
		
		int resultado = 0;
		
		
		if (o != null) {
			
			if (this.codigo < o.codigo) {
				resultado = -1;
				
			}else if (this.codigo > o.codigo) {
				resultado = 1;
			}
		}
		
		
		return (resultado);
	}
	
	
	
	/* ======================= HASH CODE() ===================== */
	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, texto);
	}
	

	
	/* ======================== EQUALS() ======================= */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		
		if ((sonIguales == false) && (obj != null) && (obj instanceof Nota)) {
			
			Nota otro = (Nota) obj;
			
			if ((this.texto.equals(otro.getTexto()) && 
				(this.fechaCreacion.equals(otro.getFechaCreacion())))) {
				
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString () {
		
		DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
        String fechaCreacion = this.getFechaCreacion().format(formatterFecha);
        String fechaModificacion = "No se ha modificado.";
        
    
        if (this.fechaUltimaModificacion != null) {
        	fechaModificacion = this.getFechaUltimaModificacion().format(formatterFecha);
        }
        
        
		return String.format("%s con código %s.\n"
			 + "Creada el día %s\n"
			 + "Última modificación: %s\n"
			 + "Texto de la nota:\n"
			 + "'%s'",
			 
			 this.getClass().getSimpleName(),
			 this.getCodigo(),
			 fechaCreacion,
			 fechaModificacion,
			 this.getTexto());
	}
}
























