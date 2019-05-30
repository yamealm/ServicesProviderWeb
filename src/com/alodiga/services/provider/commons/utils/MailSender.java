package com.alodiga.services.provider.commons.utils;

import com.alodiga.services.provider.commons.ejbs.UtilsEJB;
import com.alodiga.services.provider.commons.exceptions.GeneralException;

public class MailSender extends Thread {

    private UtilsEJB utilsEJB;
    private Mail mail;

    public MailSender(Mail mail) {
        utilsEJB = (UtilsEJB) EJBServiceLocator.getInstance().get(EjbConstants.UTILS_EJB);
        this.mail = mail;
    }

    @Override
    public void run() {
        try {
            this.sendMail(mail);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void sendMail(Mail mail) throws GeneralException {
        try {
            utilsEJB.sendMail(mail);
        } catch (Exception ex) {
            throw new GeneralException(ex.getMessage());
        }
    }

}
