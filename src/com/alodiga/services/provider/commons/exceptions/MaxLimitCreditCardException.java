package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;


public class MaxLimitCreditCardException extends Exception{
    
    private static final long serialVersionUID = 1L;

    public MaxLimitCreditCardException(String message) {
        super(message);
    }

    public MaxLimitCreditCardException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public MaxLimitCreditCardException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
    
}
