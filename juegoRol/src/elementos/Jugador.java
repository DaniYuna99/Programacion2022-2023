package elementos;

import java.util.Random;

import logicaJuego.Constantes;

public class Jugador extends Element {

	/* ======================= ATRIBUTOS ======================= */
	private PlayerType tipoJugador;
	private int dinero;
	private int pociones;
	private int gemas;	
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Jugador (PlayerType tipoJugador) throws JugadorException, ElementException {
		
		super(ElementType.valueOf(tipoJugador.toString()));
	
		if (tipoJugador != null) {
			this.tipoJugador = tipoJugador;
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función getNombre () ------------ */
	/**
	 * Método getter de la clase Jugador que devuelve el 
	 * nombre de la clase del Jugador en forma de un String.
	 * 
	 * @return
	 */
	public String getNombre() {
		return getPlayer().toString();
	}
	
	
	
	/* ------------ Función getFuerzaParaLuchar () ------------ */
	/**
	 * Método de la clase Jugador que devuelve un número entero aleatorio
	 * entre 1 y la "fuerza" del atributo PlayerType.<br> <br>
	 * 
	 * El límite máximo será mayor o menor dependiendo del "trabajo" 
	 * que tenga el Jugador en el atributo PlayerType.
	 * 
	 * @return
	 */
	public int getFuerzaParaLuchar () {
		return new Random().nextInt(1, getFuerza());
	}


	
	/* ------------ Función getFuerza () ------------ */
	/**
	 * Método privado de la clase Jugador, que técnicamente es 
	 * un getter llamando a otro getter del atributo "fuerza" 
	 * del atributo PlayerType de la clase. <br> <br>
	 * 
	 * Devuelve la fuerza máxima del "trabajo" que ha seleccionado el jugador.
	 * <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTA FUNCIÓN:</u> <br> <br>
	 * - getFuerzaParaLuchar()
	 * 
	 * atributo
	 * @return
	 */
	private int getFuerza () {
		return tipoJugador.getFuerza();
	}

	
	
	/* ------------ Función getMagiaParaLuchar () ------------ */
	/**
	 * Método de la clase Jugador que devuelve un número entero aleatorio
	 * entre 1 y la "magia" del atributo PlayerType.<br> <br>
	 * 
	 * El límite máximo será mayor o menor dependiendo del "trabajo" 
	 * que tenga el Jugador en el atributo PlayerType.
	 * 
	 * @return
	 */
	public int getMagiaParaLuchar () {
		return new Random().nextInt(1, getMagia());
	}


	
	/* ------------ Función getMagia () ------------ */
	/**
	 * Método privado de la clase Jugador, que técnicamente es 
	 * un getter llamando a otro getter del atributo "magia" 
	 * del atributo PlayerType de la clase. <br> <br>
	 * 
	 * Devuelve la magia máxima del "trabajo" que ha seleccionado el jugador.
	 * <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTA FUNCIÓN:</u> <br> <br>
	 * - getMagiaParaLuchar()
	 * 
	 * atributo
	 * @return
	 */
	private int getMagia () {
		return tipoJugador.getMagia();
	}

	
	
	/* ------------ Función getVelocidadParaLuchar () ------------ */
	/**
	 * Método de la clase Jugador que devuelve un número entero aleatorio
	 * entre 1 y la "velocidad" del atributo PlayerType.<br> <br>
	 * 
	 * El límite máximo será mayor o menor dependiendo del "trabajo" 
	 * que tenga el Jugador en el atributo PlayerType.
	 * 
	 * @return
	 */
	public int getVelocidadParaLuchar () {
		return new Random().nextInt(1, getVelocidad());
	}


	
	/* ------------ Función getVelocidad () ------------ */
	/**
	 * Método privado de la clase Jugador, que técnicamente es 
	 * un getter llamando a otro getter del atributo "velocidad" 
	 * del atributo PlayerType de la clase. <br> <br>
	 * 
	 * Devuelve la velocidad máxima del "trabajo" que ha seleccionado 
	 * el jugador.
	 * <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTA FUNCIÓN:</u> <br> <br>
	 * - getVelocidadParaLuchar()
	 * 
	 * atributo
	 * @return
	 */
	private int getVelocidad () {
		return tipoJugador.getVelocidad();
	}



	/* ------------ Función getPlayer () ------------ */
	/**
	 * Método getter que devuelve el atributo "tipoJugador" 
	 * de PlayerType.
	 * 
	 * @return
	 */
	public PlayerType getPlayer() {
		return this.tipoJugador;
	}

	
	
	/* ------------ Función resumen () ------------ */
	public String resumen () {
		
		return String.format(
				
				"Jugador %s\n"
				+ "Dinero: %s\n"
				+ "Pociones: %s\n"
				+ "Gemas: %s", 
				
				this.getNombre(),
				this.dinero,
				this.pociones,
				this.gemas);
	}

	
	
	/* ------------ Función lucha () ------------ */
	/**
	 * Método en el que dos Jugadores luchan, y dependiendo de la fuerza que saquen,
	 * el dinero y las pociones que lleve el perdedor, devolverá un número entero con 
	 * el resultado del encuentro para informar al exterior. También se actualizarán los 
	 * atributos de ambos Jugadores según el resultado de la pelea.
	 * 
	 * @param j2
	 * @return
	 * @throws JugadorException
	 */
	public int lucha (Jugador j2) throws JugadorException {
		
		int resultado = 0;
		
		
		if (j2 != null) {
			
			//Empate
			if ((this.getFuerzaParaLuchar() == j2.getFuerzaParaLuchar())) {
				resultado = Constantes.EMPATE;
			
				
			//Resultados al ganar Jugador
			}else if ((this.getFuerzaParaLuchar() > j2.getFuerzaParaLuchar()) && (j2.dinero == 0) && (j2.pociones != 0)) {
				resultado = Constantes.GANA_USA_POCIMA;
				j2.pociones--;
			
			}else if ((this.getFuerzaParaLuchar() > j2.getFuerzaParaLuchar()) && (j2.dinero != 0) && (j2.pociones != 0)) {
				resultado = Constantes.GANA_DINERO;
				j2.pociones--;
				this.dinero += j2.dinero;
				j2.dinero = 0;
			
			}else if ((this.getFuerzaParaLuchar() > j2.getFuerzaParaLuchar()) && (j2.dinero == 0) && (j2.pociones == 0)) {
				resultado = Constantes.GANA_MUERE;
			
			}else if ((this.getFuerzaParaLuchar() > j2.getFuerzaParaLuchar()) && (j2.dinero != 0) && (j2.pociones == 0)) {
				resultado = Constantes.GANA_MUERE;
				this.dinero += j2.dinero;
				j2.dinero = 0;
			
	
			//Resultados al ganar j2
			}else if ((this.getFuerzaParaLuchar() < j2.getFuerzaParaLuchar()) && (this.dinero == 0) && (this.pociones != 0)) {
				resultado = Constantes.PIERDE_USA_POCIMA;
				this.pociones--;
			
			}else if ((this.getFuerzaParaLuchar() < j2.getFuerzaParaLuchar()) && (this.dinero != 0) && (this.pociones != 0)) {
				resultado = Constantes.PIERDE_DINERO;
				this.pociones--;
				j2.dinero += this.dinero;
				this.dinero = 0;
			
			}else if ((this.getFuerzaParaLuchar() < j2.getFuerzaParaLuchar()) && (this.dinero == 0) && (this.pociones == 0)) {
				resultado = Constantes.PIERDE_MUERE;
			
			}else if ((this.getFuerzaParaLuchar() < j2.getFuerzaParaLuchar()) && (this.dinero != 0) && (this.pociones == 0)) {
				resultado = Constantes.PIERDE_MUERE;
				j2.dinero += this.dinero;
				this.dinero = 0;
			}
		
		}else {
			throw new JugadorException ("El jugador 2 tiene valor nulo.");
		}
		
		
		return (resultado);
	}

	
	
	/* ------------ Función encuentraRoca () ------------ */
	/**
	 * Método que decide el resultado de un encuentro con una roca: 
	 * si el jugador saca suficiente magia, o si tiene una gema para destruirla, 
	 * o si pierde, devolverá una cifra dependiendo del resultado para informar 
	 * al exterior.
	 * 
	 * @return
	 */
	public int encuentraRoca () {
		
		int resultado = 0;
		
		
		if (this.gemas != 0) {
			resultado = Constantes.ROMPE_ROCA_CON_GEMA;
			gemas--;
		
		}else if ((this.gemas == 0) && (getMagiaParaLuchar() > 4)) {
			resultado = Constantes.GANA_A_LA_ROCA;
		
		}else if ((this.gemas == 0) && (getMagiaParaLuchar() <= 4)) {
			resultado = Constantes.PIERDE_A_LA_ROCA;
		}
		
		
		return (resultado);
	}
	
	
	
	/* ------------ Función encuentraDinero () ------------ */
	public void encuentraDinero () {
		this.dinero++;
	}

	
	
	/* ------------ Función encuentraPocion () ------------ */
	public void encuentraPocion () {
		this.pociones++;
	}

	
	
	/* ------------ Función encuentraGema () ------------ */
	public void encuentraGema () {
		this.gemas++;
	}


	
	/* ==================== GETTERS/SETTERS ==================== */
	public int getDinero() {
		return dinero;
	}
	
	
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	
	public int getPociones() {
		return pociones;
	}
	
	
	public void setPociones(int pociones) {
		this.pociones = pociones;
	}
	
	
	public int getGemas() {
		return gemas;
	}
	
	
	public void setGemas(int gemas) {
		this.gemas = gemas;
	}
	
	
}
