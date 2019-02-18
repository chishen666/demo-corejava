package com.corejava.day09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ����������ʾJava������ʽAPI��ʹ��
 *
 * ����:JSD1412
 * ʱ��:2015-1-15 ����9:14:07
 */
public class RegexDemo1 {
	public static void main(String[] args) {
		//1.����������ʽ����ƥ��ģ��
		//����ĸ��д,���������ִ�Сд��ĸ���,���ҳ��ȴ��ڵ���6λ
		Pattern p = Pattern.compile("[A-Z][A-Za-z0-9]{5,}");

		//6λ��������
		//Pattern p = Pattern.compile("[0-9]{6}");
		//Pattern p = Pattern.compile("\\d{6}");

		//2.����ģ�崴��ƥ����
		Matcher m = p.matcher("JavaScript");

		//3.��ȷƥ��
		boolean bool = m.matches();
		System.out.println(bool == true ? "ƥ��ɹ�!" : "ƥ��ʧ��!");

		System.out
				.println(Pattern.matches("[A-Z][A-Za-z0-9]{5,}", "JavaScript") == true ? "ƥ��ɹ�!"
						: "ƥ��ʧ��!");

	}
}
