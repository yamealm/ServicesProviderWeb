package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class FavoriteDestinationCombinationNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public FavoriteDestinationCombinationNotFoundException(String message) {
        super(message);
    }

    public FavoriteDestinationCombinationNotFoundException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public FavoriteDestinationCombinationNotFoundException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
