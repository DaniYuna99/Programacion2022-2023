package ej8_ampliacionEj2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Alumno {

	/* ======================= ATRIBUTOS ======================= */
	private String nombre;
	private String dni;
	private LocalDateTime fechaNacimiento;
	private char sexo;
	private String ciudad;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final int LONGITUD_DNI = 9;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Alumno (String nombre, String dni, 
			LocalDateTime fechaNacimiento, char sexo,
			String ciudad) throws Exception {
		
		if ((nombre != null) && (!nombre.trim().isBlank())
				&& ((dni != null) && (!dni.trim().isBlank())
				&& (dni.length() == LONGITUD_DNI) 
				&& (Character.isAlphabetic(dni.charAt(8))))
				&& (LocalDateTime.now().isAfter(fechaNacimiento))
				&& (fechaNacimiento != null) 
				&& ((sexo == 'H') || (sexo == 'M'))
				&& (ciudad != null) && (!ciudad.trim().isBlank())) {
			
			this.nombre = nombre;
			this.dni = dni;
			this.fechaNacimiento = fechaNacimiento;
			this.sexo = sexo;
			this.ciudad = ciudad;
		
		}else {
			throw new Exception ("Algún campo no es válido.");
		}
	}

	

	/* ======================== MÉTODOS ======================== */
	
	/* ------------------- Función getEdad () ------------------ */
	public int getEdad() {
		return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDateTime.now());
	}
	
	

	/* ==================== GETTERS/SETTERS ==================== */
	public String getNombre() {
		return nombre;
	}
	
	
	public String getDni() {
		return dni;
	}
	
			
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}


	public char getSexo() {
		return sexo;
	}


	public String getCiudad() {
		return ciudad;
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
		return "\n" + "-------------" + "\n" + 
				"Nombre de alumno: " + nombre + "\n"
				+ "DNI: " + dni + "\n"
				+ "Edad: " + getEdad() + "\n"
				+ "Sexo: " + getSexo() + "\n"
				+ "Ciudad: " + getCiudad();
	}

}
