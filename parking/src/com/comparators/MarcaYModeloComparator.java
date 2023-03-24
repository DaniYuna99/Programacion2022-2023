package com.comparators;

import java.util.Comparator;

import com.model.Vehiculo;

public class MarcaYModeloComparator implements Comparator<Vehiculo> {

	public MarcaYModeloComparator() {}

	
	//Compare() de los atributos Marca y Modelo
	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		
		int resultado = 0;
		
		
		if ((o1 != null) && (o2 == null)) {
			resultado = -1;
			
		}else if ((o1 == null) && (o2 != null)) {
			resultado = 1;
			
		}else if ((o1 != null) && (o2 != null)) {
			resultado = (o1.getMarca().compareTo(o2.getMarca()) == 0)
							? (o1.getModelo().compareTo(o2.getModelo()))
							: (o1.getMarca().compareTo(o2.getMarca()));
		}
		
		
		return (resultado);
	}

}
