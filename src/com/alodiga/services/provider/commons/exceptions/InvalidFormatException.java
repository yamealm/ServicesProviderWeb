package com.alodiga.services.provider.commons.exceptions;

public class InvalidFormatException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidFormatException(String message) {
        super(message);
    }

    public InvalidFormatException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
