package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class PinFreeQuantityExceededException extends Exception {

    private static final long serialVersionUID = 1L;

    public PinFreeQuantityExceededException(String message) {
        super(message);
    }

    public PinFreeQuantityExceededException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public PinFreeQuantityExceededException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
