package com.alodiga.services.provider.commons.utils;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.alodiga.services.provider.commons.exceptions.GeneralException;
//import com.alodiga.services.provider.commons.models.Account;
//import com.alodiga.services.provider.commons.models.CountryHasProvider;
//import com.alodiga.services.provider.commons.models.Enterprise;
//import com.alodiga.services.provider.commons.models.TopUpProduct;
//
public class ServiceMailDispatcher {
//
//    public static void sendTopUpErrorMail(Account account, String destinationNumber, String senderNumber, TopUpProduct topUpProduct, String error, Exception ex) {
//
//        try {
//            Mail mail = ServiceMails.getTopUpErrorMail(account, destinationNumber, senderNumber, topUpProduct, error, ex);
//            (new MailSender(mail)).start();
//        } catch (Exception e) {
//            ex.printStackTrace();
//        }
//    }
//
//    public static void sendPinPurchaseErrorMail(Account account, String error, String step, Exception ex) {
//        System.out.println("-------------- sendPinPurchaseErrorMail -------------- " + step);
//        try {
//
//            Mail mail = ServiceMails.getPinPurchaseErrorMail(account, error, step, ex);
//            (new MailSender(mail)).start();
//
//        } catch (Exception ex1) {
//            ex1.printStackTrace();
//        }
//    }
//
//     public static void sendPinRechargeErrorMail(Account account, String error, String step, Exception ex) {
//        System.out.println("-------------- sendPinRechargeErrorMail -------------- " + step);
//        try {
//
//            Mail mail = ServiceMails.getPinRechargeErrorMail(account, error, step, ex);
//            (new MailSender(mail)).start();
//
//        } catch (Exception ex1) {
//            ex1.printStackTrace();
//        }
//    }
//
//    
//    public static void sendPendingDataMail(Enterprise enterprise, List<CountryHasProvider> countryHasProviders, ArrayList<String> recipients, String processName) throws GeneralException {
//        System.out.println("sendPendingDataMail");
//
//        try {
//            Mail mail = ServiceMails.getPendingDataMail(enterprise, null, countryHasProviders, recipients, processName);
//            //utilsEJB.sendMail(mail);
//            (new com.alodiga.services.provider.commons.utils.MailSender(mail)).start();
//
//        } catch (Exception ex) {
//            throw new GeneralException(ex.getMessage());
//        }
//    }
//
//    public static void sendUpdateNotificationMail(Enterprise enterprise, ArrayList<String> recipients, String providerName) throws GeneralException {
//        System.out.println("sendUpdateNotificationMail");
//        try {
//            Mail mail = ServiceMails.getUpdateNotificationMail(enterprise, recipients, providerName, "Bill Payment");
//            (new com.alodiga.services.provider.commons.utils.MailSender(mail)).start();
//        } catch (Exception ex) {
//            throw new GeneralException(ex.getMessage());
//        }
//    }
//    
//    public static void sendAlertMail(Account account, TopUpProduct topUpProduct,Float numberTransaction) throws GeneralException {
//        System.out.println("sendAlertMail");
//        try {
//            Mail mail = ServiceMails.getAlertMail(account, topUpProduct, numberTransaction);
//            (new com.alodiga.services.provider.commons.utils.MailSender(mail)).start();
//        } catch (Exception ex) {
//            throw new GeneralException(ex.getMessage());
//        }
//    }
//    
}
