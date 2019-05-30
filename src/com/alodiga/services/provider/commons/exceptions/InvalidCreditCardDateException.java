package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class InvalidCreditCardDateException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidCreditCardDateException(String message) {
        super(message);
    }

    public InvalidCreditCardDateException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public InvalidCreditCardDateException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
