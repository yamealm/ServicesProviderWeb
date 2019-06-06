package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class PinFreeNotfoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public PinFreeNotfoundException(String message) {
        super(message);
    }

    public PinFreeNotfoundException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public PinFreeNotfoundException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}