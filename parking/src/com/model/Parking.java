package com.model;

import java.util.Arrays;

import com.comparators.FechaEntradaComparator;
import com.comparators.MarcaYModeloComparator;
import com.comparators.MatriculaComparator;
import com.comparators.TipoVehiculoYCombustible_Comparator;
import com.exceptions.VehiculoException;

public class Parking {

	/* ======================= ATRIBUTOS ======================= */
	private Vehiculo[] vehiculos;
	private int indiceVehiculos = 0;
		
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Parking () {
		this.vehiculos = new Vehiculo[50];
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función insertarVehiculo () ------------- */
	public boolean insertarVehiculo (Vehiculo vehiculo) throws VehiculoException {
		
		boolean isInserted = false;
		
		
		if ((vehiculo != null) && (indiceVehiculos < 50)) {
			vehiculos[indiceVehiculos] = vehiculo;
			indiceVehiculos++;
			isInserted = true;
		
		}else if (vehiculo == null) {
			throw new VehiculoException ("El vehículo a insertar tiene valor nulo.");
		
		}else if (indiceVehiculos >= 50) {
			throw new VehiculoException ("No hay hueco para más vehículos.");
		}
		
		
		return (isInserted);
	}
	
	
	
	/* ----------- Función ordenarPorFechaEntrada () ----------- */
	/**
	 * Método que ordena la variable "vehiculos" de esta clase según 
	 * el atributo FechaEntrada, de la fecha más reciente, a la más tardía.
	 * <br> <br>
	 * Este es el criterio de ordenación por defecto de esta clase.
	 */
	public void ordenarPorFechaEntrada () {
		Arrays.sort(vehiculos, new FechaEntradaComparator());
	}

	
	
	/* ----------- Función ordenarPorMarcaYModelo () ----------- */
	public void ordenarPorMarcaYModelo () {
		Arrays.sort(vehiculos, new MarcaYModeloComparator());
	}
	
	
	
	/* --------- Función ordenarPorTipoYCombustible () --------- */
	public void ordenarPorTipoYCombustible () {
		Arrays.sort(vehiculos, new TipoVehiculoYCombustible_Comparator());
	}
	
	
	
	/* ------------- Función ordenarPorMatricula () ------------ */
	public void ordenarPorMatricula () {
		Arrays.sort(vehiculos, new MatriculaComparator());
	}



	/* ==================== GETTERS/SETTERS ==================== */
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}
	


	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("Este parking contiene estos vehículos:\n");
		
		for (int i = 0; i < vehiculos.length; i++) {
			
			if (vehiculos[i] != null) {
				sb.append(" - " + vehiculos[i].toString() + "\n");
			}
		}
		
		
		return (sb.toString());
	}
	
}
