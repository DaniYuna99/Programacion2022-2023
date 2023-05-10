package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {

	/* ======================= ATRIBUTOS ======================= */
	private int idCiudad;
	private String nombreCiudad;
	private int idPais;
	private List<Direccion> listaDirecciones;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final String SEPARADOR = "-----------------------";
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Ciudad (int idCiudad, String nombreCiudad, int idPais) {
		
		if ((idCiudad > 0) && (nombreCiudad != null) 
				&& (!nombreCiudad.trim().isBlank())
				&& (idPais > 0)) {
			
			this.idCiudad = idCiudad;
			this.nombreCiudad = nombreCiudad;
			this.idPais = idPais;
			this.listaDirecciones = new ArrayList<>();
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función mostrarDirecciones () ------------ */
	public String mostrarDirecciones () {
		
		StringBuilder sb = new StringBuilder();
		
		for (Direccion d : listaDirecciones) {
			sb.append(d.toString());
		}
		
		
		return (sb.toString());
	}

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getIdCiudad() {
		return idCiudad;
	}
	
	
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	
	
	public int getIdPais() {
		return idPais;
	}
	
	
	public List<Direccion> getListaDirecciones() {
		return listaDirecciones;
	}
	
	
	public void setListaDirecciones(List<Direccion> listaDirecciones) {
		this.listaDirecciones = listaDirecciones;
	}
	
	
	
	/* ======================= EQUALS() ======================== */
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		if ((sonIguales == false) && (obj != null) && (obj instanceof Ciudad)) {
			
			Ciudad otro = (Ciudad) obj;
			
			if ((this.idCiudad == otro.idCiudad) && (this.nombreCiudad.equals(otro.nombreCiudad))) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	public String toString () {
		
		String direcciones = (this.listaDirecciones.size() != 0) 
							? mostrarDirecciones()
							: "\n" + "    No tiene direcciones." + "\n";
		
		return String.format(
				
				"\n" + " - ID ciudad: %s\n"
				+ " - Nombre: %s\n"
				+ " - ID del país al que pertenece: %s\n"
				+ " - Número de direcciones que tiene la ciudad: %s\n\n"
				+ " - Lista de direcciones:\n"
				+ "%s",
				
				this.idCiudad,
				this.nombreCiudad,
				this.idPais,
				this.getListaDirecciones().size(),
				direcciones);
	}
}
