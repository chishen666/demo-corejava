package com.corejava.day13.homework;

import java.io.ByteArrayOutputStream;

import com.corejava.util.InputUtil;

public class ByteArrayInputStreamDemo {
	public static void main(String[] args) {
		int password = InputUtil.inputInt("ÇëÄúÊäÈëÃÜÂë:");
		write("¸ôÉéÉéÃı¿Ù¿Æ)Qjad|%lv%d%bjja%r`dqm`w+", password);
	}

	public static void write(String src, int password) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] buf = src.getBytes();
		for (int i = 0; i < buf.length; i++) {
			buf[i] ^= password;
		}
		bos.write(buf, 0, buf.length);
		byte[] temp = bos.toByteArray();
		System.out.println(new String(temp));
	}
}
