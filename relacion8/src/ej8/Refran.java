package ej8;

public class Refran {
	
	/* ======================= ATRIBUTOS ======================= */
	private String texto;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Refran (String texto) {
		this.texto = texto;
	}
	

	
	/* ==================== GETTERS/SETTERS ==================== */
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "'" + this.texto + "'";
	}
	
}
