package main.java.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import main.java.xml.LectorXML;

public class RegistroCasetas {

	/* ======================= ATRIBUTOS ======================= */
	private List<CasetaFeria> listaCasetas;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final String SEPARADOR = "----------------------";
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public RegistroCasetas () {
		
		/*Este método estático de LectorXML carga directamente 
		todas las casetas que hay en el XML*/
		try {
			
			this.listaCasetas = LectorXML.cargarCasetasFeria("././files/casetasferia.xml");
			Collections.sort(this.listaCasetas, new CasetasPorCalleAlfabeticamente_O_PorNumero_Comparator());
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ---------- Función mostrarCasetasDeUnaCalle () ---------- */
	public String mostrarCasetasDeUnaCalle (String calleAMostrar) {
		
		List<CasetaFeria> listaFiltrada = new ArrayList<>();
		
		
		for (CasetaFeria cf : listaCasetas) {
			
			if (cf.getCalle().equalsIgnoreCase(calleAMostrar)) {
				listaFiltrada.add(cf);
			}
		}
		
		
		return ((listaFiltrada.size() == 0) 
				? "La calle, o no existe, o no tiene ninguna caseta."
				: mostrarListaCasetasFeria(listaFiltrada));
	}
	
	
	
	/* -------- Función mostrarCasetasClaseFamiliar () --------- */
	public String mostrarCasetasClaseFamiliar () {
		
		List<CasetaFeria> listaFiltrada = devolverListaCasetasSegunClase(Clase.FAMILIAR);
		
		
		return ((listaFiltrada.size() == 0) 
				? "No se ha encontrado ninguna caseta de clase Familiar."
				: mostrarListaCasetasFeria(listaFiltrada));
	}
	
	
	
	/* -------- Función mostrarCasetasClaseDistrito () --------- */
	public String mostrarCasetasClaseDistrito () {
		
		List<CasetaFeria> listaFiltrada = devolverListaCasetasSegunClase(Clase.DISTRITO);
		
		
		return ((listaFiltrada.size() == 0) 
				? "No se ha encontrado ninguna caseta de clase Distrito."
				: mostrarListaCasetasFeria(listaFiltrada));
	}
	
	
	
	/* Función mostrarCasetasQueNoSeanClaseFamiliarNiDistrito () */
	public String mostrarCasetasQueNoSeanClaseFamiliarNiDistrito () {
		
		List<CasetaFeria> listaFiltrada = new ArrayList<>();
		
		
		for (CasetaFeria cf : listaCasetas) {
			
			if ((!cf.getClase().equals(Clase.DISTRITO)) 
					&& (!cf.getClase().equals(Clase.FAMILIAR))) {
				listaFiltrada.add(cf);
			}
		}
		
		
		return ((listaFiltrada.size() == 0) 
				? "No se ha encontrado ninguna caseta que no sean de clase Familiar ni Distrito."
				: mostrarListaCasetasFeria(listaFiltrada));
	}
	
	
	
	/* ----- Función mostrarNumeroCasetasClaseFamiliar () ------ */
	public String mostrarNumeroCasetasClaseFamiliar () {
		
		Map<String, Integer> mapaCalles = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		//Este For se encarga de contar las casetas por calle
		for (CasetaFeria cf : listaCasetas) {
			
			if (cf.getClase().equals(Clase.FAMILIAR)
					&& (!mapaCalles.containsKey(cf.getCalle()))) {
				
				mapaCalles.put(cf.getCalle(), 1);
			
			}else if (cf.getClase().equals(Clase.FAMILIAR)
					&& (mapaCalles.containsKey(cf.getCalle()))) {
				
				mapaCalles.put(cf.getCalle(), mapaCalles.get(cf.getCalle()) + 1);
			}
		}
		
		
		//Este For le da la información al StringBuilder para devolverlo
		for (String calle : mapaCalles.keySet()) {
			sb.append(calle + ": " + mapaCalles.get(calle) + "\n");
		}
		
		
		return (sb.toString());
	}
	
	
	
	/* ----- Función mostrarNumeroCasetasClaseDistrito () ------ */
	public String mostrarNumeroCasetasClaseDistrito () {
		
		Map<String, Integer> mapaCalles = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		//Este For se encarga de contar las casetas por calle
		for (CasetaFeria cf : listaCasetas) {
			
			if (cf.getClase().equals(Clase.DISTRITO)
					&& (!mapaCalles.containsKey(cf.getCalle()))) {
				
				mapaCalles.put(cf.getCalle(), 1);
			
			}else if (cf.getClase().equals(Clase.DISTRITO)
					&& (mapaCalles.containsKey(cf.getCalle()))) {
				
				mapaCalles.put(cf.getCalle(), mapaCalles.get(cf.getCalle()) + 1);
			}
		}
		
		
		//Este For le da la información al StringBuilder para devolverlo
		for (String calle : mapaCalles.keySet()) {
			sb.append(calle + ": " + mapaCalles.get(calle) + "\n");
		}
		
		
		return (sb.toString());
	}

	
	
	/* -------------- Función eliminarCaseta () --------------- */
	public boolean eliminarCaseta (String nombreCalle, int numero) throws Exception {
		
		Iterator<CasetaFeria> it = listaCasetas.iterator();
		boolean empezarADesplazar = false;
		
		
		if (mostrarCasetasDeUnaCalle(nombreCalle).length() > 40) {
			
			while (it.hasNext()) {
				
				CasetaFeria caseta = it.next();
				
				if ((caseta.getCalle().equalsIgnoreCase(nombreCalle)) 
						&& (caseta.getNumero() == numero) 
						&& (empezarADesplazar == false)) {
					
					it.remove();
					empezarADesplazar = true;
				
				}else if (empezarADesplazar == true) {
					caseta.setNumero(caseta.getNumero() + caseta.getModulos());
				}
			}
		
		
		}else {
			throw new Exception ("La calle no existe.");
		}
		
		
		Collections.sort(this.listaCasetas, new CasetasPorCalleAlfabeticamente_O_PorNumero_Comparator());
		
		
		return (true);
	}



	/* ---------- Función mostrarListaCasetasFeria () --------- */
	/**
	 * Método que muestra el contenido de cualquier lista 
	 * que contenga objetos CasetaFeria. Se le debe de pasar 
	 * la lista de CasetaFeria por parámetro de entrada, y devolverá un
	 * String con el toString() de todos los objetos. <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTA FUNCIÓN</u>: <br> <br>
	 * - El toString() de esta misma clase (RegistroCasetas) <br>
	 * - mostrarCasetasDeUnaCalle() <br>
	 * - mostrarCasetasClaseFamiliar() <br>
	 * - mostrarCasetasClaseDistrito() <br>
	 * - mostrarCasetasQueNoSeanClaseFamiliarNiDistrito() <br>
	 * 
	 * @param listaCasetas
	 * @return
	 */
	private String mostrarListaCasetasFeria (List<CasetaFeria> listaCasetas) {
		
		StringBuilder sb = new StringBuilder();
		
		
		for (CasetaFeria cf : listaCasetas) {
			sb.append(cf.toString() + "\n\n" + SEPARADOR + "\n\n");
		}
		
		
		return (sb.toString());
	}

	
	
	/* ------- Función devolverListaCasetasSegunClase () -------- */
	/**
	 * Método intermedio producto de una factorización de los métodos 
	 * "mostrarCasetasClaseDistrito()" y "mostrarCasetasClaseFamiliar()".
	 * <br> <br>
	 * Devuelve una lista de CasetaFeria que tienen el atributo de tipo enumeración Clase 
	 * que se le pase por parámetro de entrada a la función.
	 * 
	 * 
	 * @param claseABuscar
	 * @return
	 */
	private List<CasetaFeria> devolverListaCasetasSegunClase (Clase claseABuscar) {
		
		List<CasetaFeria> listaFiltrada = new ArrayList<>();
		
		
		for (CasetaFeria cf : listaCasetas) {
			
			if (cf.getClase().equals(claseABuscar)) {
				listaFiltrada.add(cf);
			}
		}
		
		
		return (listaFiltrada);
	}


	
	/* ==================== GETTERS/SETTERS ==================== */
	public List<CasetaFeria> getListaCasetas() {
		return listaCasetas;
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	public String toString () {
		return (mostrarListaCasetasFeria(this.listaCasetas));
	}

}


























