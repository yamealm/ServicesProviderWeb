package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class DisabledDistributorException extends Exception {

    private static final long serialVersionUID = 1L;

    public DisabledDistributorException(String message) {
        super(message);
    }

    public DisabledDistributorException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public DisabledDistributorException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
