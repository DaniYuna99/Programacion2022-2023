package com.jacaranda.bloc;

public class BlocException extends Exception {

	private static final long serialVersionUID = 1L;

	
	public BlocException() {}

	
	public BlocException(String message) {
		super(message);
	}

	
	public BlocException(Throwable cause) {
		super(cause);
	}

	
	public BlocException(String message, Throwable cause) {
		super(message, cause);
	}

	
	public BlocException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
