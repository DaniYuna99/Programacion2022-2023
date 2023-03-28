package com.jacaranda.publicacion;

import com.jacaranda.usuario.Usuario;

public class Recomendacion extends Publicacion {

	/* ======================= ATRIBUTOS ======================= */
	private int numeroEstrellas;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Recomendacion(String texto, Usuario usuario, int numeroEstrellas) 
			throws PublicacionException {
		
		super(texto, usuario);
		
		
		if ((texto != null) && (!texto.trim().isBlank()) 
				&& (texto.length() >= 100 && texto.length() <= 200) 
				&& (usuario != null) && (numeroEstrellas >= 1) 
				&& (numeroEstrellas <= 5)) {
			
			this.numeroEstrellas = numeroEstrellas;
		
		}else if (texto.length() < 100) {
			throw new PublicacionException ("El texto tiene menos de 100 caracteres.");
		
		}else if (texto.length() > 200) {
			throw new PublicacionException ("El texto tiene más de 200 caracteres.");
		
		}else if (numeroEstrellas < 1) {
			throw new PublicacionException ("El número de estrellas es inferior a lo permitido.");
		
		}else if (numeroEstrellas > 5) {
			throw new PublicacionException ("El número de estrellas es superior a lo permitido.");
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
	public boolean valorar(String valoracion) {
		
		boolean seHaValorado = false;
		
		if ((valoracion != null) && (!valoracion.trim().isBlank())
				&& ((valoracion.equalsIgnoreCase("MUYMALA") 
				|| (valoracion.equalsIgnoreCase("REGULAR")
				|| (valoracion.equalsIgnoreCase("NORMAL") 
				|| (valoracion.equalsIgnoreCase("BUENA") 
				|| (valoracion.equalsIgnoreCase("MUYBUENA") 
				|| (valoracion.equalsIgnoreCase("SUPERBUENA"))))))))) {
			
			this.valoracion += Valoraciones.valueOf(valoracion).getValoracion();
			seHaValorado = true;
		}
		
		
		return (seHaValorado);
	}
	
	

	/* ==================== GETTERS/SETTERS ==================== */
	public int getNumeroEstrellas() {
		return numeroEstrellas;
	}


	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		
		return String.format("%s \n\n"
				   + "Publicación: %s \n"
				   + "Realizada por: %s \n"
				   + "Valoración: %s \n"
				   + "Fecha de publicación: %s \n"
				   + "Número de estrellas: %s",
				   
				   this.getClass().getSimpleName(), 
				   this.getTexto(),
				   this.getUsuario().getLogin(), 
				   this.getValoracion(),
				   this.getFechaCreacion(),
				   this.getNumeroEstrellas());
			
	}

}
