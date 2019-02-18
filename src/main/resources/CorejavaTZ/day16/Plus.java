package com.corejava.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**测试单元测试*/
public class Plus {

	//要测试的方法
	public int add(int i, int j)  {
		//int[] arr = null;
		//System.out.println(arr[0]);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return i + j;
	}
}
