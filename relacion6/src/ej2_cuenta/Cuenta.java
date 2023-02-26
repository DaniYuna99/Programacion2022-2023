package ej2_cuenta;

public class Cuenta {

	/* ======================= ATRIBUTOS ======================= */
	private double saldoTotal;
	private int numReintegros;
	private int numIngresos;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Cuenta () {
		this.saldoTotal = 0;
		this.numReintegros = 0;
		this.numIngresos = 0;
	}
	
	
	public Cuenta (double saldoTotal) {
		
		if (saldoTotal > 0) {
			this.saldoTotal = saldoTotal;
			this.numReintegros = 0;
			this.numIngresos = 0;
		}
	}
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* =========== Función hacerReintegro () ============ */
	public boolean hacerReintegro (double cantidadARetirar) {
		
		boolean seHaReintegrado = false;
		
		if ((cantidadARetirar <= getSaldoTotal()) && (cantidadARetirar > 0)) {
			setSaldoTotal(getSaldoTotal() - cantidadARetirar);
			seHaReintegrado = true;
			this.numReintegros++;
		}
		
		
		return (seHaReintegrado);
	}
	
	
	
	/* ============ Función hacerIngreso () ============= */
	public boolean hacerIngreso (double cantidadAIngresar) {
		
		boolean seHaIngresado = false;
		
		if (cantidadAIngresar > 0) {
			setSaldoTotal(getSaldoTotal() + cantidadAIngresar);
			seHaIngresado = true;
			this.numIngresos++;
		}
		
		
		return (seHaIngresado);
		
	}
	
	
	/* ============ Función consultarCuenta () ============= */
	public String consultarCuenta () {
		return "Tu cuenta posee de saldo actual " + this.saldoTotal + " euros, y se han realizado "
				+ this.numReintegros + " reintegro(s), y " + this.numIngresos + " ingreso(s).";
	}
	
	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public double getSaldoTotal() {
		return saldoTotal;
	}


	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}


	public int getNumReintegros() {
		return numReintegros;
	}


	public void setNumReintegros(int numReintegros) {
		this.numReintegros = numReintegros;
	}


	public int getNumIngresos() {
		return numIngresos;
	}


	public void setNumIngresos(int numIngresos) {
		this.numIngresos = numIngresos;
	}
}
