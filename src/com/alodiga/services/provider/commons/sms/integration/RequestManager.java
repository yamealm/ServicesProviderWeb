package com.alodiga.services.provider.commons.sms.integration;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RequestManager {

    public static final String SMS_TELINTEL_INTEGRATION_URL = "http://dialerutils.mytunu.com:8080/DialerUtils/SendRawSms";
    public static final String SMS_TELINTEL_INTEGRATION_LOGIN = "desarrollo@alodiga.com";
    //public static final String SMS_TELINTEL_INTEGRATION_LOGIN = "yrodriguez@alodiga.com";
    public static final String SMS_TELINTEL_INTEGRATION_PASSWORD = "123+alodiga";
    public static final String SMS_TELINTEL_INTEGRATION_FROM = "19547563396"; //Celular de Philip
    //public static final String SMS_TELINTEL_INTEGRATION_FROM = "Alodiga";
    public static String sendSMSPostRequest(String message, String dni) throws SMSSendFailureException, Exception {
        String response = null;
        StringWriter sw = new StringWriter();
        try {
            URL formAction = new URL(SMS_TELINTEL_INTEGRATION_URL);

            Reader reader = new StringReader(
                    "login=" + SMS_TELINTEL_INTEGRATION_LOGIN
                    + "&password=" + URLEncoder.encode(SMS_TELINTEL_INTEGRATION_PASSWORD,"UTF-8")
                    + "&message=" + HTTPRequestUtilities.formatToUTF8(message)
                    + "&from=" + SMS_TELINTEL_INTEGRATION_FROM + "&to=" + dni);
            HTTPRequestUtilities.postData(reader, formAction, sw);
            response = sw.toString();
            
            System.out.println("response "+ response);
            String[] respondeElements = response.split("\\|");
            if(respondeElements[0].equals("0")){
                throw new SMSSendFailureException(response);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            sw.close();
        }
        return response;
    }

    public static void main(String[] args) {
        try {
           //sendSMSPostRequest("hola jhonny", "584168079662");
            //sendSMSPostRequest("test...", "19547563396");
            sendSMSPostRequest("hola Leonel", "584267170882");
        } catch (SMSSendFailureException ex) {
            Logger.getLogger(RequestManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RequestManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
