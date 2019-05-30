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
public class BillPaymenGeneralErrorException  extends Exception {

    private static final long serialVersionUID = 1L;

    public BillPaymenGeneralErrorException(String message) {
        super(message);
    }

    public BillPaymenGeneralErrorException(Logger logger, String message, Exception e) {
        super(message, e);
        logger.error(message, e);

    }

    public BillPaymenGeneralErrorException(String message, StackTraceElement[] stackTrace) {
        super(message);
        setStackTrace(stackTrace);
    }


}
