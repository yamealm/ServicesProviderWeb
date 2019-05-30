package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NautaInsufficientRetailerAccountException extends Exception {

    private static final long serialVersionUID = 1L;

    public NautaInsufficientRetailerAccountException(String message) {
        super(message);
    }

    public NautaInsufficientRetailerAccountException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NautaInsufficientRetailerAccountException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
