package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class PinNotfoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public PinNotfoundException(String message) {
        super(message);
    }

    public PinNotfoundException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public PinNotfoundException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
