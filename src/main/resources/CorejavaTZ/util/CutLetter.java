package com.corejava.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CutLetter {

	private static String filepath = "D:\\Q3.txt";

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filepath));
			String line = null;
			while ((line = br.readLine()) != null) {
				//截取最后的出现次数
				line = line.substring(0, line.lastIndexOf(":"));
				
				//截取翻译以及之后的内容
				/*line = line.substring(0,
						line.indexOf(":", line.indexOf(":") + 1));*/
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
