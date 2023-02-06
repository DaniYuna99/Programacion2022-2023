package boletin1_IntroduccionJava;

import java.util.Scanner;


public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*3. Escribir un método que reciba un carácter y 
		 * devuelva el tipo de carácter que es. Debe devolver 
		 * una de los siguientes mensajes según corresponda:
			◦ Letra mayúscula
			◦ Letra minúscula
			◦ Dígito entre 0 y 9
			◦ Signo de puntuación
			◦ Espacio en blanco
			◦ Paréntesis () o llaves {}
			◦ Otro carácter*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pon un caracter, y te diré cuál es: ");
		String cadena = String.valueOf(sc.nextLine());
		
		
		if (cadena.length() != 1) {
			System.out.println("Has puesto más de un caracter; inténtalo de nuevo.");
		
		}else {
			
			char caracter = cadena.charAt(0);
			
			
			if (Character.isLowerCase(caracter)) {
				System.out.println("El caracter introducido está en minúsculas.");
				
			}else if (Character.isUpperCase(caracter)) {
				System.out.println("El caracter introducido está en mayúsculas.");
			
			}else if (Character.isDigit(caracter)) {
				System.out.println("El caracter introducido es un dígito.");
			
			}else if (caracter == '¡' || caracter == '!' || caracter == '¿'
					|| caracter == '?' || caracter == ',' || caracter == '.'
					|| caracter == ':' || caracter == ';' || caracter == '"'
					|| caracter == '`' || caracter == '´') {
				System.out.println("El caracter introducido es un signo de puntuación.");
			
			}else if (Character.isWhitespace(caracter)) {
				System.out.println("No se ha introducido ningún caracter.");
			
			}else if (caracter == '(' || caracter == ')' || caracter == '[' 
					|| caracter == ']' || caracter == '{' || caracter == '}') {
				System.out.println("El caracter introducido es un paréntesis, llave o corchete.");
			
			}else {
				System.out.println("El caracter introducido es 'otro'; no lo puedo identificar.");
			
			}
			
		}
		
		
		sc.close();

	}

}
