package com.alodiga.services.provider.commons.utils;

import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.log4j.Logger;

import com.alodiga.services.provider.commons.genericEJB.SPGenericEJB;

public class SimpleEJBLocator {

    private static Logger log = Logger.getLogger(SimpleEJBLocator.class);
    private InitialContext initalContext;
    private static SimpleEJBLocator theInstance;

    public static SimpleEJBLocator getInstance() {
        if (theInstance == null) {
            theInstance = new SimpleEJBLocator();
        }
        return theInstance;
    }

    private SimpleEJBLocator() {
        try {
            Properties props = System.getProperties();
            props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            props.setProperty("org.omg.CORBA.ORBInitialHost", EjbConstants.SERVER);
            props.setProperty("org.omg.CORBA.ORBInitialPort", EjbConstants.PORT);
            this.initalContext = new InitialContext(props);
        } catch (NamingException ex) {
            log.error("Error creating EJB Service Locator", ex);
        }
    }

    public SPGenericEJB get(String jndiName) {
        SPGenericEJB ret = null;
        try {
            ret = (SPGenericEJB) initalContext.lookup(jndiName);
            return ret;
        } catch (Exception ex) {
            log.error("Error in EJBServiceLocator CTX lookup", ex);
            return null;
        }
    }
}
