package main.java.model;

public class CasetaFeria {

	/* ======================= ATRIBUTOS ======================= */
	private String titulo;
	private String calle;
	private int numero;
	private int modulos;
	private Clase clase;
	private int id;
	private int idCalle;
		
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public CasetaFeria (String titulo, String calle, int numero, 
			int modulos, Clase clase, int id, int idCalle) {
		
		if ((titulo != null) && (!titulo.trim().isBlank())
				&& (calle != null) && (!calle.trim().isBlank())
				&& (numero > 0) && (modulos > 0) && (clase != null)
				&& (id > 0) && (idCalle > 0)) {
			
			this.titulo = titulo;
			this.calle = calle;
			this.numero = numero;
			this.modulos = modulos;
			this.clase = clase;
			this.id = id;
			this.idCalle = idCalle;
		}
	} 
	
	

	/* ==================== GETTERS/SETTERS ==================== */
	public String getTitulo() {
		return titulo;
	}


	public String getCalle() {
		return calle;
	}


	public int getNumero() {
		return numero;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getModulos() {
		return modulos;
	}


	public Clase getClase() {
		return clase;
	}
	


	/* ======================= TOSTRING() ====================== */
	public String toString () {
		
		return String.format(
				
				"Titulo: %s\n"
				+ "Calle: %s\n"
				+ "Número: %s\n"
				+ "Módulos: %s\n"
				+ "Clase: %s\n"
				+ "ID: %s\n"
				+ "ID calle: %s", 
				
				this.titulo,
				this.calle,
				this.numero,
				this.modulos,
				this.clase,
				this.id,
				this.idCalle);
	}

}
