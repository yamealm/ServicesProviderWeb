package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class InvalidChangeCommisionException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidChangeCommisionException(String message) {
        super(message);
    }

    public InvalidChangeCommisionException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public InvalidChangeCommisionException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
