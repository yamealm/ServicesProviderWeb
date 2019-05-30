package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NotAvaliableServiceException extends Exception {

    private static final long serialVersionUID = 1L;

    public NotAvaliableServiceException(String message) {
        super(message);
    }

    public NotAvaliableServiceException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NotAvaliableServiceException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
