package ej1_rectangulo;

public class Rectangulo {

	/* ================== ATRIBUTOS ================== */
	private double longitud;
	private double ancho;
	
	
	
	/* ================ CONSTRUCTORES ================ */
	public Rectangulo () {
		this.longitud = 1;
		this.ancho = 1;
	}
	
	
	public Rectangulo (double longitud, double ancho) {
		setLongitud(longitud);
		setAncho(ancho);
	}


	
	/* =================== MÉTODOS =================== */
	
	/* ======= Función calcularPerimetro () ======= */
	public double calcularPerimetro () {
		
		double resultado = -1;
		
		if (getLongitud() != -1 || getAncho() != -1) {
			resultado = ((this.longitud * 2) + (this.ancho * 2));
		}
		
		
		return (resultado);
	}
	
	
	/* ========= Función calcularArea () ========== */
	public double calcularArea () {
		
		double resultado = -1;
		
		if (getLongitud() != -1 || getAncho() != -1) {
			resultado = (this.longitud * this.ancho);
		}
		
		
		return (resultado);
	}
	
	
	
	/* =============== GETTERS/SETTERS =============== */
	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(double longitud) {
		
		if (longitud > 0 && longitud < 20) {
			this.longitud = longitud;
			
		}else {
			System.out.println("La longitud no es válida.");
			this.longitud = -1;
		}
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		
		if (ancho > 0 && ancho < 20) {
			this.ancho = ancho;
			
		}else {
			System.out.println("El ancho no es válido.");
			this.ancho = -1;
		}
	}
}
