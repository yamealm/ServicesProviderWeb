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
public class BillPaymentPasswordNotFoundException  extends Exception {

    private static final long serialVersionUID = 1L;

    public BillPaymentPasswordNotFoundException(String message) {
        super(message);
    }

    public BillPaymentPasswordNotFoundException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public BillPaymentPasswordNotFoundException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }


}
