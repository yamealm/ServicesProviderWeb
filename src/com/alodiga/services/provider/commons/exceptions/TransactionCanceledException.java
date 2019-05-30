package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class TransactionCanceledException extends Exception {

    private static final long serialVersionUID = 1L;

    public TransactionCanceledException(String message) {
        super(message);
    }

    public TransactionCanceledException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public TransactionCanceledException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
