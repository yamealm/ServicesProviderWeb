package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NautaTransactionRejectedException extends Exception {

    private static final long serialVersionUID = 1L;

    public NautaTransactionRejectedException(String message) {
        super(message);
    }

    public NautaTransactionRejectedException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NautaTransactionRejectedException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
