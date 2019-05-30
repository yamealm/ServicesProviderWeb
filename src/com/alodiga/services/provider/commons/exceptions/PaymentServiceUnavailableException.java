package com.alodiga.services.provider.commons.exceptions;

@SuppressWarnings("serial")
public class PaymentServiceUnavailableException extends Exception{
    public PaymentServiceUnavailableException(String message) { super(message);}
    
    public PaymentServiceUnavailableException(String message,
        StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
