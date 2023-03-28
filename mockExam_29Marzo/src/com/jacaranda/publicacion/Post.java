package com.jacaranda.publicacion;

import com.jacaranda.usuario.Usuario;

public class Post extends Publicacion {

	/* ======================= ATRIBUTOS ======================= */
	private int numeroLecturas;
	private String tema;
		
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Post(String texto, Usuario usuario, String tema) 
			throws PublicacionException {
		
		super(texto, usuario);
		
		
		if ((texto != null) && (!texto.trim().isBlank())
				&& (usuario != null) && (tema != null)
				&& (!tema.trim().isBlank())) {
			
			this.numeroLecturas = 0;
			this.tema = tema;
			
		}else if ((tema == null) || (tema.trim().isBlank())) {
			throw new PublicacionException ("El tema es nulo o está vacío.");
		
		}
	}


	
	/* ======================== MÉTODOS ======================== */
	
	/* ---------------- Función setTexto () ---------------- */
	@Override
	protected void setTexto(String texto) throws PublicacionException {
		
		if ((texto != null) && (!texto.trim().isBlank())) {
			this.texto = texto;
			
		}else {
			throw new PublicacionException("El texto es nulo, o está vacío.");
		}
	}
	
	
	
	/* ---------------- Función valorar () ----------------- */
	@Override
	public boolean valorar(String valoracion) throws PublicacionException {
		
		boolean seHaValorado = false;
		
		if ((valoracion != null) && (!valoracion.trim().isBlank())
				&& ((valoracion.equalsIgnoreCase("MUYMALA") 
				|| (valoracion.equalsIgnoreCase("REGULAR")
				|| (valoracion.equalsIgnoreCase("NORMAL") 
				|| (valoracion.equalsIgnoreCase("BUENA") 
				|| (valoracion.equalsIgnoreCase("MUYBUENA") 
				|| (valoracion.equalsIgnoreCase("SUPERBUENA"))))))))) {
			
			this.valoracion += Valoraciones.valueOf(valoracion).getValoracion();
			this.numeroLecturas++;
			seHaValorado = true;
			
		}else {
			throw new PublicacionException ("La valoración es errónea.");
		}
		
		
		return (seHaValorado);
	}



	/* ==================== GETTERS/SETTERS ==================== */
	public int getNumeroLecturas() {
		return numeroLecturas;
	}


	public String getTema() {
		return tema;
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		
		return String.format("%s \n\n"
				   + "Publicación: %s \n"
				   + "Realizada por: %s \n"
				   + "Valoración: %s \n"
				   + "Fecha de publicación: %s", 
				   
				   this.getClass().getSimpleName(), 
				   this.getTexto(),
				   this.getUsuario().getLogin(), 
				   this.getValoracion(),
				   this.getFechaCreacion());
	}

}
