package main;

import logicaJuego.JuegoException;
import logicaJuego.JuegoGUI;

/**
 * Clase principal para lanzar el juego en modo gráfico
 */
public class MainJuegoGUI extends MainJuego {

	public static void main(String[] args) {

		try {
			new JuegoGUI(cargarJugadores());	
						
		}catch (JuegoException e) {
			System.out.println(e.getMessage());
		}

	}

}
