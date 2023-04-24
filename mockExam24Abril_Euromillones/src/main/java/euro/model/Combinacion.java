package main.java.euro.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Combinacion {

	/* ======================= ATRIBUTOS ======================= */
	private Collection<Integer> numeros;
	private Collection<Integer> estrellas;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private static final int VALOR_MINIMO = 1;
	private static final int VALOR_MAXIMO_NUMEROS = 50;
	private static final int VALOR_MAXIMO_ESTRELLAS = 12;
	private static final int TOTAL_NUMEROS = 5;
	private static final int TOTAL_ESTRELLAS = 2;

	
	
	/* ===================== CONSTRUCTORES ===================== */
	
	/* ---- 1er método que tiene 7 int de parámetros de entrada ------ */
	public Combinacion (int n1, int n2, int n3, int n4, int n5, 
			int e1, int e2) throws CombinacionException {
		
		if ((n1 >= VALOR_MINIMO || n1 <= VALOR_MAXIMO_NUMEROS) 
				&& (n2 >= VALOR_MINIMO || n2 <= VALOR_MAXIMO_NUMEROS)
				&& (n3 >= VALOR_MINIMO || n3 <= VALOR_MAXIMO_NUMEROS)
				&& (n4 >= VALOR_MINIMO || n4 <= VALOR_MAXIMO_NUMEROS)
				&& (n5 >= VALOR_MINIMO || n5 <= VALOR_MAXIMO_NUMEROS)
				&& (e1 >= VALOR_MINIMO || e1 <= VALOR_MAXIMO_ESTRELLAS)
				&& (e2 >= VALOR_MINIMO || e2 <= VALOR_MAXIMO_ESTRELLAS)) {
			
			Set<Integer> numSet = new HashSet<>();
			numSet.add(n1);
			numSet.add(n2);
			numSet.add(n3);
			numSet.add(n4);
			numSet.add(n5);
			
			Set<Integer> estSet = new HashSet<>();
			estSet.add(e1);
			estSet.add(e2);

			
			/*Exception si los Set tiene un tamaño inferior al válido,
			 porque si no tienen el tamaño, es que se ha repetido un número
			 o estrella en los parámetros de entrada*/
			if (numSet.size() < TOTAL_NUMEROS) {
				throw new CombinacionException ("El valor de un número se ha repetido.");
				
			}else if (estSet.size() < TOTAL_ESTRELLAS) {
				throw new CombinacionException ("El valor de una estrella se ha repetido.");
			
			}else {
				
				this.numeros = new ArrayList<Integer>();
				
				for (Integer numero : numSet) {
					numeros.add(numero);
				}
				
				this.estrellas = new ArrayList<Integer>();
				
				for (Integer numero2 : estSet) {
					estrellas.add(numero2);
				}

			}
		
			
		}else {
			throw new CombinacionException ("Algún valor de un número o estrella es mayor o menor al válido.");
		}
	}
	
	
	
	/* ---- 2º metodo que tiene de parámetros de entrada dos arrays int ------ */
	public Combinacion (int[] numerosArray, int[] estrellasArray) throws CombinacionException {
		
		//Números: comprobación si sus valores no se han pasado de sus límites
		for (int i = 0; i < numerosArray.length; i++) {
			
			if ((numerosArray[i] < VALOR_MINIMO) 
					|| (numerosArray[i] > VALOR_MAXIMO_NUMEROS)) {
				
				throw new CombinacionException ("Un valor de un número es mayor o menor al válido."); 
			}
		}
		
		
		//Estrellas: comprobación si sus valores no se han pasado de sus límites
		for (int j = 0; j < estrellasArray.length; j++) {
			
			if ((estrellasArray[j] < VALOR_MINIMO) 
					|| (estrellasArray[j] > VALOR_MAXIMO_ESTRELLAS)) {
				
				throw new CombinacionException ("Un valor de una estrella es mayor o menor al válido."); 
			}
		}
		
		
		List<Integer> numerosList = new ArrayList<>();
		List<Integer> estrellasList = new ArrayList<>();
		
		
		//Pongo elementos a las listas
		for (int k = 0; k < numerosArray.length; k++) {
			numerosList.add(numerosArray[k]);
		}
		
		
		for (int l = 0; l < estrellasArray.length; l++) {
			estrellasList.add(estrellasArray[l]);
		}
		
		
		//Creo unos Set teniendo usando las listas
		Set<Integer> numerosSet = new HashSet<>(numerosList);
		Set<Integer> estrellasSet = new HashSet<>(estrellasList);
		
		
		/*Exception si los Set tiene un tamaño inferior al válido,
		 porque si no tienen el tamaño, es que se ha repetido un número
		 o estrella en los parámetros de entrada. 
		 Si no hay exception, se settean las listas (no los Sets, 
		 porque necesito el orden Y LO HE APRENDIDO A LAS MALAS AQUÍ)*/
		if (numerosSet.size() < TOTAL_NUMEROS) {
			throw new CombinacionException ("El valor de un número se ha repetido.");
			
		}else if (estrellasSet.size() < TOTAL_ESTRELLAS) {
			throw new CombinacionException ("El valor de una estrella se ha repetido.");
		
		}else {
			this.numeros = numerosList;
			this.estrellas = estrellasList;
		}
	}

	
	
	/* =================== GETTERS / SETTERS =================== */
	public Collection<Integer> getNumeros() {
		return numeros;
	}
	
	
	public Collection<Integer> getEstrellas() {
		return estrellas;
	}



	/* ======================= EQUALS() ======================== */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		
		if ((sonIguales == false) && (obj != null) && (obj instanceof Combinacion)) {
			
			Combinacion otro = (Combinacion) obj;
			
			List<Integer> numerosList = new ArrayList<>(this.numeros);
			List<Integer> estrellasList = new ArrayList<>(this.estrellas);
			List<Integer> otroNumerosList = new ArrayList<>(otro.getNumeros());
			List<Integer> otroEstrellasList = new ArrayList<>(otro.getEstrellas());

			
			for (int i = 0; i < numerosList.size(); i++) {
				
				if (!numerosList.get(i).equals(otroNumerosList.get(i))) {
					sonIguales = false;
					i = numerosList.size();
				
				}else {
					sonIguales = true;
				}
			}
			
			
			if (sonIguales == true) {
				
				for (int j = 0; j < estrellasList.size(); j++) {
					
					if (!estrellasList.get(j).equals(otroEstrellasList.get(j))) {
						sonIguales = false;
						j = estrellasList.size();
					
					}else {
						sonIguales = true;
					}
				}
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ===================== HASH CODE() ======================= */
	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}

	
		
	/* ======================= TOSTRING() ====================== */
	public String toString() {
		
		List<Integer> numerosList = new ArrayList<>(this.numeros);
		List<Integer> estrellasList = new ArrayList<>(this.estrellas);

		return String.format(
				"Números: %s %s %s %s %s\n"
				+ "Estrellas: %s %s",
				
				numerosList.get(0),
				numerosList.get(1),
				numerosList.get(2),
				numerosList.get(3),
				numerosList.get(4),
				estrellasList.get(0),
				estrellasList.get(1)				
		);
	}

}
