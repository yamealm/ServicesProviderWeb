package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class TopUpProductNotAvailableException extends Exception {

    private static final long serialVersionUID = 1L;

    public TopUpProductNotAvailableException(String message) {
        super(message);
    }

    public TopUpProductNotAvailableException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public TopUpProductNotAvailableException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
