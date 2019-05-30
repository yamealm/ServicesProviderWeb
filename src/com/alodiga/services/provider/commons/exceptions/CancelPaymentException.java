package com.alodiga.services.provider.commons.exceptions;

public class CancelPaymentException extends Exception {

    private static final long serialVersionUID = 1L;

    public CancelPaymentException(String message) {
        super(message);
    }

    public CancelPaymentException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
