package com.jacaranda.memoryStorage;

import java.util.Arrays;

import com.jacaranda.comparador.ValoracionFechaCreacion_Comparator;
import com.jacaranda.publicacion.Post;
import com.jacaranda.publicacion.Publicacion;
import com.jacaranda.publicacion.PublicacionException;
import com.jacaranda.publicacion.Recomendacion;
import com.jacaranda.publicacion.Tweet;
import com.jacaranda.usuario.Usuario;



public class MemoryStorage {

	/* ======================= ATRIBUTOS ======================= */
	
	private Usuario[] usuarios;
	private Publicacion[] publicaciones;
	private int numUsuariosActuales;
	private int numPublicacionesActuales;
	
	
	/* /\/\/\/\ CONSTANTES /\/\/\/\ */
	private final static int NUM_MAXIMO_USUARIOS = 15;
	private final static int NUM_MAXIMO_PUBLICACIONES = 50;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public MemoryStorage() {
		super();
		this.numUsuariosActuales = 0;
		this.numPublicacionesActuales = 0;
		usuarios = new Usuario[NUM_MAXIMO_USUARIOS];
		publicaciones = new Publicacion[NUM_MAXIMO_PUBLICACIONES];
	}

	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función posicionUsuario() ------------ */
	/**
	 * Este método devuelve la posición de un usuario cuyo 
	 * login es idéntico al que se le pasa por parámetro. 
	 * Si no encuentra ninguno, devuelve un -1. 
	 * 
	 * <br> <br>
	 * 
	 * <u> MÉTODOS QUE USAN ESTA FUNCIÓN</u>: <br>
	 * - addUsuario() <br>
	 * - addPublicacion()
	 * 
	 * @param login
	 * @param password
	 */
	private int posicionUsuario (String login) {
		
		int pos = -1;
		
		
		for (int i = 0; i < usuarios.length && pos == -1; i++) {
			
			if (usuarios[i] != null) {
				
				if (usuarios[i].getLogin().equals(login)) {
					pos = i;
				}
			}
		}
		
		
		return (pos);
	}
	
	
	
	/* --------------- Función addUsuario() -------------- */
	public void addUsuario (String login, String password) {
		
		if ((login != null) && (!login.trim().isBlank())
					&& (password != null) && (!password.trim().isBlank())) {
			
			if ((posicionUsuario(login) == -1)) {
				usuarios[numUsuariosActuales] = new Usuario(login, password);
				numUsuariosActuales++;
			}
		}
	}

	
	
	/* ------ Función addPublicacion() [SOBRECARGADO] ----- */
	
	//Añadir un Tweet
	public void addPublicacion (String texto, String login) throws PublicacionException {
		
		int posicion = posicionUsuario(login);
		
		if ((posicion != -1) && (numPublicacionesActuales < 49)) {
			Usuario usuario = this.usuarios[posicion];
			Publicacion tweet = new Tweet(texto, usuario);
			this.publicaciones[numPublicacionesActuales++ % NUM_MAXIMO_PUBLICACIONES] = tweet;
		}
	}
	
	
	//Añadir un Post
	public void addPublicacion (String texto, String login, String tema) throws PublicacionException {
		
		int posicion = posicionUsuario(login);
		
		if (posicion != -1) {
			Usuario usuario = this.usuarios[posicion];
			Publicacion post = new Post(texto, usuario, tema);
			this.publicaciones[numPublicacionesActuales++ % NUM_MAXIMO_PUBLICACIONES] = post;
		}		
	}

	
	//Añadir una Recomendacion
	public void addPublicacion (String texto, String login, int valoracion) throws PublicacionException {
	
		int posicion = posicionUsuario(login);
		
		if (posicion != -1) {
			Usuario usuario = this.usuarios[posicion];
			Publicacion recomendacion = new Recomendacion(texto, usuario, valoracion);
			this.publicaciones[numPublicacionesActuales++ % NUM_MAXIMO_PUBLICACIONES] = recomendacion;
		}		
	}


	
	/* ------- Función mostrarListaPublicaciones() ------- */
	public String mostrarListaPublicaciones() {
		
		Arrays.sort(this.publicaciones, new ValoracionFechaCreacion_Comparator());
		
		return (listarContenido(publicaciones));
	}
	
	
	
	/* ------------- Función mostrarTweets() ------------- */
	public String mostrarTweets () {
		
		Arrays.sort(this.publicaciones, new ValoracionFechaCreacion_Comparator());
		
		
		//Esto es para saber cuantos Tweets hay en el array "publicaciones", 
		//para saber el tamaño del array, para transferirlos allí.
		int contadorTweets = 0;
		
		for (Publicacion p : this.publicaciones) {
			
			if (p instanceof Tweet) {
				contadorTweets++;
			}
		}
		
		
		//Al saber la cantidad de instancias de Tweet hay, se recorre el array "publicaciones", 
		//para recogerlos, y copiarlos a otro array. Luego, se muestra con el método "listarContenido()"
		Publicacion[] arrayTweets = new Tweet[contadorTweets];
		int indiceArrayTweets = 0;
		
		
		for (Publicacion p : this.publicaciones) {
			
			if (p instanceof Tweet) {
				arrayTweets[indiceArrayTweets++] = p;
			}
		}
		
		
		return (listarContenido(arrayTweets));
	}
	
	
	
	/* -------------- Función mostrarPosts() ------------- */
	public String mostrarPosts () {
		
		Arrays.sort(this.publicaciones, new ValoracionFechaCreacion_Comparator());
		
		
		//Esto es para saber cuantos Posts hay en el array "publicaciones", 
		//para saber el tamaño del array, para transferirlos allí.
		int contadorPosts = 0;
		
		for (Publicacion p : this.publicaciones) {
			
			if (p instanceof Post) {
				contadorPosts++;
			}
		}
		
		
		//Al saber la cantidad de instancias de Tweet hay, se recorre el array "publicaciones", 
		//para recogerlos, y copiarlos a otro array. Luego, se muestra con el método "listarContenido()"
		Publicacion[] arrayPosts = new Post[contadorPosts];
		int indiceArrayPosts = 0;
		
		
		for (Publicacion p : this.publicaciones) {
			
			if (p instanceof Post) {
				arrayPosts[indiceArrayPosts++] = p;
			}
		}
		
		
		return (listarContenido(arrayPosts));
	}
	
	
	
	/* --------- Función mostrarRecomendaciones() -------- */
	public String mostrarRecomendaciones () {
		
		Arrays.sort(this.publicaciones, new ValoracionFechaCreacion_Comparator());
		
		
		//Esto es para saber cuantos Posts hay en el array "publicaciones", 
		//para saber el tamaño del array, para transferirlos allí.
		int contadorRecomendaciones = 0;
		
		for (Publicacion p : this.publicaciones) {
			
			if (p instanceof Recomendacion) {
				contadorRecomendaciones++;
			}
		}
		
		
		//Al saber la cantidad de instancias de Tweet hay, se recorre el array "publicaciones", 
		//para recogerlos, y copiarlos a otro array. Luego, se muestra con el método "listarContenido()"
		Publicacion[] arrayRecomendaciones = new Recomendacion[contadorRecomendaciones];
		int indiceArrayRecomendaciones = 0;
		
		
		for (Publicacion p : this.publicaciones) {
			
			if (p instanceof Recomendacion) {
				arrayRecomendaciones[indiceArrayRecomendaciones++] = p;
			}
		}
		
		
		return (listarContenido(arrayRecomendaciones));
	}
	
	
	
	/* ------------- Función listarContenido() ----------- */
	private String listarContenido (Publicacion[] publicaciones) {
		
		StringBuilder sb = new StringBuilder();
		
		
		for (Publicacion p : publicaciones) {
			
			if (p != null) {
				sb.append(p).append("\n" + "-------------").append(System.lineSeparator());
			}
		}
		
		
		return (sb.toString());
	}

	
}
