package ej5_chatInstituto;

import java.util.Comparator;

public class RemitenteAlfabetico_Comparator implements Comparator<Mensaje> {

	public RemitenteAlfabetico_Comparator() {}

	
	@Override
	public int compare(Mensaje o1, Mensaje o2) {
		
		int resultado = 0;
		
		
		if ((o1 != null) && (o2 == null)) {
			resultado = -1;
		
		}else if ((o1 == null) && (o2 != null)) {
			resultado = 1;
		
		}else if (((o1 != null) && (o2 != null))) {
			resultado = (o1.getRemitente().getNombre().compareTo(o2.getRemitente().getNombre()));
		}
		
		
		return (resultado);
	}




}
