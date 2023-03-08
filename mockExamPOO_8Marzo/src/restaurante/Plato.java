package restaurante;

public class Plato {

	/* ======================= ATRIBUTOS ======================= */
	private String nombre;
	private double precio;
	private static double iva = 21.0;
	private Vino vinoRecomendado;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Plato (String nombre) throws Exception {
		
		if (nombre != null) {
			this.nombre = nombre;
			
		}else {
			throw new Exception ("El campo nombre es nulo.");
		}
	}
	
	
	
	public Plato (String nombre, double precio) throws Exception {
		
		if ((nombre != null) && (precio > 0)) {
			this.nombre = nombre;
			this.precio = precio;
			
		}else if (nombre == null) {
			throw new Exception ("El campo nombre es nulo.");
			
		}else {
			throw new Exception ("El campo precio es inferior a 0.");
		}
	}

	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función getPrecioVentaPublico () ------------ */
	public double getPrecioVentaPublico() {
		return (precio * (1 + (iva / 100)));
	}
	

	/* ------------ Función incrementarPrecio () ------------ */
	public boolean incrementarPrecio (double incremento) {
		
		boolean isIncremented = false;
		
		if (incremento > 0) {
			this.precio += incremento;
			isIncremented = true;
		}
		
		
		return (isIncremented);
	}



	
	/* ==================== GETTERS/SETTERS ==================== */
	
	/* ------------ Función getPrecioBase () ------------ */
	public double getPrecioBase() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}


	/* ------------ Función getVinoRecomendado () ------------ */
	public Vino getVinoRecomendado() {
		return vinoRecomendado;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public static double getIva() {
		return iva;
	}



	public static void setIva(double iva) {
		Plato.iva = iva;
	}



	public double getPrecio() {
		return precio;
	}



	/* ----- Función setVinoRecomendado [SOBRECARGADO] () ----- */
	public void setVinoRecomendado(Vino vinoRecomendado) {
		
		if (vinoRecomendado != null) {
			this.vinoRecomendado = vinoRecomendado;
		}
	}
	
	
	public void setVinoRecomendado(String vino, double graduacion) {
		
		try {
			this.vinoRecomendado = new Vino(vino, graduacion);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	/* ======================= EQUALS() ======================== */
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
			
		if ((sonIguales == false) && (obj != null) && (obj instanceof Plato)) {
			
			Plato otro = (Plato) obj;
			
			if ((this.nombre.equals(otro.nombre)) && (this.precio == otro.precio)
					&& (this.vinoRecomendado.equals(otro.getVinoRecomendado()))) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		
		String resultado = "";
		
		
		if (vinoRecomendado == null) {
			resultado = String.format("El plato se llama %s, y su precio es de %s euros. "
						+ "Sin recomendaciones para vino.", 
							this.nombre, 
							this.precio);
			
		}else {
			resultado = "El plato se llama " + this.nombre + ", su precio sin IVA es de " 
						+ this.precio + ", y con IVA es de " + this.getPrecioVentaPublico()
						+ " euros. El vino recomendado para este plato se llama " + vinoRecomendado.getNombre() 
						+ ", y su graduación es de " + vinoRecomendado.getGraduacion() + "%."; 
		}
		
		
		return (resultado); 
	}
}
