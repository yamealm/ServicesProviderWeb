/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;
/**
 *
 * @author lromero
 */
public class BalanceIsInsufficientException extends Exception {

    private static final long serialVersionUID = 1L;

    public BalanceIsInsufficientException(String message) {
        super(message);
    }

    public BalanceIsInsufficientException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public BalanceIsInsufficientException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }

}
