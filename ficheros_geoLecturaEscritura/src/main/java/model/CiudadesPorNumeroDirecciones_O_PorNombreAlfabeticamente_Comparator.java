package main.java.model;

import java.util.Comparator;

public class CiudadesPorNumeroDirecciones_O_PorNombreAlfabeticamente_Comparator implements Comparator<Ciudad> {

	public CiudadesPorNumeroDirecciones_O_PorNombreAlfabeticamente_Comparator() {}

	
	@Override
	public int compare(Ciudad o1, Ciudad o2) {
		
		int resultado = 0;
		
		if ((o1 != null) && (o2 == null)) {
			resultado = -1;
		
		}else if ((o1 == null) && (o2 != null)) {
			resultado = 1;
		
		}else if ((o1 != null) && (o2 != null)) {
			
			resultado = (o1.getListaDirecciones().size() == o2.getListaDirecciones().size())
						? o1.getNombreCiudad().compareTo(o2.getNombreCiudad())
						: o2.getListaDirecciones().size() - o1.getListaDirecciones().size();
		}
		
		
		return (resultado);
	}

}
