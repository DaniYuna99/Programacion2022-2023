package com.jacaranda.publicacion;

import com.jacaranda.usuario.Usuario;

public class Tweet extends Publicacion {

	/* ======================= ATRIBUTOS ======================= */
	/*NINGUNO*/
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Tweet (String texto, Usuario usuario) throws PublicacionException {
		
		super(texto, usuario);
		
		
		if (texto.length() < 0) {
			throw new PublicacionException ("El texto tiene menos caracteres de lo permitido.");
		
		}else if (texto.length() > 50) {
			throw new PublicacionException ("El texto tiene más caracteres de lo permitido.");
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
			
			this.valoracion += Valoraciones.valueOf(valoracion).getValoracion() * 2;
			seHaValorado = true;
		}
		
		
		return (seHaValorado);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		
		return String.format("%s \n\n"
				   + "Publicación: %s \n"
				   + "Realizada por: %s \n"
				   + "Valoración: %s \n"
				   + "Fecha de publicación: %s \n",
				   
				   this.getClass().getSimpleName(), 
				   this.getTexto(),
				   this.getUsuario().getLogin(), 
				   this.getValoracion(),
				   this.getFechaCreacion());
			
	}

}
