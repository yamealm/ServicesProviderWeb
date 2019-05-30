package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class WebUserIsDisabledException extends Exception {

    private static final long serialVersionUID = 1L;

    public WebUserIsDisabledException(String message) {
        super(message);
    }

    public WebUserIsDisabledException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public WebUserIsDisabledException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
