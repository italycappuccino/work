package com.stone.core.work.util.test;

import java.io.File;

public class FF {
	
	public static void main(String[] args) {
		String LINE = System.getProperty("line.separator");
		System.out.println(LINE+"===");
		
		
		
		File p = new File("d:/a");
		System.out.println(p.isDirectory());
		p.mkdirs();
		System.out.println(p.getAbsolutePath());
	}

}
