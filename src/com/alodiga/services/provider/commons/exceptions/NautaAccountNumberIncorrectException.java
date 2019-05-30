package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NautaAccountNumberIncorrectException extends Exception {

    private static final long serialVersionUID = 1L;

    public NautaAccountNumberIncorrectException(String message) {
        super(message);
    }

    public NautaAccountNumberIncorrectException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NautaAccountNumberIncorrectException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
