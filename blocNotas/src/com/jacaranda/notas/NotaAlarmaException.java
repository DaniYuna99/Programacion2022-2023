package com.jacaranda.notas;

public class NotaAlarmaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	
	public NotaAlarmaException() {
		super();
	}

	
	public NotaAlarmaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	
	public NotaAlarmaException(String message, Throwable cause) {
		super(message, cause);
	}

	
	public NotaAlarmaException(String message) {
		super(message);
	}

	
	public NotaAlarmaException(Throwable cause) {
		super(cause);
	}

}
