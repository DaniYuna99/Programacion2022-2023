package com.jacaranda.comparador;

import java.util.Comparator;

import com.jacaranda.publicacion.Publicacion;


public class ValoracionFechaCreacion_Comparator implements Comparator<Publicacion> {

	public ValoracionFechaCreacion_Comparator() {}

	//Metodo compare(), ordenando por los atributos Valoracion, y luego FechaCreacion
	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		
		int resultado = 0;
		
		
		if ((o1 != null) && (o2 == null)) {
			resultado = -1;
			
		}else if ((o1 == null) && (o2 != null)) {
			resultado = 1;
			
		}else if ((o1 != null) && (o2 != null)) {
			resultado = (o1.getValoracion() == o2.getValoracion() 
							? (o1.getFechaCreacion().compareTo(o2.getFechaCreacion()))
							: (o1.getValoracion() - o2.getValoracion()));
		}
		
		
		return (resultado);
	}

}
