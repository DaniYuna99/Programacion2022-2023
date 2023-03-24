package com.comparators;

import java.util.Comparator;

import com.model.Vehiculo;

public class FechaEntradaComparator implements Comparator<Vehiculo> {

	public FechaEntradaComparator() {}

	
	//Compare() del atributo FechaEntrada
	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		
		int resultado = 0;
		
		
		if ((o1 == null) && (o2 != null)) {
			resultado = 1;
			
		}else if ((o1 != null) && (o2 == null)) {
			resultado = -1;
		
		}else if ((o1 != null) && (o2 != null)){
			resultado = o1.getFechaEntrada().compareTo(o2.getFechaEntrada());
		}
		
		
		return (resultado);
	}

}
