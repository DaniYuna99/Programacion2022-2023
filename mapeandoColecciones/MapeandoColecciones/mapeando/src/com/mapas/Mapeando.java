package com.mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Mapeando {

	/* ===================== CONSTRUCTORES ===================== */
	public Mapeando () {}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ----------- Función mapearPersonasPorGenero () ---------- */
	
	/**
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public Map<Genero, Collection<Persona>> mapearPersonasPorGenero (Collection<Persona> personas) {
		
		Map<Genero, Collection<Persona>> mapa = new HashMap<>();
		
		
		for (Persona p : personas ) {
			
			if (!mapa.containsKey(p.getGenero())) {
				mapa.put(p.getGenero(), new HashSet<>());
				
			}else {
				mapa.get(p.getGenero()).add(p);
			}
		}

		
		return (mapa);
	}
	
	
	
	/* ----------------- Función contarNumeros () -------------- */

	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		
		Map<Integer, Integer> mapa = new HashMap<>();
		
		
		for (Integer numero : numeros) {
		
			if (!mapa.containsKey(numero)) {
				mapa.put(numero, 1);
				
			}else {
				mapa.put(numero, mapa.get(numero) + 1);
			}
		}
		
		
		return (mapa);
	}
	
	
	
	/* ----------- Función generarNumerosAleatorios () ---------- */

	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size) {
		
		List<Integer> numeros = new ArrayList<>() {{
			
			for(int i=0; i<size; i++) {
				add(new Random().nextInt(0, 20));
			}
		}};
		
		
		return (numeros);
	}
}
