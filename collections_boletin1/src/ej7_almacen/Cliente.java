package ej7_almacen;

public class Cliente {

	/* ======================= ATRIBUTOS ======================= */
	private int numCliente;
	
	
	/* /\/\/\/\ ESTÁTICOS /\/\/\/\ */
	private static int NUM_CLIENTE_SIGUIENTE = 1;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Cliente () {
		this.numCliente = NUM_CLIENTE_SIGUIENTE++;
	}

	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función comoSeLlameLaFuncion () ------------ */
	
	/* =================== GETTERS / SETTERS =================== */
	public int getNumCliente() {
		return numCliente;
	}
	
	
	
	/* ======================= EQUALS() ======================== */
	
	/* ===================== HASH CODE() ======================= */

	/* ===================== COMPARE TO() ====================== */
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString () {
		return "Cliente con número " + numCliente;
	}
}
