package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class PinAlreadyExistException extends Exception {
	private static final long serialVersionUID = 1L;

    public PinAlreadyExistException(String message) {
        super(message);
    }

    public PinAlreadyExistException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public PinAlreadyExistException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
