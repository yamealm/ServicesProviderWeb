package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class DisabledUserException extends Exception {

    private static final long serialVersionUID = 1L;

    public DisabledUserException(String message) {
        super(message);
    }

    public DisabledUserException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public DisabledUserException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
