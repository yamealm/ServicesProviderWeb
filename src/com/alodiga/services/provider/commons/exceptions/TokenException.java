package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class TokenException extends Exception {

    private static final long serialVersionUID = 1L;

    public TokenException(String message) {
        super(message);
    }

    public TokenException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public TokenException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
