package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class CarrierSystemUnavailableException extends Exception {

    private static final long serialVersionUID = 1L;

    public CarrierSystemUnavailableException(String message) {
        super(message);
    }

    public CarrierSystemUnavailableException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public CarrierSystemUnavailableException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
