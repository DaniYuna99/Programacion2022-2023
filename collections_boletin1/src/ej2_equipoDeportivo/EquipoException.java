package ej2_equipoDeportivo;

public class EquipoException extends Exception {

	private static final long serialVersionUID = 1L;

	
	public EquipoException() {}

	
	public EquipoException(String message) {
		super(message);
	}

	
	public EquipoException(Throwable cause) {
		super(cause);
	}

	
	public EquipoException(String message, Throwable cause) {
		super(message, cause);
	}

	
	public EquipoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
