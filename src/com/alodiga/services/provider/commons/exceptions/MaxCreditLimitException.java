package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class MaxCreditLimitException extends Exception {

    private static final long serialVersionUID = 1L;

    public MaxCreditLimitException(String message) {
        super(message);
    }

    public MaxCreditLimitException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public MaxCreditLimitException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
