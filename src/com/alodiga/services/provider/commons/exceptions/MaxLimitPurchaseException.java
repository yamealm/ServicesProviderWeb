package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;


public class MaxLimitPurchaseException extends Exception {
    
    private static final long serialVersionUID = 1L;

    public MaxLimitPurchaseException(String message) {
        super(message);
    }

    public MaxLimitPurchaseException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public MaxLimitPurchaseException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
    
}
