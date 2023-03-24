package com.comparators;

import java.util.Comparator;

import com.model.Vehiculo;

public class TipoVehiculoYCombustible_Comparator implements Comparator<Vehiculo> {

	public TipoVehiculoYCombustible_Comparator() {}

	
	// Compare() con los atributos enumerados TipoVehiculo y Combustible
	// Ordena según la posición de los valores de los enumerados.
	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		
		int resultado = 0;
		
		
		if ((o1 != null) && (o2 == null)) {
			resultado = -1;
		
		}else if ((o1 == null) && (o2 != null)) {
			resultado = 1;
		
		}else if ((o1 != null) && (o2 != null)) {
			resultado = (o1.getTipoVehiculo().compareTo(o2.getTipoVehiculo()) == 0)
							? o1.getCombustible().compareTo(o2.getCombustible())
							: o1.getTipoVehiculo().compareTo(o2.getTipoVehiculo());
		}
		
		
		return (resultado);
	}

}
