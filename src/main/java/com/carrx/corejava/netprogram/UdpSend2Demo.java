package com.carrx.corejava.netprogram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UdpSend2Demo {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (true) {
				String line = sc.nextLine();
				if (line != null && line.length() > 0) {
					byte[] buf = line.getBytes();
					String ip = InetAddress.getLocalHost().getHostAddress();
					int port = 8080;
					udpSend(buf, ip, port);
				}
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

	public static void udpSend(byte[] buf, String ip, int port) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		InetAddress address = InetAddress.getByName(ip);
		DatagramPacket dp = new DatagramPacket(buf, buf.length, address, port);
		ds.send(dp);
		ds.close();
	}
}
