package com.model;

public class Coche extends Vehiculo {

	/* ======================= ATRIBUTOS ======================= */
	private Combustible combustible;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private final double PRECIO_POR_DIA_GASOLINA = 3.5;
	private final double PRECIO_POR_DIA_DIESEL = 2;

	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Coche (String matricula, Gama gama, Combustible combustible) {
		
		if ((matricula != null) && (!matricula.isEmpty())
				&& (gama != null) && (combustible != null)) {
			
			this.matricula = matricula;
			this.combustible = combustible;
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
	
	/* ----------- Función calcularPrecioAlquiler () ----------- */
	@Override
	public double calcularPrecioAlquiler (String matricula, int diasAlquiler) {
		
		double precioAlquilerFinal = -1;
		
		
		if (combustible.equals(Combustible.GASOLINA)) {
			precioAlquilerFinal = precioAlquiler + (PRECIO_POR_DIA_GASOLINA * diasAlquiler);
		
		}else if (combustible.equals(Combustible.DIESEL)) {
			precioAlquilerFinal = precioAlquiler + (PRECIO_POR_DIA_DIESEL * diasAlquiler);
		}
		
		
		return (precioAlquilerFinal);
	}

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public Combustible getCombustible() {
		return combustible;
	}

	
	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	
		
	/* ======================= EQUALS() ======================== */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj); 
		
		
		if ((sonIguales == false) && (obj != null) && (obj instanceof Coche)) {
			
			Coche otro = (Coche) obj;
			
			if (this.matricula.equals(otro.matricula)) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "Coche con matrícula " + matricula + " de gama " + gama 
				+ " usa de combustible " + combustible + "." ;
	}

}
