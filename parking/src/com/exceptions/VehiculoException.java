package com.exceptions;

public class VehiculoException extends Exception {

	//Añado esto para que se calle el maldito programa
	private static final long serialVersionUID = 1L;

	
	public VehiculoException() {}

	public VehiculoException(String message) {
		super(message);
	}

	public VehiculoException(Throwable cause) {
		super(cause);
	}

	public VehiculoException(String message, Throwable cause) {
		super(message, cause);
	}

	public VehiculoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
