package com.stone.core.work.util.test;

import java.math.BigDecimal;

public class AB {
	
	private static final String NUMBER_REG = "^(([1-9]\\d{0,9})|0)(\\.\\d{1,2})?$";//^\d{15}|\d{18}$//^[0-9]*$//^(\\d{18,18}|\\d{15,15}|\\d{17,17}x)$
	
	public static void main(String[] args) {
		
		A a= new A();
		a.setA("a");
		a.setB("b");
		
		
		String c = a.getId();
		
		System.out.println(c+"==");
		
		
		
		System.out.println(a.getId());
		
		boolean b = isNumber("234.000");//0234.553
		System.out.println(b+"===");
		BigDecimal bigNumber = new BigDecimal("022.00022"); 
		System.out.println(bigNumber);
		
		
	}
	
	public static boolean isNumber(String number) {
		if (number==null) {
			return false;
		} else if (number.matches(NUMBER_REG)) {
			return true;
		}

		return false;
	}

}
