package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class NautaExternalIdAlreadyUsedAccountException extends Exception {

    private static final long serialVersionUID = 1L;

    public NautaExternalIdAlreadyUsedAccountException(String message) {
        super(message);
    }

    public NautaExternalIdAlreadyUsedAccountException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public NautaExternalIdAlreadyUsedAccountException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
