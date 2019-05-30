package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class SubstringBetweenException extends Exception {

    private static final long serialVersionUID = 1L;

    public SubstringBetweenException(String message) {
        super(message);
    }

    public SubstringBetweenException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public SubstringBetweenException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
