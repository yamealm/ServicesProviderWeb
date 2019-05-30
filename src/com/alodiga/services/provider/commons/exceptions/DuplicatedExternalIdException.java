package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class DuplicatedExternalIdException extends Exception {

    private static final long serialVersionUID = 1L;

    public DuplicatedExternalIdException(String message) {
        super(message);
    }

    public DuplicatedExternalIdException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public DuplicatedExternalIdException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
