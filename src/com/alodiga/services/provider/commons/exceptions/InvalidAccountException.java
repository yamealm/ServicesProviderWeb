package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class InvalidAccountException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidAccountException(String message) {
        super(message);
    }

    public InvalidAccountException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public InvalidAccountException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
