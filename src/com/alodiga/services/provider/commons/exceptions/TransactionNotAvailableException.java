package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class TransactionNotAvailableException extends Exception {

    private static final long serialVersionUID = 1L;

    public TransactionNotAvailableException(String message) {
        super(message);
    }

    public TransactionNotAvailableException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public TransactionNotAvailableException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
