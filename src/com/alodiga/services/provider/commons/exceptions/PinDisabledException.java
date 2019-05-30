package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class PinDisabledException extends Exception {
	private static final long serialVersionUID = 1L;

    public PinDisabledException(String message) {
        super(message);
    }

    public PinDisabledException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public PinDisabledException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
