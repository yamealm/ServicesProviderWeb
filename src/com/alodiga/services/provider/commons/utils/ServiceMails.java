package com.alodiga.services.provider.commons.utils;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.models.Enterprise;
import com.alodiga.services.provider.commons.models.ProductSerie;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;



public class ServiceMails {

    public static String SUPPORT_MAIL = "yamealm@gmail.com";
    public static String CG_TURBINES_MAIL = "yamealm@gmail.com";
    
    public static Mail getPendingExpirationDataMail(Enterprise enterprise, List<ProductSerie> series , String processName) throws GeneralException {

        String hello = "Hola";
        String subject = "CG Tubines SRL: Productos Pendiente por vencer.";
        String text1 = "Hay registros requeridos para culminar el proceso de actualizaci&oacute;n.";
        String text2 = "Registros a incorporar:";
        String process = "Proceso de Actualizaci&oacute;n";
        String executed = "Ejecutado al:";
        String moreInfo = "Para mayor informaci&oacute;n visiste";
        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
        String allRights = "Todos los derechos reservados";
        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";

        String body = "";
        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
        body += "<head>";
        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
                + "<table width='756' height='600' border='0'>"
                + "<tr><th width='750' height='595'><p>"
                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
                + "<table  width='730' border='0' >"
                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
                + "</table>"
                + "<table width='728' border='0'>"
                + "<tr><th width='728'>"
                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
                + hello + "&nbsp;!<br/><br/>"
                + text1 + "<br><br></p>"
                + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
                + text2
                + "</p></th></tr>"
                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
                + "<tr>"
                + "<th>"
                + "<div>"
                + "<table width='705' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
                + "<tr height='30px'>"
                + "<td " + style2 + " width='300'>"
                + "<div align='left'>"
                + process + "</div></td>"
                + "<td>"
                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
                + processName + "</div>"
                + "</td>"
                + "</tr>"
                + "<tr height='30px'>"
                + "<td " + style2 + " width='300'>"
                + "<div align='left'>"
                + executed + "</div></td>"
                + "<td>"
                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
                + new Timestamp(new java.util.Date().getTime()) + "</div>"
                + "</td>"
                + "</tr></table></div></th></tr>";
        if (series != null && series.size() > 0) {

            body += "<tr><th><p align='left' style='font: 14px/1.8em Arial,Helvetica,sans-serif,lighter;color:#666; font-weight:bold; display: table;margin: 0; padding:0;'>"
                    + "Operadoras M&oacute;viles"
                    + "</p></th></tr>"
                    + "<tr><th><div>"
                    + "<table width='725' border='0'>"
                    + "<tr align='center'>"
                    + "<th width='365' " + style2 + ">Numero de Parte</th>"
                    + "<th width='360' " + style2 + ">Producto</th>"
                    + "<th width='365' " + style2 + ">Categoria</th>"
                    + "<th width='360' " + style2 + ">Numero de Serie</th>"
                    + "<th width='365' " + style2 + ">Fecha de Expiracion</th>"
                    + "<th width='360' " + style2 + ">Ubicacion Caja</th>"
                    + "<th width='360' " + style2 + ">Ubicacion Carpeta</th>"
                    + "</tr>";

            for (ProductSerie productSerie : series) {
                body += "<tr height='20px'>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getPartNumber() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getDescription() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getCategory().getName() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getSerie() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getExpirationDate() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getUbicationBox() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getUbicationFolder() + "</td>"
                        + "</tr>";
            }
            body += "</table></div></th></tr>";
        }


        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
                + "<tr height='40px'>"
                + "<th height='40px'><div class='Estilo11' align='left'>"
                + moreInfo
                + "<span style='font-size: 13px'> "
                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
                + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th height='31' bordercolor='#999999'><div align='center'><p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;' >"
                + mailInvite
                + "</p>"
                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
                + thanks
                + "</p>"
                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
                + messageFooter1
                + "</p>"
                + "</div>"
                + "</th>"
                + "</tr>"
                + " </table>"
                + "<div align='center'>"
                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> "
                + "</div></th></tr>"
                + "</table></div></body></html>";

        Mail mail = new Mail();
        mail.setEnterprise(enterprise);
        mail.setSubject(subject);
        mail.setFrom(enterprise.getInfoEmail());
        mail.setBody(body);
        ArrayList<String> recipients = new ArrayList<String>();
        recipients.add(CG_TURBINES_MAIL);
        mail.setTo(recipients);
        //Copia oculta
        recipients = new ArrayList<String>();
        recipients.add(SUPPORT_MAIL);
        mail.setBcc(recipients);
        return mail;
    }
    
    public static Mail getQuarantineDataMail(Enterprise enterprise, List<ProductSerie> series , String processName) throws GeneralException {

        String hello = "Hola";
        String subject = "CG Tubines SRL: Productos Pendiente por vencer.";
        String text1 = "Hay registros requeridos para culminar el proceso de actualizaci&oacute;n.";
        String text2 = "Registros a incorporar:";
        String process = "Proceso de Actualizaci&oacute;n";
        String executed = "Ejecutado al:";
        String moreInfo = "Para mayor informaci&oacute;n visiste";
        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
        String allRights = "Todos los derechos reservados";
        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
        String style2 = "style='background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";

        String body = "";
        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
        body += "<head>";
        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
                + "<table width='756' height='600' border='0'>"
                + "<tr><th width='750' height='595'><p>"
                + "<img src='http://sales.alodiga.com/images/img-alodiga-logo.png' align='left' width='114' height='90' longdesc='Logo alodiga' />"
                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
                + "<table  width='730' border='0' >"
                + "<tr><th width='728' height='20' align='right' bgcolor='#80C454' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text1 + "</th></tr>"
                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
                + "</table>"
                + "<table width='728' border='0'>"
                + "<tr><th width='728'>"
                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
                + hello + "&nbsp;!<br/><br/>"
                + text1 + "<br><br></p>"
                + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
                + text2
                + "</p></th></tr>"
                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
                + "<tr>"
                + "<th>"
                + "<div>"
                + "<table width='705' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
                + "<tr height='30px'>"
                + "<td " + style2 + " width='300'>"
                + "<div align='left'>"
                + process + "</div></td>"
                + "<td>"
                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
                + processName + "</div>"
                + "</td>"
                + "</tr>"
                + "<tr height='30px'>"
                + "<td " + style2 + " width='300'>"
                + "<div align='left'>"
                + executed + "</div></td>"
                + "<td>"
                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
                + new Timestamp(new java.util.Date().getTime()) + "</div>"
                + "</td>"
                + "</tr></table></div></th></tr>";
        if (series != null && series.size() > 0) {

            body += "<tr><th><p align='left' style='font: 14px/1.8em Arial,Helvetica,sans-serif,lighter;color:#666; font-weight:bold; display: table;margin: 0; padding:0;'>"
                    + "Operadoras M&oacute;viles"
                    + "</p></th></tr>"
                    + "<tr><th><div>"
                    + "<table width='725' border='0'>"
                    + "<tr align='center'>"
                    + "<th width='365' " + style2 + ">Numero de Parte</th>"
                    + "<th width='360' " + style2 + ">Producto</th>"
                    + "<th width='365' " + style2 + ">Categoria</th>"
                    + "<th width='360' " + style2 + ">Numero de Serie</th>"
                    + "<th width='365' " + style2 + ">Fecha de Expiracion</th>"
                    + "<th width='360' " + style2 + ">Ubicacion Caja</th>"
                    + "<th width='360' " + style2 + ">Ubicacion Carpeta</th>"
                    + "<th width='360' " + style2 + ">Motivo de Caurentena</th>"
                    + "</tr>";

            for (ProductSerie productSerie : series) {
                body += "<tr height='20px'>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getPartNumber() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getDescription() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getCategory().getName() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getSerie() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getExpirationDate() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getUbicationBox() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getUbicationFolder() + "</td>"
                       	+ "<td " + style1 + ">" + productSerie.getQuarantineReason() + "</td>"
                        + "</tr>";
            }
            body += "</table></div></th></tr>";
        }


        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
                + "<tr height='40px'>"
                + "<th height='40px'><div class='Estilo11' align='left'>"
                + moreInfo
                + "<span style='font-size: 13px'> "
                + "<a href='http://sales.alodiga.com/'>  sales.alodiga.com</a></span></div>"
                + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th height='31' bordercolor='#999999'><div align='center'><p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;' >"
                + mailInvite
                + "</p>"
                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
                + thanks
                + "</p>"
                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
                + messageFooter1
                + "</p>"
                + "</div>"
                + "</th>"
                + "</tr>"
                + " </table>"
                + "<div align='center'>"
                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2013 - Alodiga, C.A. " + allRights + "<br> "
                + "</div></th></tr>"
                + "</table></div></body></html>";

        Mail mail = new Mail();
        mail.setEnterprise(enterprise);
        mail.setSubject(subject);
        mail.setFrom(enterprise.getInfoEmail());
        mail.setBody(body);
        ArrayList<String> recipients = new ArrayList<String>();
        recipients.add(CG_TURBINES_MAIL);
        mail.setTo(recipients);
        //Copia oculta
        recipients = new ArrayList<String>();
        recipients.add(SUPPORT_MAIL);
        mail.setBcc(recipients);
        return mail;
    }
}
