package com.stone.core.work.util.mac;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * 
 * @author MrWang
 * 获取客户端MAC地址
 * 
 *
 */

public class MacAddress {
	
	public static String hexByte(byte b) {
		String s = "000000" + Integer.toHexString(b);
		return s.substring(s.length() - 2);
	}

	public String getMAC() {
		Enumeration<NetworkInterface> el;
		String mac_s = "";
		try {
			el = NetworkInterface.getNetworkInterfaces();
			while (el.hasMoreElements()) {
				byte[] mac = el.nextElement().getHardwareAddress();
				if (mac == null)
					continue;
				else
					if(mac.length>0){
						mac_s = /**/hexByte(mac[0]) + "-" + hexByte(mac[1]) + "-"
								+ hexByte(mac[2]) + "-" + hexByte(mac[3]) + "-"
								+ hexByte(mac[4]) + "-" + hexByte(mac[5]);
						System.out.println(mac_s + "MAC地址");
					}

			}
		} catch (SocketException e1) {
			e1.printStackTrace();
		}
		return mac_s;
	}
	
	public static void main(String[] args) {
		MacAddress m = new MacAddress();
		String mac = m.getMAC();
		System.out.println(mac);
		
	}
}

