package main.java.euro.model;

public class CombinacionException extends Exception {

	private static final long serialVersionUID = 1L;

	
	public CombinacionException() {}

	
	public CombinacionException(String message) {
		super(message);
	}

	
	public CombinacionException(String message, Throwable cause) {
		super(message, cause);
	}

}
