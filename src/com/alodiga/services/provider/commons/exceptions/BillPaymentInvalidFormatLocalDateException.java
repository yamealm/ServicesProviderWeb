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
public class BillPaymentInvalidFormatLocalDateException  extends Exception {

    private static final long serialVersionUID = 1L;

    public BillPaymentInvalidFormatLocalDateException(String message) {
        super(message);
    }

    public BillPaymentInvalidFormatLocalDateException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public BillPaymentInvalidFormatLocalDateException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }


}
