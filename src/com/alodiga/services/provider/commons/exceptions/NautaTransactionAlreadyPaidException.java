package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NautaTransactionAlreadyPaidException extends Exception {

    private static final long serialVersionUID = 1L;

    public NautaTransactionAlreadyPaidException(String message) {
        super(message);
    }

    public NautaTransactionAlreadyPaidException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NautaTransactionAlreadyPaidException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
