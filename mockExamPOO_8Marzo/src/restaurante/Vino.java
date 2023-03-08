package restaurante;

public class Vino {
	
	/* ======================= ATRIBUTOS ======================= */
	private String nombre;
	private double graduacion;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Vino (String nombre) throws Exception {
		
		if (nombre != null) {
			this.nombre = nombre;
			
		}else {
			throw new Exception ("El campo nombre es nulo.");
		}
	}
	

	public Vino (String nombre, double graduacion) throws Exception {
		
		if (nombre != null && graduacion >= 0) {
			this.nombre = nombre;
			this.graduacion = graduacion;
			
		}else if (nombre == null) {
			throw new Exception ("El campo nombre es nulo.");
			
		}else {
			throw new Exception ("El campo graduacion es menor que 0.");
		}
	}
	

	
	/* ======================= EQUALS() ======================== */
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj); 
		
		if ((sonIguales == false) && (obj != null) 
				&& (this != null) && (obj instanceof Vino)) {
			Vino otro = (Vino) obj;
			
			if ((this.nombre.equals(otro.nombre)) && (this.graduacion == otro.graduacion)) {
				sonIguales = true;
			}
		}
		
		return (sonIguales);
	}

	
	/* ==================== GETTERS/SETTERS ==================== */
	public String getNombre() {
		return nombre;
	}


	public double getGraduacion() {
		return graduacion;
	}
	
}
