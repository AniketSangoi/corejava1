package com.rays.date;
import java.util.Date;
import java.util.Calendar;
public class Calendarry {

	
	public static void main(String[] args) {
		Date today= new Date();
	Calendar cal=Calendar.getInstance();
	cal.setTime(today);
	cal.add(Calendar.DATE,0);
	System.out.println(today);
	}
}
