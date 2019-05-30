package com.alodiga.services.provider.commons.exceptions;

public class InvalidPhoneNumberException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidPhoneNumberException(String message) {
        super(message);
    }

    public InvalidPhoneNumberException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
