package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NullParameterException extends Exception {

    private static final long serialVersionUID = 1L;

    public NullParameterException(String message) {
        super(message);
    }

    public NullParameterException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NullParameterException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }

}
