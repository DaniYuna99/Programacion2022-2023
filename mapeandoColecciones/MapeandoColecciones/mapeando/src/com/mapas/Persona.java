package com.mapas;


public class Persona {

	/* ======================= ATRIBUTOS ======================= */
	private String nombre;
	private String apellidos;
	private Genero genero;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Persona(String nombre, String apellidos, Genero genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
	}


	
	/* ==================== GETTERS/SETTERS ==================== */
	public String getNombre() {
		return nombre;
	}
	
	
	public String getApellidos() {
		return apellidos;
	}
	
	
	public Genero getGenero() {
		return genero;
	}

	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return nombre +" "+ apellidos ;
	}

}








