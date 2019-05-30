package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class ContractNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public ContractNotFoundException(String message) {
        super(message);
    }

    public ContractNotFoundException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public ContractNotFoundException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
