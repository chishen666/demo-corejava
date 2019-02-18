package com.carrx.corejava.netprogram;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IpDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());

		InetAddress[] ip1 = InetAddress.getAllByName("www.baidu.com");

		for (InetAddress inetAddress : ip1) {
			System.out.println(inetAddress.getHostAddress());
		}
		String str = "127.0.0.1";
		System.out.println(Arrays.toString(str.getBytes()));

	}
}
