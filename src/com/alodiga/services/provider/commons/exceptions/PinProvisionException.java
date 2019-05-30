package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class PinProvisionException extends Exception {
	private static final long serialVersionUID = 1L;

    public PinProvisionException(String message) {
        super(message);
    }

    public PinProvisionException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public PinProvisionException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
