package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class GeneralException extends Exception {

    private static final long serialVersionUID = 1L;

    public GeneralException(String message) {
        super(message);
    }

    public GeneralException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public GeneralException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
    }
