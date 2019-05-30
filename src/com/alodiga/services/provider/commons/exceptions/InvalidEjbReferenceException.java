package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

@SuppressWarnings("serial")
public class InvalidEjbReferenceException extends Exception {

    String ejbName;
    Long orderId;

    public InvalidEjbReferenceException(String message, String ejbName) {
        super(message);
        this.ejbName = ejbName;
    }

    public InvalidEjbReferenceException(String message, StackTraceElement[] stackTrace, String ejbName) {
        super(message);
        this.ejbName = ejbName;
        setStackTrace(stackTrace);
    }

    public InvalidEjbReferenceException(String message, StackTraceElement[] stackTrace, String ejbName, Long orderId) {
        super(message);
        this.ejbName = ejbName;
        this.orderId = orderId;
        setStackTrace(stackTrace);
    }

    public InvalidEjbReferenceException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);
    }

    public String getEjbName() {
        return ejbName;
    }

    public Long getOrderId() {
        return orderId;
    }

}
