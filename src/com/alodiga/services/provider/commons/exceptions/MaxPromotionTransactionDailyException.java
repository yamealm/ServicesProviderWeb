package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

public class MaxPromotionTransactionDailyException extends Exception {

    private static final long serialVersionUID = 1L;

    public MaxPromotionTransactionDailyException(String message) {
        super(message);
    }

    public MaxPromotionTransactionDailyException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public MaxPromotionTransactionDailyException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }
}
