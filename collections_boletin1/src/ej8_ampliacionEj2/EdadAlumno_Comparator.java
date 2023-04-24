package ej8_ampliacionEj2;

import java.util.Comparator;

public class EdadAlumno_Comparator implements Comparator<Alumno> {

	public EdadAlumno_Comparator() {}

	/*  Comparator que ordena una lista de objetos Alumno 
		según el método getEdad(), que hace uso del 
		atributo de Alumno LocalDateTime "fechaNacimiento" */
	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		int resultado = 0;
		
		
		if ((o1 != null) && (o2 == null)) {
			resultado = -1;
			
		}else if ((o1 == null) && (o2 != null)) {
			resultado = 1;
			
		}else if ((o1 != null) && (o2 != null)) {
			resultado = o1.getEdad() - o2.getEdad();
		}
		
		
		return (resultado);
	}

}
