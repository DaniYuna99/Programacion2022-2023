package com.model;

public class Microbus extends Vehiculo {

	/* ======================= ATRIBUTOS ======================= */
	private int plazas;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private final int PRECIO_POR_PLAZA = 5;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Microbus (String matricula, Gama gama, int plazas) {
		
		if ((matricula != null) && (!matricula.isEmpty())
				&& (gama != null) && (plazas > 0)) {
			
			this.matricula = matricula;
			this.plazas = plazas;
			this.gama = gama;
			
			if (gama.equals(Gama.ALTA)) {
				this.precioAlquiler = PRECIO_ALQUILER_GAMA_ALTA;
				
			}else if (gama.equals(Gama.MEDIA)) {
				this.precioAlquiler = PRECIO_ALQUILER_GAMA_MEDIA;

			}else if (gama.equals(Gama.BAJA)) {
				this.precioAlquiler = PRECIO_ALQUILER_GAMA_BAJA;
			}
		}
	}

	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función calcularPrecioAlquiler () ------------ */
	@Override
	public double calcularPrecioAlquiler(String matricula, int diasAlquiler) {
		return (precioAlquiler + (plazas * PRECIO_POR_PLAZA));
	}

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	
	/* ===================== HASH CODE() ======================= */
	
	/* ======================= EQUALS() ======================== */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj); 
		
		
		if ((sonIguales == false) && (obj != null) && (obj instanceof Microbus)) {
			
			Microbus otro = (Microbus) obj;
			
			if (this.matricula.equals(otro.matricula)) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}

	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "Microbús con matrícula " + matricula + " de gama " + gama 
				+ " tiene un total de " + plazas + " plazas." ;
	}
}
