package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NautaTransactionRepeatedException extends Exception {

    private static final long serialVersionUID = 1L;

    public NautaTransactionRepeatedException(String message) {
        super(message);
    }

    public NautaTransactionRepeatedException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NautaTransactionRepeatedException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
