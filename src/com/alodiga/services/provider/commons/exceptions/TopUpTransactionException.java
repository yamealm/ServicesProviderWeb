package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class TopUpTransactionException extends Exception {

    private static final long serialVersionUID = 1L;

    public TopUpTransactionException(String message) {
        super(message);
    }

    public TopUpTransactionException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public TopUpTransactionException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
