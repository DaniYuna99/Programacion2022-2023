package com.jacaranda.bloc;

import java.util.Comparator;

import com.jacaranda.notas.Nota;

public class CodigoComparator implements Comparator<Nota> {

	public CodigoComparator() {}

	
	//compare(), ordenando según el atributo int codigo
	@Override
	public int compare(Nota o1, Nota o2) {
		
		int resultado = 0;
		
		
		if ((o1 != null) && (o2 == null)) {
			resultado = -1;
		
		}else if ((o1 == null) && (o2 != null)) {
			resultado = 1;
		
		}else if ((o1 != null) && (o2 != null)) {
			resultado = o1.getCodigo() - o2.getCodigo();
		}
		
		
		return (resultado);
	}


	

}
