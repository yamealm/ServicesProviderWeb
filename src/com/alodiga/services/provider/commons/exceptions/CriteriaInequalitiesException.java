package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class CriteriaInequalitiesException extends Exception {

    private static final long serialVersionUID = 1L;

    public CriteriaInequalitiesException(String message) {
        super(message);
    }

    public CriteriaInequalitiesException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public CriteriaInequalitiesException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }

}
