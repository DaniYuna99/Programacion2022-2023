package ej5;

import java.util.Scanner;

public class MainCartas {
	
	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		JuegoCartas jc = new JuegoCartas();

		
		System.out.println("¿Cuántas cartas reparto? ");
		int cartasARepartir = Integer.valueOf(sc.nextLine());
		
		while (cartasARepartir <= 0 || cartasARepartir > 23) {
			System.out.println("Las cartas no pueden ser un número negativo, o superiores a 23. Introdúcelo de nuevo: ");
			cartasARepartir = Integer.valueOf(sc.nextLine());
		}

		
		jc.setJugador1(jc.repartirCartas(cartasARepartir));
		jc.setJugador2(jc.repartirCartas(cartasARepartir));
		
		
		System.out.println(SEPARADOR);
		System.out.println("Cartas del jugador 1: ");
		System.out.println(jc.leerCartas(jc.getJugador1()));
		
		System.out.println(SEPARADOR);
		System.out.println("Cartas del jugador 2: ");
		System.out.println(jc.leerCartas(jc.getJugador2()));
		
		sc.close();

		
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* \/\/\/\ CONSTANTES /\/\/\/\ */
	public static final String SEPARADOR = "------------------------";
	
	
}
