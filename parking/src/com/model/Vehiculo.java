package com.model;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.enumerados.Combustible;
import com.enumerados.TipoVehiculo;
import com.exceptions.VehiculoException;


public class Vehiculo implements Comparable<Vehiculo>{

	/* ======================= ATRIBUTOS ======================= */
	private String marca;
	private String modelo;
	private String matricula;
	private Combustible combustible;
	private LocalDateTime fechaEntrada;
	private TipoVehiculo tipoVehiculo;
		
	
	
	/* ===================== CONSTRUCTORES ===================== */
	
	//Constructor 1 simple
	public Vehiculo () {}
	
	
	//Constructor 2 con todos los campos, y control con excepciones
	public Vehiculo (String marca, String modelo, String matricula, 
			Combustible combustible, LocalDateTime fechaEntrada, 
			TipoVehiculo tipoVehiculo) throws VehiculoException {
		
		if ((marca != null) && (!marca.isEmpty() && (modelo != null) && (!modelo.isEmpty())
				&& (matricula != null) && (!matricula.isEmpty()) && (matricula.length() <= 8)
				&& (combustible != null) && (fechaEntrada != null) && (tipoVehiculo != null))) {
			
			this.marca = marca;
			this.modelo = modelo;
			this.matricula = matricula;
			this.combustible = combustible;
			this.fechaEntrada = fechaEntrada;
			this.tipoVehiculo = tipoVehiculo;
			
		}else if (matricula.length() > 8) {
			throw new VehiculoException("La matrícula tiene una longitud superior a 8.");
		
		}else {
			throw new VehiculoException("Algún campo está vacío, o es nulo.");
		}
	}
	
	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public String getMatricula() {
		return matricula;
	}


	public Combustible getCombustible() {
		return combustible;
	}


	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}


	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	
	
	
	/* ==================== COMPARE TO() ======================= */
	/**
	 * Este compareTo() ordena según la fecha de entrada de un Vehículo.
	 * ¿Pero parece que no controla nulos? Por lo que uso mejor una clase Comparator.
	 */
	@Override
	public int compareTo(Vehiculo o) {
		
		int resultado = 0;
		
		
		if (this != null && o != null) {
			resultado = this.fechaEntrada.compareTo(o.fechaEntrada);
		}
		
		
		return (resultado);
	}


		
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = fechaEntrada.format(formatter);
        
		return tipoVehiculo + " " + marca + " " + modelo + ", su matricula es " + matricula + ", usa de combustible "
				+ combustible + ", y su fecha de entrada fue " + formatDateTime + ".";
	}
	
}
















