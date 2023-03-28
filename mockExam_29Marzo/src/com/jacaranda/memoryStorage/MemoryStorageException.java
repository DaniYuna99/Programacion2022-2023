package com.jacaranda.memoryStorage;

public class MemoryStorageException extends Exception {

	private static final long serialVersionUID = 1L;

	public MemoryStorageException() {}

	
	public MemoryStorageException(String message) {
		super(message);
	}

	public MemoryStorageException(Throwable cause) {
		super(cause);
	}

	public MemoryStorageException(String message, Throwable cause) {
		super(message, cause);
	}

	public MemoryStorageException(String message, Throwable cause, 
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
