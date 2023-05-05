package euromillones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {

	/* ======================= ATRIBUTOS ======================= */
	private List<Combinacion> combinaciones;
		
	
	
	/* ===================== CONSTRUCTORES ===================== */
	
	//El constructor se encarga de insertar todos los datos del Excel en la lista "combinaciones"
	public Historial (File fileEuro) throws Exception {
		
		if (fileEuro.exists()) {
			
			this.combinaciones = new ArrayList<>();
			FileReader fr = null;
			BufferedReader br = null;
			
			try {
				
				fr = new FileReader(fileEuro);
				br = new BufferedReader(fr);
				br.readLine();
				String linea = br.readLine();
				String[] lineaArray = null;
				
				
				while (linea != null) {
					
					lineaArray = linea.split(",");
					
					LocalDate fechaArray = (lineaArray[0].length() == 10)
							? LocalDate.parse(lineaArray[0], DateTimeFormatter.ofPattern("dd/MM/yyyy"))
							: LocalDate.parse(lineaArray[0], DateTimeFormatter.ofPattern("d/MM/yyyy"));
					
					Combinacion combinacion = new Combinacion 
							(fechaArray, Integer.valueOf(lineaArray[1]), 
							Integer.valueOf(lineaArray[2]), Integer.valueOf(lineaArray[3]), Integer.valueOf(lineaArray[4]), 
							Integer.valueOf(lineaArray[5]), Integer.valueOf(lineaArray[7]), Integer.valueOf(lineaArray[8]));
					
					this.combinaciones.add(combinacion);
					linea = br.readLine();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}else {
			throw new Exception ("La ruta del archivo no existe.");
		}
	}


	
	/* ======================== MÉTODOS ======================== */
	
	/*PISTA: USAR MAPAS PARA AGRUPAR COMBINACIONES SEGÚN ALGO*/
	
	/* --------- Función obtenerNumeroMasFrecuente () ---------- */
	public int obtenerNumeroMasFrecuente () {
		
		Map<Integer, Integer> mapaNumeros = new HashMap<>();
		
		//Estos For meten los números de las combinaciones en el mapa
		for (Combinacion combinacion : combinaciones) {
			
			for (Integer numero : combinacion.getNumeros()) {
				
				if (!mapaNumeros.containsKey(numero)) {
					mapaNumeros.put(numero, 1);
				
				}else {
					mapaNumeros.put(numero, mapaNumeros.get(numero) + 1);
				}
			}
		}
		
		
		return (obtenerCosaMasFrecuente(mapaNumeros));
	}
	
	
	
	/* --------- Función obtenerEstrellaMasFrecuente () -------- */
	public int obtenerEstrellaMasFrecuente () {
		
		Map<Integer, Integer> mapaEstrellas = new HashMap<>();
		
		//Estos For meten las estrellas de las combinaciones en el mapa
		for (Combinacion combinacion : combinaciones) {
			
			for (Integer estrella : combinacion.getEstrellas()) {
				
				if (!mapaEstrellas.containsKey(estrella)) {
					mapaEstrellas.put(estrella, 1);
				
				}else {
					mapaEstrellas.put(estrella, mapaEstrellas.get(estrella) + 1);
				}
			}
		}
		
		
		return (obtenerCosaMasFrecuente(mapaEstrellas));
	}
	
	
	
	/* --------- Función obtenerCosaMasFrecuente () -------- */
	
	/**
	 * Método que usan los métodos que obtienen lo más frecuente,
	 * para extraer el número/estrella más frecuente de un mapa.
	 * 
	 * @param mapa
	 * @return
	 */
	private int obtenerCosaMasFrecuente (Map<Integer, Integer> mapa) {
		
		//Necesito algo de referencia, aunque sea falso
		int cosaMasFrecuente = 1;
		int numeroApariciones = 1;
				
				
		/*Este For encuentra el número/estrella más frecuente, comparando los 
		* números y su frecuencia con los de arriba, y se van actualizando*/
		for (Integer numero : mapa.keySet()) {
					
			if (mapa.get(numero) > numeroApariciones) {
				cosaMasFrecuente = numero;
				numeroApariciones = mapa.get(numero);
			}
		}
		
		
		return (cosaMasFrecuente);
	}

	
	
	/* --------- Función obtenerNumeroMenosFrecuente () -------- */
	public int obtenerNumeroMenosFrecuente () {
		
		Map<Integer, Integer> mapaNumeros = new HashMap<>();
		
		//Estos For meten los números de las combinaciones en el mapa
		for (Combinacion combinacion : combinaciones) {
			
			for (Integer numero : combinacion.getNumeros()) {
				
				if (!mapaNumeros.containsKey(numero)) {
					mapaNumeros.put(numero, 1);
				
				}else {
					mapaNumeros.put(numero, mapaNumeros.get(numero) + 1);
				}
			}
		}

		
		return (obtenerCosaMenosFrecuente(mapaNumeros));
	}
	
	
	
	/* -------- Función obtenerEstrellaMenosFrecuente () ------- */
	public int obtenerEstrellaMenosFrecuente () {
		
		Map<Integer, Integer> mapaEstrellas = new HashMap<>();
		
		//Estos For meten las estrellas de las combinaciones en el mapa
		for (Combinacion combinacion : combinaciones) {
			
			for (Integer estrella : combinacion.getEstrellas()) {
				
				if (!mapaEstrellas.containsKey(estrella)) {
					mapaEstrellas.put(estrella, 1);
				
				}else {
					mapaEstrellas.put(estrella, mapaEstrellas.get(estrella) + 1);
				}
			}
		}
		
		
		return (obtenerCosaMenosFrecuente(mapaEstrellas));
	}
	
	
	
	/* --------- Función obtenerCosaMenosFrecuente () -------- */
	
	/**
	 * Método que usan los métodos que obtienen lo menos frecuente, 
	 * para extraer el número/estrella menos frecuente de un mapa.
	 * 
	 * @param mapa
	 * @return
	 */
	private int obtenerCosaMenosFrecuente (Map<Integer, Integer> mapa) {
		
		//Necesito algo de referencia, aunque sea falso
		int cosaMenosFrecuente = 1;
		int numeroApariciones = 10000;
				
				
		/*Este For encuentra el número/estrella menos frecuente, comparando los 
		* números y su frecuencia con los de arriba, y se van actualizando*/
		for (Integer numero : mapa.keySet()) {
					
			if (mapa.get(numero) < numeroApariciones) {
				cosaMenosFrecuente = numero;
				numeroApariciones = mapa.get(numero);
			}
		}
		
		
		return (cosaMenosFrecuente);
	}
	
	
	
	/* ------------ Función obtenerMaximoAciertos () ----------- */
	public int obtenerMaximoAciertos (Combinacion combinacionGanadora) {
		
		int maximoAciertos = 0;
		int aciertos = 0;
		
		
		for (Combinacion combinacion : combinaciones) {
			
			aciertos = obtenerAciertos(combinacion, combinacionGanadora);
				
			if (aciertos > maximoAciertos) {
				maximoAciertos = aciertos;
			}
		}
		
		
		return (maximoAciertos);
	}
	
	
	
	/* -------------- Función obtenerAciertos () ------------- */
	
	/**
	 * Método que devuelve la cantidad de coincidencias o aciertos hay entre las dos 
	 * Combinaciones. Se usa en el método "obtenerMaximoAciertos()"
	 * 
	 * @param combinacion
	 * @param combinacionGanadora
	 * @return
	 */
	private int obtenerAciertos (Combinacion combinacion, Combinacion combinacionGanadora) {
		
		int aciertos = 0;
		
		//Numeros
		for (int i = 0; i < Combinacion.MAXIMO_NUMEROS; i++) {
			
			if (combinacion.getNumeros().get(i).equals(combinacionGanadora.getNumeros().get(i))) {
				aciertos++;
			}
		}
		
		
		//Estrellas
		for (int j = 0; j < Combinacion.MAXIMO_ESTRELLAS; j++) {
					
			if (combinacion.getEstrellas().get(j).equals(combinacionGanadora.getEstrellas().get(j))) {
				aciertos++;
			}
		}
		
		
		return (aciertos);
	}

	
	
	/* -- Función obtenerMayorSecuenciaNumerosConsecutivos () -- */
	
	/*Me he complicado mucho, pero creo que está. Lo de detectar cosas en 
	 * mitad de iteraciones como esto da mucho asco*/
	
	public int obtenerMayorSecuenciaNumerosConsecutivos () {
		
		int mayorNumConsecutivos = 0;
		int numConsecutivos = 1;
		boolean esSecuencia = true;
		
		
		for (Combinacion combinacion : combinaciones) {
			
			for (int i = 0; i < Combinacion.MAXIMO_NUMEROS; i++) {
				
				if (i + 1 < Combinacion.MAXIMO_NUMEROS) {
					
					if ((combinacion.getNumeros().get(i + 1) != combinacion.getNumeros().get(i) + 1) 
							&& (i + 1 < Combinacion.MAXIMO_NUMEROS) && (esSecuencia == true)) {
						
						esSecuencia = false;
					}
					
					
					if ((combinacion.getNumeros().get(i + 1) == combinacion.getNumeros().get(i) + 1) 
							&& (esSecuencia == false) && (numConsecutivos == 1)) {
						
						esSecuencia = true;
					}
					
					
					if ((combinacion.getNumeros().get(i + 1) == combinacion.getNumeros().get(i) + 1) 
							&& (i + 1 < Combinacion.MAXIMO_NUMEROS) && (esSecuencia == true)) {
						
						numConsecutivos++;
					}
				
					
				}else {
					
					if ((combinacion.getNumeros().get(i - 1) == combinacion.getNumeros().get(i)) 
							&& (esSecuencia == false) && (numConsecutivos == 0)) {
						
						esSecuencia = true;
					
					}else if ((combinacion.getNumeros().get(i - 1) == combinacion.getNumeros().get(i)) 
							&& (esSecuencia == true)) {
						
						numConsecutivos++;
						
					}else if ((combinacion.getNumeros().get(i - 1) != combinacion.getNumeros().get(i)) 
							&& (esSecuencia == true)) {
						
						esSecuencia = false;
					}
				}
			}
			
			
			if (numConsecutivos > mayorNumConsecutivos) {
				mayorNumConsecutivos = numConsecutivos;
			}
			
			
			numConsecutivos = 0;
		
		}
		
		
		return (mayorNumConsecutivos = (mayorNumConsecutivos == 1)
					? 0
					: mayorNumConsecutivos);
	}	



	/* ==================== GETTERS/SETTERS ==================== */
	public List<Combinacion> getCombinaciones() {
		return combinaciones;
	}
	
	
	/* ===================== HASH CODE() ======================= */
	
	/* ===================== COMPARE TO() ====================== */
	
	/* ======================= EQUALS() ======================== */
	
	/* ======================= TOSTRING() ====================== */
}
