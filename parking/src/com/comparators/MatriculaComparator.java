package com.comparators;

import java.util.Comparator;

import com.model.Vehiculo;

public class MatriculaComparator implements Comparator<Vehiculo> {

	public MatriculaComparator() {}

	
	// Compare() con el atributo Matricula
	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		
		int resultado = 0;
		
		
		if ((o1 != null) && (o2 == null)) {
			resultado = -1;
		
		}else if ((o1 == null) && (o2 != null)) {
			resultado = 1;
			
		}else if ((o1 != null) && (o2 != null)) {
			resultado = (o1.getMatricula().compareTo(o2.getMatricula()));
		}
		
		
		return (resultado);
	}

}
