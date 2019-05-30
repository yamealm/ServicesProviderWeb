package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class MaxAmountPerTransactionException extends Exception {

    private static final long serialVersionUID = 1L;

    public MaxAmountPerTransactionException(String message) {
        super(message);
    }

    public MaxAmountPerTransactionException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public MaxAmountPerTransactionException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
