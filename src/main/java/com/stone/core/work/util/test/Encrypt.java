package com.stone.core.work.util.test;

public class Encrypt {
	
	public static void main(String[] args) {
		
		long a = 2l;
		long b = 2l;
		
		long c = 1l;
		long d = 3l;
		
		
		System.out.println("a".hashCode());
		System.out.println("b".hashCode());
		System.out.println("A".hashCode());
		System.out.println("B".hashCode());
		
		System.out.println(String.valueOf(a).hashCode()+String.valueOf(b).hashCode());
		System.out.println(String.valueOf(c).hashCode()+String.valueOf(d).hashCode());
		
		System.out.println(String.valueOf(a).hashCode());
		System.out.println(String.valueOf(b).hashCode());
		System.out.println(String.valueOf(c).hashCode());
		System.out.println(String.valueOf(d).hashCode());
		
	}

}
