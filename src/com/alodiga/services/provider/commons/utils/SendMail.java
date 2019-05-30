package com.alodiga.services.provider.commons.utils;

import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import com.alodiga.services.provider.commons.exceptions.NullParameterException;

public class SendMail {

    public static void sendMails(List<Mail> mails) throws MessagingException {
        if (mails == null || mails.isEmpty()) {
            throw new MessagingException();
        }
        for (Mail mail : mails) {
            sendMail(mail);
        }
    }

    public static void sendMail(Mail mail) throws MessagingException {
        try {
            if (mail == null) {
                throw new NullParameterException("Parameter mail cannot be null");
            }
            if (mail.getEnterprise() != null) {
                mail.setFrom(mail.getEnterprise().getInfoEmail());
            }
            if (mail.getFrom() == null || "".equals(mail.getFrom())) {
                throw new NullParameterException("Parameter mail.getFrom cannot be null");
            }

            if (mail.getTo() == null || mail.getTo().isEmpty()) {
                throw new NullParameterException("Parameter mail.getTo cannot be null");
            }

            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", ServiceConstans.SMTP_SERVER);

            // Preparamos la sesion
            Session session = Session.getInstance(props, null);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mail.getFrom()));

            // Lista de destinos
            InternetAddress[] addresses = new InternetAddress[mail.getTo().size()];
            for (int i = 0; i < addresses.length; i++) {
                addresses[i] = new InternetAddress((String) mail.getTo().get(i));
            }
            message.setRecipients(Message.RecipientType.TO, addresses);
            message.setSubject(mail.getSubject());
            message.setContent(mail.getBody(), "text/html");
            if (mail.getBcc() != null) {
                InternetAddress[] bccs = new InternetAddress[mail.getBcc().size()];
                for (int i = 0; i < bccs.length; i++) {
                    bccs[i] = new InternetAddress((String) mail.getBcc().get(i));
                }
                message.setRecipients(Message.RecipientType.BCC, bccs);
            }
            // create and fill the first message part
            MimeBodyPart mbp1 = new MimeBodyPart();

            mbp1.setContent(mail.getBody(), "text/html");
            //mbp1.setText(mail.getBody(), "text/html");

            // create the Multipart and add its parts to it
            Multipart mp = new MimeMultipart();
            mp.addBodyPart(mbp1);

            if (mail.getAttachments() != null) {
                // create the second message part
                MimeBodyPart mbp2 = new MimeBodyPart();
                for (int i = 0; i < mail.getAttachments().size(); i++) {
                    // attach the file to the message
                    FileDataSource fds = new FileDataSource(mail.getAttachments().get(i));
                    mbp2.setDataHandler(new DataHandler(fds));
                    mbp2.setFileName(fds.getName());
                    mp.addBodyPart(mbp2);
                }
            }

            if (mail.getDataHandlers() != null) {
                // create the second message part
                MimeBodyPart mbp2 = new MimeBodyPart();
                for (int i = 0; i < mail.getDataHandlers().size(); i++) {
                    // attach the file to the message
                    mbp2.setDataHandler(mail.getDataHandlers().get(i));
                    mbp2.setFileName(mail.getSubject().toString() + i + "." + typeFile(mail.getDataHandlers().get(i).getContentType()));
                    mp.addBodyPart(mbp2);
                }
            }
            // add the Multipart to the message
            message.setContent(mp);
            // set the Date: header
            message.setSentDate(new Date());

            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect();
            t.sendMessage(message, message.getAllRecipients());

            // Cierre.
            t.close();
        } catch (Exception e) {
            e.printStackTrace();
//            logger.error("Error sending email", e);
            throw new MessagingException(e.getMessage(), e);
        }
    }

    public static String typeFile(String type) {
        String ext = new String();
        if (type.compareTo("application/vnd.ms-excel") == 0) {
            ext = "xls";
        }
        return ext;
    }
}
