package main.java.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pais {
	
	/* ======================= ATRIBUTOS ======================= */
	private int idPais;
	private String nombrePais;
	private List<Ciudad> listaCiudades;
		
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Pais () {
		this.listaCiudades = new ArrayList<>();
	}
	
	
	public Pais (int idPais, String nombrePais) {
		
		if ((idPais > 0) && (nombrePais != null) 
				&& (!nombrePais.trim().isBlank())) {
			
			this.idPais = idPais;
			this.nombrePais = nombrePais;
			this.listaCiudades = new ArrayList<>();
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función mostrarCiudades () ------------ */
	public String mostrarCiudades () {
		
		StringBuilder sb = new StringBuilder();
		
		
		for (Ciudad c : listaCiudades) {
			sb.append("\n" + Ciudad.SEPARADOR + "\n" + c.toString());
		}
		
		
		return (sb.toString());
	}

	
	
	/* ---- Función ordenarCiudadesPorNumeroDirecciones () ----- */
	public void ordenarCiudadesPorNumeroDirecciones () {
		Collections.sort(this.listaCiudades, new CiudadesPorNumeroDirecciones_O_PorNombreAlfabeticamente_Comparator());
	}

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getIdPais() {
		return idPais;
	}
	
	
	public String getNombrePais() {
		return nombrePais;
	}
	
	
	public List<Ciudad> getListaCiudades() {
		return listaCiudades;
	}
	
	
	public void setListaCiudades(List<Ciudad> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	public String toString () {
		
		int numeroDirecciones = 0;
		
		for (Ciudad c : listaCiudades) {
			numeroDirecciones = c.getListaDirecciones().size();
		}
		
		
		return String.format(
				
				"\n" + "ID país: %s\n"
				+ "Nombre: %s\n"
				+ "Número de ciudades que tiene este país: %s\n"
				+ "Número de direcciones que tiene este país: %s\n\n"
				+ "Lista de ciudades:\n"
				+ "%s",
				
				this.idPais,
				this.nombrePais,
				this.getListaCiudades().size(),
				numeroDirecciones,
				mostrarCiudades());
	}

}
