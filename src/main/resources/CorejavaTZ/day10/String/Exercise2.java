package com.corejava.day10.String;

import java.util.Date;

import com.corejava.util.DateUtil;
import com.corejava.util.InputUtil;

/**ģ������ע��*/
public class Exercise2 {
	public static void main(String[] args) {
		String message = InputUtil.inputLine("������������:");
		String[] arr = message.split("-");
		Date birthday = DateUtil.createDate(Integer.parseInt(arr[0]),
				Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
		System.out.println(birthday);
	}
}
