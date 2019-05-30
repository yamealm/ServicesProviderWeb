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
public class BillPaymentAppliedTransactionException  extends Exception {

    private static final long serialVersionUID = 1L;

    public BillPaymentAppliedTransactionException(String message) {
        super(message);
    }

    public BillPaymentAppliedTransactionException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public BillPaymentAppliedTransactionException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }


}
