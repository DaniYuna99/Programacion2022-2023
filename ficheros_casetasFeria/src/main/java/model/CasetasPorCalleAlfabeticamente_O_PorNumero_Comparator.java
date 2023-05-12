package main.java.model;

import java.util.Comparator;

public class CasetasPorCalleAlfabeticamente_O_PorNumero_Comparator implements Comparator<CasetaFeria> {

	public CasetasPorCalleAlfabeticamente_O_PorNumero_Comparator() {}

	//Este Comparator ordena según el atributo int "numero" una lista de CasetaFeria
	@Override
	public int compare(CasetaFeria o1, CasetaFeria o2) {
		
		int resultado = 0;
		
		if ((o1 != null) && (o2 == null)) {
			resultado = -1;
			
		}else if ((o1 == null) && (o2 != null)) {
			resultado = 1;
			
		}else if ((o1 != null) && (o2 != null)) {
			
			resultado = (o1.getCalle().equals(o2.getCalle())
						? (o1.getNumero() - o2.getNumero())
						: o1.getCalle().compareTo(o2.getCalle()));
		}
		
		
		return (resultado);
	}

}
