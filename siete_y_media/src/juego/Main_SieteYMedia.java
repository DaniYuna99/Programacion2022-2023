package juego;

import java.util.Scanner;

import juego.modelo.Baraja;
import juego.modelo.Carta;

public class Main_SieteYMedia {

	/************************************************************************/
	/******************************** MAIN **********************************/
	/************************************************************************/
	
	public static void main(String[] args) {
		
		/*INCOMPLETO: ESTOY MAREADO CON EL PROBLEMA*/
		
		Scanner sc = new Scanner(System.in);
		
		Baraja cartas = null;
		int opcionMenu = 0;
		int opcionMenuJugador = 0;
		int opcionMenuBanca = 0;
		int indiceJugador = 0;
		int indiceBanca = 0;
		

		try {
			
			cartas = new Baraja();
			cartas.barajar();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		
		do {
			
			System.out.println(MENU);
			opcionMenu = Integer.valueOf(sc.nextLine());
			
			while (opcionMenu != 1 && opcionMenu != 2 && opcionMenu != 3) {
				System.out.println("Error. Elige bien esta vez: ");
				opcionMenu = Integer.valueOf(sc.nextLine());
			}
			
			
			if (opcionMenu == 1) {
				
				if (cartas.sacarCartaJugador(indiceJugador) == true) {
					System.out.println("El jugador ha obtenido una nueva carta.");
					indiceJugador++;
					
				}
				
				
				do {
					
					System.out.println(mostrarCartas(cartas.getCartasJugador()));
					System.out.println(SEGUNDO_MENU);
					opcionMenuJugador = Integer.valueOf(sc.nextLine());
					
					while (opcionMenuJugador != 1 && opcionMenuJugador != 2) {
						System.out.println("Error. Has elegido mal: ");
						opcionMenuJugador = Integer.valueOf(sc.nextLine());
					}
					
					
					if (opcionMenuJugador == 1) {
						
						if (cartas.sacarCartaJugador(indiceJugador) == true) {
							System.out.println("El jugador ha obtenido una nueva carta.");
							indiceJugador++;
							
						}else {
							System.out.println("El jugador no ha obtenido una nueva carta por algún motivo.");
						}

						
					}else if (cartas.getValorTotal(cartas.getCartasJugador()) > 7.5 || opcionMenuJugador == 2){
						
						cartas.sacarCartaBanca(indiceBanca);
						System.out.println("La banca tiene una nueva carta.");
							
						
						do {
							
							System.out.println(mostrarCartas(cartas.getCartasBanca()));
							System.out.println(SEGUNDO_MENU);
							opcionMenuBanca = Integer.valueOf(sc.nextLine());
							
							while (opcionMenuBanca != 1 && opcionMenuBanca != 2) {
								System.out.println("Error. Has elegido mal: ");
								opcionMenuBanca = Integer.valueOf(sc.nextLine());
							}
							
							
							if (opcionMenuBanca == 1) {
								
								if (cartas.sacarCartaBanca(indiceBanca) == true) {
									System.out.println("La banca tiene una nueva carta.");
									indiceBanca++;
								
								}else {
									System.out.println("La banca no tiene una nueva carta.");
								}
								
							}else {
								System.out.println("Te has plantado.");
							}
							
						}while (opcionMenuBanca != 2 || (cartas.getValorTotal(cartas.getCartasBanca()) <= 7.5));
						
					}
					
					
				}while (opcionMenuJugador != 2 || (cartas.getValorTotal(cartas.getCartasJugador()) <= 7.5));
				
				
				if (cartas.getValorTotal(cartas.getCartasJugador()) > 7.5) {
					System.out.println("El jugador ha perdido. La banca ha ganado.");
				}
				
				
			}else if (opcionMenu == 2) {
				cartas.barajar();
				System.out.println("Se han barajado las cartas.");
			}
		
			
		}while (opcionMenu != 3);
			
		
		System.out.println(SEPARADOR + "\n" + "Has salido del programa.");
		sc.close();
			
	}
	
	
	
	/************************************************************************/
	/************************ FUNCIONES Y CONSTANTES ************************/
	/************************************************************************/
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	public static final String SEPARADOR = "--------------------------";
	
	public static final String MENU = SEPARADOR + "\n"
								    + "¿Qué quieres hacer?\n"
								    + SEPARADOR + "\n"
								    + "1. Empezar a jugar\n"
								    + "2. Barajar las cartas\n"
								    + "3. Salir\n"
								    + SEPARADOR + "\n"
								    + "Elige: ";
	
	public static final String SEGUNDO_MENU = SEPARADOR + "\n"
										    + "Y ahora, ¿cómo quieres continuar?\n"
										    + SEPARADOR + "\n"
										    + "1. Pedir otra carta\n"
										    + "2. Plantarte\n"
										    + SEPARADOR + "\n"
										    + "Elige: ";
	
	
	
	/* ============== Función mostrarCartas () =============== */
	public static String mostrarCartas(Carta[] cartasAMostrar) {
		
		int contadorIndice = 0;
		StringBuilder sb = new StringBuilder();
		
		
		for (Carta carta : cartasAMostrar) {
			
			if (carta != null) {
				
				if ((cartasAMostrar[contadorIndice + 1] != null) 
						&& ((contadorIndice + 1 <= cartasAMostrar.length - 1))) {
					sb.append(carta.toString() + ", ");
					
				}else {
					sb.append(carta.toString() + ".");
				}
			}
			
			
			contadorIndice++;
		}
		
		
		return (sb.toString());
	}
}
