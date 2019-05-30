package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class PurchaseCanceledException extends Exception {

    private static final long serialVersionUID = 1L;

    public PurchaseCanceledException(String message) {
        super(message);
    }

    public PurchaseCanceledException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public PurchaseCanceledException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
