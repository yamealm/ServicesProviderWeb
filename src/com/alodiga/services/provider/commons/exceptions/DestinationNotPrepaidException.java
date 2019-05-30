package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class DestinationNotPrepaidException extends Exception {

    private static final long serialVersionUID = 1L;

    public DestinationNotPrepaidException(String message) {
        super(message);
    }

    public DestinationNotPrepaidException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public DestinationNotPrepaidException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
