package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class MaxNumberTransactionDailyPerSenderException extends Exception {

    private static final long serialVersionUID = 1L;

    public MaxNumberTransactionDailyPerSenderException(String message) {
        super(message);
    }

    public MaxNumberTransactionDailyPerSenderException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public MaxNumberTransactionDailyPerSenderException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}