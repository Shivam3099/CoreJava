package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

   public class MaintenanceCalendar {
     private static final Calendar c = null;
	public static void main(String[] args)   {
	     Date d =new Date();
        System.out.println(d);
          
       SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
       String s =sdf.format(d);
        System.out.println(s);
      
        
        Calendar c= Calendar.getInstance();
        
        Caldr(c);
}
	public static void Caldr(Calendar c) {
    for(int i = 0;i < 12; i++) {
	c.add(Calendar.DATE,30);
	Date n = c.getTime();
	System.out.println(n);
	}
}
}