package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class CommissionCalculationException extends Exception {

    private static final long serialVersionUID = 1L;

    public CommissionCalculationException(String message) {
        super(message);
    }

    public CommissionCalculationException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public CommissionCalculationException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
