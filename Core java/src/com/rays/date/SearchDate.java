package com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class SearchDate {
	public static void main(String[] args)throws ParseException {
		String s="10/2/2002";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date d= sdf.parse(s);
		System.out.println(d);
	}

	
}
