package com.mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		//mapearPersonasPorGenero()
		System.out.println("mapearPersonasPorGenero()" + "\n" + "-------------------");
		List<Persona> lista = new ArrayList<>();
		
		lista.add(new Persona("Daniel", "Carpintero", Genero.MASCULINO));
		lista.add(new Persona("Manuel", "Carmona", Genero.MASCULINO));
		lista.add(new Persona("Víctor", "Jiménez", Genero.MASCULINO));

		lista.add(new Persona("Paula", "Delgado", Genero.FEMENINO));
		
		lista.add(new Persona("Laura", "Fernández", Genero.NEUTRO));
		lista.add(new Persona("Yulisa", "Gómez", Genero.NEUTRO));
		
		/*He quitado el DESCONOCIDO para demostrar que si alguno de los géneros no aparece, 
		no se introduce la lista vacía*/
		
		//lista.add(new Persona("Joselito", "Díaz", Genero.DESCONOCIDO));

				
		Map<Genero, Collection<Persona>> mapa = null;
		Mapeando mapeando = new Mapeando();
		
		try {
			mapa = new HashMap<>(mapeando.mapearPersonasPorGenero(lista));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(mapa.toString());
		
		
		//contarNumeros() usando generarNumerosAleatorios()
		System.out.println("\n\n" + "contarNumeros() usando generarNumerosAleatorios()" + "\n" + "-------------------");

		List<Integer> listaNumeros = new ArrayList<>(Mapeando.generarNumerosAleatorios(10));
		System.out.println(listaNumeros.toString());

		
		Map<Integer, Integer> mapaNumeros = null;
		
		try {
			mapaNumeros = new HashMap<>(mapeando.contarNumeros(listaNumeros));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(mapaNumeros.toString());

	}
	
}
