package main.java.model;

public class Direccion {

	/* ======================= ATRIBUTOS ======================= */
	private int idDireccion;
	private String nombreDireccion;
	private String ciudad;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */	
	public Direccion (int idDireccion, String nombreDireccion, String ciudad) {
		
		if ((idDireccion > 0) && (nombreDireccion != null)
				&& (!nombreDireccion.trim().isBlank())
				&& (ciudad != null)
				&& (!ciudad.trim().isBlank())) {
			
			this.idDireccion = idDireccion;
			this.nombreDireccion = nombreDireccion;
			this.ciudad = ciudad;
		}
	}
		


	/* ==================== GETTERS/SETTERS ==================== */
	public int getIdDireccion() {
		return idDireccion;
	}
	
	
	public String getNombreDireccion() {
		return nombreDireccion;
	}
	
	
	public String getCiudad() {
		return ciudad;
	}
	
	

	/* ======================= TOSTRING() ====================== */
	public String toString () {
		
		return String.format( 
				
				"\n" + "   + ID dirección: %s\n"
				+ "   + Nombre: %s\n"
				+ "   + Ciudad: %s\n",
				
				this.idDireccion,
				this.nombreDireccion,
				this.ciudad);
	}
}
