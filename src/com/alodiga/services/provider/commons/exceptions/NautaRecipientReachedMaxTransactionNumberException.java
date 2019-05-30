package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NautaRecipientReachedMaxTransactionNumberException extends Exception {

    private static final long serialVersionUID = 1L;

    public NautaRecipientReachedMaxTransactionNumberException(String message) {
        super(message);
    }

    public NautaRecipientReachedMaxTransactionNumberException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NautaRecipientReachedMaxTransactionNumberException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
