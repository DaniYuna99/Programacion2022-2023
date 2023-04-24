package ej3_ej2Generico;

public class Alumno {

	/* ======================= ATRIBUTOS ======================= */
	private String nombre;
	private String dni;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final int LONGITUD_DNI = 9;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Alumno (String nombre, String dni) throws Exception {
		
		if ((nombre != null) && (!nombre.trim().isBlank())
				&& ((dni != null) && (!dni.trim().isBlank())
				&& (dni.length() == LONGITUD_DNI) 
				&& (Character.isAlphabetic(dni.charAt(8))))) {
			
			this.nombre = nombre;
			this.dni = dni;
		
		}else {
			throw new Exception ("Algún campo no es válido.");
		}
	}



	/* ==================== GETTERS/SETTERS ==================== */
	public String getNombre() {
		return nombre;
	}
	
	
	public String getDni() {
		return dni;
	}
	
	
			
	/* ======================= EQUALS() ======================== */
	@Override 
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		if ((sonIguales == false) && (obj instanceof Alumno) && (obj != null)) {
			Alumno otro = (Alumno) obj;
			
			if ((this.getDni().equals(otro.getDni()))) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "Nombre de alumno: " + nombre + "\n"
				+ "DNI: " + dni;
	}

}
