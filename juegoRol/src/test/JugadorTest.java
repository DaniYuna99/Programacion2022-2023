package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import elementos.Coordenada;
import elementos.Jugador;
import logicaJuego.Constantes;
import logicaJuego.Juego;
import logicaJuego.JuegoException;
import main.MainJuego;

public class JugadorTest {

	Juego j1 = new Juego(MainJuego.cargarJugadoresTest(), 1);
	
	
	@Test
	void testEliminarJugador () {
		
		j1 = new Juego(MainJuego.cargarJugadoresTest());
		Coordenada coordJugador = j1.obtenerCoordenadaJugadorJuega();	
		j1.eliminarJugador(coordJugador);
		
		if (j1.getTablero().containsKey(coordJugador)) {
			assert(false);
		
		}else {
			assert(true);
		}
	}
	
	
	
	@Test
	void testEliminarJugadorMal () {
		
		j1 = new Juego(MainJuego.cargarJugadoresTest());
		Coordenada coordJugador = j1.obtenerCoordenadaJugadorJuega();	
		
		if (j1.getTablero().containsKey(coordJugador)) {
			assert(true);
		
		}else {
			assert(false);
		}
	}

	
	
	@Test
	void testCambiarPosicion () {
		
		Coordenada coordInicial = new Coordenada(j1.obtenerCoordenadaJugadorJuega().getX(), j1.obtenerCoordenadaJugadorJuega().getY());
		Coordenada coordDestino = new Coordenada(j1.obtenerCoordenadaJugadorJuega().getX(), j1.obtenerCoordenadaJugadorJuega().getY());
		
		if (coordDestino.getY() < Constantes.TAMANNO) {
			coordDestino.goUp();
			
		}else {
			coordDestino.goDown();
		}
		
		
		j1.cambiaJugadorAPosicion(coordDestino);
		
		if (j1.getTablero().containsKey(coordDestino)
				&& (!coordInicial.equals(coordDestino))) {
			assert(true);
		
		}else {
			assert(false);
		}
	}
	
	
	
	@Test
	void testCambiarPosicionMal () {
		
		Coordenada coordInicial = new Coordenada(j1.obtenerCoordenadaJugadorJuega().getX(), j1.obtenerCoordenadaJugadorJuega().getY());
		Coordenada coordDestino = new Coordenada(j1.obtenerCoordenadaJugadorJuega().getX(), j1.obtenerCoordenadaJugadorJuega().getY());
		
		if (coordDestino.getY() < Constantes.TAMANNO) {
			coordDestino.goUp();
			coordInicial.goUp();
			
		}else {
			coordDestino.goDown();
			coordInicial.goUp();
		}
		
		
		j1.cambiaJugadorAPosicion(coordDestino);
		
		if (j1.getTablero().containsKey(coordDestino)
				&& (!coordInicial.equals(coordDestino))) {
			assert(false);
		
		}else {
			assert(true);
		}
	}
	
	
	
	@Test
	void testProximoJugador () {
		
		j1.proximoJugador(false);
		assertEquals(j1.getJugadorJuega(), 1);
		j1.proximoJugador(false);
		assertEquals(j1.getJugadorJuega(), 2);
		j1.proximoJugador(false);
		assertEquals(j1.getJugadorJuega(), 3);
		j1.proximoJugador(false);
		assertEquals(j1.getJugadorJuega(), 0);
	}
	
	
	
	@Test
	void testEncuentraGema() {
		
		try {
			Jugador j = j1.getJugador(j1.obtenerCoordenadaJugadorJuega());
			j.encuentraGema();
			
			if (j.getGemas() == 1
					&& j instanceof Jugador) {
				assert(true);
			
			}else {
				assert(false);
			}
			
		} catch (JuegoException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Test
	void testEncuentraGemaMal() {
		
		try {
			Jugador j = j1.getJugador(j1.obtenerCoordenadaJugadorJuega());
			j.encuentraGema();
			
			if (j.getGemas() != 1
					&& j instanceof Jugador) {
				assert(false);
			
			}else {
				assert(true);
			}
			
		} catch (JuegoException e) {
			e.printStackTrace();
		}
	}
}

























