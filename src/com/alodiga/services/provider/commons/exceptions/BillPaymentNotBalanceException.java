/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alodiga.services.provider.commons.exceptions;

import org.apache.log4j.Logger;

/**
 *
 * @author dramirez
 */
public class BillPaymentNotBalanceException extends Exception {

    private static final long serialVersionUID = 1L;

    public BillPaymentNotBalanceException(String message) {
        super(message);
    }

    public BillPaymentNotBalanceException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public BillPaymentNotBalanceException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }


}
