package com.carrx.corejava.netprogram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UdpReceive2Demo {
	public static void main(String[] args) {
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();
			int port = 8080;
			udpReceive(ip, port);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	public static void udpReceive(String ip, int port) throws IOException {
		InetAddress address = InetAddress.getByName(ip);
		DatagramSocket ds = new DatagramSocket(port, address);
		while (true) {
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			buf = dp.getData();
			System.out.println(new String(buf, "UTF-8"));
		}
	}
}
