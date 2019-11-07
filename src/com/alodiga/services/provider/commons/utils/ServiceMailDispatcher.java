package com.alodiga.services.provider.commons.utils;

import java.util.List;

import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.models.Enterprise;
import com.alodiga.services.provider.commons.models.EnterpriseHasEmail;
import com.alodiga.services.provider.commons.models.MetrologicalControlHistory;
import com.alodiga.services.provider.commons.models.ProductSerie;


public class ServiceMailDispatcher {
   
    public static void sendPendingDataMail(Enterprise enterprise,List<EnterpriseHasEmail> emails, List<ProductSerie> series, String processName) throws GeneralException {
        System.out.println("sendPendingDataMail");

        try {
            Mail mail = ServiceMails.getPendingExpirationDataMail(enterprise,emails, series, processName);
            (new com.alodiga.services.provider.commons.utils.MailSender(mail)).start();

        } catch (Exception ex) {
            throw new GeneralException(ex.getMessage());
        }
    }

    public static void sendQuarantineDataMail(Enterprise enterprise,List<EnterpriseHasEmail> emails, List<ProductSerie> series, String providerName) throws GeneralException {
        System.out.println("sendQuarantineDataMail");
        try {
            Mail mail = ServiceMails.getQuarantineDataMail(enterprise,emails, series, providerName);
            (new com.alodiga.services.provider.commons.utils.MailSender(mail)).start();
        } catch (Exception ex) {
            throw new GeneralException(ex.getMessage());
        }
    }
    
    public static void sendPendingDataMailControl(Enterprise enterprise,List<EnterpriseHasEmail> emails, List<MetrologicalControlHistory> histories, String processName) throws GeneralException {
        System.out.println("sendPendingDataMail");

        try {
            Mail mail = ServiceMails.getPendingExpirationDataMailControl(enterprise,emails, histories, processName);
            (new com.alodiga.services.provider.commons.utils.MailSender(mail)).start();

        } catch (Exception ex) {
            throw new GeneralException(ex.getMessage());
        }
    }

    public static void sendQuarantineDataMailControl(Enterprise enterprise,List<EnterpriseHasEmail> emails, List<MetrologicalControlHistory> histories, String providerName) throws GeneralException {
        System.out.println("sendQuarantineDataMail");
        try {
            Mail mail = ServiceMails.getQuarantineDataMailControl(enterprise,emails, histories, providerName);
            (new com.alodiga.services.provider.commons.utils.MailSender(mail)).start();
        } catch (Exception ex) {
            throw new GeneralException(ex.getMessage());
        }
    }
    
 
}
