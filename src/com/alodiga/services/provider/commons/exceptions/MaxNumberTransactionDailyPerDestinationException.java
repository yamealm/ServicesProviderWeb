package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class MaxNumberTransactionDailyPerDestinationException extends Exception {

    private static final long serialVersionUID = 1L;

    public MaxNumberTransactionDailyPerDestinationException(String message) {
        super(message);
    }

    public MaxNumberTransactionDailyPerDestinationException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public MaxNumberTransactionDailyPerDestinationException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
