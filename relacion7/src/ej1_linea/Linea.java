package ej1_linea;

public class Linea {

	/* ======================= ATRIBUTOS ======================= */
	private Punto puntoA;
	private Punto puntoB;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Linea() {
		this.puntoA = new Punto(0,0);
		this.puntoB = new Punto(0,0);
	}
	
	
	public Linea(Punto puntoA, Punto puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}

	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ============ Función moverDerecha () ============= */
	public void moverDerecha(double movimiento) {
		this.puntoA.setCoordX(puntoA.getCoordX() + movimiento);
		this.puntoB.setCoordX(puntoB.getCoordX() + movimiento);
	}
	
	
	/* =========== Función moverIzquierda () ============ */
	public void moverIzquierda(double movimiento) {
		moverDerecha(-movimiento);
	}
	
	
	/* ============= Función moverArriba () ============= */
	public void moverArriba(double movimiento) {
		this.puntoA.setCoordY(puntoA.getCoordY() + movimiento);
		this.puntoB.setCoordY(puntoB.getCoordY() + movimiento);
	}
	
	
	/* ============= Función moverAbajo () ============== */
	public void moverAbajo(double movimiento) {
		moverArriba(-movimiento);
	}
	
	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public Punto getPuntoA() {
		return puntoA;
	}


	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}


	public Punto getPuntoB() {
		return puntoB;
	}


	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "[" + puntoA + ", " + puntoB + "]";
	}
	
	
	
	/* ======================== EQUALS() ======================= */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		if ((sonIguales == false) && (obj != null) && (this != null)
				&& (obj instanceof Linea)) {
			
			Linea otro = (Linea) obj;
			
			if ((this.puntoA.equals(otro.puntoA)) 
				&& (this.puntoB.equals(otro.puntoB))) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}

}
