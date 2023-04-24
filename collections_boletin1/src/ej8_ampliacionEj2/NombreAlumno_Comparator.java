package ej8_ampliacionEj2;

import java.util.Comparator;

public class NombreAlumno_Comparator implements Comparator<Alumno>{

	public NombreAlumno_Comparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		int resultado = 0;
		
		
		if ((o1 != null) && (o2 == null)) {
			resultado = -1;
			
		}else if ((o1 == null) && (o2 != null)) {
			resultado = 1;
			
		}else if ((o1 != null) && (o2 != null)) {
			resultado = o1.getNombre().compareTo(o2.getNombre());
		}
		
		
		return (resultado);
	}

}
