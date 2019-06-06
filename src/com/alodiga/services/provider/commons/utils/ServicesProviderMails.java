//package com.alodiga.services.provider.commons.utils;
//
//
//import com.alodiga.services.provider.commons.models.Account;
//import com.alodiga.services.provider.commons.models.Language;
//import java.util.ArrayList;
//
//public class ServicesProviderMails {
//
//    public static String ESP_GROUP_MAIL = "monitoreo_esp@alodiga.com";
//    public static String SAC_COORDINADORES_MAIL = "sac-coordinadores@alodiga.com";
//    //public static String ESP_GROUP_MAIL = "lromero@alodiga.com";
//    //public static String SAC_COORDINADORES_MAIL = "lromero@alodiga.com";
//
//    
//
//    public static Mail getAccountRegistrationMail(Account account, String password) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP: Registro de Cuenta.";
//        String text1 = "Bienvenid@ al Alodiga Services Provider(SP)!";
//        String text2 = "Datos de su cuenta:";
//        String text3 = "Registro de Cuenta.";
//        String distributorName = "Cuenta: ";
//        String login = "Usuario(Login): ";
//        String pass = "Clave: ";
//        String date = "Fecha de Creaci&oacute;n: ";
//
//        String moreInfo = "Para acceder al sistema visite:";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
//            hello = "Hello";
//            subject = "Alodiga ESP: Account Registration.";
//            text1 = "Welcome to Alodiga Services Provider (SP)!";
//            text2 = "Account Data: ";
//            text3 = "Account Creation";
//            distributorName = "Account: ";
//            login = "User(Login): ";
//            pass = "Password: ";
//            date = "Creation Date:";
//            moreInfo = "To sign in, click here: ";
//            mailInvite = "We invite you to continue enjoying the benefits and attractive products and services offered by Alodiga.";
//            thanks = "Thank you for choosing Alodiga, Alodiga Mejora tu vida";
//            messageFooter1 = "This message was sent from an email distributor solely for notification messages that are not supported. Do not respond to this communication";
//            allRights = "All rights reserved";
//        }
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text3 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " " + account.getBusinessName() + "&nbsp;" + "!</p>"
//                + "<p align='left' class='Estilo11'>"
//                + text1 + "<br><br></p>"
//                + "</th>"
//                + "</tr>"
//                + "<tr>"
//                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
//                + text2
//                + "</p></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr>"
//                + "<th>"
//                + "<div><table width='705' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + distributorName + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + account.getFullName() + "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
//                + login + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + account.getLogin() + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
//                + pass + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + password + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + date + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + GeneralUtils.date2String(account.getCreationDate(), GeneralUtils.FORMAT_DATE_USA)
//                + "</div></td></tr></div></table>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://192.168.201.21/'>  sales.alodiga.com</a></span></div>"
//                + "</th>"
//                + "</tr>"
//                + "<tr>"
//                + "<th height='31' bordercolor='#999999'><div align='center'><p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;' >"
//                + mailInvite
//                + "</p>"
//                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
//                + thanks
//                + "</p>"
//                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
//                + messageFooter1
//                + "</p>"
//                + "</div>"
//                + "</th>"
//                + "</tr>"
//                + " </table>"
//                + "<div align='center'>"
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights
//                + "<br> </div></th></tr>"
//                + "</table></div></body></html>";
//
//        Mail mail = new Mail();
//        mail.setEnterprise(account.getEnterprise());
//        mail.setSubject(subject);
//        mail.setFrom(account.getEnterprise().getInfoEmail());
//        mail.setBody(body);
//        ArrayList<String> recipients = new ArrayList<String>();
//        recipients.add(account.getEmail());
//        mail.setTo(recipients);
//        //Copia oculta
//        recipients = new ArrayList<String>();
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(ESP_GROUP_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//   
//
//}
