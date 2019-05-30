package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class MaxAmountDailyException extends Exception {

    private static final long serialVersionUID = 1L;

    public MaxAmountDailyException(String message) {
        super(message);
    }

    public MaxAmountDailyException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public MaxAmountDailyException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
