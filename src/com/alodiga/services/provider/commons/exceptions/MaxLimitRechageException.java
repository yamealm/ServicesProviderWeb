package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;


public class MaxLimitRechageException extends Exception {
    
    private static final long serialVersionUID = 1L;

    public MaxLimitRechageException(String message) {
        super(message);
    }

    public MaxLimitRechageException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public MaxLimitRechageException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
    
}
