package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class BillPayTransactionException extends Exception {

    private static final long serialVersionUID = 1L;

    public BillPayTransactionException(String message) {
        super(message);
    }

    public BillPayTransactionException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public BillPayTransactionException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
