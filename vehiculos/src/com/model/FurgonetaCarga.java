package com.model;

public class FurgonetaCarga extends Vehiculo {

	/* ======================= ATRIBUTOS ======================= */
	private double PMA;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private final double PRECIO_POR_PMA = 0.5;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public FurgonetaCarga (String matricula, Gama gama, double PMA) {
		
		if ((matricula != null) && (!matricula.isEmpty())
				&& (gama != null) && (PMA > 0)) {
			
			this.matricula = matricula;
			this.PMA = PMA;
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
	public double calcularPrecioAlquiler (String matricula, int diasAlquiler) {
		return (precioAlquiler + (PRECIO_POR_PMA * PMA));
	}

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public double getPMA() {
		return PMA;
	}

	public void setPMA(double pMA) {
		PMA = pMA;
	}

	
		
	/* ======================= EQUALS() ======================== */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		if ((sonIguales == false) && (obj != null) && (obj instanceof FurgonetaCarga)) {
			
			FurgonetaCarga otro = (FurgonetaCarga) obj;
			
			if (this.matricula.equals(otro.matricula)) {
				sonIguales = true;
			}
		
			
		}
		
		
		return (sonIguales);
	}

	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "Furgoneta de carga con matrícula " + matricula + " de gama " + gama 
				+ " tiene de PMA es " + PMA + "." ;
	}

}
