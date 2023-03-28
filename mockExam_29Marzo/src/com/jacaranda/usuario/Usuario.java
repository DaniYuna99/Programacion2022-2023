package com.jacaranda.usuario;

import java.util.Objects;


public class Usuario {

	/* ======================= ATRIBUTOS ======================= */
	private String login;
	private String password;
	
	
	
	/* ===================== CONSTRUCTORES ===================== */
	public Usuario (String login, String password) {
		
		if ((login != null) && (!login.trim().isEmpty())
				&& (password != null) && (!password.trim().isBlank())) {
					
			this.login = login;
			this.password = password;
			
		}
	}

	
	
	/* ======================== MÉTODOS ======================== */
	
	/* --------------- Función setPassword () --------------- */
	public boolean setPassword(String oldpass, String newpass) {
		
		boolean isSetted = false;
		
		if ((oldpass != null) && (!oldpass.trim().isBlank()) 
				&& (newpass != null) && (!newpass.trim().isBlank())
				&& (this.password.equals(oldpass))) {
			
			this.password = newpass;
			isSetted = true;
		}
		
		
		return (isSetted);
	}
	
	
	/* --------------- Función checkPassword () --------------- */
	public boolean checkPassword (String passAComprobar) {
		
		return ((passAComprobar != null) && (passAComprobar.trim().isBlank()) 
				&& (this.password.equals(passAComprobar)));
	}
	
	

	/* ==================== GETTERS/SETTERS ==================== */
	public String getLogin() {
		return login;
	}

	
	
	/* ===================== HASH CODE() ======================= */
	@Override
	public int hashCode() {
		return Objects.hash(login);
	}
	
	
		
	/* ======================= EQUALS() ======================== */
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = (this == obj);
		
		
		if ((sonIguales == false) && (obj instanceof Usuario) && (obj != null)) {
			
			Usuario otro = (Usuario) obj;
			
			if (this.login.equals(otro.login)) {
				sonIguales = true;
			}
		}
		
		
		return (sonIguales);
	}
	
	
}
