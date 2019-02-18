package com.corejava.day09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ����������ʾJava������ʽģ��ƥ������
 *
 * ����:JSD1412
 * ʱ��:2015-1-15 ����9:30:05
 */
public class RegexDemo2 {

	private String content;

	//���췽����ʼ������
	public RegexDemo2() {
		content = "Java is a very good programing lauguage,It was develop by SUN in 1996,"
				+ "Java was not similar with JavaScript."
				+ "If you want to learning Java,Please contact me at:"
				+ "allan0716@gmail.com or 1381234567.";
	}

	//ģ��ƥ����������
	public void matches(String regex) {
		//1.����������ʽ����ƥ��ģ��
		Pattern p = Pattern.compile(regex);
		//2.����ģ�崴��ƥ����
		Matcher m = p.matcher(content);
		
		//ͳ�Ƴ��ִ���
		int count = 0;
		
		//����״̬����
		boolean bool = true;
		
		//3.ģ������
		while (m.find()) {
			//˵���ҵ��������,���ӡ
			System.out.println(m.group() + "�����е�[" + m.start() + "~" + m.end()
					+ "]λ�ô�.");
			count++;//��������1
			bool = false;//�ı�״̬������״̬
		}
		System.out.println("����ƥ�������һ��������:" + count + "��.");
		if(bool){
			System.out.println("����û���ҵ��������...");
		}
	}

	public static void main(String[] args) {
		RegexDemo2 rd = new RegexDemo2();
		rd.matches("Java");
	}
}
