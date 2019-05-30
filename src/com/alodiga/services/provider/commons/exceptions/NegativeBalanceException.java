package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NegativeBalanceException extends Exception {

	 private static final long serialVersionUID = 1L;

	    public NegativeBalanceException(String message) {
	        super(message);
	    }

	    public NegativeBalanceException(Logger logger, String message, Exception e) {
	        super(message, e);
	        logger.error(message, e);
	    }

	    public NegativeBalanceException(String message, StackTraceElement[] stackTrace) {
	        super(message);
	        setStackTrace(stackTrace);
	    }
}
