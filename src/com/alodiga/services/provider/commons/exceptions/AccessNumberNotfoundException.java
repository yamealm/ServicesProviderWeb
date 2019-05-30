package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class AccessNumberNotfoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public AccessNumberNotfoundException(String message) {
        super(message);
    }

    public AccessNumberNotfoundException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public AccessNumberNotfoundException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
