package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NautaTransactiontimeoutException extends Exception {

    private static final long serialVersionUID = 1L;

    public NautaTransactiontimeoutException(String message) {
        super(message);
    }

    public NautaTransactiontimeoutException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NautaTransactiontimeoutException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
