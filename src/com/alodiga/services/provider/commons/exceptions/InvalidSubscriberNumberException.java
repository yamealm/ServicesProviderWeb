package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class InvalidSubscriberNumberException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidSubscriberNumberException(String message) {
        super(message);
    }

    public InvalidSubscriberNumberException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public InvalidSubscriberNumberException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
