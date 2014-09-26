package com.stone.core.work.util.test;

import java.util.Date;
import java.util.Properties;

public class Property {
	
	public static void main(String[] args) {
		
		System.out.println(new Date());
		
		Properties p = System.getProperties();
		
		p.list(System.out);
		
		System.out.println("==");
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("="+rt.totalMemory()+"\n"+rt.freeMemory());
		
	}

}
