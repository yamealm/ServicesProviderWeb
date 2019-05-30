package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class InvalidFormatValuefieldException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidFormatValuefieldException(String message) {
        super(message);
    }

    public InvalidFormatValuefieldException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public InvalidFormatValuefieldException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
