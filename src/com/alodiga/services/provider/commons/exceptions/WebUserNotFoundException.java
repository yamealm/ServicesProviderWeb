package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class WebUserNotFoundException extends Exception {
	 private static final long serialVersionUID = 1L;

	    public WebUserNotFoundException(String message) {
	        super(message);
	    }

	    public WebUserNotFoundException(Logger logger, String message, Exception e) {
	        super(message, e);
	        logger.error(message, e);
	    }

	    public WebUserNotFoundException(String message, StackTraceElement[] stackTrace) {
	        super(message);
	        setStackTrace(stackTrace);
	    }
}
