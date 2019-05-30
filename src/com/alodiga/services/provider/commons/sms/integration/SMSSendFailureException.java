package com.alodiga.services.provider.commons.sms.integration;


public class SMSSendFailureException extends Exception {

    private static final long serialVersionUID = 1L;

    public SMSSendFailureException(String message) {
        super(message);
    }

    public SMSSendFailureException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
