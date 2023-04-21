package com.mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
	public static Map<Genero, ArrayList<Persona>> mapearPersonasPorGenero (Collection<Persona> personas) {
		
		Map<Genero, ArrayList<Persona>> mapa = new HashMap<>();
		ArrayList<Persona> personasMasculino = new ArrayList<>();
		ArrayList<Persona> personasFemenino = new ArrayList<>();
		ArrayList<Persona> personasNeutro = new ArrayList<>();
		ArrayList<Persona> personasDesconocido = new ArrayList<>();

		
		for (Persona persona : personas) {
			
			if (persona.getGenero().equals(Genero.MASCULINO)) {
				personasMasculino.add(persona);
				
			}else if (persona.getGenero().equals(Genero.FEMENINO)) {
				personasFemenino.add(persona);

			}else if (persona.getGenero().equals(Genero.NEUTRO)) {
				personasNeutro.add(persona);

			}else if (persona.getGenero().equals(Genero.DESCONOCIDO)) {
				personasDesconocido.add(persona);

			}
		}
		
		
		if (!personasMasculino.isEmpty()) {
			mapa.put(Genero.MASCULINO, personasMasculino);
		}
		
		
		if (!personasFemenino.isEmpty()) {
			mapa.put(Genero.FEMENINO, personasFemenino);
		}
		
		
		if (!personasNeutro.isEmpty()) {
			mapa.put(Genero.NEUTRO, personasNeutro);
		}
		
		
		if (!personasDesconocido.isEmpty()) {
			mapa.put(Genero.DESCONOCIDO, personasDesconocido);
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
	public static Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		
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
