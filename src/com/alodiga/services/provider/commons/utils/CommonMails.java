package com.alodiga.services.provider.commons.utils;
//
//import com.alodiga.services.provider.commons.models.Account;
//import com.alodiga.services.provider.commons.models.Language;
//import com.alodiga.services.provider.commons.models.Transaction;
//import java.util.ArrayList;
//
public class CommonMails {
//
//    public static String SERVICES_GROUP_MAIL = "monitoreo_services@alodiga.com";
//    public static String SAC_COORDINADORES_MAIL = "sac-coordinadores@alodiga.com";
//
////  "lromero@alodiga.com";
//
//
//    //Envía notificación de que se deben actualizar las comisiones
////    public static Mail getUpdatedTopUpNotificationMail(Enterprise enterprise, ArrayList<String> recipients, String providerName) throws GeneralException {
////        StringBuilder body = new StringBuilder();
////        body.append("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>").append("<html xmlns='http://www.w3.org/1999/xhtml'>").append("<head>").append("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' /> <style type='text/css'>.Estilo11 {font-family:'Times New Roman',Times, serif;color: #333333;font-size: 13px;}</style><title>").append("Alodiga Alodiga Multi-level Channel. Actualización Top-Ups").append("</title></head><body topmargin='0'>").append("<div align='center'>").append("<table width='556' height='711' border='0'>").append("<tr>").append("<th width='550' height='707' scope='row'>").append("<p><img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />").append("</p>").append("<p>&nbsp;</p>").append("<p>&nbsp;</p>").append("<p>&nbsp;</p>").append("<table  width='523' border='0' >").append("<tr>").append("<th width='517' height='32' bgcolor='#FACC2E' scope='row'>&nbsp;</th>").append("</tr>").append("</table>").append("<p align='left' class='Estilo11'>&iexcl; Buenos d&iacuteas,</p>").append("<p align='left' class='Estilo11'> El Proceso de actualizaci&oacute;n autom&aacute;tica  se ha realizado al: ").append(new Timestamp(new java.util.Date().getTime())).append("</p>").append("<p align='left' class='Estilo11'>Puede verificar la actualizaci&oacute;n de las comisiones para cada tipo de cuenta accediendo al area de administrac&oacute;n de la Aplicaci&aocute;n Alodiga Alodiga Multi-level Channel.</p>").append("<tr>").append("<th height='31' bordercolor='#999999' scope='row'>").append("<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;' > Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.").append("</p>").append("<div align='center'>").append("<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'> Gracias por preferirnos,</p>").append("<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'> Alodiga Mejora tu vida").append("<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'> Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaci&oacute;n que no </p>").append("<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'> admite mensajes. No responda esta comunicaci&oacute;n. </p>").append("</div>").append("</th>").append("</tr>").append("</table>").append("<div align='center'>").append("<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. Todos los derechos reservado <br/>").append("</div>").append("</th>").append("</tr>").append("</table>").append("</div'></body></html>");
////        Mail mail = new Mail();
////        mail.setSubject("Alodiga Multi-level Channel. Actualización Top-Ups " + providerName);
////        mail.setFrom(enterprise.getInfoEmail());
////        mail.setBody(body.toString());
////        mail.setTo(recipients);
////        return mail;
////
////    }
////
////
////    public static Mail getTestMail(Enterprise enterprise, ArrayList<String> _recipients, String subject, String content) {
////
////        String hello = "Hola";
////        String text1 = "Este es un correo de prueba.";
////        String text2 = "Contenido: ";
////        String moreInfo = "Para acceder al sistema visite:";
////        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
////        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
////        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
////        String allRights = "Todos los derechos reservados";
////
////        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
////        String style2 = "style='background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
////        String body = "";
////        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
////        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
////        body += "<head>";
////        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
////                + "<table width='756' height='600' border='0'>"
////                + "<tr><th width='750' height='595'><p>"
////                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
////                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
////                + "<table  width='730' border='0' >"
////                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
////                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
////                + "</table>"
////                + "<table width='728' border='0'>"
////                + "<tr><th width='728'>"
////                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
////                + hello + " &nbsp;!</p>"
////                + "<p align='left' class='Estilo11'>"
////                + text1 + "<br><br></p>"
////                + "</th>"
////                + "</tr>"
////                + "<tr>"
////                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
////                + text2
////                + "</p></th></tr>"
////                + "<tr>"
////                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
////                + content
////                + "</p></th></tr>"
////                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
////                + "<tr height='40px'>"
////                + "<th height='40px'><div class='Estilo11' align='left'>"
////                + moreInfo
////                + "<span style='font-size: 13px'> "
////                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
////                + "</th>"
////                + "</tr>"
////                + "<tr>"
////                + "<th height='31' bordercolor='#999999'><div align='center'><p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;' >"
////                + mailInvite
////                + "</p>"
////                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
////                + thanks
////                + "</p>"
////                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
////                + messageFooter1
////                + "</p>"
////                + "</div>"
////                + "</th>"
////                + "</tr>"
////                + " </table>"
////                + "<div align='center'>"
////                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights
////                + "<br> </div></th></tr>"
////                + "</table></div></body></html>";
////
////        Mail mail = new Mail();
////        mail.setEnterprise(enterprise);
////        mail.setSubject(subject);
////        mail.setFrom(enterprise.getInfoEmail());
////        mail.setBody(body);
////        ArrayList<String> recipients = new ArrayList<String>();
////        recipients.add(enterprise.getEmail());
////        mail.setTo(recipients);
////        //Copia oculta
////        recipients = new ArrayList<String>();
////        recipients.addAll(_recipients);
////        recipients.add(SERVICES_GROUP_MAIL);
////        recipients.add(SAC_COORDINADORES_MAIL);
////        mail.setBcc(recipients);
////        return mail;
////    }
////
////     public static Mail getRechargePinProccessError(Account account, Transaction transaction, String step, Exception ex) throws Exception {
////
////        String hello = "Hola";
////        String subject = "Error durante el proceso de recarga. " + transaction.getDescription();
////        String text1 = "Ha ocurrido un error durante el proceso de compra.";
////        String text2 = "Datos del Error:";
////        String userName = "Usuario: ";
////        String transactionNumber = "Transaccion: ";
////        String date = "Fecha: ";
////        String _step = "Momento donde ocurre el error: ";
////
////        String moreInfo = "Para mayor informaci&oacute;n visiste";
////        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
////        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
////        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
////        String allRights = "Todos los derechos reservados";
////        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
////        String style2 = "style='background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
////
////        String body = "";
////        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
////        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
////        body += "<head>";
////        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
////                + "<table width='756' height='600' border='0'>"
////                + "<tr><th width='750' height='595'><p>"
////                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
////                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
////                + "<table  width='730' border='0' >"
////                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
////                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
////                + "</table>"
////                + "<table width='728' border='0'>"
////                + "<tr><th width='728'>"
////                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
////                + hello + "&nbsp;!<br/><br/>"
////                + text1 + "<br><br></p>"
////                + "</th>"
////                + "</tr>"
////                + "<tr>"
////                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
////                + text2
////                + "</p></th></tr>"
////                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
////                + "<tr>"
////                + "<th>"
////                + "<div><table width='705' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
////                + "<tr height='60px'><td " + style2 + " width='105'><div align='left'>"
////                + _step + "</div></td>"
////                + "<td>"
////                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + step + "</div>"
////                + "</td>"
////                + "</tr>";
////
////        if (ex != null && ex.getMessage() != null) {
////            body += "<tr height='80px'><td " + style2 + " width='105'><div align='left' >Error:</div></td>"
////                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                    + ex.getMessage() + "</div></td></tr>";
////        }
////
////        body += "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
////                + userName + "</div></td>"
////                + "<td>"
////                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + account.getFullName() + "(" + account.getLogin() + ")</div>"
////                + "</td>"
////                + "</tr>";
////
////        if (transaction != null && transaction.getId() != null) {
////            body += "<tr height='30px'><td " + style2 + " width='105'><div align='left' >"
////                    + transactionNumber + "</div></td>"
////                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                    + transaction.getId() + "</div></td></tr>";
////        }
////
////        if (transaction != null && transaction.getId() != null) {
////            body += "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
////                    + date + "</div></td>"
////                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                    + GeneralUtils.date2String(transaction.getCreationDate(), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>";
////        }
////
////        body += "</table></div></th></tr>";
////        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
////                + "<tr height='40px'>"
////                + "<th height='40px'><div class='Estilo11' align='left'>"
////                + moreInfo
////                + "<span style='font-size: 13px'> "
////                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
////                + "</th>"
////                + "</tr>"
////                + "<tr>"
////                + "<th height='31' bordercolor='#999999'><div align='center'><p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;' >"
////                + mailInvite
////                + "</p>"
////                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
////                + thanks
////                + "</p>"
////                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
////                + messageFooter1
////                + "</p>"
////                + "</div>"
////                + "</th>"
////                + "</tr>"
////                + " </table>"
////                + "<div align='center'>"
////                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
////
////        Mail mail = new Mail();
////        mail.setEnterprise(account.getEnterprise());
////        mail.setSubject(subject);
////        mail.setFrom(account.getEnterprise().getInfoEmail());
////        mail.setBody(body);
////        ArrayList<String> recipients = new ArrayList<String>();
////        recipients.add(account.getEmail());
////        mail.setTo(recipients);
////        //Copia oculta
////        recipients = new ArrayList<String>();
////        recipients.add(SERVICES_GROUP_MAIL);
////        recipients.add("yamealm@gmail.com");
////        mail.setBcc(recipients);
////        return mail;
////    }
////
////      public static Mail getPurchasePinProccessError(Account account, Transaction transaction, String step, Exception ex) throws Exception {
////
////        String hello = "Hola";
////        String subject = "Error durante el proceso de compra. " + transaction.getDescription();
////        String text1 = "Ha ocurrido un error durante el proceso de compra.";
////        String text2 = "Datos del Error:";
////        String userName = "Usuario: ";
////        String transactionNumber = "Transaccion: ";
////        String date = "Fecha: ";
////        String _step = "Momento donde ocurre el error: ";
////
////        String moreInfo = "Para mayor informaci&oacute;n visiste";
////        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
////        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
////        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
////        String allRights = "Todos los derechos reservados";
////        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
////        String style2 = "style='background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
////
////        String body = "";
////        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
////        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
////        body += "<head>";
////        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
////                + "<table width='756' height='600' border='0'>"
////                + "<tr><th width='750' height='595'><p>"
////                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
////                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
////                + "<table  width='730' border='0' >"
////                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
////                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
////                + "</table>"
////                + "<table width='728' border='0'>"
////                + "<tr><th width='728'>"
////                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
////                + hello + "&nbsp;!<br/><br/>"
////                + text1 + "<br><br></p>"
////                + "</th>"
////                + "</tr>"
////                + "<tr>"
////                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
////                + text2
////                + "</p></th></tr>"
////                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
////                + "<tr>"
////                + "<th>"
////                + "<div><table width='705' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
////                + "<tr height='60px'><td " + style2 + " width='105'><div align='left'>"
////                + _step + "</div></td>"
////                + "<td>"
////                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + step + "</div>"
////                + "</td>"
////                + "</tr>";
////
////        if (ex != null && ex.getMessage() != null) {
////            body += "<tr height='80px'><td " + style2 + " width='105'><div align='left' >Error:</div></td>"
////                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                    + ex.getMessage() + "</div></td></tr>";
////        }
////
////        body += "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
////                + userName + "</div></td>"
////                + "<td>"
////                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + account.getFullName() + "(" + account.getLogin() + ")</div>"
////                + "</td>"
////                + "</tr>";
////
////        if (transaction != null && transaction.getId() != null) {
////            body += "<tr height='30px'><td " + style2 + " width='105'><div align='left' >"
////                    + transactionNumber + "</div></td>"
////                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                    + transaction.getId() + "</div></td></tr>";
////        }
////
////        if (transaction != null && transaction.getId() != null) {
////            body += "<tr height='30px'><td " + style2 + " width='105'><div align='left'>"
////                    + date + "</div></td>"
////                    + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                    + GeneralUtils.date2String(transaction.getCreationDate(), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>";
////        }
////
////        body += "</table></div></th></tr>";
////        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
////                + "<tr height='40px'>"
////                + "<th height='40px'><div class='Estilo11' align='left'>"
////                + moreInfo
////                + "<span style='font-size: 13px'> "
////                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
////                + "</th>"
////                + "</tr>"
////                + "<tr>"
////                + "<th height='31' bordercolor='#999999'><div align='center'><p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;' >"
////                + mailInvite
////                + "</p>"
////                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
////                + thanks
////                + "</p>"
////                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
////                + messageFooter1
////                + "</p>"
////                + "</div>"
////                + "</th>"
////                + "</tr>"
////                + " </table>"
////                + "<div align='center'>"
////                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
////
////        Mail mail = new Mail();
////        mail.setEnterprise(account.getEnterprise());
////        mail.setSubject(subject);
////        mail.setFrom(account.getEnterprise().getInfoEmail());
////        mail.setBody(body);
////        ArrayList<String> recipients = new ArrayList<String>();
////        recipients.add(account.getEmail());
////        mail.setTo(recipients);
////        //Copia oculta
////        recipients = new ArrayList<String>();
////        recipients.add(SERVICES_GROUP_MAIL);
////        recipients.add("yamealm@gmail.com");
////        mail.setBcc(recipients);
////        return mail;
////    }
////
////      public static Mail getPinPurchaseSuccessful(Account account, Transaction transaction) throws Exception {
////
////        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
////        String hello = "Hola";
////        String subject = "Confirmaci&oacute;n de Compra de Pin. " + transaction.getDescription();
////        String text1 = "Confirmaci&oacute;n de Compra de Pin.";
////        String text2 = "Datos de su compra:";
////        String userName = "Usuario: ";
////        String transactionNumber = "Transaccion: ";
////        String date = "Fecha: ";
////        String amount = "Total Monto s/descuentos: ";
////        String totalAmount = "Total Monto pagado: ";
////        String points = "Puntos aplicados: ";
////        String detail = "Detalle de producto:";
////        String d_product = "Producto ";
////        String d_amount = "Monto";
////        String d_points = "Puntos";
////        String d_discount = "Descuento(%)";
////        String d_totalPaid = "Total pagado";
////
////        String moreInfo = "Para mayor informaci&oacute;n visiste";
////        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
////        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
////        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
////        String allRights = "Todos los derechos reservados";
////        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
////            hello = "Hello";
////            subject = "Pin Purchase Confirmation. " + transaction.getDescription();
////            text1 = "Pin Purchase Confirmation";
////            text2 = "Purchase Data: ";
////            userName = "Usuario: ";
////            transactionNumber = "Transaction: ";
////            date = "Date: ";
////            amount = "Total Amount wo/discounts: ";
////            totalAmount = "Total Paid Amount: ";
////            points = "Applied Points: ";
////            detail = "Product Detail:";
////            d_product = "Product ";
////            d_amount = "Amount";
////            d_points = "Points";
////            d_discount = "Discount(%)";
////            d_totalPaid = "Total paid";
////
////            moreInfo = "Form more info visit";
////            mailInvite = "We invite you to continue enjoying the benefits and attractive products and services offered by Alodiga.";
////            thanks = "Thank you for choosing Alodiga, Alodiga Mejora tu vida";
////            messageFooter1 = "This message was sent from an email distributor solely for notification messages that are not supported. Do not respond to this communication";
////            allRights = "All rights reserved";
////        }
////        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
////        String style2 = "style='background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
////        String body = "";
////        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
////        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
////        body += "<head>";
////        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
////                + "<table width='756' height='600' border='0'>"
////                + "<tr><th width='750' height='595'><p>"
////                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
////                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
////                + "<table  width='730' border='0' >"
////                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
////                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
////                + "</table>"
////                + "<table width='728' border='0'>"
////                + "<tr><th width='728'>"
////                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
////                + hello + " " + account.getFullName() + "&nbsp;"
////                + "!<br/><br/>"
////                + text1 + "<br><br></p>"
////                + "</th>"
////                + "</tr>"
////                + "<tr>"
////                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
////                + text2
////                + "</p></th></tr>"
////                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
////                + "<tr>"
////                + "<th>"
////                + "<div><table width='705' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
////                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
////                + userName + "</div></td>"
////                + "<td>"
////                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + account.getFullName() + "(" + account.getLogin() + ")</div>"
////                + "</td>"
////                + "</tr>"
////                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
////                + transactionNumber + "</div></td>"
////                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + transaction.getId() + "</div></td></tr>"
////                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
////                + date + "</div></td>"
////                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + GeneralUtils.date2String(transaction.getCreationDate(), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>"
////                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
////                + amount + "</div></td>"
////                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr>"
////                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
////                + totalAmount + "</div></td>"
////                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr></table></div>"
////                + "</th>"
////                + "</tr>";
////
////        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
////                + "<tr height='40px'>"
////                + "<th height='40px'><div class='Estilo11' align='left'>"
////                + moreInfo
////                + "<span style='font-size: 13px'> "
////                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
////                + "</th>"
////                + "</tr>"
////                + "<tr>"
////                + "<th height='31' bordercolor='#999999'><div align='center'><p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;' >"
////                + mailInvite
////                + "</p>"
////                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
////                + thanks
////                + "</p>"
////                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
////                + messageFooter1
////                + "</p>"
////                + "</div>"
////                + "</th>"
////                + "</tr>"
////                + " </table>"
////                + "<div align='center'>"
////                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
////
////        Mail mail = new Mail();
////        mail.setEnterprise(account.getEnterprise());
////        mail.setSubject(subject);
////        mail.setFrom(account.getEnterprise().getInfoEmail());
////        mail.setBody(body);
////        ArrayList<String> recipients = new ArrayList<String>();
////        recipients.add(account.getEmail());
////        mail.setTo(recipients);
////        //Copia oculta
////        recipients = new ArrayList<String>();
////        recipients.add(SERVICES_GROUP_MAIL);
////        recipients.add("yamealm@gmail.com");
////        mail.setBcc(recipients);
////        return mail;
////    }
////
////      public static Mail getPinRechargeSuccessful(Account account, Transaction transaction) throws Exception {
////
////        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
////        String hello = "Hola";
////        String subject = "Confirmaci&oacute;n de Recarga de Pin. "+ transaction.getDescription();
////        String text1 = "Confirmaci&oacute;n de Recarga de Pin.";
////        String text2 = "Datos de su compra:";
////        String userName = "Usuario: ";
////        String transactionNumber = "Transaccion: ";
////        String date = "Fecha: ";
////        String amount = "Total Monto s/descuentos: ";
////        String totalAmount = "Total Monto pagado: ";
////        String points = "Puntos aplicados: ";
////        String detail = "Detalle de producto:";
////        String d_product = "Producto ";
////        String d_amount = "Monto";
////        String d_points = "Puntos";
////        String d_discount = "Descuento(%)";
////        String d_totalPaid = "Total pagado";
////
////        String moreInfo = "Para mayor informaci&oacute;n visiste";
////        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
////        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
////        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
////        String allRights = "Todos los derechos reservados";
////        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
////            hello = "Hello";
////            subject = "Pin Recharge Confirmation. "+ transaction.getDescription();
////            text1 = "Pin Recharge Confirmation";
////            text2 = "Purchase Data: ";
////            userName = "Usuario: ";
////            transactionNumber = "Transaction: ";
////            date = "Date: ";
////            amount = "Total Amount wo/discounts: ";
////            totalAmount = "Total Paid Amount: ";
////            points = "Applied Points: ";
////            detail = "Product Detail:";
////            d_product = "Product ";
////            d_amount = "Amount";
////            d_points = "Points";
////            d_discount = "Discount(%)";
////            d_totalPaid = "Total paid";
////
////            moreInfo = "Form more info visit";
////            mailInvite = "We invite you to continue enjoying the benefits and attractive products and services offered by Alodiga.";
////            thanks = "Thank you for choosing Alodiga, Alodiga Mejora tu vida";
////            messageFooter1 = "This message was sent from an email distributor solely for notification messages that are not supported. Do not respond to this communication";
////            allRights = "All rights reserved";
////        }
////        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
////        String style2 = "style='background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
////        String body = "";
////        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
////        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
////        body += "<head>";
////        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
////                + "<table width='756' height='600' border='0'>"
////                + "<tr><th width='750' height='595'><p>"
////                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
////                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
////                + "<table  width='730' border='0' >"
////                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
////                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
////                + "</table>"
////                + "<table width='728' border='0'>"
////                + "<tr><th width='728'>"
////                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
////                + hello + " " + account.getFullName() + "&nbsp;"
////                + "!<br/><br/>"
////                + text1 + "<br><br></p>"
////                + "</th>"
////                + "</tr>"
////                + "<tr>"
////                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
////                + text2
////                + "</p></th></tr>"
////                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
////                + "<tr>"
////                + "<th>"
////                + "<div><table width='705' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
////                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
////                + userName + "</div></td>"
////                + "<td>"
////                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + account.getFullName() + "(" + account.getLogin() + ")</div>"
////                + "</td>"
////                + "</tr>"
////                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
////                + transactionNumber + "</div></td>"
////                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + transaction.getId() + "</div></td></tr>"
////                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
////                + date + "</div></td>"
////                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + GeneralUtils.date2String(transaction.getCreationDate(), GeneralUtils.FORMAT_DATE_USA) + "</div></td></tr>"
////                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
////                + amount + "</div></td>"
////                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr>"
////                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
////                + totalAmount + "</div></td>"
////                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr></table></div>"
////                + "</th>"
////                + "</tr>";
////
////        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
////                + "<tr height='40px'>"
////                + "<th height='40px'><div class='Estilo11' align='left'>"
////                + moreInfo
////                + "<span style='font-size: 13px'> "
////                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
////                + "</th>"
////                + "</tr>"
////                + "<tr>"
////                + "<th height='31' bordercolor='#999999'><div align='center'><p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;' >"
////                + mailInvite
////                + "</p>"
////                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
////                + thanks
////                + "</p>"
////                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
////                + messageFooter1
////                + "</p>"
////                + "</div>"
////                + "</th>"
////                + "</tr>"
////                + " </table>"
////                + "<div align='center'>"
////                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> </div></th></tr></table></div></body></html>";
////
////        Mail mail = new Mail();
////        mail.setEnterprise(account.getEnterprise());
////        mail.setSubject(subject);
////        mail.setFrom(account.getEnterprise().getInfoEmail());
////        mail.setBody(body);
////        ArrayList<String> recipients = new ArrayList<String>();
////        recipients.add(account.getEmail());
////        mail.setTo(recipients);
////        //Copia oculta
////        recipients = new ArrayList<String>();
////        recipients.add(SERVICES_GROUP_MAIL);
////        recipients.add("yamealm@gmail.com");
////        mail.setBcc(recipients);
////        return mail;
////    }
////
//      public static Mail getAccountRegistrationMail(Account account, String password) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Alodiga: Registro de Cuenta.";
//        String text1 = "Bienvenid@ al Alodiga Services Provider!";
//        String text2 = "Datos de su cuenta:";
//        String text3 = "Registro de Cuenta.";
//        String userName = "Cuenta: ";
//        String login = "Usuario(Login): ";
//        String levelName = "Nivel: ";
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
//            subject = "Alodiga Services Provider: Account Registration.";
//            text1 = "Welcome to Alodiga Services Provider!";
//            text2 = "Account Data: ";
//            text3 = "Account Creation";
//            userName = "Account: ";
//            login = "User(Login): ";
//            levelName = "Level: ";
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
//                + userName + "</div></td>"
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
//                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
//                + levelName + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
////                + level.getLevelDataByLanguageId(distributor.getLanguage().getId()).getAlias() + "</div></td></tr>"
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
//        recipients.add(SERVICES_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//     public static Mail getRechargePinProccessError(Account account, Transaction transaction, String step, Exception ex) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Error durante el proceso de recarga. " + transaction.getDescription();
//        String text1 = "Ha ocurrido un error durante el proceso de compra.";
//        String text2 = "Datos del Error:";
//        String userName = "Usuario: ";
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
//                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
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
//                + userName + "</div></td>"
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
//        recipients.add(SERVICES_GROUP_MAIL);
//        recipients.add("yamealm@gmail.com");
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//      public static Mail getPurchasePinProccessError(Account account, Transaction transaction, String step, Exception ex) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Error durante el proceso de compra. " + transaction.getDescription();
//        String text1 = "Ha ocurrido un error durante el proceso de compra.";
//        String text2 = "Datos del Error:";
//        String userName = "Usuario: ";
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
//                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
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
//                + userName + "</div></td>"
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
//        recipients.add(SERVICES_GROUP_MAIL);
//        recipients.add("yamealm@gmail.com");
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//      public static Mail getPinPurchaseSuccessful(Account account, Transaction transaction) throws Exception {
//
//        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
//        String hello = "Hola";
//        String subject = "Confirmaci&oacute;n de Compra de Pin. " + transaction.getDescription();
//        String text1 = "Confirmaci&oacute;n de Compra de Pin.";
//        String text2 = "Datos de su compra:";
//        String userName = "Usuario: ";
//        String transactionNumber = "Transaccion: ";
//        String date = "Fecha: ";
//        String amount = "Total Monto s/descuentos: ";
//        String totalAmount = "Total Monto pagado: ";
//        String points = "Puntos aplicados: ";
//        String detail = "Detalle de producto:";
//        String d_product = "Producto ";
//        String d_amount = "Monto";
//        String d_points = "Puntos";
//        String d_discount = "Descuento(%)";
//        String d_totalPaid = "Total pagado";
//
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
//            hello = "Hello";
//            subject = "Pin Purchase Confirmation. " + transaction.getDescription();
//            text1 = "Pin Purchase Confirmation";
//            text2 = "Purchase Data: ";
//            userName = "Usuario: ";
//            transactionNumber = "Transaction: ";
//            date = "Date: ";
//            amount = "Total Amount wo/discounts: ";
//            totalAmount = "Total Paid Amount: ";
//            points = "Applied Points: ";
//            detail = "Product Detail:";
//            d_product = "Product ";
//            d_amount = "Amount";
//            d_points = "Points";
//            d_discount = "Discount(%)";
//            d_totalPaid = "Total paid";
//
//            moreInfo = "Form more info visit";
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
//                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
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
//                + userName + "</div></td>"
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
//                + totalAmount + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr></table></div>"
//                + "</th>"
//                + "</tr>";
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
//        recipients.add(SERVICES_GROUP_MAIL);
//        recipients.add("yamealm@gmail.com");
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//      public static Mail getPinRechargeSuccessful(Account account, Transaction transaction) throws Exception {
//
//        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
//        String hello = "Hola";
//        String subject = "Confirmaci&oacute;n de Recarga de Pin. "+ transaction.getDescription();
//        String text1 = "Confirmaci&oacute;n de Recarga de Pin.";
//        String text2 = "Datos de su compra:";
//        String userName = "Usuario: ";
//        String transactionNumber = "Transaccion: ";
//        String date = "Fecha: ";
//        String amount = "Total Monto s/descuentos: ";
//        String totalAmount = "Total Monto pagado: ";
//        String points = "Puntos aplicados: ";
//        String detail = "Detalle de producto:";
//        String d_product = "Producto ";
//        String d_amount = "Monto";
//        String d_points = "Puntos";
//        String d_discount = "Descuento(%)";
//        String d_totalPaid = "Total pagado";
//
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
//            hello = "Hello";
//            subject = "Pin Recharge Confirmation. "+ transaction.getDescription();
//            text1 = "Pin Recharge Confirmation";
//            text2 = "Purchase Data: ";
//            userName = "Usuario: ";
//            transactionNumber = "Transaction: ";
//            date = "Date: ";
//            amount = "Total Amount wo/discounts: ";
//            totalAmount = "Total Paid Amount: ";
//            points = "Applied Points: ";
//            detail = "Product Detail:";
//            d_product = "Product ";
//            d_amount = "Amount";
//            d_points = "Points";
//            d_discount = "Discount(%)";
//            d_totalPaid = "Total paid";
//
//            moreInfo = "Form more info visit";
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
//                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
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
//                + userName + "</div></td>"
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
//                + totalAmount + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr></table></div>"
//                + "</th>"
//                + "</tr>";
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
//        recipients.add(SERVICES_GROUP_MAIL);
//        recipients.add("yamealm@gmail.com");
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//      public static Mail getPurchaseBalanceProccessError(Account account, Transaction transaction, String step, Exception ex) throws Exception {
//
//        String hello = "Hola";
//        String subject = "Error durante el proceso de compra de saldo. SP";
//        String text1 = "Ha ocurrido un error durante el proceso de compra de saldo.";
//        String text2 = "Datos del Error:";
//        String distributorName = "Distributor: ";
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
//        String style2 = "style='background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
//
//        String body = "";
//        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
//        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
//        body += "<head>";
//        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#FFBF00;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
//                + "<table width='756' height='600' border='0'>"
//                + "<tr><th width='750' height='595'><p>"
//                + "<img src='http://multilevel.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
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
//                + "<a href='"+Constants.APP_URL+"'>  multilevel.alodiga.com</a></span></div>"
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
//        recipients.add(SERVICES_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//       public static Mail getSuccessfulBalancePurchaseMail(Account account, Transaction transaction) throws Exception {
//
//        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
//        String hello = "Hola";
//        String subject = "Confirmación de Compra de Saldo. Alodiga SP";
//        String text1 = "Confirmaci&oacute;n de Compra de Saldo. Alodiga SP";
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
//            subject = "Balance Purchase Confirmation. MultiLevel";
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
//                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
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
//                + totalAmount + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getTotalAmount() + " " + currencySymbol
//                + "</div></td></tr></table></div></th></tr>"
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
//        recipients.add(SERVICES_GROUP_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
//
//        public static Mail getBalancePurchaseSuccessful(Account account, Transaction transaction) throws Exception {
//
//        String currencySymbol = account.getEnterprise().getCurrency().getSymbol();
//        String hello = "Hola";
//        String subject = "Confirmacion de Compra de Saldo. Services";
//        String text1 = "Confirmaci&oacute;n de Compra de Saldo. Services";
//        String text2 = "Datos de su compra:";
//        String distributorName = "Account: ";
//        String transactionNumber = "Transaccion: ";
//        String date = "Fecha: ";
//        String amount = "Total Monto s/descuentos: ";
//        String totalAmount = "Total Monto pagado: ";
//        String points = "Puntos aplicados: ";
//        String detail = "Detalle de producto:";
//        String d_product = "Producto ";
//        String d_amount = "Monto";
//        String d_points = "Puntos";
//        String d_discount = "Descuento(%)";
//        String d_totalPaid = "Total pagado";
//
//        String moreInfo = "Para mayor informaci&oacute;n visiste";
//        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
//        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
//        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
//        String allRights = "Todos los derechos reservados";
//        if (account.getLanguage().getId().equals(Language.ENGLISH)) {
//            hello = "Hello";
//            subject = "Balance Purchase Confirmation. Services";
//            text1 = "Balance Purchase Confirmation";
//            text2 = "Purchase Data: ";
//            distributorName = "Account: ";
//            transactionNumber = "Transaction: ";
//            date = "Date: ";
//            amount = "Total Amount wo/discounts: ";
//            totalAmount = "Total Paid Amount: ";
//            points = "Applied Points: ";
//            detail = "Product Detail:";
//            d_product = "Product ";
//            d_amount = "Amount";
//            d_points = "Points";
//            d_discount = "Discount(%)";
//            d_totalPaid = "Total paid";
//
//            moreInfo = "Form more info visit";
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
//                + "<img src='http://services.provider.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
//                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
//                + "<table  width='730' border='0' >"
//                + "<tr><th width='728' height='20' align='right' bgcolor='#FDB813' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
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
//                + totalAmount + "</div></td>"
//                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
//                + transaction.getTotalAmount() + " " + currencySymbol + "</div></td></tr></table></div>"
//                + "</th>"
//                + "</tr>";
////        if (!transaction.getTransactionItems().isEmpty()) {
////
////            body += "<tr><th><p align='left' style='font: 14px/1.8em Arial,Helvetica,sans-serif,lighter;color:#666; font-weight:bold; display: table;margin: 0; padding:0;'>"
////                    + detail
////                    + "</p></th></tr>"
////                    + "<tr><th><div>"
////                    + "<table width='725' border='0'>"
////                    + "<tr align='center'>"
////                    + "<th width='205' " + style2 + ">" + d_product + "</th>"
////                    + "<th width='130' " + style2 + ">" + d_amount + "</th>"
////                    + "<th width='130' " + style2 + ">" + d_points + "</th>"
////                    + "<th width='130' " + style2 + ">" + d_discount + "</th>"
////                    + "<th width='130' " + style2 + ">" + d_totalPaid + "</th>"
////                    + "</tr>";
////
////            for (TransactionItem item : transaction.getTransactionItems()) {
////                body += "<tr height='20px'>"
////                        + "<td " + style1 + ">" + item.getProduct().getProductDataByLanguageId(distributor.getLanguage().getId()).getAlias() + "</td>"
////                        + "<td " + style1 + ">" + item.getUnitAmount() + " " + currencySymbol + "</td>"
////                        + "<td " + style1 + ">" + item.getAssignedPoints() + "</td>"
////                        + "<td " + style1 + ">" + item.getAppliedDiscount() + " % " + "</td>"
////                        + "<td " + style1 + ">" + item.getRealValue() + " " + currencySymbol + "</td>"
////                        + "</tr>";
////            }
////            body += "</table></div></th></tr>";
////        }
//        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
//                + "<tr height='40px'>"
//                + "<th height='40px'><div class='Estilo11' align='left'>"
//                + moreInfo
//                + "<span style='font-size: 13px'> "
//                + "<a href='"+Constants.APP_URL+"'>  multilevel.alodiga.com</a></span></div>"
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
//        recipients.add(SERVICES_GROUP_MAIL);
//        recipients.add(SAC_COORDINADORES_MAIL);
//        mail.setBcc(recipients);
//        return mail;
//    }
}
