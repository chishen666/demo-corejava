package com.carrx.corejava.netprogram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSendDemo {

	public static void main(String[] args) {
		udpSend("192.168.1.3", 8080, "hello world!");
	}

	public static void udpSend(String ip, int port, String msg) {
		try {
			byte[] buf = msg.getBytes("UTF-8");
			InetAddress address = InetAddress.getByName(ip);
			DatagramSocket ds = new DatagramSocket();
			DatagramPacket dp = new DatagramPacket(buf, buf.length, address, port);
			ds.send(dp);
			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
