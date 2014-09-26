package com.stone.core.work.util.test;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CC {
	
	public static void main(String[] args) {
		
		DateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		try {
			Date reportDate = sdf.parse("20140409");//00000000
			
			System.out.println(reportDate.toString());
			
			
			System.out.println(File.separator);
			System.out.println(File.separatorChar);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
