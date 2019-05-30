package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NegativeBalanceAlopoinsException extends Exception {

    private static final long serialVersionUID = 1L;

    public NegativeBalanceAlopoinsException(String message) {
        super(message);
    }

    public NegativeBalanceAlopoinsException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NegativeBalanceAlopoinsException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
