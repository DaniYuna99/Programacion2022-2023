package ej6_diccionario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Diccionario {

	/* ======================= ATRIBUTOS ======================= */
	private Map<String, HashSet<String>> diccionario;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Diccionario () {
		this.diccionario = new HashMap<String, HashSet<String>>();
	}

	
	
	/* ======================== MÉTODOS ======================== */
	
	/* -------------- Función addPalabra () -------------- */
	public void addPalabra (String palabraAIntroducir, String definicion) {
		
		if (!diccionario.containsKey(palabraAIntroducir)) {
			HashSet<String> definiciones = new HashSet<>();
			definiciones.add(definicion);
			diccionario.put(palabraAIntroducir, definiciones);
		
		}else {
			HashSet<String> definiciones = diccionario.get(palabraAIntroducir);
			definiciones.add(definicion);
		}
	}
	
	
	/* ------------- Función buscarPalabra () ------------ */
	public String buscarPalabra (String palabraABuscar) {
		
		StringBuilder sb = new StringBuilder("No existe la palabra '" + palabraABuscar + "' en el diccionario.");
		
		
		if (palabraABuscar.trim().isBlank()) {
			
			sb.delete(0, sb.toString().length());
			sb.append("No se ha introducido una palabra, por lo que no se puede buscar.");
			
		}else if (diccionario.containsKey(palabraABuscar)) {
			
			sb.delete(0, sb.toString().length());
			sb.append("La palabra '" + palabraABuscar + "' tiene " 
					 + diccionario.get(palabraABuscar).size() + " definición(es): " + "\n");
			
			
			for (String definicion : diccionario.get(palabraABuscar)) {
				sb.append("- " + definicion.toString() + "\n");
			}
		}
		
		
		return (sb.toString());
	}

	
	
	/* ------------- Función borrarPalabra () ------------ */
	public boolean borrarPalabra (String palabraABorrar) {
		
		boolean isDeleted = false;
		
		if (diccionario.containsKey(palabraABorrar)) {
			diccionario.remove(palabraABorrar);
			isDeleted = true;
		}
		
		
		return (isDeleted);
	}

	
	
	/* ------------ Función listarPalabras () ------------ */
	public String listarPalabras (String prefijo) {
		
		StringBuilder sb = new StringBuilder("Las palabras que empiezan por '" + prefijo + "' son:\n");
		boolean encontrado = false;
		
		
		if ((prefijo.trim().isBlank())) {
			sb.delete(0, sb.toString().length());
			sb.append("No has escrito nada, por lo que no puedo buscar.");
		
		}else {
			
			for (String key : diccionario.keySet()) {
				
				if (key.startsWith(prefijo)) {
					sb.append("- " + key + "\n");
					encontrado = true;
				}
			}
			
			
			if ((encontrado == false)) {
				sb.delete(0, sb.toString().length());
				sb.append("No existe ninguna palabra que empiece por '" + prefijo + "' en el diccionario.");
			}
		}
		
		
		return (sb.toString());
	}

	

	/* ==================== GETTERS/SETTERS ==================== */
	public Map<String, HashSet<String>> getDiccionario() {
		return diccionario;
	}
	
}
