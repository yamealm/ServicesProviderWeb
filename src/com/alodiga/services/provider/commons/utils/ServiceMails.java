package com.alodiga.services.provider.commons.utils;
import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.models.Enterprise;
import com.alodiga.services.provider.commons.models.MetrologicalControlHistory;
import com.alodiga.services.provider.commons.models.ProductSerie;
import com.alodiga.services.provider.commons.models.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;



public class ServiceMails {

    public static String SUPPORT_MAIL = "yamealm@gmail.com";
    public static String CG_TURBINES_MAIL = "turbinesweb@gmail.com";
   
    
    public static Mail getPendingExpirationDataMail(Enterprise enterprise, List<ProductSerie> series , String processName) throws GeneralException {

        String hello = "Hola";
        String subject = "CG Tubines SRL: Productos Proximos a vencer.";
        String text1 = "Hay productos en Stock pr&oacute;ximos a vencer";
        String text2 = "Registros a incorporar:";
        String process = "Proceso de Actualizaci&oacute;n";
        String executed = "Ejecutado al:";
        String moreInfo = "Para mayor informaci&oacute;n visiste";
        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
        String allRights = "Todos los derechos reservados";
        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
        String style2 = "style='background-color: #555555;color:#ffffff;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
        Properties propiedades = new Properties();
        try {
     			propiedades.load(new FileInputStream("C:\\Users\\yamea\\eclipse-workspace\\ServicesProviderCommons\\src\\properties\\prop.properties"));
     		} catch (FileNotFoundException e) {
     			e.printStackTrace();
     		} catch (IOException e) {
     			e.printStackTrace();
     		}
        String imagen = propiedades.getProperty("prop.logo");
        String body = "";
        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
        body += "<head>";
        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
        		 + "<table width='1056' height='600' border='0'>"
                 + "<tr><th width='1050' height='595'><p>"
                 + "<img src='"+imagen+"' align='left' width='200' height='90' longdesc='Logo CG Turbines' />"
                 + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
                 + "<table  width='1030' border='0' >"
                 + "<tr><th width='1028' height='20' align='right' bgcolor='#0095cd' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'></th></tr>"
                 + "<tr><th width='1028' height='5' bgcolor='#232323'></th></tr>"
                 + "</table>"
                 + "<table width='1028' border='0'>"
                 + "<tr><th width='1028'>"
                 + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
                 + hello + "&nbsp;!<br/><br/>"
                 + text1 + "<br><br></p>"
                 + "</th>"
                 + "</tr>"
                 + "<tr>"
                 + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
                 + text2
                 + "</p></th></tr>"
                 + "<tr height='3px'><th width='1028' bgcolor='#232323'></th></tr>"
                 + "<tr>"
                 + "<th>"
                 + "<div>"
                 + "<table width='1005' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
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
                    + "Productos"
                    + "</p></th></tr>"
                    + "<tr><th><div>" 
                    + "<table width='1025' border='0'>"
                    + "<tr align='center'>"
                    + "<th width='385' " + style2 + ">Numero de Parte</th>"
                    + "<th width='380' " + style2 + ">Producto</th>"
                    + "<th width='385' " + style2 + ">Categoria</th>"
                    + "<th width='380' " + style2 + ">Numero de Serie</th>"
                    + "<th width='385' " + style2 + ">Fecha de Expiracion</th>"
                    + "<th width='380' " + style2 + ">Ubicacion Caja</th>"
                    + "<th width='380' " + style2 + ">Ubicacion Carpeta</th>"
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
                + "</tr>"
                + "<tr>"
                + "<th height='31' bordercolor='#999999'><div align='center'>"
                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
                + messageFooter1
                + "</p>"
                + "</div>"
                + "</th>"
                + "</tr>"
                + " </table>"
                + "<div align='center'>"
                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2019 - CG Turbines SRL " + allRights + "<br> "
                + "</div></th></tr>"
                + "</table></div></body></html>";

        Mail mail = new Mail();
        mail.setEnterprise(enterprise);
        mail.setSubject(subject);
        mail.setFrom(enterprise.getInfoEmail());
        mail.setBody(body);
        ArrayList<String> recipients = new ArrayList<String>();
        recipients.add(CG_TURBINES_MAIL);
        if (!propiedades.getProperty("prop.mail1").equals("") && !propiedades.getProperty("prop.mail1").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail1"));
        if (!propiedades.getProperty("prop.mail2").equals("") && !propiedades.getProperty("prop.mail2").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail2"));
        if (!propiedades.getProperty("prop.mail3").equals("") && !propiedades.getProperty("prop.mail3").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail3"));
        if (!propiedades.getProperty("prop.mail4").equals("") && !propiedades.getProperty("prop.mail4").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail4"));
        mail.setTo(recipients);
        //Copia oculta
        recipients = new ArrayList<String>();
        recipients.add(SUPPORT_MAIL);
        mail.setBcc(recipients);
        return mail;
    }
    
    public static Mail getPendingExpirationDataMailControl(Enterprise enterprise, List<MetrologicalControlHistory> histories , String processName) throws GeneralException {

        String hello = "Hola";
        String subject = "CG Tubines SRL: Productos Proximos a vencer.";
        String text1 = "Hay productos en Control Metrol&oacute;gico pr&oacute;ximos a vencer";
        String text2 = "Registros a incorporar:";
        String process = "Proceso de Actualizaci&oacute;n";
        String executed = "Ejecutado al:";
        String moreInfo = "Para mayor informaci&oacute;n visiste";
        String mailInvite = "Le invitamos a seguir disfrutando los beneficios y de los atractivos productos y servicios que le ofrece Alodiga.";
        String thanks = "Gracias por preferirnos, Alodiga Mejora tu vida";
        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
        String allRights = "Todos los derechos reservados";
        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
        String style2 = "style='background-color: #555555;color:#ffffff;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
        Properties propiedades = new Properties();
        try {
     			propiedades.load(new FileInputStream("C:\\Users\\yamea\\eclipse-workspace\\ServicesProviderCommons\\src\\properties\\prop.properties"));
     		} catch (FileNotFoundException e) {
     			e.printStackTrace();
     		} catch (IOException e) {
     			e.printStackTrace();
     		}
        String imagen = propiedades.getProperty("prop.logo");
        String body = "";
        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
        body += "<head>";
        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
        		 + "<table width='1056' height='600' border='0'>"
                 + "<tr><th width='1050' height='595'><p>"
                 + "<img src='"+imagen+"' align='left' width='200' height='90' longdesc='Logo CG Turbines' />"
                 + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
                 + "<table  width='1030' border='0' >"
                 + "<tr><th width='1028' height='20' align='right' bgcolor='#0095cd' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'></th></tr>"
                 + "<tr><th width='1028' height='5' bgcolor='#232323'></th></tr>"
                 + "</table>"
                 + "<table width='1028' border='0'>"
                 + "<tr><th width='1028'>"
                 + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
                 + hello + "&nbsp;!<br/><br/>"
                 + text1 + "<br><br></p>"
                 + "</th>"
                 + "</tr>"
                 + "<tr>"
                 + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
                 + text2
                 + "</p></th></tr>"
                 + "<tr height='3px'><th width='1028' bgcolor='#232323'></th></tr>"
                 + "<tr>"
                 + "<th>"
                 + "<div>"
                 + "<table width='1005' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
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
        if (histories != null && histories.size() > 0) {

            body += "<tr><th><p align='left' style='font: 14px/1.8em Arial,Helvetica,sans-serif,lighter;color:#666; font-weight:bold; display: table;margin: 0; padding:0;'>"
                    + "Productos"
                    + "</p></th></tr>"
                    + "<tr><th><div>"
                    + "<table width='1025' border='0'>"
                    + "<tr align='center'>"
                    + "<th width='365' " + style2 + ">Desgnacion</th>"
                    + "<th width='360' " + style2 + ">Instrumento</th>"
                    + "<th width='365' " + style2 + ">Marca/Modelo</th>"
                    + "<th width='360' " + style2 + ">Numero de Serie</th>"
                    + "<th width='365' " + style2 + ">Fecha de Expiracion</th>"
                    + "<th width='360' " + style2 + ">Fecha de Calibracion</th>"
                    + "</tr>";

            for (MetrologicalControlHistory history : histories) {
                body += "<tr height='20px'>"
                        + "<td " + style1 + ">" + history.getMetrologicalControl().getDesignation() + "</td>"
                        + "<td " + style1 + ">" + history.getMetrologicalControl().getInstrument() + "</td>"
                        + "<td " + style1 + ">" + history.getMetrologicalControl().getBraund().getName()+"/"+history.getMetrologicalControl().getModel().getName() + "</td>"
                        + "<td " + style1 + ">" + history.getMetrologicalControl().getSerie() + "</td>"
                        + "<td " + style1 + ">" + history.getExpirationDate() + "</td>"
                        + "<td " + style1 + ">" + history.getCalibrationDate() + "</td>"
                        + "</tr>";
            }
            body += "</table></div></th></tr>";
        }


        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
                + "<tr height='40px'>"
                + "</tr>"
                + "<tr>"
                + "<th height='31' bordercolor='#999999'><div align='center'>"
                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
                + messageFooter1
                + "</p>"
                + "</div>"
                + "</th>"
                + "</tr>"
                + " </table>"
                + "<div align='center'>"
                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2019 - CG Turbines SRL " + allRights + "<br> "
                + "</div></th></tr>"
                + "</table></div></body></html>";

        Mail mail = new Mail();
        mail.setEnterprise(enterprise);
        mail.setSubject(subject);
        mail.setFrom(enterprise.getInfoEmail());
        mail.setBody(body);
        ArrayList<String> recipients = new ArrayList<String>();
        recipients.add(CG_TURBINES_MAIL);
        if (!propiedades.getProperty("prop.mail1").equals("") && !propiedades.getProperty("prop.mail1").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail1"));
        if (!propiedades.getProperty("prop.mail2").equals("") && !propiedades.getProperty("prop.mail2").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail2"));
        if (!propiedades.getProperty("prop.mail3").equals("") && !propiedades.getProperty("prop.mail3").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail3"));
        if (!propiedades.getProperty("prop.mail4").equals("") && !propiedades.getProperty("prop.mail4").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail4"));
        mail.setTo(recipients);
        //Copia oculta
        recipients = new ArrayList<String>();
        recipients.add(SUPPORT_MAIL);
        mail.setBcc(recipients);
        return mail;
    }
    
    public static Mail getQuarantineDataMail(Enterprise enterprise, List<ProductSerie> series , String processName) throws GeneralException {

        String hello = "Hola";
        String subject = "CG Tubines SRL: Productos que ingresaron a Cuarentena.";
        String text1 = "Existen productos que entraron a cuarentena de manera autom&aacute;tica.";
        String text2 = "Productos que ingresaron:";
        String process = "Proceso de Actualizaci&oacute;n";
        String executed = "Ejecutado al:";
        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
        String allRights = "Todos los derechos reservados";
        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
        String style2 = "style='background-color: #555555;color:#ffffff;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
          Properties propiedades = new Properties();
        try {
     			propiedades.load(new FileInputStream("C:\\Users\\yamea\\eclipse-workspace\\ServicesProviderCommons\\src\\properties\\prop.properties"));
     		} catch (FileNotFoundException e) {
     			e.printStackTrace();
     		} catch (IOException e) {
     			e.printStackTrace();
     		}
        String imagen = propiedades.getProperty("prop.logo");
        String body = "";
        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
        body += "<head>";
        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
                + "<table width='1056' height='600' border='0'>"
                + "<tr><th width='1050' height='595'><p>"
                + "<img src='"+imagen+"' align='left' width='200' height='90' longdesc='Logo CG Turbines' />"
                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
                + "<table  width='1030' border='0' >"
                + "<tr><th width='1028' height='20' align='right' bgcolor='#0095cd' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'></th></tr>"
                + "<tr><th width='1028' height='5' bgcolor='#232323'></th></tr>"
                + "</table>"
                + "<table width='1028' border='0'>"
                + "<tr><th width='1028'>"
                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
                + hello + "&nbsp;!<br/><br/>"
                + text1 + "<br><br></p>"
                + "</th>"
                + "</tr>"
                + "<tr>"
                + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
                + text2
                + "</p></th></tr>"
                + "<tr height='3px'><th width='1028' bgcolor='#232323'></th></tr>"
                + "<tr>"
                + "<th>"
                + "<div>"
                + "<table width='1005' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
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
                    + "Productos"
                    + "</p></th></tr>"
                    + "<tr><th><div>"
                    + "<table width='1025' border='0'>"
                    + "<tr align='center'>"
                    + "<th width='385' " + style2 + ">Numero de Parte</th>"
                    + "<th width='380' " + style2 + ">Producto</th>"
                    + "<th width='385' " + style2 + ">Categoria</th>"
                    + "<th width='380' " + style2 + ">Numero de Serie</th>"
                    + "<th width='385' " + style2 + ">Fecha de Expiracion</th>"
                    + "<th width='380' " + style2 + ">Ubicacion Caja</th>"
                    + "<th width='380' " + style2 + ">Ubicacion Carpeta</th>"
                    + "<th width='740' " + style2 + ">Motivo de Caurentena</th>"
                    + "</tr>";

            for (ProductSerie productSerie : series) {
            	String date = "";
            	if (productSerie.getExpirationDate() != null) {
            		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            		date = df.format(productSerie.getExpirationDate());
            	}
                body += "<tr height='20px'>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getPartNumber() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getDescription() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getCategory().getName() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getSerie() + "</td>"
                        + "<td " + style1 + ">" + date + "</td>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getUbicationBox() + "</td>"
                        + "<td " + style1 + ">" + productSerie.getProduct().getUbicationFolder() + "</td>"
                       	+ "<td " + style1 + ">" + productSerie.getQuarantineReason() + "</td>"
                        + "</tr>";
            }
            body += "</table></div></th></tr>";
        }


        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
                + "<tr height='40px'>"
                + "</tr>"
                + "<tr>"
                + "<th height='31' bordercolor='#999999'><div align='center'>"
                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
                + messageFooter1
                + "</p>"
                + "</div>"
                + "</th>"
                + "</tr>"
                + " </table>"
                + "<div align='center'>"
                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2019 - CG Turbines SRL " + allRights + "<br> "
                + "</div></th></tr>"
                + "</table></div></body></html>";

        Mail mail = new Mail();
        mail.setEnterprise(enterprise);
        mail.setSubject(subject);
        mail.setFrom(enterprise.getInfoEmail());
        mail.setBody(body);
        ArrayList<String> recipients = new ArrayList<String>();
        recipients.add(CG_TURBINES_MAIL);
        if (!propiedades.getProperty("prop.mail1").equals("") && !propiedades.getProperty("prop.mail1").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail1"));
        if (!propiedades.getProperty("prop.mail2").equals("") && !propiedades.getProperty("prop.mail2").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail2"));
        if (!propiedades.getProperty("prop.mail3").equals("") && !propiedades.getProperty("prop.mail3").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail3"));
        if (!propiedades.getProperty("prop.mail4").equals("") && !propiedades.getProperty("prop.mail4").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail4"));
        mail.setTo(recipients);
        //Copia oculta
        recipients = new ArrayList<String>();
        recipients.add(SUPPORT_MAIL);
        mail.setBcc(recipients);
        return mail;
    }
    
    public static Mail getQuarantineDataMailControl(Enterprise enterprise, List<MetrologicalControlHistory> histories , String processName) throws GeneralException {

        String hello = "Hola";
        String subject = "CG Tubines SRL: Productos de Control Metrologico que ingresaron a Cuarentena.";
        String text1 = "Existen productos de control metrologico que entraron a cuarentena de manera autom&aacute;tica.";
        String text2 = "Productos que ingresaron:";
        String process = "Proceso de Actualizaci&oacute;n";
        String executed = "Ejecutado al:";
        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
        String allRights = "Todos los derechos reservados";
        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
        String style2 = "style='background-color: #555555;color:#ffffff;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
        Properties propiedades = new Properties();
        try {
     			propiedades.load(new FileInputStream("C:\\Users\\yamea\\eclipse-workspace\\ServicesProviderCommons\\src\\properties\\prop.properties"));
     		} catch (FileNotFoundException e) {
     			e.printStackTrace();
     		} catch (IOException e) {
     			e.printStackTrace();
     		}
        String imagen = propiedades.getProperty("prop.logo");
        String body = "";
        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
        body += "<head>";
        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
        		 + "<table width='1056' height='600' border='0'>"
                 + "<tr><th width='1050' height='595'><p>"
                 + "<img src='"+imagen+"' align='left' width='200' height='90' longdesc='Logo CG Turbines' />"
                 + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
                 + "<table  width='1030' border='0' >"
                 + "<tr><th width='1028' height='20' align='right' bgcolor='#0095cd' style='color:#242424;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;'></th></tr>"
                 + "<tr><th width='1028' height='5' bgcolor='#232323'></th></tr>"
                 + "</table>"
                 + "<table width='1028' border='0'>"
                 + "<tr><th width='1028'>"
                 + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
                 + hello + "&nbsp;!<br/><br/>"
                 + text1 + "<br><br></p>"
                 + "</th>"
                 + "</tr>"
                 + "<tr>"
                 + "<th><p align='left' style='font: 16px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; font-weight:bold; display: table;  margin: 0; padding:0;' >"
                 + text2
                 + "</p></th></tr>"
                 + "<tr height='3px'><th width='1028' bgcolor='#232323'></th></tr>"
                 + "<tr>"
                 + "<th>"
                 + "<div>"
                 + "<table width='1005' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
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
        if (histories != null && histories.size() > 0) {

            body += "<tr><th><p align='left' style='font: 14px/1.8em Arial,Helvetica,sans-serif,lighter;color:#666; font-weight:bold; display: table;margin: 0; padding:0;'>"
                    + "Productos"
                    + "</p></th></tr>"
                    + "<tr><th><div>"
                    + "<table width='1025' border='0'>"
                    + "<tr align='center'>"
                    + "<th width='415' " + style2 + ">Desgnacion</th>"
                    + "<th width='410' " + style2 + ">Instrumento</th>"
                    + "<th width='415' " + style2 + ">Marca/Modelo</th>"
                    + "<th width='410' " + style2 + ">Numero de Serie</th>"
                    + "<th width='415' " + style2 + ">Fecha de Expiracion</th>"
                    + "<th width='410' " + style2 + ">Fecha de Calibracion</th>"
                    + "</tr>";

            for (MetrologicalControlHistory history : histories) {
                body += "<tr height='20px'>"
                        + "<td " + style1 + ">" + history.getMetrologicalControl().getDesignation() + "</td>"
                        + "<td " + style1 + ">" + history.getMetrologicalControl().getInstrument() + "</td>"
                        + "<td " + style1 + ">" + history.getMetrologicalControl().getBraund().getName()+"/"+history.getMetrologicalControl().getModel().getName() + "</td>"
                        + "<td " + style1 + ">" + history.getMetrologicalControl().getSerie() + "</td>"
                        + "<td " + style1 + ">" + history.getExpirationDate() + "</td>"
                        + "<td " + style1 + ">" + history.getCalibrationDate() + "</td>"
                        + "</tr>";
            }
            body += "</table></div></th></tr>";
        }


        body += "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
                + "<tr height='40px'>"
                + "</tr>"
                + "<tr>"
                + "<th height='31' bordercolor='#999999'><div align='center'>"
                + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
                + messageFooter1
                + "</p>"
                + "</div>"
                + "</th>"
                + "</tr>"
                + " </table>"
                + "<div align='center'>"
                + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2019 - CG Turbines SRL " + allRights + "<br> "
                + "</div></th></tr>"
                + "</table></div></body></html>";

        Mail mail = new Mail();
        mail.setEnterprise(enterprise);
        mail.setSubject(subject);
        mail.setFrom(enterprise.getInfoEmail());
        mail.setBody(body);
        ArrayList<String> recipients = new ArrayList<String>();
        recipients.add(CG_TURBINES_MAIL);
        if (!propiedades.getProperty("prop.mail1").equals("") && !propiedades.getProperty("prop.mail1").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail1"));
        if (!propiedades.getProperty("prop.mail2").equals("") && !propiedades.getProperty("prop.mail2").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail2"));
        if (!propiedades.getProperty("prop.mail3").equals("") && !propiedades.getProperty("prop.mail3").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail3"));
        if (!propiedades.getProperty("prop.mail4").equals("") && !propiedades.getProperty("prop.mail4").isEmpty())
        	recipients.add(propiedades.getProperty("prop.mail4"));
        mail.setTo(recipients);
        //Copia oculta
        recipients = new ArrayList<String>();
        recipients.add(SUPPORT_MAIL);
        mail.setBcc(recipients);
        return mail;
    }
    
    public static Mail getUserRecoveryPasswordMail(User user, String newPassword, Enterprise enterprise) throws GeneralException {

        String hello = "Hola";
        String subject = "CG Turbines SRL: Recuperación de clave.";
        String text1 = "Nos complace notificarle que su clave de acceso ha sido generada automaticamente.";
        String text2 = "Datos de su cuenta:";
        String text3 = "Recuperacion de clave";
        String distributorName = "Cuenta: ";
        String login = "Usuario(Login): ";
        String pass = "Nueva Clave: ";
        String messageFooter1 = "Este mensaje ha sido enviado desde una cuenta de correo electr&oacute;nico exclusivamente de notificaciones que no admite mensajes. No responda esta comunicaci&oacute;n.";
        String allRights = "Todos los derechos reservados";
        Properties propiedades = new Properties();
        try {
     			propiedades.load(new FileInputStream("C:\\Users\\yamea\\eclipse-workspace\\ServicesProviderCommons\\src\\properties\\prop.properties"));
     		} catch (FileNotFoundException e) {
     			e.printStackTrace();
     		} catch (IOException e) {
     			e.printStackTrace();
     		}
        String imagen = propiedades.getProperty("prop.logo");
        String style1 = "style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'";
        String style2 = "style='background-color: #555555;color:#ffffff;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px'";
        String body = "";
        body = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>";
        body += "<html xmlns='http://www.w3.org/1999/xhtml'>";
        body += "<head>";
        body += "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><style type='text/css'>.Estilo11 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #333333; font-size:13px; font-weight:bold;}</style><style type='text/css'>.Estilo12 {font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;}</style><style type='text/css'>.EstiloColumn {background-color: #555555;color:#7CBF4F;font:12px/1.8em Arial,Helvetica,sans-serif,lighter;font-weight:bold;padding-left:10px}</style>" + "<div align='center'>"
                + "<table width='756' height='600' border='0'>"
                + "<tr><th width='750' height='595'><p>"
                + "<img src='"+imagen+"' align='left' width='200' height='90' longdesc='Logo CG Turbines' />"
                + "</p><p>&nbsp;</p>" + "<p>&nbsp;</p>"
                + "<table  width='730' border='0' >"
                + "<tr><th width='728' height='20' align='right' bgcolor='#0095cd' style='color:#ffffff;font:14px/1.8em Arial,Helvetica,sans-serif,lighter;'>" + text3 + "</th></tr>"
                + "<tr><th width='728' height='5' bgcolor='#232323'></th></tr>"
                + "</table>"
                + "<table width='728' border='0'>"
                + "<tr><th width='728'>"
                + "<p align='left' class='Estilo11'><br/><br/>&iexcl;"
                + hello + " " + user.getFirstName() + " " + user.getLastName() + "&nbsp;" + "!</p>"
                + "<p align='left' class='Estilo11'>"
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
                + "<div><table width='705' border='0' cellpadding='2' cellspancing='0' style='border:inherit'>"
                + "<tr height='30px'><td " + style2 + " width='305'><div align='left'>"
                + distributorName + "</div></td>"
                + "<td>"
                + "<div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
                + user.getFirstName() + " " + user.getLastName() + "</div>"
                + "</td>"
                + "</tr>"
                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
                + login + "</div></td>"
                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
                + user.getLogin() + "</div></td></tr>"
                + "<tr height='30px'><td " + style2 + " width='305'><div align='left' >"
                + pass + "</div></td>"
                + "<td><div align='left' style='font:13px/0.6em Arial,Helvetica,sans-serif,lighter; color: #666; font-size:13px;'>"
                + newPassword + "</div></td></tr></div></table>"
                + "<tr height='3px'><th width='728' bgcolor='#232323'></th></tr>"
                        + "<tr height='40px'>"
                        + "</tr>"
                        + "<tr>"
                        + "<th height='31' bordercolor='#999999'><div align='center'>"
                        + " <p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>"
                        + messageFooter1
                        + "</p>"
                        + "</div>"
                        + "</th>"
                        + "</tr>"
                        + " </table>"
                        + "<div align='center'>"
                        + "<p align='center' style='font: 10px/1.8em Arial,Helvetica,sans-serif,lighter ; color: #666; display: table;  margin: 0; padding:0;'>&copy; Copyright 2019 - CG TURBINES SRL " + allRights + "<br> "
                        + "</div></th></tr>"
                        + "</table></div></body></html>";
        Mail mail = new Mail();
        mail.setEnterprise(enterprise);
        mail.setSubject(subject);
        mail.setFrom(enterprise.getInfoEmail());
        mail.setBody(body);
        ArrayList<String> recipients = new ArrayList<String>();
        recipients.add(user.getEmail());
        mail.setTo(recipients);
        //Copia oculta
        recipients = new ArrayList<String>();
        recipients.add(SUPPORT_MAIL);
        mail.setBcc(recipients);
        return mail;
    }
}
