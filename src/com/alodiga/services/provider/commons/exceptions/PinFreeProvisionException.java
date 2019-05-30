package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class PinFreeProvisionException extends Exception {

    private static final long serialVersionUID = 1L;

    public PinFreeProvisionException(String message) {
        super(message);
    }

    public PinFreeProvisionException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public PinFreeProvisionException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
