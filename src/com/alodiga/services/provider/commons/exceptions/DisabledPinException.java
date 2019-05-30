package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class DisabledPinException extends Exception {
	private static final long serialVersionUID = 1L;

    public DisabledPinException(String message) {
        super(message);
    }

    public DisabledPinException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public DisabledPinException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
