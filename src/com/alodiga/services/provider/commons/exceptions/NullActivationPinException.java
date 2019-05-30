package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NullActivationPinException extends Exception {

    private static final long serialVersionUID = 1L;

    public NullActivationPinException(String message) {
        super(message);
    }

    public NullActivationPinException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NullActivationPinException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }

}
