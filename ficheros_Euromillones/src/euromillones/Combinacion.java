package euromillones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Combinacion {

	/* ======================= ATRIBUTOS ======================= */
	private LocalDate fecha;
	private List<Integer> numeros;
	private List<Integer> estrellas;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final int MAXIMO_ESTRELLAS = 2;
	public static final int MAXIMO_NUMEROS = 5;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	
	//1º constructor
	public Combinacion (LocalDate fecha, int n1, int n2, int n3, 
			int n4, int n5, int e1, int e2) {
		
		this.fecha = fecha;
		this.numeros = new ArrayList<>();
		
		this.numeros.add(n1);
		this.numeros.add(n2);
		this.numeros.add(n3);
		this.numeros.add(n4);
		this.numeros.add(n5);
		
		this.estrellas = new ArrayList<>();
		this.estrellas.add(e1);
		this.estrellas.add(e2);
	}
	
	
	//2º constructor
	public Combinacion (LocalDate fecha, List<Integer> numeros, List<Integer> estrellas) {
		
		this.fecha = fecha;
		this.numeros = numeros;
		this.estrellas = estrellas;
	}
	
	
	//3º constructor (genera combinaciones aleatorias)
	public Combinacion (LocalDate fecha) {
		
		this(fecha, new ArrayList<Integer>(), new ArrayList<Integer>());

		List<Integer> listaNumeros = new ArrayList<>();
		List<Integer> listaEstrellas = new ArrayList<>();
		int numAleatorio = 0;
		
		
		//Numeros
		while (listaNumeros.size() < MAXIMO_NUMEROS) {
			
			numAleatorio = new Random().nextInt(1, 50);
			
			if (!listaNumeros.contains(numAleatorio) || (listaNumeros.size() == 0)) {
				listaNumeros.add(numAleatorio);
			}
		}
		
		
		//Estrellas
		while (listaEstrellas.size() < MAXIMO_ESTRELLAS) {
			
			numAleatorio = new Random().nextInt(1, 12);
			
			if (!listaEstrellas.contains(numAleatorio) || (listaEstrellas.size() == 0)) {
				listaEstrellas.add(numAleatorio);
			}
		}
		
		
		this.numeros = listaNumeros;
		this.estrellas = listaEstrellas;
	}
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función mostrarCombinacion () ------------ */
	public String mostrarCombinacion () {
		
		StringBuilder sb = new StringBuilder("Fecha: " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		sb.append("\n" + "Números: ");
		
		for (Integer numero : numeros) {
			sb.append(numero + " ");
		}
		
		
		sb.append("\n" + "Estrellas: ");
		
		for (Integer estrella : estrellas) {
			sb.append(estrella + " ");
		}
		
		sb.append("\n");
		
		
		return (sb.toString());
	}	

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public LocalDate getFecha() {
		return fecha;
	}
	
	
	public List<Integer> getNumeros() {
		return numeros;
	}
	
	
	public List<Integer> getEstrellas() {
		return estrellas;
	}
	
	
	
	/* ===================== HASH CODE() ======================= */
	
	/* ===================== COMPARE TO() ====================== */
	
	/* ======================= EQUALS() ======================== */
	
	/* ======================= TOSTRING() ====================== */
	public String toString() {
		return mostrarCombinacion();
	}



}
