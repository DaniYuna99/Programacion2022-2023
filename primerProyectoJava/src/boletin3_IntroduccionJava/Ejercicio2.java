package boletin3_IntroduccionJava;

public class Ejercicio2 {

	/******************************************************************************/
	/*********************************** MAIN *************************************/
	/******************************************************************************/
	
	public static void main(String[] args) {
		
		/*2. Un número es divisible por 3 si la suma de todas sus cifras 
		 * reducidas a una cifra es igual a 0, 3, 6 ó 9. Por ejemplo, 
		 * 156 ⇒ 1 + 5 + 6 = 12 ⇒ 1 + 2 = 3 es divisible, pero 
		 * 157 ⇒ 1+ 5 + 7 = 13 ⇒ 1 + 3 = 4 no lo es. Elabora un programa 
		 * que compruebe la divisibilidad por 3 según este algoritmo. 
		 * El programa debe comprobar que el número facilitado es válido.*/
		
		System.out.println(esDivisiblePor3(156));	//true
		System.out.println(esDivisiblePor3(157));	//false
		
	}
	
	
	
	/******************************************************************************/
	/********************************* FUNCIONES **********************************/
	/******************************************************************************/
	
	/* ================== Función esDivisiblePor3 () ================== */
	public static boolean esDivisiblePor3 (int posibleNumDivisible) {
		
		boolean esDivisible = false;
		String posibleNumString = String.valueOf(posibleNumDivisible);
		int sumaDigitos = 0;
		
		
		sumaDigitos = sumarDigitosNumero(posibleNumString);
		
		posibleNumString = String.valueOf(sumaDigitos);
		
		
		while (posibleNumString.length() != 1) {
			sumaDigitos = sumarDigitosNumero(posibleNumString);
			posibleNumString = String.valueOf(sumaDigitos);
		}
		
		
		if (Integer.valueOf(posibleNumString) % 3 == 0) {
			esDivisible = true;
		}
		
		
		return (esDivisible);
		
	}

	
	
	/* ================== Función sumarDigitosNumero () ================== */
	/**
	 * Método que si le pasas por parámetro un número entero como una variable String, 
	 * te suma los dígitos del número uno a uno, y te devuelve su suma. <br> <br>
	 * 
	 * Métodos que hacen uso de esta función: <br>
	 * - esDivisiblePor3()
	 *  
	 * @param posibleNumString
	 * @return
	 */
	public static int sumarDigitosNumero(String posibleNumString) {
		
		int sumaDigitos = 0;
		int cifra;
		
		
		for (int i = 0; i <= (posibleNumString.length() - 1); i++) {
			cifra = Character.getNumericValue(posibleNumString.charAt(i));
			sumaDigitos += cifra;
		}
		
		
		return (sumaDigitos);
	}
}
