package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class FavoriteDestinationNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public FavoriteDestinationNotFoundException(String message) {
        super(message);
    }

    public FavoriteDestinationNotFoundException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public FavoriteDestinationNotFoundException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
