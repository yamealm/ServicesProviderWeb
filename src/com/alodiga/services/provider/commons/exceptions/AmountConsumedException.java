package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class AmountConsumedException extends Exception {

    private static final long serialVersionUID = 1L;

    public AmountConsumedException(String message) {
        super(message);
    }

    public AmountConsumedException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public AmountConsumedException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
