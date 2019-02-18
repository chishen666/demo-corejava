package com.corejava.day10.homework;

public class StringTest {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("This is a log file,it was store at")
				.append("\"d:\\Program File\\temp\" ")
				.append("directory.the format of log file was:\n")
				.append("20130509:Jack:M:1990-08-08");

		//1.��ȡ�������е�·�����ַ���
		//��ȡ�ַ����е�һ��"���ֵ��±�
		int start = builder.indexOf("\"");
		//��ȡ�ַ����еڶ���"���ֵ��±�
		int end = builder.indexOf("\"", start + 1);
		//��ȡ·��
		String path = builder.substring(start + 1, end);
		System.out.println(path);

		//2.�ѵ�һ������֮ǰ�Ĳ����е����пո��滻Ϊ#
		String beforePart = builder.substring(0, start).replace(" ", "#");
		System.out.println(beforePart);

		//�ѵڶ�������֮��Ĳ����е����пո��滻Ϊ*
		String afterPart = builder.substring(end + 1).replace(" ", "*");
		System.out.println(afterPart);

		//3.��\n������ַ���ȡ����ӡ
		String lastPart = builder.substring(builder.indexOf("\n") + 1);
		System.out.println(lastPart);

		//��:��Ϊ�и��,��\n�����ȡ�������ַ����ֶδ�ӡ
		String[] arr = lastPart.split(":");

		for (String s : arr) {
			System.out.println(s);
		}
	}
}
