package com.sms.domains;
/**
 * 
 * @author handong
 *
 */
public class SGIPException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SGIPException() {
		super();
	}

	public SGIPException(String message, Throwable cause) {
		super(message, cause);
	}

	public SGIPException(String message) {
		super(message);
	}

	public SGIPException(Throwable cause) {
		super(cause);
	}
}
