package com.alodiga.services.provider.commons.test;

import com.alodiga.services.provider.commons.ejbs.BillPaymentEJB;
import com.alodiga.services.provider.commons.ejbs.ExternalServicesEJB;
import com.alodiga.services.provider.commons.ejbs.ServicesEJB;
import com.alodiga.services.provider.commons.ejbs.TransactionEJB;
import com.alodiga.services.provider.commons.exceptions.DisabledAccountException;
import com.alodiga.services.provider.commons.exceptions.EmptyListException;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.exceptions.InvalidAccountException;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;
import com.alodiga.services.provider.commons.genericEJB.EJBRequest;
import com.alodiga.services.provider.commons.models.Account;
import com.alodiga.services.provider.commons.models.billPayment.BillPaymentCatalog;
import com.alodiga.services.provider.commons.models.billPayment.BillPaymentProduct;
import com.alodiga.services.provider.commons.models.billPayment.BillPaymentServices;
import com.alodiga.services.provider.commons.utils.AccountData;
import com.alodiga.services.provider.commons.utils.EjbConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import junit.framework.TestCase;

/**
 *
 * @author desarrollog3
 */
public class ServicesTest extends TestCase {

    private ServicesEJB servicesEJB;
    private BillPaymentEJB billPaymentEJB;
    private ExternalServicesEJB externalServicesEJB;
    private TransactionEJB transactionEJB;
    private EJBRequest request = null;

    @Override
    protected void setUp() throws Exception {
        try {
            Properties props = new Properties();
            props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmitem.JNDIStateFactoryImpl");
            props.setProperty("org.omg.CORBA.ORBInitialHost", EjbConstants.SERVER);
            props.setProperty("org.omg.CORBA.ORBInitialPort", EjbConstants.PORT);
            InitialContext intialContext = new InitialContext(props);
            servicesEJB = (ServicesEJB) intialContext.lookup(EjbConstants.SERVICES_EJB);
            billPaymentEJB = (BillPaymentEJB) intialContext.lookup(EjbConstants.BILLPAYMENT_EJB);
            externalServicesEJB = (ExternalServicesEJB) intialContext.lookup(EjbConstants.EXTERNAL_SERVICES_EJB);
            transactionEJB = (TransactionEJB) intialContext.lookup(EjbConstants.TRANSACTION_EJB);
            request = new EJBRequest();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

//    public void _testPinPurchaseWithPaymentMethod() {
//        try {
//            PaymentPatner pp = new PaymentPatner();
//            pp.setId(1l);
//            PaymentType pt = new PaymentType();
//            pt.setId(2l);
//            CreditcardType type = new CreditcardType();
//            type.setId(1l);
//            Customer customer = customerEJB.loadCustomerByLogin("14811680");
//            PaymentInfo pi = new PaymentInfo();
//            pi.setId(null);
//            pi.setCustomer(customer);
//            pi.setAddress(customer.getAddress());
//            pi.setBeginningDate(new Timestamp(new Date().getTime()));
//            pi.setCreditCardCvv("123");
//            pi.setCreditCardName("Dairene Ramirez");
//            pi.setCreditCardNumber("4111111111111111");
//            pi.setCreditCardDate(new Timestamp(new Date().getTime()));
//            pi.setCreditcardType(type);
//            pi.setPaymentType(pt);
//            pi.setPaymentPatner(pp);
//            AccountData accountData = new AccountData();
//            accountData.setLogin("30103543");
//            accountData.setPassword(Encoder.MD5("lr0m3r0"));
//            String phoneNumber = "14165527751";
//            Float amount = 20f;
//            String smsDestination = "Alodiga, gracias por su recarga de: " + amount + ", su saldo actual es: ";
//            String storeInfo = "Tienda 1";
//            String externalId = "1201";
//            ProvissionPinResponse pinResponse = servicesEJB.purchasePin(accountData, customer, pi, phoneNumber, amount, smsDestination, storeInfo, externalId);
//            System.out.println("pinResponse" + pinResponse.toString());
//            System.out.println("pinResponse.getMessage()" + pinResponse.getMessage() != null ? pinResponse.getMessage() : null);
//            System.out.println("pinResponse.getSecret()" + pinResponse.getSecret() != null ? pinResponse.getSecret() : null);
//            System.out.println("pinResponse.getSerial()" + pinResponse.getSerial() != null ? pinResponse.getSerial() : null);
//            System.out.println("pinResponse.getSisacOrder()" + pinResponse.getSisacOrder() != null ? pinResponse.getSisacOrder() : null);
//            assertTrue(true);
//        } catch (InvalidAccountException ex) {
//            fail("Error InvalidAccountException en testPinPurchaseWithPaymentMethod. " + ex);
//        } catch (DisabledAccountException ex) {
//            fail("Error DisabledAccountException en testPinPurchaseWithPaymentMethod. " + ex);
//        } catch (InvalidPhoneNumberException ex) {
//            fail("Error InvalidPhoneNumberException en testPinPurchaseWithPaymentMethod. " + ex);
//        } catch (PinAlreadyExistException ex) {
//            fail("Error PinAlreadyExistException en testPinPurchaseWithPaymentMethod. " + ex);
//        } catch (InvalidCreditCardException ex) {
//            fail("Error InvalidCreditCardException en testPinPurchaseWithPaymentMethod. " + ex);
//        } catch (InvalidAmountException ex) {
//            fail("Error InvalidAmountException en testPinPurchaseWithPaymentMethod. " + ex);
//        } catch (GeneralException ex) {
//            fail("Error GeneralException en testPinPurchaseWithPaymentMethod. " + ex);
//        } catch (RegisterNotFoundException ex) {
//            fail("Error RegisterNotFoundException en testPinPurchaseWithPaymentMethod. " + ex);
//        } catch (NullParameterException ex) {
//            fail("Error NullParameterException en testPinPurchaseWithPaymentMethod. " + ex);
//        } catch (Exception ex) {
//            fail("Error Exception en testPinPurchaseWithPaymentMethod. " + ex);
//        }
//    }
//
//    public void testPinPurchase() {
//        try {
//
//            Customer customer = customerEJB.loadCustomerByLogin("14894321");
//            AccountData accountData = new AccountData();
//            accountData.setLogin("30103544");
//            accountData.setPassword(Encoder.MD5("lr0m3r0"));
//            String phoneNumber = "14165527052";
//            Float amount = 15f;
//            String smsDestination = "Alodiga, gracias por su recarga de: " + amount + ", su saldo actual es: ";
//            String storeInfo = "Tienda 2";
//            String externalId = "1351";
//            ProvissionPinResponse pinResponse = servicesEJB.provissionPin(accountData, customer, phoneNumber, amount, smsDestination, storeInfo, externalId);
//            System.out.println("pinResponse" + pinResponse.toString());
//            System.out.println("pinResponse.getMessage()" + pinResponse.getMessage() != null ? pinResponse.getMessage() : null);
//            System.out.println("pinResponse.getSecret()" + pinResponse.getSecret() != null ? pinResponse.getSecret() : null);
//            System.out.println("pinResponse.getSerial()" + pinResponse.getSerial() != null ? pinResponse.getSerial() : null);
//            System.out.println("pinResponse.getSisacOrder()" + pinResponse.getSisacOrder() != null ? pinResponse.getSisacOrder() : null);
//            assertTrue(true);
//        } catch (InvalidAccountException ex) {
//            fail("Error InvalidAccountException en testPinPurchase. " + ex);
//        } catch (DisabledAccountException ex) {
//            fail("Error DisabledAccountException en testPinPurchase. " + ex);
//        } catch (InvalidPhoneNumberException ex) {
//            fail("Error InvalidPhoneNumberException en testPinPurchase. " + ex);
//        } catch (PinAlreadyExistException ex) {
//            fail("Error PinAlreadyExistException en testPinPurchase. " + ex);
//        } catch (InvalidAmountException ex) {
//            fail("Error InvalidAmountException en testPinPurchase. " + ex);
//        } catch (GeneralException ex) {
//            fail("Error GeneralException en testPinPurchase. " + ex);
//        } catch (RegisterNotFoundException ex) {
//            fail("Error RegisterNotFoundException en testPinPurchase. " + ex);
//        } catch (NullParameterException ex) {
//            fail("Error NullParameterException en testPinPurchase. " + ex);
//        } catch (Exception ex) {
//            fail("Error Exception en testPinPurchase. " + ex);
//        }
//    }
//
//    public void _testRechargePinWithPaymentMethod() {
//        {
//            RechargePinResponse rechargePinResponse = null;
//            try {
//                PaymentPatner pp = new PaymentPatner();
//                pp.setId(1l);
//                PaymentType pt = new PaymentType();
//                pt.setId(2l);
//                CreditcardType type = new CreditcardType();
//                type.setId(1l);
//                Customer customer = customerEJB.loadCustomerByLogin("14811680");
//                PaymentInfo pi = new PaymentInfo();
//                pi.setId(null);
//                pi.setCustomer(customer);
//                pi.setAddress(customer.getAddress());
//                pi.setBeginningDate(new Timestamp(new Date().getTime()));
//                pi.setCreditCardCvv("123");
//                pi.setCreditCardName("Dairene Ramirez");
//                pi.setCreditCardNumber("4111111111111111");
//                pi.setCreditCardDate(new Timestamp(new Date().getTime()));
//                pi.setCreditcardType(type);
//                pi.setPaymentType(pt);
//                pi.setPaymentPatner(pp);
//                AccountData accountData = new AccountData();
//                accountData.setLogin("30103543");
//                accountData.setPassword(Encoder.MD5("lr0m3r0"));
//                String phoneNumber = "14243671380";
//                Float amount = 15f;
//                String smsDestination = "Alodiga, gracias por su recarga de: " + amount + ", su saldo actual es: ";
//                String storeInfo = "Tienda 2";
//                String externalId = "1350";
//                String serial = "2216280";
//                rechargePinResponse = servicesEJB.rechargePin(accountData, customer, pi, phoneNumber, serial, amount, smsDestination, storeInfo, externalId);
//                System.out.println("rechargePinResponse.getSerial()" + rechargePinResponse.getSerial());
//                System.out.println("rechargePinResponse.getMessage()" + rechargePinResponse.getMessage());
//                System.out.println("rechargePinResponse.getBalance()" + rechargePinResponse.getBalance());
//                System.out.println("rechargePinResponse.getSisacOrder()" + rechargePinResponse.getSisacOrder());
//                assertTrue(true);
//            } catch (PaymentDeclinedException ex) {
//                Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InvalidPaymentInfoException ex) {
//                Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InvalidAccountException ex) {
//                fail("Error InvalidAccountException en testRechargePinWithPaymentMethod. " + ex);
//            } catch (DisabledAccountException ex) {
//                fail("Error DisabledAccountException en testRechargePinWithPaymentMethod. " + ex);
//            } catch (InvalidPhoneNumberException ex) {
//                fail("Error InvalidPhoneNumberException en testRechargePinWithPaymentMethod. " + ex);
//            } catch (DisabledPinException ex) {
//                fail("Error DisabledPinException en testRechargePinWithPaymentMethod. " + ex);
//            } catch (InvalidCreditCardException ex) {
//                fail("Error InvalidCreditCardException en testRechargePinWithPaymentMethod. " + ex);
//            } catch (InvalidAmountException ex) {
//                fail("Error InvalidAmountException en testRechargePinWithPaymentMethod. " + ex);
//            } catch (NoSuchAlgorithmException ex) {
//                fail("Error NoSuchAlgorithmException en testRechargePinWithPaymentMethod. " + ex);
//            } catch (UnsupportedEncodingException ex) {
//                fail("Error UnsupportedEncodingException en testRechargePinWithPaymentMethod. " + ex);
//            } catch (GeneralException ex) {
//                fail("Error GeneralException en testRechargePinWithPaymentMethod. " + ex);
//            } catch (RegisterNotFoundException ex) {
//                fail("Error RegisterNotFoundException en testRechargePinWithPaymentMethod. " + ex);
//            } catch (NullParameterException ex) {
//                fail("Error NullParameterException en testRechargePinWithPaymentMethod. " + ex);
//            }
//        }
//    }
//
//    public void _testRechargePin() {
//        RechargePinResponse rechargePinResponse = null;
//        try {
//            Customer customer = customerEJB.loadCustomerByLogin("14894320");
//            AccountData accountData = new AccountData();
//            accountData.setLogin("30103543");
//            accountData.setPassword(Encoder.MD5("lr0m3r0"));
//            String phoneNumber = "14165527751";
//            Float amount = 10f;
//            String smsDestination = "Alodiga, gracias por su recarga de: " + amount + ", su saldo actual es: ";
//            String storeInfo = "Tienda 2";
//            String externalId = "1350";
//            String serial = "2218043";
//            rechargePinResponse = servicesEJB.rechargePin(accountData, phoneNumber, serial, amount, smsDestination, storeInfo, externalId);
//            System.out.println("rechargePinResponse.getSerial()" + rechargePinResponse.getSerial());
//            System.out.println("rechargePinResponse.getMessage()" + rechargePinResponse.getMessage());
//            System.out.println("rechargePinResponse.getBalance()" + rechargePinResponse.getBalance());
//            System.out.println("rechargePinResponse.getSisacOrder()" + rechargePinResponse.getSisacOrder());
//            assertTrue(true);
//        } catch (InvalidAccountException ex) {
//            fail("Error InvalidAccountException en testRechargePin. " + ex);
//        } catch (DisabledAccountException ex) {
//            fail("Error DisabledAccountException en testRechargePin. " + ex);
//        } catch (InvalidPhoneNumberException ex) {
//            fail("Error InvalidPhoneNumberException en testRechargePin. " + ex);
//        } catch (DisabledPinException ex) {
//            fail("Error DisabledPinException en testRechargePin. " + ex);
//        } catch (InvalidAmountException ex) {
//            fail("Error InvalidAmountException en testRechargePin. " + ex);
//        } catch (NoSuchAlgorithmException ex) {
//            fail("Error NoSuchAlgorithmException en testRechargePin. " + ex);
//        } catch (UnsupportedEncodingException ex) {
//            fail("Error UnsupportedEncodingException en testRechargePin. " + ex);
//        } catch (GeneralException ex) {
//            fail("Error GeneralException en testRechargePin. " + ex);
//        } catch (RegisterNotFoundException ex) {
//            fail("Error RegisterNotFoundException en testRechargePin. " + ex);
//        } catch (NullParameterException ex) {
//            fail("Error NullParameterException en testRechargePin. " + ex);
//        }
//    }
//
//    public void testcancelPinProvission() {
//        try {
//            CancelPinProvissionResponse cancelPinProvissionResponse = null;
//            AccountData accountData = new AccountData();
//            accountData.setLogin("30103543");
//            accountData.setPassword(Encoder.MD5("lr0m3r0"));
//<<<<<<< ServicesTest.java
//            Long transactionId = 7L;
//            cancelPinProvissionResponse = servicesEJB.cancelPinProvission(accountData, transactionId,null);
//=======
//            Long transactionId = 16L;
//            cancelPinProvissionResponse = servicesEJB.cancelPinProvission(accountData, transactionId,null);
//>>>>>>> 1.3
//            if (cancelPinProvissionResponse.getSuccess()!=null){
//                System.out.println("cancelPinProvissionResponse.getSuccess" + cancelPinProvissionResponse.getSuccess());
//                assertTrue(true);
//            } else {
//                for (Error error :cancelPinProvissionResponse.getErrors()){
//                    System.out.println("Error "+ error.getMessage());
//                    fail("Error "+ error.getMessage());
//                }
//            }
//        } catch (NullParameterException ex) {
//            fail("Error NullParameterException en testcancelPinProvission. " + ex);
//        } catch (InvalidAccountException ex) {
//            fail("Error InvalidAccountException en testcancelPinProvission. " + ex);
//        } catch (DisabledAccountException ex) {
//            fail("Error DisabledAccountException en testcancelPinProvission. " + ex);
//        } catch (RegisterNotFoundException ex) {
//            fail("Error RegisterNotFoundException en testcancelPinProvission. " + ex);
//        } catch (AmountConsumedException ex) {
//            fail("Error AmountConsumedException en testcancelPinProvission. " + ex);
//        } catch (GeneralException ex) {
//            fail("Error GeneralException en testcancelPinProvission. " + ex);
//        } catch (NoSuchAlgorithmException ex) {
//            fail("Error NoSuchAlgorithmException en testcancelPinProvission. " + ex);
//        } catch (UnsupportedEncodingException ex) {
//            fail("Error UnsupportedEncodingException en testcancelPinProvission. " + ex);
//        }
//    }
//
//    public void _testcancelRechargePin() {
//        try {
//            CancelPinRechargeResponse  cancelPinRechargeResponse = null;
//            AccountData accountData = new AccountData();
//            accountData.setLogin("30103543");
//            accountData.setPassword(Encoder.MD5("lr0m3r0"));
//<<<<<<< ServicesTest.java
//            Long transactionId = 10L;
//            cancelPinRechargeResponse = servicesEJB.cancelPinRecharge(accountData, transactionId,null);
//=======
//            Long transactionId = 17L;
//            cancelPinRechargeResponse = servicesEJB.cancelPinRecharge(accountData, transactionId,null);
//>>>>>>> 1.3
//            if (cancelPinRechargeResponse.getSuccess()!=null){
//                System.out.println("cancelPinRechargeResponse.getSuccess" + cancelPinRechargeResponse.getSuccess());
//                assertTrue(true);
//            } else {
//                for (Error error :cancelPinRechargeResponse.getErrors()){
//                    System.out.println("Error "+ error.getMessage());
//                    fail("Error "+ error.getMessage());
//                }
//            }
//        } catch (NullParameterException ex) {
//            fail("Error NullParameterException en testcancelPinProvission. " + ex);
//        } catch (InvalidAccountException ex) {
//            fail("Error InvalidAccountException en testcancelPinProvission. " + ex);
//        } catch (DisabledAccountException ex) {
//            fail("Error DisabledAccountException en testcancelPinProvission. " + ex);
//        } catch (RegisterNotFoundException ex) {
//            fail("Error RegisterNotFoundException en testcancelPinProvission. " + ex);
//        } catch (AmountConsumedException ex) {
//            fail("Error AmountConsumedException en testcancelPinProvission. " + ex);
//        } catch (GeneralException ex) {
//            fail("Error GeneralException en testcancelPinProvission. " + ex);
//        } catch (NoSuchAlgorithmException ex) {
//            fail("Error NoSuchAlgorithmException en testcancelPinProvission. " + ex);
//        } catch (UnsupportedEncodingException ex) {
//            fail("Error UnsupportedEncodingException en testcancelPinProvission. " + ex);
//        }
//    }


//    public void testassigmentComissionRRP() {
//        com.alodiga.multilevelchannel.commons.ejbs.TransactionEJB transactionEJB = (com.alodiga.multilevelchannel.commons.ejbs.TransactionEJB) com.alodiga.multilevelchannel.commons.utils.SimpleEJBLocator.getInstance().get(com.alodiga.multilevelchannel.commons.utils.EjbConstants.TRANSACTION_EJB);
//        try {
//            transactionEJB.assignCommissionForBuyingReferenced(6L, 1L, 20f, "2258006");
//            assertTrue(true);
//        } catch (Exception ex) {
//            fail("Error "+ ex.getMessage());
//        }
//
//
//    }

public void _testgetBillPaymentServices() {
        try {
            List<BillPaymentServices> list =  billPaymentEJB.getBillPaymentServices();
            for (BillPaymentServices services : list){
                System.out.println("Servicio: "+services.getName());
                System.out.println("Id: "+services.getId());
            }
        } catch (GeneralException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EmptyListException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void _testgetBillPaymentCatalogsByServicesId() {
        try {
            List<BillPaymentCatalog> list =  billPaymentEJB.getBillPaymentCatalogsByServicesId(10L);
            for (BillPaymentCatalog catalog : list){
                System.out.println("Servicio: "+catalog.getName());
                System.out.println("Id: "+catalog.getId());
            }
        } catch (NullParameterException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GeneralException ex) {
            ex.printStackTrace();
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EmptyListException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
}

public void _testgetBillPaymentProductsByCatalogId() {
        try {
            List<BillPaymentProduct> list =  billPaymentEJB.getBillPaymentProductsByCatalogId(48L);
            for (BillPaymentProduct catalog : list){
                System.out.println("Servicio: "+catalog.getName());
                System.out.println("Id: "+catalog.getId());
            }
        } catch (NullParameterException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GeneralException ex) {
            ex.printStackTrace();
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EmptyListException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void _testgetMyBalance() {
        try {
            Float balance = billPaymentEJB.getMyBalance();
            System.out.println("Balance: " + balance);
        } catch (GeneralException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public void _testgetCurrentBalanceByAccount() {
        try {
                AccountData accountData = new AccountData();
                accountData.setIpRemoteAddress("192.168.201.59");
                accountData.setLogin("37382117");
                accountData.setPassword("6877d501635d99c61fd34490e87bcbfc");
                Float accountBalance = externalServicesEJB.accountBalance(accountData);
            System.out.println("Balance: " + accountBalance);
        } catch (InvalidAccountException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DisabledAccountException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullParameterException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (GeneralException ex) {
            Logger.getLogger(ServicesTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


     public void  testgetEntireSalesAmountByAccount() throws NullParameterException, GeneralException {
        try {
            List<Float> _sales = transactionEJB.getEntireSalesAmountByAccount(8L);
            System.out.println("tamaño: " + _sales.size());
            for (Float f: _sales){
                System.out.println("Balance: " + f);
            }
         } catch (GeneralException ex) {
             ex.printStackTrace();
         }
    }

    
}
