package main.java.euro.model;

public class HistorialException extends Exception {

	private static final long serialVersionUID = 1L;


	public HistorialException() {}

	
	public HistorialException(String message) {
		super(message);
	}

	
	public HistorialException(String message, Throwable cause) {
		super(message, cause);
	}


}
