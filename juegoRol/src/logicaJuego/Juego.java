package logicaJuego;

import static logicaJuego.JuegoUtils.crearSeparador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import elementos.Coordenada;
import elementos.Element;
import elementos.ElementException;
import elementos.ElementType;
import elementos.Jugador;
import elementos.JugadorException;
import elementos.PlayerType;

public class Juego {

	/* ======================= ATRIBUTOS ======================= */
	private Map<Coordenada, Element> tablero;
	private List<Coordenada> coordenadaJugadores;
	private int jugadorJuega;
	protected int dado; // Dado para ver los movimientos del jugador que juega	
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Juego(PlayerType[] tipos) {
		
		this.tablero = new HashMap<>();
		this.coordenadaJugadores = new ArrayList<>();
		this.jugadorJuega = 0;
		
		generarGemasEnTablero();
		generarRocasEnTablero();
		generarDineroEnTablero();
		generarPocionesEnTablero();
		repartirJugadoresEnTablero(tipos);
	}
	
	
	//2º constructor para tests
	public Juego(PlayerType[] tipos, int test) {
		
		this.tablero = new HashMap<>();
		this.coordenadaJugadores = new ArrayList<>();
		this.jugadorJuega = 0;
		
		/*generarGemasEnTablero();
		generarRocasEnTablero();
		generarDineroEnTablero();
		generarPocionesEnTablero();*/
		repartirJugadoresEnTablero(tipos);
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* --------------- Función moverJugador () --------------- */
	/**
	 * Mueve el jugador en el tablero.
	 * 
	 * @param direccion
	 * @return resultado de la operación
	 * @throws JuegoException
	 * @throws JugadorException
	 */
	public String moverJugador(char direccion) throws JuegoException, JugadorException {
		
		String resultado = "";
		Jugador jugador = (Jugador) tablero.get(obtenerCoordenadaJugadorJuega());
		
		//GETJUGADOR() VA REGULINCHI, NO MODIFICA EL TABLERO SI MODIFICO EL JUGADOR
		//Jugador jugador = getJugador(obtenerCoordenadaJugadorJuega());
		
		Coordenada coordDestino = getNextPosition(direccion);
		
		// Tengo que ver que hay en la nueva casilla
		Element elemento = this.tablero.get(coordDestino);
		
		if (elemento != null) { // Hay algo en la casilla
			
			if ((elemento instanceof Jugador)) {
				// Después de la lucha los jugadores no se mueven
				resultado = luchar(resultado, jugador, coordDestino, elemento);
				dado = 0;
				
			} else if (elemento.getType() == ElementType.ROCA) {
				resultado = encuentraRoca(resultado, jugador, coordDestino);
				
			} else if (elemento.getType() == ElementType.GEMA) {
				jugador.encuentraGema();
				this.cambiaJugadorAPosicion(coordDestino);
				
			} else if (elemento.getType() == ElementType.DINERO) {
				jugador.encuentraDinero();
				this.cambiaJugadorAPosicion(coordDestino);
				
			} else if (elemento.getType() == ElementType.POCION) {
				jugador.encuentraPocion();
				this.cambiaJugadorAPosicion(coordDestino);
			}
			
		} else {
			this.cambiaJugadorAPosicion(coordDestino);
		}
				
		
		return resultado;
	}
	
	
	
	/* --------------- Función encuentraRoca () --------------- */
	/**
	 * Método que devuelve un String con el resultado de lo que ocurre cuando 
	 * se encuentra un Jugador un Element Roca en el tablero. <br> <br>
	 * 
	 * Se llama al método "encuentraRoca()" del Jugador, que realiza la acción, 
	 * y con el número que devuelve, se devuelve un String indicando el resultado
	 * para los Jugadores. <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTA FUNCIÓN:</u> <br>
	 * - moverJugador()
	 * 
	 * @param resultado
	 * @param jugador
	 * @param coordDestino
	 * @return
	 */
	private String encuentraRoca(String resultado, Jugador jugador, Coordenada coordDestino) {
		
		int resultadoRoca = jugador.encuentraRoca();
		
		switch (resultadoRoca) {
		
				case Constantes.ROMPE_ROCA_CON_GEMA:
					resultado = String.format("El jugador %s rompe la roca con una gema.", jugador.getNombre());
					this.cambiaJugadorAPosicion(coordDestino);
					break;
		
				case Constantes.GANA_A_LA_ROCA:
					resultado = String.format("El jugador %s gana a la roca.", jugador.getNombre());
					this.cambiaJugadorAPosicion(coordDestino);
					break;
		
				case Constantes.PIERDE_A_LA_ROCA:
					resultado = String.format("El jugador %s pierde. No se mueve.", jugador.getNombre());
					break;
		}
		
		
		return resultado;
	}
	
	
	
	/* --------------- Función luchar () --------------- */
	/**
	 * Método que devuelve un String con el resultado después de que 
	 * dos Jugadores luches entre sí.
	 * 
	 * @param resultado
	 * @param jugador
	 * @param coordDestino
	 * @param elemento
	 * @return
	 */
	private String luchar(String resultado, Jugador jugador, Coordenada coordDestino, Element elemento) {
		
		Jugador enemigo = (Jugador) elemento;
		
		int resultadoLucha = 0;
		
		try {
			resultadoLucha = jugador.lucha(enemigo);
		} catch (JugadorException e) {
			e.printStackTrace();
		}
		
		
		switch (resultadoLucha) {
		
			case Constantes.EMPATE:
				resultado = "Empate entre los jugadores.";
				break;
				
			case Constantes.GANA_USA_POCIMA:
				resultado = "El jugador " + jugador.getNombre() + " gana. Le quita una poción al enemigo.";
				break;
				
			case Constantes.GANA_DINERO:
				resultado = "El jugador " + jugador.getNombre() + " gana. Le quita el dinero al enemigo.";
				break;
				
			case Constantes.GANA_MUERE:
				resultado = "El jugador " + jugador.getNombre() + " gana. El enemigo muere.";
				this.eliminarJugador(coordDestino);
				// Si se elimina el jugador que juega el dado se pone a 0 para que no siga
				// tirando
				dado = 0;
				proximoJugador(true);
				break;
				
			case Constantes.PIERDE_USA_POCIMA:
				resultado = "El enemigo " + enemigo.getNombre() + " gana. Le quita una poción al jugador.";
				break;
				
			case Constantes.PIERDE_DINERO:
				resultado = "El enemigo " + enemigo.getNombre() + " gana. Le quita el dinero al jugador.";
				break;
				
			case Constantes.PIERDE_MUERE:
				resultado = "El enemigo " + enemigo.getNombre() + " gana. El jugador muere.";
				this.eliminarJugador(this.coordenadaJugadores.get(jugadorJuega));
				dado = 0;
				// Decrementamos en uno el jugador, para que no se salte al siguiente
				// ya que al borrarlo el siguiente apunta al siguiente, y al incrementarlo
				// se le salta
				proximoJugador(true);
				break;
		}
		
		
		return resultado;
	}

	
	
	/* --------------- Función getNextPosition () --------------- */
	/**
	 * Método que genera la Coordenada en la que, en un futuro, se moverá un Jugador. <br> <br>
	 * 
	 * Se extrae la Coordenada en la que está actualmente el Jugador, y con
	 * los métodos de Coordenada "goUp()", "goDown()", etc, se aumentan los
	 * valores X e Y de la Coordenada(según el caracter recibido como parámetro de entrada),
	 * para obtener la posición futura. <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTA FUNCIÓN:</u> <br>
	 * - moverJugador()
	 * 
	 * @param direction
	 * @return
	 * @throws JuegoException
	 */
	private Coordenada getNextPosition(char direction) throws JuegoException {
		
		Coordenada coord = new Coordenada(obtenerCoordenadaJugadorJuega().getX(), obtenerCoordenadaJugadorJuega().getY());
		
		/*En el MainJuego se controlan las direcciones con un bucle While, 
		pero dejo esta Exception aquí*/
		if ((direction != 'N') && (direction != 'S') 
				&& (direction != 'E') && (direction != 'O')) {
			
			throw new JuegoException ("La dirección introducida es errónea.");
		
		}else {
			
			/*goDown() y goUp() en la práctica en el tablero funcionan al contrario.
			Por lo que si poner 'N', se usa goDown(), y viceversa.*/
			
			if (direction == 'N') {
				coord.goDown();
				
			}else if (direction == 'S') {
				coord.goUp();
				
			}else if (direction == 'O') {
				coord.goLeft();
				
			}else if (direction == 'E') {
				coord.goRight();
			}
		}
		
		
		return (coord);
	}

	
	
	/* --------------- Función generarGemasEnTablero () --------------- */
	/**
	 * Método que genera un determinado número de Gemas. El número depende de la 
	 * constante de la clase Constantes llamada NUM_GEMAS. Se generan 
	 * Coordenadas aleatorias, y se depositan las Gemas una vez 
	 * se compruebe si esa posición está vacía. Se usa en el constructor. <br> <br>
	 * 
	 * Si se genera una Coordenada que está ocupada, se generará otra hasta 
	 * que salga una Coordenada que no esté ocupada. <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTA FUNCIÓN:</u> <br>
	 * - Constructor de esta clase (Juego)
	 */
	private void generarGemasEnTablero () {
		
		for (int i = 0; i < Constantes.NUM_GEMAS; i++) {
			
			Coordenada coord = new Coordenada();
			
			while (tablero.containsKey(coord)) {
				coord = new Coordenada();
			}
			
			try {
				tablero.put(coord, new Element(ElementType.GEMA));
			} catch (ElementException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	/* --------------- Función generarPocionesEnTablero () --------------- */
	/**
	 * Método que genera un determinado número de Pociones. El número depende de la 
	 * constante de la clase Constantes llamada NUM_POCIONES. Se generan 
	 * Coordenadas aleatorias, y se depositan las Pociones una vez 
	 * se compruebe si esa posición está vacía. Se usa en el constructor. <br> <br>
	 * 
	 * Si se genera una Coordenada que está ocupada, se generará otra hasta 
	 * que salga una Coordenada que no esté ocupada. <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTA FUNCIÓN:</u> <br>
	 * - Constructor de esta clase (Juego)
	 */
	private void generarPocionesEnTablero () {
		
		for (int i = 0; i < Constantes.NUM_POCIONES; i++) {
			
			Coordenada coord = new Coordenada();
			
			while (tablero.containsKey(coord)) {
				coord = new Coordenada();
			}
			
			try {
				tablero.put(coord, new Element(ElementType.POCION));
			} catch (ElementException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	/* --------------- Función generarRocasEnTablero () --------------- */
	/**
	 * Método que genera un determinado número de Rocas. El número depende de la 
	 * constante de la clase Constantes llamada NUM_ROCAS. Se generan 
	 * Coordenadas aleatorias, y se depositan las Rocas una vez 
	 * se compruebe si esa posición está vacía. Se usa en el constructor. <br> <br>
	 * 
	 * Si se genera una Coordenada que está ocupada, se generará otra hasta 
	 * que salga una Coordenada que no esté ocupada. <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTA FUNCIÓN:</u> <br>
	 * - Constructor de esta clase (Juego)
	 */
	private void generarRocasEnTablero () {
		
		for (int i = 0; i < Constantes.NUM_ROCAS; i++) {
			
			Coordenada coord = new Coordenada();
			
			while (tablero.containsKey(coord)) {
				coord = new Coordenada();
			}
			
			try {
				tablero.put(coord, new Element(ElementType.ROCA));
			} catch (ElementException e) {
				e.printStackTrace();
			}
		}
	}


	
	/* --------------- Función generarDineroEnTablero () --------------- */
	/**
	 * Método que genera una determinada cantidad de Dinero. La cantidad 
	 * depende de la constante de la clase Constantes llamada NUM_DINERO. Se generan 
	 * Coordenadas aleatorias, y se deposita el Dinero una vez 
	 * se compruebe si esa posición está vacía. Se usa en el constructor. <br> <br>
	 * 
	 * Si se genera una Coordenada que está ocupada, se generará otra hasta 
	 * que salga una Coordenada que no esté ocupada. <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTA FUNCIÓN:</u> <br>
	 * - Constructor de esta clase (Juego)
	 */
	private void generarDineroEnTablero () {
		
		for (int i = 0; i < Constantes.NUM_DINERO; i++) {
			
			Coordenada coord = new Coordenada();
			
			while (tablero.containsKey(coord)) {
				coord = new Coordenada();
			}
			
			try {
				tablero.put(coord, new Element(ElementType.DINERO));
			} catch (ElementException e) {
				e.printStackTrace();
			}
		}
	}


	
	/* --------------- Función repartirJugadoresEnTablero () --------------- */
	/**
	 * Método que recibe un array de PlayerType con el orden de los jugadores, y los 
	 * reparte en Coordenadas aleatorias en el tablero. <br> <br>
	 * 
	 * Este método se usa en el constructor de la clase Juego. 
	 * 
	 * @param jugadores
	 */
	private void repartirJugadoresEnTablero (PlayerType[] jugadores) {
		
		for (int i = 0; i < jugadores.length; i++) {
			
			Coordenada coord = new Coordenada();
			String et = jugadores[i].toString();
			PlayerType et2 = PlayerType.valueOf(et);
			
			while (tablero.containsKey(coord)) {
				coord = new Coordenada();
			}
			
			try {
				
				tablero.put(coord, new Jugador(et2));
				coordenadaJugadores.add(coord);
				
			} catch (ElementException | JugadorException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	/* --------------- Función cambiaJugadorAPosicion () --------------- */
	/**
	 * Método que mueve un Jugador de una Coordenada a otra, borrándose la Coordenada
	 * donde estaba el Jugador antes, y metiéndose la Coordenada nueva.
	 * 
	 * @param coordDestino
	 */
	public void cambiaJugadorAPosicion(Coordenada coordDestino) {
		
		Element jugador = tablero.get(obtenerCoordenadaJugadorJuega());
		eliminarJugador(obtenerCoordenadaJugadorJuega());
		tablero.put(coordDestino, jugador);
		coordenadaJugadores.add(jugadorJuega, coordDestino);
	}

		
	
	/* --------------- Función eliminarJugador () --------------- */
	/**
	 * Método que elimina un Jugador de la Coordenada que le pases por parámetro.
	 * Lo elimina del mapa "tablero" y también se borra su Coordenada de 
	 * la lista "coordenadaJugadores".
	 * 
	 * @param coordDestino
	 */
	public void eliminarJugador(Coordenada coordDestino) {
		
		tablero.remove(coordDestino);
		
		
		Iterator<Coordenada> it = coordenadaJugadores.iterator();
		
		while(it.hasNext()) {
			Coordenada c = it.next();
			
			if (c.equals(coordDestino)) {
				it.remove();
			}
		}
	}
	
	
	
	/* --------------- Función imprimeValoresJugadores () --------------- */
	/**
	 * Método que devuelve un String con los objetos que tienen los Jugadores.
	 * 
	 * @return
	 */
	public String imprimeValoresJugadores() {
		
		StringBuilder sb = new StringBuilder();
		List<Jugador> jugadores = new ArrayList<>();
		
		for (Coordenada coord : coordenadaJugadores) {
			Jugador jugador = (Jugador) tablero.get(coord);
			jugadores.add(jugador);
		}
		
		
		for (int i = 0; i < jugadores.size(); i++) {
			sb.append(String.format("|  Jugador: %-20s  |  Dinero: %-12s  |  Pociones: %-12s  |  Gemas: %-12s  |", 
									jugadores.get(i).getType().toString(),
									jugadores.get(i).getDinero(),
									jugadores.get(i).getPociones(),
									jugadores.get(i).getGemas()) + "\n");
		}

		
		return (sb.toString());
	}

	
	
	/* --------------- Función imprimeNombreJugadores () --------------- */
	/**
	 * Método devolviendo un String con el orden de los Jugadores, y el turno 
	 * de qué Jugador.
	 * 
	 * @return
	 */
	public String imprimeNombreJugadores() {
		
		StringBuilder sb = new StringBuilder();
		List<Jugador> jugadores = new ArrayList<>();
		
		
		try {
			
			for (Coordenada coord : coordenadaJugadores) {
				Jugador jugador = getJugador(coord);
				jugadores.add(jugador);
			}
			
			
			sb.append(" - Turno de " + jugadores.get(jugadorJuega).getNombre() + ".\n");
			
			
			for (int i = 0; i < jugadores.size(); i++) {
				sb.append(String.format("El jugador %s es un %s", 
										i + 1,
										jugadores.get(i).getType().toString() + "\n"));
			}
			
		} catch (JuegoException e) {
			System.out.println(e.getMessage());
		}

		
		return (sb.toString());
	}

	
	
	/* --------------- Función isTerminado () --------------- */
	/**
	 * Método que comprueba si se cumple alguna condición para que el juego acabe.<br> <br>
	 * 
	 * El juego acaba cuando un jugador obtiene todo el dinero (Constantes.NUM_DINERO), 
	 * o sólo queda un jugador en el tablero.
	 * 
	 * <u>MÉTODOS QUE USAN ESTE MÉTODO:</u> <br>
	 * - actionPerformed() (Clase JuegoGUI) <br>
	 * - jugar() (Clase MainJuego) <br>
	 * - El Main de MainJuego
	 * 
	 * @return
	 */
	public boolean isTerminado() {
		
		boolean haTerminado = false;
		
		if ((coordenadaJugadores.size() == 1) || comprobarSiUnJugadorTieneTodoElDinero() == true) {
			haTerminado = true;
		}
		
			
		return (haTerminado);
	}

	
	
	/* --- Función comprobarSiUnJugadorTieneTodoElDinero () -- */
	/**
	 * El método devuelve un boolean, indicando si alguno de los Jugadores 
	 * tiene todo el Dinero. Si alguno lo tiene, devuelve true.
	 * 
	 * <u>MÉTODOS QUE USAN ESTE MÉTODO:</u> <br>
	 * - isTerminado() <br>
	 * @return
	 */
	private boolean comprobarSiUnJugadorTieneTodoElDinero () {
		
		boolean tieneTodoElDinero = false;
		
		
		for (Coordenada coord : coordenadaJugadores) {
			
			Jugador jugador = null;
			
			jugador = (Jugador) tablero.get(coord);
			
			
			if (jugador.getDinero() == Constantes.NUM_DINERO) {
				tieneTodoElDinero = true;
			}
		}
		
		
		return (tieneTodoElDinero);
	}

	
	
	/* -------------- Función getJugador () -------------- */
	
	/*EL MÉTODO ""PUEDE"" DAR COSAS INCORRECTAS. REPITO, ""PUEDE"".
	 * SE USA EN ALGUNOS SITIOS, Y SI LO QUITO FALLAN, 
	 * ASÍ QUE LO DEJO TAL COMO ESTÁ PORQUE ALGO HACE BIEN.*/
	
	/**
	 * Método al que si le das una Coordenada donde esté un Jugador,
	 * en el tablero, te devolverá un objeto Jugador con sus atributos.
	 * 
	 * Si en la coordenada pasada no hay un Jugador, saltará una Exception.
	 * 
	 * @param coordJugador
	 * @return
	 */
	public Jugador getJugador (Coordenada coordJugador) throws JuegoException {
		
		Jugador jugador = null;
		
		try {
			
			if ((tablero.get(coordJugador).getType().toString()).equals("ELFO")
					|| (tablero.get(coordJugador).getType().toString()).equals("GUERRERO")
					|| (tablero.get(coordJugador).getType().toString()).equals("OGRO")
					|| (tablero.get(coordJugador).getType().toString()).equals("MAGO")) {
				
				jugador = new Jugador (PlayerType.valueOf(tablero.get(coordJugador).getType().toString()));
				
			}else {
				throw new JuegoException ("No hay ningún jugador en esa coordenada.");
			}
			
		} catch (JugadorException | ElementException e) {
			e.printStackTrace();
		} 
		
		
		return (jugador);
	}

	
	
	/* --------------- Función getValorDado () --------------- */
	/**
	 * Devuelve el valor del dado.
	 * 
	 * <u>MÉTODOS QUE USAN ESTE MÉTODO:</u> <br>
	 * - Constructor de JuegoGUI <br>
	 * - actionPerformed() (Clase JuegoGUI)
	 * @return
	 */
	public int getValorDado() {
		return dado;
	}

	
	
	/* --------------- Función setDado () --------------- */
	/**
	 * Este método genera el movimiento de un Jugador cuando le llega su turno.
	 * La cantidad máxima depende de la estadística de Velocidad de la clase del Jugador.
	 * 
	 * <u>MÉTODOS QUE USAN ESTE MÉTODO:</u> <br>
	 * - Constructor de JuegoGUI <br>
	 * - actionPerformed() (Clase JuegoGUI)
	 */
	public void setDado() {
		
		try {
			this.dado = getJugador(obtenerCoordenadaJugadorJuega()).getVelocidadParaLuchar();
		
		} catch (JuegoException e) {
			e.printStackTrace();
		}
	}
	
		
		
	
	/* --------------- Función getNombreJugadorQueJuega () --------------- */
	/**
	 * Pues eso, devuelve un String el nombre de la clase que está utilizando el Jugador 
	 * del turno actual.
	 * 
	 * <u>MÉTODOS QUE USAN ESTE MÉTODO:</u> <br>
	 * - Constructor de JuegoGUI <br>
	 * - actionPerformed() (Clase JuegoGUI)
	 * 
	 * @return
	 */
	public String getNombreJugadorQueJuega() {
		
		String resultado = null;
		
		try {
			resultado = (getJugador(obtenerCoordenadaJugadorJuega()).getNombre());
		} catch (JuegoException e) {
			e.printStackTrace();
		}
		
		
		return (resultado);
	}

	
	
	/* --------------- Función proximoJugador () --------------- */
	/**
	 * Método que le suma 1 unidad al atributo "jugadorJuega", para 
	 * cambiar el turno al siguiente Jugador. 
	 * 
	 * <u>MÉTODOS QUE USAN ESTE MÉTODO:</u> <br>
	 * - luchar() <br>
	 * - actionPerformed() (Clase JuegoGUI)
	 * 
	 * @param haMuertoJugador
	 */
	public void proximoJugador(boolean haMuertoJugador) {
		
		/*EL ORDEN DE TURNOS SUELE FALLAR CUANDO MUERE UN JUGADOR.
		 * NO HE PODIDO SOLUCIONARLO*/
		
		//if (haMuertoJugador == false) {
			
			if (jugadorJuega < coordenadaJugadores.size() - 1) {
				this.jugadorJuega++;
				
			}else {
				this.jugadorJuega = 0;
			}
		
		/*}else if ((haMuertoJugador == true) && (jugadorJuega == 0)) {
			this.jugadorJuega++;
		
		}else if ((haMuertoJugador == true) && (jugadorJuega != 0)) {
			//No ocurre nada.
		}*/
	}

	
	
	/* --------------- Función getGanador () --------------- */
	public String getGanador() {
		
		String resultado = "";
		
		if (coordenadaJugadores.size() != 1) {
			resultado = " " + tablero.get(coordenadaJugadores.get(jugadorJuega)).getType().toString();
			
		}else {
			resultado = " " + tablero.get(coordenadaJugadores.get(0)).getType().toString();
		}
				
		
		return (resultado);
	}

	
	
	/* --------------- Función obtenerElementoTablero () --------------- */
	/**
	 * Método que devuelve el Element (o Jugador) de la Coordenada que le pases 
	 * por parámetro. <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTE MÉTODO:</u> <br>
	 * - asignarIcono() (Clase JuegoGUI)
	 * 
	 * @param coordenada
	 * @return
	 */
	public Element obtenerElementoTablero(Coordenada coordenada) {
		return tablero.get(coordenada);
	}
	
	
	
	/* --------------- Función obtenerCoordenadaJugadorJuega () --------------- */
	/**
	 * Método que devuelve la Coordenada donde se sitúa el Jugador que tiene el turno. <br> <br>
	 * 
	 * <u>MÉTODOS QUE USAN ESTE MÉTODO:</u> <br>
	 * - getNombreJugadorJuega() <br>
	 * - cambiaJugadorAPosicion() <br>
	 * - getNextPosition() <br>
	 *  - moverJugador()
	 *  
	 * @return
	 */
	public Coordenada obtenerCoordenadaJugadorJuega() {
		return coordenadaJugadores.get(jugadorJuega);
	}
	
	
	
	/* --------------- Función decrementaDado () --------------- */
	/**
	 * Método que decrementa el dado en 1 unidad. Se usa cuando se mueve un 
	 * Jugador a una casilla.
	 * 
	 * <u>MÉTODOS QUE USAN ESTE MÉTODO:</u> <br>
	 * - actionPerformed() (Clase JuegoGUI) <br>
	 * 
	 */
	public void decrementaDado() {
		this.dado--;
	}

	
	
	/* ======================= TOSTRING() ====================== */
	/**
	 * Escribe el tablero en formato no gráfico. Devuelve el string con la
	 * información
	 */
	@Override
	public String toString() {
		StringBuilder resul = new StringBuilder();
		resul.append(crearSeparador());
		resul.append("     |");

		for (int fila = 0; fila < Constantes.TAMANNO; fila++) {
			for (int columna = 0; columna < Constantes.TAMANNO; columna++) {
				Coordenada coor = new Coordenada(columna, fila);

				if (this.tablero.get(coor) != null) {
					resul.append(" " + this.tablero.get(coor).getType().getSymbol() + " ");
				} else {
					resul.append("   ");
				}

				resul.append("|");
			}
			resul.append(System.lineSeparator()).append(crearSeparador()).append("     |");
		}
		resul.delete(resul.length() - 5, resul.length());
		return resul.toString();
	}



	/* ==================== GETTERS/SETTERS [PARA TESTS] ==================== */
	public Map<Coordenada, Element> getTablero() {
		return tablero;
	}



	public int getJugadorJuega() {
		return jugadorJuega;
	}

	
}
