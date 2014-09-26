package com.stone.core.work.util.test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {
	/**
	 * 使用md5的算法进行加密
	 */
	public static String md5(String plainText) {
		byte[] secretBytes = null;
		try {
			secretBytes = MessageDigest.getInstance("md5").digest(plainText.getBytes());
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("没有md5这个算法！");
		}
		String md5code = new BigInteger(1, secretBytes).toString(16);// 16进制数字
		// 如果生成数字未满32位，需要前面补0
		for (int i = 0; i < 32 - md5code.length(); i++) {
			md5code = "0" + md5code;
		}
		return md5code;
	}

	public static void main(String[] args) {
//		System.out.println(md5("1"));
//		System.out.println(md5("3"));
//		System.out.println(md5("2"));
//		System.out.println(md5("2"));
//		System.out.println(md5("A"));
//		System.out.println(md5("a"));
		
		//5a4ad4407822eb89a62ae9a8e0a7ecd5
		//bc3c4a6331a8a9950945a1aa8c95ab8a
		//098f6bcd4621d373cade4e832627b4f6

		System.out.println(md5("test"));
	}

}
