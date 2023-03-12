package ej6;

import java.util.Scanner;

public class Main_Ej6 {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una palabra para decirte qué letras tiene y cuál cantidad: ");
		String palabra = sc.nextLine();
		
		System.out.println("---------------------");
		System.out.println(mostrarCantidadLetras(palabra));
		sc.close();

	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* \/\/\/\ CONSTANTES /\/\/\/\ */
	/*AÑADÍ NÚMEROS TAMBIÉN QUE FUE AÑADIRLOS EN EL STRING Y YA*/
	public static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz123456789";
	
	
	/* ============== Función contarLetras () =============== */
	public static int[] contarLetras (String palabra) {
		
		palabra = palabra.toLowerCase();
		int[] contadoresLetras = new int[36];

		
		for (int i = 0; i < palabra.length(); i++) {
			
			for (int j = 0; j < ABECEDARIO.length(); j++) {
				
				if (palabra.charAt(i) == ABECEDARIO.charAt(j)) {
					contadoresLetras[j]++;
				}
			}
		}
		
		
		return (contadoresLetras);
	}

	
	
	/* ============== Función mostrarCantidadLetras () =============== */
	public static String mostrarCantidadLetras (String palabra) {
		
		StringBuilder sb = new StringBuilder("Las letras que posee la palabra '" + palabra + "' son:\n");
		int[] contadoresLetras = contarLetras(palabra);
		
		
		for (int i = 0; i < contadoresLetras.length; i++) {
			
			if (contadoresLetras[i] > 0) {
				sb.append("- " + Character.toUpperCase(ABECEDARIO.charAt(i)) + " sale " + contadoresLetras[i] + " vez/veces.\n");
			}
		}
		
		
		return (sb.toString());
	}

}











