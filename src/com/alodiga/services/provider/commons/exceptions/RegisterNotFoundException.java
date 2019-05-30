package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class RegisterNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public RegisterNotFoundException(String message) {
        super(message);
    }

    public RegisterNotFoundException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public RegisterNotFoundException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
