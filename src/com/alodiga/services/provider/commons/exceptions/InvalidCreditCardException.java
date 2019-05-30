package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class InvalidCreditCardException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidCreditCardException(String message) {
        super(message);
    }

    public InvalidCreditCardException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public InvalidCreditCardException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
