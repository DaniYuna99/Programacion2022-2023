package ej3_maquinaCafe;

public class Monedero {

	/* ======================= ATRIBUTOS ======================= */
	private int DosE;
	private int UnE;
	private int CincuentaC;
	private int VeinteC;
	private int DiezC;
	private int CincoC;
	private int DosC;
	private int UnC;
	
	
	/* //////// CONSTANTES \\\\\\\\ */
	public static final double VALOR_2E = 2.00;
	public static final double VALOR_1E = 1.00;
	public static final double VALOR_50C = 0.50;
	public static final double VALOR_20C = 0.20;
	public static final double VALOR_10C = 0.10;
	public static final double VALOR_5C = 0.05;
	public static final double VALOR_2C = 0.02;
	public static final double VALOR_1C = 0.01;
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Monedero () {
		this.DosE = 10;
		this.UnE = 10;
		this.CincuentaC = 10;
		this.VeinteC = 10;
		this.DiezC = 10;
		this.CincoC = 10;
		this.DosC = 10;
		this.UnC = 10;
	}


	
	/* ======================== MÉTODOS ======================== */
	
	/* =========== Función vaciarMonedero () ============ */
	public void vaciarMonedero () {
		this.DosE = 0;
		this.UnE = 0;
		this.CincuentaC = 0;
		this.VeinteC = 0;
		this.DiezC = 0;
		this.CincoC = 0;
		this.DosC = 0;
		this.UnC = 0;
	}
	
	
	
	/* =========== Función almacenarDinero () ============ */
	public void almacenarDinero (double dineroIntroducido) {
		
		while (dineroIntroducido > 0) {
			
			if ((dineroIntroducido >= VALOR_2E) && (DosE != 0)) {
				DosE++;
				dineroIntroducido -= VALOR_2E;
				
			}else if ((dineroIntroducido < VALOR_2E) && (dineroIntroducido >= VALOR_1E) 
					&& (UnE != 0)) {
				UnE++;
				dineroIntroducido -= VALOR_1E;
				
			}else if ((dineroIntroducido < VALOR_1E) && (dineroIntroducido >= VALOR_50C) 
					&& (CincuentaC != 0)) {
				CincuentaC++;
				dineroIntroducido -= VALOR_50C;
				
			}else if ((dineroIntroducido < VALOR_50C) && (dineroIntroducido >= VALOR_20C) 
					&& (VeinteC != 0)) {
				VeinteC++;
				dineroIntroducido -= VALOR_20C;
				
			}else if ((dineroIntroducido < VALOR_20C) && (dineroIntroducido >= VALOR_10C) 
					&& (DiezC != 0)) {
				DiezC++;
				dineroIntroducido -= VALOR_10C;
				
			}else if ((dineroIntroducido < VALOR_10C) && (dineroIntroducido >= VALOR_5C) 
					&& (CincoC != 0)) {
				CincoC++;
				dineroIntroducido -= VALOR_5C;
				
			}else if ((dineroIntroducido < VALOR_5C) && (dineroIntroducido >= VALOR_2C) 
					&& (DosC != 0)) {
				DosC++;
				dineroIntroducido -= VALOR_2C;
				
			}else if ((dineroIntroducido < VALOR_2C) && (UnC != 0)) {
				UnC++;
				dineroIntroducido -= VALOR_1C;
			}
		}
	}
	
	
	/* =========== Función devolverDinero () ============ */
	public void devolverDinero (double dineroIntroducido) {
			
		while (dineroIntroducido > 0) {
			
			if ((dineroIntroducido >= VALOR_2E) && (DosE != 0)) {
				DosE--;
				dineroIntroducido -= VALOR_2E;
				
			}else if ((dineroIntroducido < VALOR_2E) && (dineroIntroducido >= VALOR_1E) 
					&& (UnE != 0)) {
				UnE--;
				dineroIntroducido -= VALOR_1E;
				
			}else if ((dineroIntroducido < VALOR_1E) && (dineroIntroducido >= VALOR_50C) 
					&& (CincuentaC != 0)) {
				CincuentaC--;
				dineroIntroducido -= VALOR_50C;
				
			}else if ((dineroIntroducido < VALOR_50C) && (dineroIntroducido >= VALOR_20C) 
					&& (VeinteC != 0)) {
				VeinteC--;
				dineroIntroducido -= VALOR_20C;
				
			}else if ((dineroIntroducido < VALOR_20C) && (dineroIntroducido >= VALOR_10C) 
					&& (DiezC != 0)) {
				DiezC--;
				dineroIntroducido -= VALOR_10C;
				
			}else if ((dineroIntroducido < VALOR_10C) && (dineroIntroducido >= VALOR_5C) 
					&& (CincoC != 0)) {
				CincoC--;
				dineroIntroducido -= VALOR_5C;
				
			}else if ((dineroIntroducido < VALOR_5C) && (dineroIntroducido >= VALOR_2C) 
					&& (DosC != 0)) {
				DosC--;
				dineroIntroducido -= VALOR_2C;
				
			}else if ((dineroIntroducido < VALOR_2C) && (UnC != 0)) {
				UnC--;
				dineroIntroducido -= VALOR_1C;
				
			}
			
			dineroIntroducido = formatearDecimales(dineroIntroducido, 2);
		}
	}
	
	
	
	/*ESTO ES UNA FUNCIÓN QUE ENCONTRÉ ONLINE PARA REDONDEAR A 2 DECIMALES EL DINERO DE DEVOLVERDINERO()*/
	
	/* =========== Función formatearDecimales () ============ */
	public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
		return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
	}
	
	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getDosE() {
		return DosE;
	}
	
	
	public void setDosE(int dosE) {
		DosE = dosE;
	}
	
	
	public int getUnE() {
		return UnE;
	}
	
	
	public void setUnE(int unE) {
		UnE = unE;
	}
	
	
	public int getCincuentaC() {
		return CincuentaC;
	}
	
	
	public void setCincuentaC(int cincuentaC) {
		CincuentaC = cincuentaC;
	}
	
	
	public int getVeinteC() {
		return VeinteC;
	}
	
	
	public void setVeinteC(int veinteC) {
		VeinteC = veinteC;
	}
	
	
	public int getDiezC() {
		return DiezC;
	}
	
	
	public void setDiezC(int diezC) {
		DiezC = diezC;
	}
	
	
	public int getCincoC() {
		return CincoC;
	}


	public void setCincoC(int cincoC) {
		CincoC = cincoC;
	}


	public int getDosC() {
		return DosC;
	}
	
	
	public void setDosC(int dosC) {
		DosC = dosC;
	}
	
	
	public int getUnC() {
		return UnC;
	}
	
	
	public void setUnC(int unC) {
		UnC = unC;
	}


	/* ====================== TOSTRING() ====================== */
	@Override
	public String toString() {
		return "El monedero tiene:\n " 
				+ "   2€ -->   " + DosE + "		1€ -->    " + UnE + "	  0.50€ --> " + CincuentaC + "\n" 
				+ "    0.20€ --> "+ VeinteC + " 	0.10€ --> " + DiezC + "	  0.05€ --> " + CincoC + "\n" 
				+ "    0.02€ --> "+ DosC + " 	0.01€ --> " + UnC;
	}
}
