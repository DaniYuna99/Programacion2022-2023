package ej5;

import java.util.Arrays;

public class JuegoCartas {
	
	/* ======================= ATRIBUTOS ======================= */
	private String[] cartas = new String[48];
	private String[] jugador1 = new String[24];
	private String[] jugador2 = new String[24];


	
	/* ===================== CONSTRUCTORES ===================== */
	public JuegoCartas () {
		
		for (int i = 0; i < 12; i++) {
			cartas[i] = String.valueOf(i + 1) + " de Oros";
		}
		
		for (int j = 0; j < 12; j++) {
			cartas[j + 12] = String.valueOf(j + 1) + " de Copas";
		}
		
		for (int k = 0; k < 12; k++) {
			cartas[k + 24] = String.valueOf(k + 1) + " de Espadas";
		}
		
		for (int l = 0; l < 12; l++) {
			cartas[l + 36] = String.valueOf(l + 1) + " de Bastos";
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ---------- Función repartirCartas () ---------- */
	public String[] repartirCartas(int numeroCartas) {
		
		int indiceCartas = 0;
		int indiceJugador = 0;
		String[] cartasJugador = new String[24];
		
		
		if (numeroCartas > 0 && numeroCartas <= 24) {
			
			for (int i = numeroCartas; i >= 1; i--) {
				
				indiceCartas = (int) (Math.random() * cartas.length);
				
				while (cartas[indiceCartas] == null) {
					indiceCartas = (int) (Math.random() * cartas.length);
				}

				
				cartasJugador[indiceJugador] = cartas[indiceCartas];
				indiceJugador++;
				cartas[indiceCartas] = null;
			}
		}
		
		
		return (cartasJugador);
	}
	
	
	
	/* ---------- Función leerCartas () ---------- */
	public String leerCartas (String[] cartasJugador) {
		
		StringBuilder sb = new StringBuilder();
		int indiceActual = 0;
		
		
		for (String carta : cartasJugador) {
			
			if (carta != null) {
				
				if (cartasJugador[indiceActual + 1] != null 
						&& (indiceActual + 1 < cartasJugador.length)) {
					
					sb.append(carta + ", ");
					
				}else if (cartasJugador[indiceActual + 1] == null
						|| (indiceActual + 1 >= cartasJugador.length)) {
					
					sb.append(carta + ".");
				}
				
				
				indiceActual++;
			}
		}
		
		
		return (sb.toString());
	}

	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public String[] getCartas() {
		return cartas;
	}

	
	public void setCartas(String[] cartas) {
		this.cartas = cartas;
	}

	
	public String[] getJugador1() {
		return jugador1;
	}

	
	public void setJugador1(String[] jugador1) {
		this.jugador1 = jugador1;
	}

	
	public String[] getJugador2() {
		return jugador2;
	}

	
	public void setJugador2(String[] jugador2) {
		this.jugador2 = jugador2;
	}



	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		return "JuegoCartas [cartas=" + Arrays.toString(cartas) + "]";
	}
}
