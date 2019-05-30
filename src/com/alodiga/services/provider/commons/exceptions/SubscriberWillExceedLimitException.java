package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class SubscriberWillExceedLimitException extends Exception {

    private static final long serialVersionUID = 1L;

    public SubscriberWillExceedLimitException(String message) {
        super(message);
    }

    public SubscriberWillExceedLimitException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public SubscriberWillExceedLimitException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
