package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class MaxAmountBalanceException extends Exception {

    private static final long serialVersionUID = 1L;

    public MaxAmountBalanceException(String message) {
        super(message);
    }

    public MaxAmountBalanceException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public MaxAmountBalanceException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
