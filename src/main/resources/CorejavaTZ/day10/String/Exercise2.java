package com.corejava.day10.String;

import java.util.Date;

import com.corejava.util.DateUtil;
import com.corejava.util.InputUtil;

/**模拟生日注册*/
public class Exercise2 {
	public static void main(String[] args) {
		String message = InputUtil.inputLine("请您输入生日:");
		String[] arr = message.split("-");
		Date birthday = DateUtil.createDate(Integer.parseInt(arr[0]),
				Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
		System.out.println(birthday);
	}
}
