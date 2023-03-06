package ej1_linea;

public class Punto {

	/* ======================= ATRIBUTOS ======================= */
	private double coordX;
	private double coordY;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Punto () {}
	
	
	public Punto (double coordX, double coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* No hay métodos para la clase Punto */
	
	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public double getCoordX() {
		return coordX;
	}


	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}


	public double getCoordY() {
		return coordY;
	}


	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}
	
	
	
	/* ======================== EQUALS() ======================= */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		if ((sonIguales == false) && (this != null) && (obj != null)
			&& (obj instanceof Punto)) {
			Punto otro = (Punto) obj;
			
			if ((this.getCoordX() == otro.getCoordX())
				&& (this.getCoordY() == otro.getCoordY())) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	public String toString() {
		return "(" + coordX + ", " + coordY + ")";
	}


	
}
