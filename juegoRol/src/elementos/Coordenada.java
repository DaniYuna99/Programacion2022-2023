package elementos;

import java.util.Objects;
import java.util.Random;

import logicaJuego.Constantes;

public class Coordenada {

	/* ======================= ATRIBUTOS ======================= */
	private int x;
	private int y;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	
	//1º constructor
	public Coordenada () {
		this.x = new Random().nextInt(0, Constantes.TAMANNO);	
		this.y = new Random().nextInt(0, Constantes.TAMANNO);	
	}
	
	
	//2º constructor
	public Coordenada (int x, int y) {
		
		if ((x > Constantes.TAMANNO) || (y > Constantes.TAMANNO)) {
			this.x = 0;
			this.y = 0;
		
		}else {
			this.x = x;
			this.y = y;
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* --------------- Función goUp () --------------- */
	public boolean goUp () {
		
		boolean seHaMovido = false;
		
		if (y + 1 < Constantes.TAMANNO) {
			y++;
			seHaMovido = true;
		}
		
		
		return (seHaMovido);
	}
	
	
	
	/* --------------- Función goDown () --------------- */
	public boolean goDown () {
		
		boolean seHaMovido = false;
		
		if (y - 1 >= 0) {
			y--;
			seHaMovido = true;
		}
		
		
		return (seHaMovido);
	}

	
	
	/* --------------- Función goLeft () --------------- */
	public boolean goLeft () {
		
		boolean seHaMovido = false;
		
		if (x - 1 >= 0) {
			x--;
			seHaMovido = true;
		}
		
		
		return (seHaMovido);
	}

	
	
	/* --------------- Función goRight () --------------- */
	public boolean goRight () {
		
		boolean seHaMovido = false;
		
		if (x + 1 < Constantes.TAMANNO) {
			x++;
			seHaMovido = true;
		}
		
		
		return (seHaMovido);
	}



	/* ==================== GETTERS/SETTERS ==================== */
	public int getX() {
		return x;
	}
	
	
	public int getY() {
		return y;
	}


	
	/* ======================= HASH CODE() ===================== */
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	
	
	
	/* ======================== EQUALS() ======================= */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		if ((sonIguales == false) && (obj != null) && (obj instanceof Coordenada)) {
			
			Coordenada otro = (Coordenada) obj;
			
			if ((this.x == otro.x) && (this.y == otro.y)) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	public String toString () {
		
		return String.format(
				
				"X: %s\n"
				+ "Y: %s",
				
				this.x,
				this.y);
	}
}
