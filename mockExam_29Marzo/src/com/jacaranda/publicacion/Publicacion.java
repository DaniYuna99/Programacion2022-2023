package com.jacaranda.publicacion;

import java.time.LocalDateTime;
import java.util.Objects;

import com.jacaranda.usuario.Usuario;


public abstract class Publicacion implements Valorable, Comparable<Publicacion> {

	/* ======================= ATRIBUTOS ======================= */
	protected String texto;
	private LocalDateTime fechaCreacion;
	protected int valoracion;
	private int codigo;
	private Usuario usuario;
	
	
	/* /\/\/\/\ ESTÁTICOS /\/\/\/\ */
	private static int codigoSiguiente = 0;

	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Publicacion (String texto, Usuario usuario) throws PublicacionException {
		
		if (usuario != null) {
			
			setTexto(texto);
			this.usuario = usuario;
			this.fechaCreacion = LocalDateTime.now();
			this.codigo = codigoSiguiente++;
		
		}else if (usuario == null) {
			throw new PublicacionException("El usuario es nulo.");
		}
	}
	
	
	
	/* ======================== MÉTODOS ======================== */
	
	/* ------------ Función setTexto () ------------ */
	protected abstract void setTexto(String texto) throws PublicacionException;

	
	
	/* ------------ Función valorar () ------------ */
	@Override
	public abstract boolean valorar(String valoracion) throws PublicacionException;
		

	
	/* ----------- Función isAnterior () ----------- */
	public boolean isAnterior (Publicacion publicacion) {
		return (this.fechaCreacion.isBefore(publicacion.getFechaCreacion()));
	}


	
	/* ==================== GETTERS/SETTERS ==================== */
	public String getTexto() {
		return texto;
	}


	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}


	public int getValoracion() {
		return valoracion;
	}


	public int getCodigo() {
		return codigo;
	}


	public Usuario getUsuario() {
		return usuario;
	}
	
	
		
	/* ===================== COMPARE TO() ====================== */
	@Override
	public int compareTo(Publicacion pu) {
		
		int resultado = 0;
		
		if ((pu != null)) {
			resultado = (pu.getValoracion() == this.getValoracion())
						? (pu.getFechaCreacion().compareTo(this.getFechaCreacion()))
						: (pu.getValoracion() - this.getValoracion());
		
		}else if (pu == null) {
			resultado = -1;
		}
		
		
		return (resultado);
	}
	
	
	
	/* ====================== HASH CODE() ====================== */
	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaCreacion, texto, usuario, valoracion);
	}
	
	
	
	/* ======================= EQUALS() ======================== */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		
		if ((sonIguales == false) && (obj instanceof Publicacion) && (obj != null)) {
			
			Publicacion otro = (Publicacion) obj;
			
			
			if ((this.texto.equals(otro.texto)) 
					&& (this.getClass().equals(otro.getClass()))) {
				
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
	
	/* ======================= TOSTRING() ====================== */
	@Override
	public String toString() {
		
		return String.format("%s \n"
				   + "Publicación: %s \n "
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
