package com.alodiga.services.provider.commons.exceptions;

public class InvalidPaymentInfoException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidPaymentInfoException(String message) { super(message);}
	
	public InvalidPaymentInfoException(String message, 
		StackTraceElement[] stackTrace) {
		super(message);
		setStackTrace(stackTrace);
	}
}
