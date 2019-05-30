package com.alodiga.services.provider.commons.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
	
	
	public static Calendar calendarFromString(String date, String format){
		Calendar dateWithFormat = null;
		try 
		{
		  DateFormat formatter = new SimpleDateFormat(format);
		  dateWithFormat = GregorianCalendar.getInstance(); 
		  Date auxDate = new Date(formatter.parse(date).getTime());
		  dateWithFormat.setTime(auxDate);		  
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		  return  dateWithFormat;
	}

}
