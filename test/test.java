/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.alodiga.services.provider.commons.ejbs.AccessControlEJB;
import com.alodiga.services.provider.commons.ejbs.AuditoryEJB;
import com.alodiga.services.provider.commons.ejbs.BillingTimerEJB;
import com.alodiga.services.provider.commons.ejbs.UserEJB;
import com.alodiga.services.provider.commons.models.User;
import com.alodiga.services.provider.commons.utils.EJBServiceLocator;
import com.alodiga.services.provider.commons.utils.EjbConstants;
import java.util.Properties;
import javax.naming.InitialContext;
import junit.framework.TestCase;

/**
 *
 * @author christiang
 */
public class test extends TestCase {


    @Override
    protected void setUp() throws Exception {
//
        Properties props = new Properties();
        props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
        props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
        props.setProperty("org.omg.CORBA.ORBInitialHost", EjbConstants.SERVER);
        props.setProperty("org.omg.CORBA.ORBInitialPort", EjbConstants.PORT);
        InitialContext intialContext = new InitialContext(props);
        BillingTimerEJB billingTimersEJB = (BillingTimerEJB) intialContext.lookup(EjbConstants.BILLINGS_EJB);
//    }
    }
     public void testcualquiercosa () {
        try {
           
            //UserEJB userEJB=null;

            //userEJB =(UserEJB)EJBServiceLocator.getInstance().get(EjbConstants.USER_EJB);
            //System.out.println("test"+userEJB);
            Boolean b = true;
            User user = new User();
            //user = accessControlEJB.validateUser("lromero","28e1cbc2e786eb013d66c9a3334961d0");
           // System.out.println(user.getLastName());

        } catch (Exception ex) {
            fail("Error testValidateCustomer. " + ex);
        }
    }


}


