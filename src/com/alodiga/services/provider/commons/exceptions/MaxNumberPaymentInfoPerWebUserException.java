package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class MaxNumberPaymentInfoPerWebUserException extends Exception {

    private static final long serialVersionUID = 1L;

    public MaxNumberPaymentInfoPerWebUserException(String message) {
        super(message);
    }

    public MaxNumberPaymentInfoPerWebUserException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public MaxNumberPaymentInfoPerWebUserException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
