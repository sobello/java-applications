package com.session.four;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("American Format "+sdf.format(d1));
				
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 5); //Add 5 days to Today's date
		//cal.add(Calendar.DAY_OF_MONTH, -5);//Subtract 5 days from Today's Date
		cal.setTime(cal.getTime());
		System.out.println(sdf.format(cal.getTime()));
		
	}
	
	
}
