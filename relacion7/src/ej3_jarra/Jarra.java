package ej3_jarra;

public class Jarra {

	/* ======================= ATRIBUTOS ======================= */
	private int tamanoJarra;
	private int contenido;
	private static int aguaTotal = 0;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Jarra(int tamanoJarra) {
		this.tamanoJarra = tamanoJarra;
		this.contenido = 0;
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ============= Función llenarJarra () ============== */
	public void llenarJarra() {
		this.contenido = this.tamanoJarra;
		aguaTotal += tamanoJarra;
	}
	
	
	
	/* ============== Función vaciarJarra () ============== */
	public void vaciarJarra() {
		this.contenido = 0;
	}
	
	
	
	/* ============== Función volcarJarra () ============== */
	public boolean volcarJarra(Jarra jarraALaQueLeVuelcas) {
		/* - Si la jarra que vuelca + el contenido de la jarraALaQueLeVuelcas 
		 * 	 es mayor que la capacidad de la jarraALaQueLeVuelcas, 
		 * 	 this.contenido -= (jarra.capacidad - jarra.contenido)*/
		boolean seHaVolcado = true;
		
		if (jarraALaQueLeVuelcas.getContenido() == jarraALaQueLeVuelcas.getTamanoJarra()
				|| (this.contenido == 0)) {
			seHaVolcado = false;
			
		}else if (this.contenido + jarraALaQueLeVuelcas.getContenido() 
					> jarraALaQueLeVuelcas.getTamanoJarra()) {
			this.contenido -= (jarraALaQueLeVuelcas.getTamanoJarra() - jarraALaQueLeVuelcas.getContenido());
			jarraALaQueLeVuelcas.llenarJarra();
			this.setAguaTotal(aguaTotal - jarraALaQueLeVuelcas.getTamanoJarra());
			
		}else if (this.contenido + jarraALaQueLeVuelcas.getContenido() 
				    <= jarraALaQueLeVuelcas.getTamanoJarra()) {
			jarraALaQueLeVuelcas.setContenido(this.contenido + jarraALaQueLeVuelcas.getContenido());
			this.vaciarJarra();
			
		}
		
		
		return (seHaVolcado);
	}
	
	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getTamanoJarra() {
		return tamanoJarra;
	}


	public void setTamanoJarra(int capacidad) {
		this.tamanoJarra = capacidad;
	}


	public int getAguaTotal() {
		return aguaTotal;
	}


	public void setAguaTotal(int aguaTotal) {
		Jarra.aguaTotal = aguaTotal;
	}
	
	
	public int getContenido() {
		return contenido;
	}
	
	
	public void setContenido(int aguaDentro) {
		this.contenido = aguaDentro;
	}


	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "Tiene un tamaño de " + this.tamanoJarra 
				+ " litros, y su contenido actual de agua es de " 
				+ this.contenido + " litros.";
	}

}
