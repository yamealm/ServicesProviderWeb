package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NautaTransactionAmountLimitExceededException extends Exception {

    private static final long serialVersionUID = 1L;

    public NautaTransactionAmountLimitExceededException(String message) {
        super(message);
    }

    public NautaTransactionAmountLimitExceededException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NautaTransactionAmountLimitExceededException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
