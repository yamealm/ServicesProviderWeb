/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.alodiga.services.provider.commons.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lromero
 */
public class TestDate {


    public static void main(String[] s){
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
      Date d = null;
        try {
            d = format1.parse("2025-5-01");
        } catch (ParseException ex) {
            Logger.getLogger(TestDate.class.getName()).log(Level.SEVERE, null, ex);
        }
      System.out.print(d.toString() + "**************");

        Timestamp ccTimestamp = new Timestamp(d.getTime());
         System.out.print(ccTimestamp.toString() + "**********" );

         

                    SimpleDateFormat format = new SimpleDateFormat("MM");
                    String ccMonth = String.valueOf(format.format(ccTimestamp));
                    format = new SimpleDateFormat("yyyy");
                    String ccYear = String.valueOf(format.format(ccTimestamp));
                    try {
                        SimpleDateFormat formatter = new SimpleDateFormat("MM-yyyy");
                        java.sql.Date creditCardDate1 = new java.sql.Date((formatter.parse(ccMonth + "-" + ccYear)).getTime());
                           System.out.print(creditCardDate1.toString() + "**********" );
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }


    }

}
