package com.model;

public abstract class Vehiculo {

	/* ======================= ATRIBUTOS ======================= */
	protected String matricula;
	protected Gama gama;
	protected double precioAlquiler;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	protected final int PRECIO_ALQUILER_GAMA_BAJA = 30;
	protected final int PRECIO_ALQUILER_GAMA_MEDIA = 40;
	protected final int PRECIO_ALQUILER_GAMA_ALTA = 50;
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función calcularPrecioAlquiler () ------------ */
	public abstract double calcularPrecioAlquiler(String matricula, int diasAlquiler);

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double getPrecioAlquiler() {
		return precioAlquiler;
	}


	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	
	
		
	/* ======================= EQUALS() ======================== */
	@Override
	public abstract boolean equals(Object obj);
	
	
}
