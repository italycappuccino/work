package com.stone.core.work.util.test;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;

public class Sp {
	protected static final String DEFAULT_SEPARATOR = Character.toString((char)0x01);
	
	public static void main(String[] args) {
		
//		
//		System.out.println(DEFAULT_SEPARATOR);
//		
//		String data = "1110212091mm";
//		final String[] items = StringUtils.splitPreserveAllTokens(data, DEFAULT_SEPARATOR);
//		
//		
//		System.out.println(items.length);
		long a = 1039034l;
		//0e2bcf8c708ab89d65830754bc03d241
		//0e2bcf8c708ab89d65830754bc03d241
		
//		System.out.println(MD5Utils.md5(String.valueOf(a)));
//		
//		Mp m = abc();
//		System.out.println(m.getO().getA());
		
		String usedSumInsured = "2.100";
		BigDecimal usi=new BigDecimal(usedSumInsured);
		System.out.println(usi.toString());
		
		
		
		
	}
	
	static Mp abc(){
		Mp m = new Mp();
		Op o = new Op();
		m.setO(o);
		o.setA(1);
		o.setB(2);
		return m;
	}

}
class Mp{
	Op o;
	int f;
	public Op getO() {
		return o;
	}
	public void setO(Op o) {
		this.o = o;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
}
class Op{
	int a;
	int b;
	int c;
	int d;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
}