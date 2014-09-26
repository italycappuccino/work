package com.stone.core.work.util.test;

import java.io.File;
import java.util.Calendar;

public class M {
	
	public static void main(String[] args) {
		
		try {
		String oldPath="D:/Peter/Java/Test/a.txt";
		String newPath="D:/Peter/Java/Test10/a.txt";
		File newFile = new File(newPath);
		new File(oldPath).renameTo(newFile);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
