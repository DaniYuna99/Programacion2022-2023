package com.jacaranda.publicacion;

public enum Valoraciones {
	
	//Valores del enumerado y sus valores asignados
	SUPERBUENA(3),
	MUYBUENA(2),
	BUENA(1),
	NORMAL(0),
	REGULAR(-1),
	MUYMALA(-2);
	
	
	//Atributo
	private int valoracion;
	
	
	//Constructor
	private Valoraciones(int valoracion) {
		this.valoracion = valoracion;
	}
	
	
	//Getter
	public int getValoracion() {
		return valoracion;
	}
	
	

}
