package ej3_maquinaCafe;

public class MaquinaCafe {
	
	/* ======================= ATRIBUTOS ======================= */
	private int cafe;
	private int leche;
	private int vasos;
	private Monedero monedero;
	
	
	/* //////// CONSTANTES \\\\\\\\ */
	public static final double PRECIO_CAFE = 1.00;
	public static final double PRECIO_LECHE = 0.80;
	public static final double PRECIO_CAFE_CON_LECHE = 1.50;
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public MaquinaCafe () {
		this.cafe = 50;
		this.leche = 50;
		this.vasos = 80;
		this.monedero = new Monedero();
	}
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* =========== Función llenarDeposito () ============ */
	public void llenarDeposito () {
		this.cafe = 50;
		this.leche = 50;
		this.vasos = 80;
	}
	
		
	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getCafe() {
		return cafe;
	}


	public void setCafe(int cafe) {
		this.cafe = cafe;
	}


	public int getLeche() {
		return leche;
	}


	public void setLeche(int leche) {
		this.leche = leche;
	}


	public int getVasos() {
		return vasos;
	}


	public void setVasos(int vasos) {
		this.vasos = vasos;
	}


	public Monedero getMonedero() {
		return monedero;
	}


	public void setMonedero(Monedero monedero) {
		this.monedero = monedero;
	}


	@Override
	public String toString() {
		return "La máquina de café tiene " + cafe + " dosis de café, "
				+ leche + " dosis de leche, y " + vasos + " vasos.\n\n"
				+ monedero.toString();
	}
}
