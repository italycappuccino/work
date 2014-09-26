package com.stone.core.work.util.test;

public class GG {
	
	
	public static void main(String[] args) {
		GG g = new GG();
		g.a();
	}
	
	public void p(){
		Long id = 9301230102l;
		String serialNo = String.format("%010d", id);
		if(id.toString().equals(serialNo)){
			System.out.println("========================");
		}
		System.out.println(serialNo+"========");	
	}
	
	public void a(){
		Mc c = new Mc();
		c.setB("b");
		c.setC("c");
		b(c);
		
		System.out.println(c.getA()+"====");
	}
	
	public void b(Mc m){
		m.setA(1);
	}
	
	
	
	

}
class Mc{
	int a;
	String b;
	String c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	
}