package com.stone.core.work.util.mac;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class MacTest {
	
	public static String physicalAddress = "read MAC error!";

	 public MacTest() {
		 
	 }

	 public static String checkPhysicalAddress() {
	  try {
	   String line;
	   Process process = Runtime.getRuntime().exec("cmd /c ipconfig /all");
	   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	   while ((line = bufferedReader.readLine()) != null) {
	    System.out.println(line);
	    if (line.indexOf("Physical Address. . . . . . . . . :") != -1) {
	     if (line.indexOf(":") != -1) {
	      physicalAddress = line.substring(line.indexOf(":") + 2);
	      //break; // 找到MAC,推出循环
	     }
	    }
	   }
	   process.waitFor();
	  } catch (Exception e) {
	   e.printStackTrace();
	  }
	  return physicalAddress;
	 }

	 public static void main(String[] args) {
	  System.out.println("本机的MAC地址是: " + MacTest.checkPhysicalAddress());
	  
	  //方法一：中文操作系统中打印GBK  
      System.out.println(System.getProperty("file.encoding"));  
        
      //方法二：中文操作系统中打印GBK  
      System.out.println(Charset.defaultCharset());  
	 }
	
	
	
	
	
	

}
