package juego.modelo;

import java.util.Objects;

public class Carta {
	
	/* ======================= ATRIBUTOS ======================= */
	private int numero;
	private Palos palo;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Carta (int numero, Palos palo) throws Exception {
		
		if ((numero > 0) && (numero <= 12) 
			&& (numero != 8) && (numero != 9)
			&& (palo != null)) {
			
			this.numero = numero;
			this.palo = palo;
			
		}else {
			throw new Exception("Algún dato no es válido.");
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* --------------- Función getValor () --------------- */
	public double getValor() {
		
		return (numero > 7) 
				? 0.5
				: (this.numero);
	}
	
	
	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getNumero() {
		return numero;
	}


	public Palos getPalo() {
		return palo;
	}

	
	
	/* ===================== HASH CODE() ======================= */
	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}



	/* ======================= EQUALS() ======================== */
	@Override 
	public boolean equals (Object obj) {
		
		boolean sonIguales = (this == obj);
		
		
		if ((sonIguales == false) && (obj != null) && (obj instanceof Carta)){
	
			Carta otro = (Carta) obj;
			
			if ((this.getNumero() == otro.getNumero()) 
					&& (this.getPalo().equals(otro.getPalo()))) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}	
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString () {
		return numero + " " + palo;
	}


}
