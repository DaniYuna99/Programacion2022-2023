package ej4_y_5_complejo;

public class Complejo {

	/* ======================= ATRIBUTOS ======================= */
	private double parteReal;
	private double parteImaginaria;
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Complejo () {}
	
	public Complejo (double parteReal, double parteImaginaria) {
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* =========== Función sumarComplejo () ============ */
	public Complejo sumarComplejo (Complejo complejo2) {
		
		double sumaReales = this.parteReal + complejo2.getParteReal();
		double sumaImaginarios = this.parteImaginaria + complejo2.getParteImaginaria();
		
		
		return (new Complejo(sumaReales, sumaImaginarios));
	}
	
	
	/* =========== Función restarComplejo () ============ */
	public Complejo restarComplejo (Complejo complejo2) {
		
		double sumaReales = this.parteReal - complejo2.getParteReal();
		double sumaImaginarios = this.parteImaginaria - complejo2.getParteImaginaria();
		
		
		return (new Complejo(sumaReales, sumaImaginarios));
	}
	
	
	/* =========== Función toString () ============ */
	@Override
	public String toString() {
		return "Número complejo: " + parteReal + " " + parteImaginaria + "i";
	}
	
	
	/* =========== Función equals () ============ */
	public boolean equals (Object obj) {
		
		boolean sonIguales = (this == obj);
		
		
		if ((sonIguales == false) && (obj != null) && (this != null)
				&& (obj instanceof Complejo)) {
			
			Complejo otro = (Complejo) obj;
			
			if ((this.parteReal == otro.getParteReal()) 
					&& (this.parteImaginaria == otro.getParteImaginaria())) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	

	/* ==================== GETTERS/SETTERS ==================== */
	public double getParteReal() {
		return parteReal;
	}


	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}


	public double getParteImaginaria() {
		return parteImaginaria;
	}


	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
}
