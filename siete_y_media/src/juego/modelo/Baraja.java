package juego.modelo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja {
	
	/* ======================= ATRIBUTOS ======================= */
	private int numCartas = 40;
	private int siguiente = 0;
	
	private Carta[] cartasBaraja = new Carta[40];
	private Carta[] cartasJugador = new Carta[20];
	private Carta[] cartasBanca = new Carta[20];
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Baraja(int siguiente) {}
	
	
	public Baraja() throws Exception {
		
		int contador = 0;
		
		
		for (Palos p : Palos.values()) {
			
			for (int i = 1; i < 13; i++) {
				
				if (i != 8 && i != 9) {
					cartasBaraja[contador] = new Carta(i, p);
					contador++;
				}
			}
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------------ Función barajar () ------------------ */
	public void barajar() {
		
		Random rnd = ThreadLocalRandom.current();
		
		
		for (int i = cartasBaraja.length - 1; i > 0; i--) {
			
			int index = rnd.nextInt(i + 1);
			Carta a = cartasBaraja[index];
			cartasBaraja[index] = cartasBaraja[i];
			cartasBaraja[i] = a;
		}	  
	}
	
	
	
	/* ----------------- Función sacarCartaJugador () ----------------- */
	public boolean sacarCartaJugador(int indiceJugador) {
		
		boolean seHaSacado = false;
		
		
		if (siguiente < 40) {
			Carta nuevaCarta = cartasBaraja[siguiente];
			cartasJugador[indiceJugador] = nuevaCarta;
			siguiente++;
			seHaSacado = true;
		}
		
		
		return (seHaSacado); 
	}
	
	
	
	/* ----------------- Función sacarCartaBanca () ----------------- */
	public boolean sacarCartaBanca(int indiceBanca) {
		
		boolean seHaSacado = false;
		
		
		if (siguiente < 40) {
			Carta nuevaCarta = cartasBaraja[siguiente];
			cartasBanca[indiceBanca] = nuevaCarta;
			siguiente++;
			seHaSacado = true;
		}
		
		
		return (seHaSacado); 
	}
	

	
	/* --------------- Función getValorTotal () ---------------- */
	public double getValorTotal(Carta[] cartas) {
		
		double valorTotal = 0;
		
		
		for (Carta carta : cartas)  {
			
			if (carta != null) {
				valorTotal += carta.getValor();
			}
		}
		
		
		return (valorTotal);
	}
	

	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getNumCartas() {
		return numCartas;
	}


	public void setNumCartas(int numCartas) {
		this.numCartas = numCartas;
	}


	public int getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(int siguiente) {
		this.siguiente = siguiente;
	}


	public Carta[] getCartasBaraja() {
		return cartasBaraja;
	}


	public void setCartasBaraja(Carta[] cartasBaraja) {
		this.cartasBaraja = cartasBaraja;
	}


	public Carta[] getCartasJugador() {
		return cartasJugador;
	}


	public void setCartasJugador(Carta[] cartasJugador) {
		this.cartasJugador = cartasJugador;
	}


	public Carta[] getCartasBanca() {
		return cartasBanca;
	}


	public void setCartasBanca(Carta[] cartasBanca) {
		this.cartasBanca = cartasBanca;
	}
	
	
		
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "Número de cartas de la baraja: " + numCartas + "\n"
				+ "Siguiente: " + siguiente;
	}



	
}
