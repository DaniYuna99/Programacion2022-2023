package elementos;

public class JugadorException extends Exception {

	private static final long serialVersionUID = 1L;

	
	public JugadorException() {}

	
	public JugadorException(String message) {
		super(message);
	}

	
	public JugadorException(Throwable cause) {
		super(cause);
	}

	
	public JugadorException(String message, Throwable cause) {
		super(message, cause);
	}

}
