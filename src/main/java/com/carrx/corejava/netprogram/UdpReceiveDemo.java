package com.carrx.corejava.netprogram;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpReceiveDemo {

	public static void main(String[] args) {
		try {
			byte[] buf = udpReceive("192.168.1.3", 8080);
			System.out.println(new String(buf, "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public static byte[] udpReceive(String ip, int port) {
		DatagramSocket ds = null;
		try {
			byte[] buf = new byte[1024];
			InetAddress address = InetAddress.getByName(ip);
			ds = new DatagramSocket(port, address);
			while (true) {

				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				System.out.println(new String(dp.getData(), "utf-8"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ds != null) {
				ds.close();
			}
		}
		return null;
	}
}
