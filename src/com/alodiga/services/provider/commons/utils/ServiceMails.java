package com.alodiga.services.provider.commons.utils;
//
//import com.alodiga.services.provider.commons.models.Pin;
//import com.alodiga.services.provider.commons.exceptions.GeneralException;
//import com.alodiga.services.provider.commons.models.Account;
//import com.alodiga.services.provider.commons.models.CountryHasProvider;
//import com.alodiga.services.provider.commons.models.Enterprise;
//import com.alodiga.services.provider.commons.models.Language;
//import com.alodiga.services.provider.commons.models.MobileOperatorHasProvider;
//import com.alodiga.services.provider.commons.models.TopUpProduct;
//import com.alodiga.services.provider.commons.models.Transaction;
//import com.alodiga.services.provider.commons.models.User;
//import com.alodiga.services.provider.commons.models.billPayment.BillPaymentProduct;
//import java.sql.Timestamp;
//import java.util.ArrayList;
//import java.util.List;
//
public class ServiceMails {
//
//    //public static String SSI_GROUP_MAIL = "monitoreo_esp@alodiga.com";
//    //public static String SAC_COORDINADORES_MAIL = "sac-coordinadores@alodiga.com";
//    public static String SSI_GROUP_MAIL = "jnunez@alodiga.com";
//    public static String SUPPORT_MAIL = "jnunez@alodiga.com";
//    public static String SAC_COORDINADORES_MAIL = "yalmea@alodiga.com";
//
//    public static Mail getSuccessfulBalancePurchaseMail(Account account, Transaction transaction) throws Exception {
//
//        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
//        String hello = "Hola";
//        String subject = "Alodiga SP: Confirmaci&oacute;n de Compra de Saldo.";
//        String text1 = "Confirmaci&oacute;n de Compra de Saldo. Alodiga Services Provider System";
//        String text2 = "Datos de su compra:";
//        String distributorName = "Cuenta: ";
//        String transactionNumber = "Transaccion: ";
//        String date = "Fecha: ";
//        String amount = "Total Monto s/descuentos: ";
//        String totalAmount = "Total Monto pagado: ";
//
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
//            hello = "Hello";
//            subject = "Balance Purchase Confirmation. Services Provider";
//            text1 = "Balance Purchase Confirmation";
//            text2 = "Purchase Data: ";
//            distributorName = "Account: ";
//            transactionNumber = "Transaction: ";
//            date = "Date: ";
//            amount = "Total Amount wo/discounts: ";
//            totalAmount = "Total Paid Amount: ";
//            moreInfo = "Form more info visit";
//            mailInvite = "We invite you to continue enjoying the benefits and attractive products and services offered by Alodiga.";
//            thanks = "Thank you for choosing Alodiga, Alodiga Mejora tu vida";
//            messageFooter1 = "This message was sent from an email distributor solely for notification messages that are not supported. Do not respond to this communication";
//            allRights = "All rights reserved";
//        }
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " " + account.getFullName() + "&nbsp;"
//                + "!<br/><br/>"
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
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
//                + transactionNumber + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getId() + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + date + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + GeneralUtils.date2String(transaction.getCreationDate(), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + amount + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr>"
//                + "</table></div>"
//                + "</th>"
//                + "</tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//    public static Mail getPurchaseBalanceProccessError(Account account, Transaction transaction, String step, Exception ex) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP: Error durante el proceso de compra.";
//        String text1 = "Ha ocurrido un error durante el proceso de compra.";
//        String text2 = "Datos del Error:";
//        String distributorName = "Cuenta: ";
//        String transactionNumber = "Transaccion: ";
//        String date = "Fecha: ";
//        String _step = "Momento donde ocurre el error: ";
//
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + "&nbsp;!<br/><br/>"
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
//                + "<tr height='60px'><td " + style2 + " width='105'><div align='left'>"
//                + _step + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + step + "</div>"
//                + "</td>"
//                + "</tr>";
//
//        if (ex != null && ex.getMessage() != null) {
//            body += "<tr height='80px'><td " + style2 + " width='105'><div align='left' >Error:</div></td>"
//                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                    + ex.getMessage() + "</div></td></tr>";
//        }
//
//        body += "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + distributorName + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "</td>"
//                + "</tr>";
//
//        if (transaction != null && transaction.getId() != null) {
//            body += "<tr height='30px'><td " + style2 + " width='105'><div align='left' >"
//                    + transactionNumber + "</div></td>"
//                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                    + transaction.getId() + "</div></td></tr>";
//        }
//
//        if (transaction != null && transaction.getId() != null) {
//            body += "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                    + date + "</div></td>"
//                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                    + GeneralUtils.date2String(transaction.getCreationDate(), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>";
//        }
//
//        body += "</table></div></th></tr>";
//        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//    public static Mail getTopUpErrorMail(Account account, String destinationNumber, String senderNumber, TopUpProduct topUpProduct, String error, Exception ex) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP - TopUp: Error durante el proceso de compra.";
//        String text1 = "Ha ocurrido un error durante el proceso de recarga de TopUp.";
//        String text2 = "Datos del Error:";
//        String distributorName = "Cuenta: ";
//        String _step = "Error: ";
//
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + "&nbsp;!<br/><br/>"
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
//                + "<tr height='60px'><td " + style2 + " width='105'><div align='left'>"
//                + _step + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + error + "</div>"
//                + "</td>"
//                + "</tr>";
//
//        if (ex != null && ex.getMessage() != null) {
//            body += "<tr height='80px'><td " + style2 + " width='105'><div align='left' >Error:</div></td>"
//                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                    + ex.getMessage() + "</div></td></tr>";
//        }
//
//        body += "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + distributorName + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "</table></div></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//    public static Mail getSuccessfulTopUpProcessMail(Account account, Transaction transaction, String destinationNumber, String senderNumber, TopUpProduct topUpProduct, String smsDestination, String smsSender) throws Exception {
//
//        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
//        String hello = "Hola";
//        String subject = "Alodiga SP: Confirmaci&oacute;n de Recarga Local/Internacional.";
//        String text1 = "Alodiga Services Provider System: Confirmaci&oacute;n de Recarga Local/Internacional.";
//        String text2 = "Datos de su compra:";
//        String distributorName = "Cuenta: ";
//        String transactionNumber = "Transaccion: ";
//        String date = "Fecha: ";
//        String totalAmount = "Total Monto pagado: ";
//        String amount = "Monto:";
//        String service = "Servicio:";
//        String destination = "Destino:";
//        String sender = "Remitente:";
//        String destinationSMS = "SMS Destino:";
//        String senderSMS = "SMS Remitente:";
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
//            hello = "Hello";
//            subject = "Alodiga Services Provider System: Local/International Recharge Confirmation.";
//            text1 = "Alodiga Services Provider System: Local/International Recharge Confirmation";
//            text2 = "Purchase Data: ";
//            distributorName = "Account: ";
//            transactionNumber = "Transaction: ";
//            amount = "Amount";
//            service = "Service:";
//            destination = "Destination";
//            sender = "Sender";
//            date = "date";
//            destinationSMS = "SMS Destination";
//            senderSMS = "SMS Sender";
//
//            totalAmount = "Total Paid Amount: ";
//            moreInfo = "Form more info visit";
//            mailInvite = "We invite you to continue enjoying the benefits and attractive products and services offered by Alodiga.";
//            thanks = "Thank you for choosing Alodiga, Alodiga Mejora tu vida";
//            messageFooter1 = "This message was sent from an email distributor solely for notification messages that are not supported. Do not respond to this communication";
//            allRights = "All rights reserved";
//        }
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " " + account.getFullName() + "&nbsp;"
//                + "!<br/><br/>"
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
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
//                + transactionNumber + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getId() + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + date + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + GeneralUtils.date2String(transaction.getCreationDate(), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + amount + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + service + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + topUpProduct.getMobileOperator().getName() + " (" + topUpProduct.getMobileOperator().getId() + ")</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + amount + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + topUpProduct.getProductDenomination().getAmount() + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + amount + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + topUpProduct.getProductDenomination().getAmount() + " " + account.getEnterprise().getCurrency().getSymbol() + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + destination + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + destinationNumber + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + sender + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + senderNumber + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + date + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + new Timestamp(new java.util.Date().getTime()) + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + destinationSMS + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + smsDestination + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + senderSMS + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + smsSender + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//     public static Mail getPendingDataMail(Enterprise enterprise, List<MobileOperatorHasProvider> mobileOperatorHasProviders, List<CountryHasProvider> countryHasProviders, ArrayList<String> recipients, String processName) throws GeneralException {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP - TopUp: Registros Pendientes.";
//        String text1 = "Hay registros requeridos para culminar el proceso de actualizaci&oacute;n.";
//        String text2 = "Registros a incorporar:";
//        String process = "Proceso de Actualizaci&oacute;n";
//        String executed = "Ejecutado al:";
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + "&nbsp;!<br/><br/>"
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
//                + "<div>"
//                + "<table width='705' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
//                + "<tr height='30px'>"
//                + "<td " + style2 + " width='300'>"
//                + "<div align='left'>"
//                + process + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + processName + "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'>"
//                + "<td " + style2 + " width='300'>"
//                + "<div align='left'>"
//                + executed + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + new Timestamp(new java.util.Date().getTime()) + "</div>"
//                + "</td>"
//                + "</tr></table></div></th></tr>";
//        if (mobileOperatorHasProviders != null && mobileOperatorHasProviders.size() > 0) {
//
//            body += "<tr><th><p align='left' style='font: 14px/1.8em Arial,Helvetica,sans-serif,lighter;color:#666; font-weight:bold; display: table;margin: 0; padding:0;'>"
//                    + "Operadoras M&oacute;viles"
//                    + "</p></th></tr>"
//                    + "<tr><th><div>"
//                    + "<table width='725' border='0'>"
//                    + "<tr align='center'>"
//                    + "<th width='365' " + style2 + ">Operadora</th>"
//                    + "<th width='360' " + style2 + ">Proveedor</th>"
//                    + "</tr>";
//
//            for (MobileOperatorHasProvider mobileOperatorHasProvider : mobileOperatorHasProviders) {
//                body += "<tr height='20px'>"
//                        + "<td " + style1 + ">" + mobileOperatorHasProvider.getMobileOperator().getName() + "</td>"
//                        + "<td " + style1 + ">" + mobileOperatorHasProvider.getProvider().getName() + "</td>"
//                        + "</tr>";
//            }
//            body += "</table></div></th></tr>";
//        }
//        if (countryHasProviders != null && countryHasProviders.size() > 0) {
//
//            body += "<tr><th><p align='left' style='font: 14px/1.8em Arial,Helvetica,sans-serif,lighter;color:#666; font-weight:bold; display: table;margin: 0; padding:0;'>"
//                    + "Paises"
//                    + "</p></th></tr>"
//                    + "<tr><th><div>"
//                    + "<table width='725' border='0'>"
//                    + "<tr align='center'>"
//                    + "<th width='315' " + style2 + ">Pa&iacute;s</th>"
//                    + "<th width='310' " + style2 + ">Proveedor</th>"
//                    + "</tr>";
//
//            for (CountryHasProvider countryHasProvider : countryHasProviders) {
//                body += "<tr height='20px'>"
//                        + "<td " + style1 + ">" + countryHasProvider.getCountry().getName() + "</td>"
//                        + "<td " + style1 + ">" + countryHasProvider.getProvider().getName() + "</td>"
//                        + "</tr>";
//            }
//            body += "</table></div></th></tr>";
//        }
//
//        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> "
//                + "</div></th></tr>"
//                + "</table></div></body></html>";
//
//        Mail mail = new Mail();
//        mail.setEnterprise(enterprise);
//        mail.setSubject(subject);
//        mail.setFrom(enterprise.getInfoEmail());
//        mail.setBody(body);
//        mail.setTo(recipients);
//        //Copia oculta
//        recipients = new ArrayList<String>();
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//
//    public static Mail getUpdateNotificationMail(Enterprise enterprise, ArrayList<String> recipients, String providerName, String processName) throws GeneralException {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP: Proceso de actualización.";
//        String text1 = "Proceso de Actualizaci&oacute;n " + processName;
//        String info = "Puede verificar la actualizaci&oacute;n de las comisiones para cada tipo de cuenta accediendo al area de administraci&oacute;n de la Aplicaci&oacute;n Alodiga Services Provider System.";
//        String process = "Proceso de Actualizaci&oacute;n";
//        String executed = "Ejecutado al:";
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='570' border='0'>"
//                + "<tr><th width='750' height='565'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + "&nbsp;!<br/><br/>"
//                + text1 + "<br><br>"
//                + "</p>"
//                + "</th>"
//                + "</tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr>"
//                + "<th>"
//                + "<div><table width='705' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
//                + "<tr height='30px'><td " + style2 + " width='105'><div align='left'>Proveedor: </div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + providerName + "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + process + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + info + "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + executed + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + new Timestamp(new java.util.Date().getTime()) + "</div>"
//                + "</td>"
//                + "</tr>";
//
//        body += "</table></div></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
//
//        Mail mail = new Mail();
//        mail.setEnterprise(enterprise);
//        mail.setSubject(subject);
//        mail.setFrom(enterprise.getInfoEmail());
//        mail.setBody(body);
//        mail.setTo(recipients);
//        //Copia oculta
//        recipients = new ArrayList<String>();
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
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
//            subject = "Alodiga Services Provider System: Account Registration.";
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
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text3 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " " + account.getFullName() + "&nbsp;" + "!</p>"
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
//                + "<a href='http://192.168.201.21'>  192.168.201.21</a></span></div>"
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//    public static Mail getRecoveryPasswordMail(Account account, String newPassword, Enterprise enterprise) throws GeneralException {
//        String hello = "Hola";
//        String subject = "Alodiga SP: Recuperación de clave.";
//        String text1 = "Nos complace notificarle que su clave de acceso ha sido generada automaticamente.";
//        String text2 = "Datos de su cuenta:";
//        String text3 = "Recuperacion de clave.";
//        String distributorName = "Cuenta: ";
//        String login = "Usuario(Login): ";
//        String pass = "Nueva Clave: ";
//        String moreInfo = "Para acceder al sistema visite:";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
//            hello = "Hello";
//            subject = "Alodiga Services Provider System: Password Recovery.";
//            text1 = "We are pleased to notify you that your password has been generated automatically.";
//            text2 = "Account Data: ";
//            text3 = "Password Recovery";
//            distributorName = "Account: ";
//            login = "User(Login): ";
//            pass = "New Password: ";
//            moreInfo = "To sign in, click here: ";
//            mailInvite = "We invite you to continue enjoying the benefits and attractive products and services offered by Alodiga.";
//            thanks = "Thank you for choosing Alodiga, Alodiga Mejora tu vida";
//            messageFooter1 = "This message was sent from an email distributor solely for notification messages that are not supported. Do not respond to this communication";
//            allRights = "All rights reserved";
//        }
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text3 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " " + account.getFullName() + "&nbsp;" + "!</p>"
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
//                + newPassword + "</div></td></tr></div></table>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//    public static Mail getUserRecoveryPasswordMail(User user, String newPassword, Enterprise enterprise) throws GeneralException {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP: Recuperación de clave.";
//        String text1 = "Nos complace notificarle que su clave de acceso ha sido generada automaticamente.";
//        String text2 = "Datos de su cuenta:";
//        String text3 = "Recuperacion de clave.";
//        String distributorName = "Cuenta: ";
//        String login = "Usuario(Login): ";
//        String pass = "Nueva Clave: ";
//        String moreInfo = "Para acceder al sistema visite:";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text3 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " " + user.getFirstName() + " " + user.getLastName() + "&nbsp;" + "!</p>"
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
//                + user.getFirstName() + " " + user.getLastName() + "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
//                + login + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + user.getLogin() + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
//                + pass + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + newPassword + "</div></td></tr></div></table>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//        mail.setEnterprise(enterprise);
//        mail.setSubject(subject);
//        mail.setFrom(enterprise.getInfoEmail());
//        mail.setBody(body);
//        ArrayList<String> recipients = new ArrayList<String>();
//        recipients.add(enterprise.getEmail());
//        mail.setTo(recipients);
//        //Copia oculta
//        recipients = new ArrayList<String>();
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//    public static Mail getTestMail(Enterprise enterprise, ArrayList<String> _recipients, String subject, String content) {
//
//        String hello = "Hola";
//        String text1 = "Este es un correo de prueba.";
//        String text2 = "Contenido: ";
//        String moreInfo = "Para acceder al sistema visite:";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " &nbsp;!</p>"
//                + "<p align='left' class='Estilo11'>"
//                + text1 + "<br><br></p>"
//                + "</th>"
//                + "</tr>"
//                + "<tr>"
//                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
//                + text2
//                + "</p></th></tr>"
//                + "<tr>"
//                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
//                + content
//                + "</p></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//        mail.setEnterprise(enterprise);
//        mail.setSubject(subject);
//        mail.setFrom(enterprise.getInfoEmail());
//        mail.setBody(body);
//        ArrayList<String> recipients = new ArrayList<String>();
//        recipients.add(enterprise.getEmail());
//        mail.setTo(recipients);
//        //Copia oculta
//        recipients = new ArrayList<String>();
//        recipients.addAll(_recipients);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//    public static Mail getSuccessfulPinPurchaseMail(Account account, Transaction transaction, Pin pin, String sms, String _accessNumber) throws Exception {
//
//        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
//        String hello = "Hola";
//        String subject = "Alodiga SP: Compra de pin electrónico.";
//        String text1 = "Alodiga Services Provider System: Compra de pin electr&oacute;nico.";
//        String text2 = "Datos de su compra:";
//        String distributorName = "Cuenta: ";
//        String transactionNumber = "Transaccion: ";
//        String date = "Fecha: ";
//        String totalAmount = "Total Monto pagado: ";
//        String amount = "Monto:";
//        String service = "Servicio:";
//        String serviceName = "Pin Electr&oacute;nico:";
//        String serial = "Serial:";
//        String accessNumber = "N&uacute;mero de acceso:";
////        String destination = "Destino:";
////        String sender = "Remitente:";
//        String destinationSMS = "SMS Destino:";
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
//            hello = "Hello";
//            subject = "Alodiga Services Provider System: Pin Purchase Confirmation.";
//            text1 = "Alodiga Services Provider System: Pin Purchase Confirmation";
//            text2 = "Purchase Data: ";
//            distributorName = "Account: ";
//            transactionNumber = "Transaction: ";
//            amount = "Amount";
//            service = "Service:";
//            serviceName = "Electronic Pin:";
//            serial = "Serial:";
//            accessNumber = "Access Number:";
////            destination = "Destination";
////            sender = "Sender";
//            date = "date";
//            destinationSMS = "SMS Destination";
//            totalAmount = "Total Paid Amount: ";
//            moreInfo = "Form more info visit";
//            mailInvite = "We invite you to continue enjoying the benefits and attractive products and services offered by Alodiga.";
//            thanks = "Thank you for choosing Alodiga, Alodiga Mejora tu vida";
//            messageFooter1 = "This message was sent from an email distributor solely for notification messages that are not supported. Do not respond to this communication";
//            allRights = "All rights reserved";
//        }
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " " + account.getFullName() + "&nbsp;"
//                + "!<br/><br/>"
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
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
//                + transactionNumber + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getId() + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + date + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + GeneralUtils.date2String(transaction.getCreationDate(), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + amount + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr>"
//                
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + service + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + serviceName + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + serial + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + pin.getSerial() + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + accessNumber + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + _accessNumber + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + date + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + new Timestamp(new java.util.Date().getTime()) + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + destinationSMS + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + sms + "</div></td></tr></table></div>"
//                + "</th>"
//                + "</tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//    public static Mail getPinPurchaseErrorMail(Account account, String sms, String error, Exception ex) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP - Pin Electrónico: Error durante el proceso de compra.";
//        String text1 = "Ha ocurrido un error durante el proceso de compra de Pin Electr&oacute;nico.";
//        String text2 = "Datos del Error:";
//        String distributorName = "Cuenta: ";
//        String _step = "Error: ";
//
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + "&nbsp;!<br/><br/>"
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
//                + "<tr height='60px'><td " + style2 + " width='105'><div align='left'>"
//                + _step + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + error + "</div>"
//                + "</td>"
//                + "</tr>";
//
//        if (ex != null && ex.getMessage() != null) {
//            body += "<tr height='80px'><td " + style2 + " width='105'><div align='left' >Error:</div></td>"
//                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                    + ex.getMessage() + "</div></td></tr>";
//        }
//
//        body += "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + distributorName + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "</table></div></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//    public static Mail getSuccessfulPinRechargeMail(Account account, Transaction transaction, Pin pin, String sms, String _accessNumber) throws Exception {
//
//        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
//        String hello = "Hola";
//        String subject = "Alodiga SP: Recarga de pin electrónico.";
//        String text1 = "Alodiga Services Provider System: Recarga de pin electr&oacute;nico.";
//        String text2 = "Datos de su compra:";
//        String distributorName = "Cuenta: ";
//        String transactionNumber = "Transaccion: ";
//        String date = "Fecha: ";
//        String totalAmount = "Total Monto pagado: ";
//        String amount = "Monto:";
//        String service = "Servicio:";
//        String serviceName = "Pin Electr&oacute;nico:";
//        String serial = "Serial:";
//        String accessNumber = "N&uacute;mero de acceso:";
////        String destination = "Destino:";
////        String sender = "Remitente:";
//        String destinationSMS = "SMS Destino:";
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
//            hello = "Hello";
//            subject = "Alodiga Services Provider System: Pin Recharge Confirmation.";
//            text1 = "Alodiga Services Provider System: Pin Recharge Confirmation";
//            text2 = "Purchase Data: ";
//            distributorName = "Account: ";
//            transactionNumber = "Transaction: ";
//            amount = "Amount";
//            service = "Service:";
//            serviceName = "Electronic Pin:";
//            serial = "Serial:";
//            accessNumber = "Access Number:";
////            destination = "Destination";
////            sender = "Sender";
//            date = "date";
//            destinationSMS = "SMS Destination";
//            totalAmount = "Total Paid Amount: ";
//            moreInfo = "Form more info visit";
//            mailInvite = "We invite you to continue enjoying the benefits and attractive products and services offered by Alodiga.";
//            thanks = "Thank you for choosing Alodiga, Alodiga Mejora tu vida";
//            messageFooter1 = "This message was sent from an email distributor solely for notification messages that are not supported. Do not respond to this communication";
//            allRights = "All rights reserved";
//        }
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " " + account.getFullName() + "&nbsp;"
//                + "!<br/><br/>"
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
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
//                + transactionNumber + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getId() + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + date + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + GeneralUtils.date2String(transaction.getCreationDate(), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + amount + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr>"
//
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + service + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + serviceName + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + serial + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + pin.getSerial() + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + accessNumber + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + _accessNumber + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + date + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + new Timestamp(new java.util.Date().getTime()) + "</div"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + destinationSMS + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + sms + "</div></td></tr></table></div>"
//                + "</th>"
//                + "</tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//    public static Mail getPinRechargeErrorMail(Account account, String sms, String error, Exception ex) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP - Pin Electrónico: Error durante el proceso de recarga.";
//        String text1 = "Ha ocurrido un error durante el proceso de recarga de Pin Electr&oacute;nico.";
//        String text2 = "Datos del Error:";
//        String distributorName = "Cuenta: ";
//        String _step = "Error: ";
//
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + "&nbsp;!<br/><br/>"
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
//                + "<tr height='60px'><td " + style2 + " width='105'><div align='left'>"
//                + _step + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + error + "</div>"
//                + "</td>"
//                + "</tr>";
//
//        if (ex != null && ex.getMessage() != null) {
//            body += "<tr height='80px'><td " + style2 + " width='105'><div align='left' >Error:</div></td>"
//                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                    + ex.getMessage() + "</div></td></tr>";
//        }
//
//        body += "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + distributorName + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "</table></div></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//
//    public static Mail getUpdateProcessErrorMail(Enterprise enterprise, String process, String error, Exception ex) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP: Error durante el actualización Automática.";
//        String text1 = "Ha ocurrido un error durante el actualizaci&oacute;n Autom&aacute;tica.";
//        String text2 = "Datos del Error:";
//        String processName = "Proceso: ";
//        String _step = "Error: ";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + "&nbsp;!<br/><br/>"
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
//                + "<tr height='60px'><td " + style2 + " width='105'><div align='left'>"
//                + processName + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + process + "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + "Fecha:</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + GeneralUtils.date2String(new Timestamp(new java.util.Date().getTime()), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>"
//                + "<tr height='60px'><td " + style2 + " width='105'><div align='left'>"
//                + _step + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='line-height:1.2em;font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + error + "</div>"
//                + "</td>"
//                + "</tr>";
//
//        if (ex != null && ex.getMessage() != null) {
//            body += "<tr height='80px'><td " + style2 + " width='105'><div align='left' >Error:</div></td>"
//                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                    + ex.getMessage() + "</div></td></tr>";
//        }
//
//        body += "</table></div></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//
//                + "<tr>"
//                + "<th height='31' bordercolor='#999999'><div align='center'>"
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
//                + messageFooter1
//                + "</p>"
//                + "</div>"
//                + "</th>"
//                + "</tr>"
//                + " </table>"
//                + "<div align='center'>"
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
//
//        Mail mail = new Mail();
//        mail.setEnterprise(enterprise);
//        mail.setSubject(subject);
//        mail.setFrom(enterprise.getInfoEmail());
//        mail.setBody(body);
//        ArrayList<String> recipients = new ArrayList<String>();
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setTo(recipients);
//        return mail;
//    }
//
//    public static Mail getBillPayErrorMail(BillPaymentProduct billPayProduct, Float amount, Account account, String accountNumber, String senderName, String senderNumber, String error, Exception ex) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP: Error durante el Proceso de Pago de Servicios(Bill Pay).";
//        String text1 = "Ha ocurrido un error durante el proceso de Pago de Servicios(Bill Pay).";
//        String text2 = "Datos del Error:";
//        String distributorName = "Cuenta: ";
//        String _step = "Error: ";
//
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        String style2 = "style='background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//
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
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + "&nbsp;!<br/><br/>"
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
//                + "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + distributorName + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + "TopUp:</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + billPayProduct.getName() + "(" + billPayProduct.getId() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + "Monto:</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + amount + "("+billPayProduct.getCurrencyCode()+")" + "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + "Proveedor:</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + billPayProduct.getProvider().getName() + "(" + billPayProduct.getProvider().getId() + ")" + "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + "Fecha:</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + GeneralUtils.date2String(new Timestamp(new java.util.Date().getTime()), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>"
//                + "<tr height='60px'><td " + style2 + " width='105'><div align='left'>"
//                + _step + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + error + "</div>"
//                + "</td>"
//                + "</tr>";
//
//        if (ex != null && ex.getMessage() != null) {
//            body += "<tr height='80px'><td " + style2 + " width='105'><div align='left' >Exception:</div></td>"
//                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                    + ex.getMessage() + "</div></td></tr>";
//        }
//
//        body += "</table></div></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
//                + messageFooter1
//                + "</p>"
//                + "</th>"
//                + "</div></tr>"
//                + " </table>"
//                + "<div align='center'>"
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
//
//        Mail mail = new Mail();
//        mail.setEnterprise(account.getEnterprise());
//        mail.setSubject(subject);
//        mail.setFrom(account.getEnterprise().getInfoEmail());
//        mail.setBody(body);
//        ArrayList<String> recipients = new ArrayList<String>();
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setTo(recipients);
//        return mail;
//    }
//
//    public static Mail getSuccessfulBillPaymentMail(Transaction transaction, BillPaymentProduct billPayProduct, String accountNumber, String senderName, String senderNumber, String destinationSMS) throws Exception {
//        Account account = transaction.getAccount();
//        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
//        String hello = "Hola";
//        String subject = "Alodiga SP: Confirmación de Pago de Servicios(Bill-Payment).";
//        String text1 = "Alodiga Services Provider System: Confirmaci&oacute;n de Pago de Servicios(Bill-Payment).";
//        String text2 = "Datos de su compra:";
//        String distributorName = "Cuenta: ";
//        String transactionNumber = "Transaccion: ";
//        String date = "Fecha: ";
//        String amount = "Monto:";
//        String service = "Servicio:";
//        String paymentAmount = "Monto de pago:";
//        String _senderName = "Nombre Remitente:";
//        String _senderNumber = "Tel&eacute;fono Remitente:";
//        String _destinationSMS = "SMS Destino:";
//        String _accountNumber = "Numero de Cuenta:";
//        String _transactionKey = "Numero clave de referencia:";
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
//            hello = "Hello";
//            subject = "Alodiga Services Provider System: Local/International Recharge Confirmation.";
//            text1 = "Alodiga Services Provider System: Local/International Recharge Confirmation";
//            text2 = "Purchase Data: ";
//            distributorName = "Account: ";
//            transactionNumber = "Transaction: ";
//            amount = "Amount";
//            service = "Service:";
//            paymentAmount="Payment amount:";
//            _senderName = "Sender Name:";
//            _senderNumber = "Sender Number:";
//            date = "Date:";
//            _destinationSMS = "SMS Destination:";
//            _accountNumber = "Account number:";
//            _transactionKey = "TransactionKey";
//            moreInfo = "Form more info visit";
//            mailInvite = "We invite you to continue enjoying the benefits and attractive products and services offered by Alodiga.";
//            thanks = "Thank you for choosing Alodiga, Alodiga Mejora tu vida";
//            messageFooter1 = "This message was sent from an email distributor solely for notification messages that are not supported. Do not respond to this communication";
//            allRights = "All rights reserved";
//        }
//        String style2 = "style='background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p><p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " &nbsp;"
//                + "!<br/><br/>"
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
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
//                + transactionNumber + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getId() + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + date + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + GeneralUtils.date2String(transaction.getCreationDate(), GeneralUtils.FORMAT_DATE_USA)
//                + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + amount + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + GeneralUtils.getCorrectAmount(currencySymbol, transaction.getTotalAmount(), 2) + "</div></td></tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + service + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + billPayProduct.getName() + " (" + billPayProduct.getId() + ")</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + _accountNumber + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + accountNumber+"</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + _transactionKey + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getExternalID() + "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + paymentAmount + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + GeneralUtils.getCorrectAmount(billPayProduct.getCurrencyCode(), billPayProduct.getProductDenomination().getAmount(), 2)+ "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + _senderName + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + senderName + "</div>"
//                + "</td>"
//                + "</tr>"
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + _senderNumber + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + senderNumber + "</div>"
//                + "</td>"
//                + "</tr>"
//
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
//                + _destinationSMS + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='line-height:1.2em;font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + destinationSMS + "</div></td></tr></table></div></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
//
//        Mail mail = new Mail();
//        mail.setEnterprise(account.getEnterprise());
//        mail.setSubject(subject);
//        mail.setFrom(account.getEnterprise().getInfoEmail());
//        mail.setBody(body);
//        ArrayList<String> recipients = new ArrayList<String>();
//        mail.setTo(recipients);
//        //Copia oculta
//        recipients = new ArrayList<String>();
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//
//
//
//
//    public static Mail getNoticeOfSuspensionOfServiceMail(Enterprise enterprise, ArrayList<String> _recipients, String subject, String content) {
//
//        String hello = "Hola";
//        String text1 = "Alodiga SP: Notificacion del Servicio.";
//        String text2 = "Contenido: ";
//        String moreInfo = "Para mayor informaci&oacute;n Contáctenos  al personal administrativo";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " &nbsp;!</p>"
//                + "<p align='left' class='Estilo11'>"
//                + text1 + "<br><br></p>"
//                + "</th>"
//                + "</tr>"
//                + "<tr>"
//                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
//                + text2
//                + "</p></th></tr>"
//                + "<tr>"
//                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
//                + content
//                + "</p></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
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
//        mail.setEnterprise(enterprise);
//        mail.setSubject(subject);
//        mail.setFrom(enterprise.getInfoEmail());
//        mail.setBody(body);
//        ArrayList<String> recipients = new ArrayList<String>();
//        recipients.add(enterprise.getEmail());
//        mail.setTo(recipients);
//        //Copia oculta
//        recipients = new ArrayList<String>();
//        recipients.addAll(_recipients);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//
//
//    public static Mail getAlodigaBenefitMailEs(Enterprise enterprise, ArrayList<String> _recipients, String subject, String content, String key, String
//    Login,String keyServices) {
//
//        String hello = "Hola";
//        String text1 = "Alodiga Informa que.";
//        String login = "Su Usuario es: "+Login+"";
//        String Key = "Su Clave de acceso es :"+keyServices+"";
//        String text2 = "Contenido: ";
//        String moreInfo = "Para acceder al sistema visite site de Alodiga en:";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga Benefit.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//
//        String message2 = "Active su registro haciendo clic";
//        String message3 = "aquí";
//        String message4 = "y disfrute de los siguientes productos Alodiga.";
//        String message5 = "Para el hogar:";
//
//        String message6 = "Pinfree que permite hacer llamadas de larga distancia desde cualquier tel&eacute;fono fijo o celular.";
//        String message7 = "Plan para llamar desde su casa o celular sin tener que marcar PINes y claves secretas.";
//        String message8 = "Escoja el pa&iacute;s desde donde desea que lo llamen, escoja el n&uacute;mero en los Estados Unidos donde quiere que repique la llamada y comience a disfrutar de su servicio.";
//        String message9 = "Disfrute desde su hogar de las ventajas econ&oacute;micas de la telefon&iacute;a IP.";
//
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#5e5e5e' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " &nbsp;!</p>"
//                + "<p align='left' class='Estilo11'>"
//                + text1 + "<br><br></p>"
//                + "<p align='left' class='Estilo11'>"
//                + login + "<br><br></p>"
//                + "<p align='left' class='Estilo11'>"
//                + Key + "<br><br></p>"
//                + "</th>"
//                + "</tr>"
//                + "<tr>"
//                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
//                + text2
//                + "</p></th></tr>"
//                + "<tr>"
//                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
//                + content
//                + "<br>"
//                + "<p>" + message2 + " <a href=http://www.alodiga.us//index.php?option=com_php&Itemid=249&key=" + key + "&login=" + Login + ">" + message3 + "</a>" + message4 + "</p>"
//                + "<p><strong>" + message5 + "</strong></p>"
//                + "<p align='left'><strong><a href=\"https://www.alodiga.us/index.php/compra-shopping/configurar-productos?sId=12&csId=110\">Pinline</a>:</strong>" + message6 + "</p>"
//                + "<p align='left'><a href=\"https://www.alodiga.us/index.php/compra-shopping/configurar-productos?sId=8&csId=123\">Pinless Pro</a>:</strong>" + message7 + "</p>"
//                + "<p align='left'><strong><a href=\"https://www.alodiga.us/index.php/compra-shopping/configurar-productos?sId=15&csId=120\">Virtual Offshore Number</a>:</strong>" + message8 + "</p>"
//                + "<p align='left'><strong><a href=\"https://www.alodiga.us/index.php/compra-shopping/configurar-productos?sId=9&csId=116\">Phone Kit</a>:</strong>" + message9 + "</p>"
//                + "</tr>"
//                + "</p></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='https://www.alodiga.us/'>www.alodiga.us</a></span></div>"
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
//        mail.setEnterprise(enterprise);
//        mail.setSubject(subject);
//        mail.setFrom(enterprise.getInfoEmail());
//        mail.setBody(body);
//        ArrayList<String> recipients = new ArrayList<String>();
//        recipients.add(enterprise.getEmail());
//        mail.setTo(recipients);
//        //Copia oculta
//        recipients = new ArrayList<String>();
//        recipients.addAll(_recipients);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//
//
//    public static Mail getAlodigaBenefitMailEn(Enterprise enterprise, ArrayList<String> _recipients, String subject, String content, String key, String Login,String keyServices) {
//
//        String hello = "Hello ";
//        String text1 = "Alodiga reports that.";
//        String login = "Your login is: "+Login+"";
//        String Key = "Your Password is :"+keyServices+"";
//        String text2 = "Content: ";
//        String moreInfo = "To access the site visit Alodiga system in:";
//        String mailInvite = "We invite you to continue enjoying the benefits and attractive products and services offered Alodiga Benefit.";
//        String thanks = "Thank you for choosing us, Alodiga Improve Your Life";
//        String messageFooter1 = "This message was sent from an account & oacute electronic mail; exclusively unique that does not support notification messages. Do not reply this & oacute communication;n.";
//        String allRights = "All rights reserved";
//
//        String message2 = "Activate your registration by clicking";
//        String message3 = "you here";
//        String message4 = "and enjoy the following products Alodiga.";
//        String message5 = "Home:";
//
//        String message6 = "PinFree that allows long distance calls from any landline or cell.";
//        String message7 = "Plan to call from your home or cell phone without dialing PINs and secret keys.";
//        String message8 = "Choose the country where you want to be called, choose the number in the United States where you want the ringing call and start enjoying your service.";
//        String message9 = "Enjoy from home advantage econom micas of IP telephony.";
//
//        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#5e5e5e' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + " &nbsp;!</p>"
//                + "<p align='left' class='Estilo11'>"
//                + text1 + "<br><br></p>"
//                + "<p align='left' class='Estilo11'>"
//                + login + "<br><br></p>"
//                + "<p align='left' class='Estilo11'>"
//                + Key + "<br><br></p>"
//                + "</th>"
//                + "</tr>"
//                + "<tr>"
//                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
//                + text2
//                + "</p></th></tr>"
//                + "<tr>"
//                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
//                + content
//                + "<br>"
//                + "<p>" + message2 + " <a href=http://www.alodiga.us//index.php?option=com_php&Itemid=249&key=" + key + "&login=" + Login + ">" + message3 + "</a>" + message4 + "</p>"
//                + "<p><strong>" + message5 + "</strong></p>"
//                + "<p align='left'><strong><a href=\"https://www.alodiga.us/index.php/compra-shopping/configurar-productos?sId=12&csId=110\">Pinline</a>:</strong>" + message6 + "</p>"
//                + "<p align='left'><a href=\"https://www.alodiga.us/index.php/compra-shopping/configurar-productos?sId=8&csId=123\">Pinless Pro</a>:</strong>" + message7 + "</p>"
//                + "<p align='left'><strong><a href=\"https://www.alodiga.us/index.php/compra-shopping/configurar-productos?sId=15&csId=120\">Virtual Offshore Number</a>:</strong>" + message8 + "</p>"
//                + "<p align='left'><strong><a href=\"https://www.alodiga.us/index.php/compra-shopping/configurar-productos?sId=9&csId=116\">Phone Kit</a>:</strong>" + message9 + "</p>"
//                + "</tr>"
//                + "</p></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='https://www.alodiga.us/'>www.alodiga.us</a></span></div>"
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
//        mail.setEnterprise(enterprise);
//        mail.setSubject(subject);
//        mail.setFrom(enterprise.getInfoEmail());
//        mail.setBody(body);
//        ArrayList<String> recipients = new ArrayList<String>();
//        recipients.add(enterprise.getEmail());
//        mail.setTo(recipients);
//        //Copia oculta
//        recipients = new ArrayList<String>();
//        recipients.addAll(_recipients);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//     public static Mail getAlertMail(Account account, TopUpProduct topUpProduct,Float numberTransaction) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Alodiga SP - Alerta: Compras de TopUp.";
//        String text1 = "Se han detectado "+ numberTransaction +" transcciones de recarga de TopUp para el producto "+topUpProduct.getDescription()+ ". Denominacion " + topUpProduct.getProductDenomination().getAmount() + "Codigo del TopUp= "+topUpProduct.getId();
//        String text2 = "Datos del Alerta:";
//        String distributorName = "Cuenta: ";
//        String _step = "Mensaje: ";
//
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + subject + "</th></tr>"
//                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
//                + "</table>"
//                + "<table width='728' border='0'>"
//                + "<tr><th width='728'>"
//                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
//                + hello + "&nbsp;!<br/><br/>"
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
//                + "<tr height='60px'><td " + style2 + " width='105'><div align='left'>"
//                + _step + "</div></td>"
//                + "<td>"
//                + "<p align='justify' style='font: 13px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:normal; display: table;  margin: 0; padding:0;'>"
//                + text1 + "</div></td>"
//                + "</p>"
//                + "<td>"
//                + "</td>"
//                + "</tr>";
//
//        body += "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
//                + distributorName + "</div></td>"
//                + "<td>"
//                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + account.getFullName() + "(" + account.getLogin() + ")</div>"
//                + "<td>"
//                + "</td>"
//                + "</tr>"
//                + "</table></div></th></tr>"
//                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
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
//                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
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
//        recipients.add(SSI_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        recipients.add(SUPPORT_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//
}
