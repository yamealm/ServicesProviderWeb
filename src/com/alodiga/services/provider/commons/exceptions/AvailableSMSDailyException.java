package com.alodiga.services.provider.commons.exceptions;

public class AvailableSMSDailyException extends Exception {

    private static final long serialVersionUID = 1L;

    public AvailableSMSDailyException(String message) {
        super(message);
    }

    public AvailableSMSDailyException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
