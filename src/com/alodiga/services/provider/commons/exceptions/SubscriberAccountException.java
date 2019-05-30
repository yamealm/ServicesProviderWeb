package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class SubscriberAccountException extends Exception {

    private static final long serialVersionUID = 1L;

    public SubscriberAccountException(String message) {
        super(message);
    }

    public SubscriberAccountException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public SubscriberAccountException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
