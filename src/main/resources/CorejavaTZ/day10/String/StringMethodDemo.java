package com.corejava.day10.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * ����������ʾjava.lang.String�еĳ��÷���
 *
 * ����:JSD1412
 * ʱ��:2015-1-19 ����10:51:57
 */
public class StringMethodDemo {

	private static String str = "���,����Java";

	public static void main(String[] args) {
		//1.ͨ���±��ȡ�ַ����ַ�,�ַ����±�Ҳ�Ǵ�0��ʼ,
		//��������±�,���׳��쳣:StringIndexOutOfBoundsException
		char c1 = str.charAt(0);
		System.out.println(c1);

		//2.ͨ����,��,���Ƚ��ַ�����С(������ʱʹ��)
		int r1 = new String("C").compareTo(new String("A"));
		System.out.println(r1);

		//3.�Ƚ��ַ���ֵ�Ƿ����
		boolean b1 = new String("C").equals(new String("C"));

		//���Դ�Сд�Ƚ����
		boolean b2 = new String("C").equalsIgnoreCase(new String("c"));
		System.out.println(b1);
		System.out.println(b2);

		//4.�ַ���ƴ�ӷ���
		String s1 = str.concat("����Ա");
		System.out.println(s1);

		//5.�ж��ַ������Ƿ����ָ������
		boolean b3 = str.contains("C++");
		System.out.println(b3);

		//6.�ж��ַ����Ƿ���ָ�����ݿ�ͷ���߽�β
		boolean b4 = new String("������--���ٻ�����.mp3").startsWith("������");
		boolean b5 = new String("������--���ٻ�����.mp3").endsWith("mp3");
		System.out.println(b4);
		System.out.println(b5);

		//7.��ȡ�ַ�����ָ�����ݵ��±�(��ȡ��һ�γ��ֵ��±�)
		//ע��:���������ָ���ַ�,�򷵻�-1�±�
		int index1 = new String("������--���ٻ�����.mp3").indexOf("-");
		System.out.println(index1);

		int index2 = new String("������--���ٻ���-��.mp3").lastIndexOf("-");
		System.out.println(index2);

		int index3 = new String("������--���ٻ�����.mp3").indexOf("-", index1 + 1);
		System.out.println(index3);

		//ע��:
		boolean b6 = new String("������--���ٻ�����.mp3").startsWith("����", index3 + 1);
		System.out.println(b6);

		//8.���ַ���ת�����ֽ�����(����ת��ʱʹ��,�Ժ���˵)
		byte[] buf = null;
		try {
			buf = str.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(buf));
		System.out.println(new String(buf));

		//9.��ȡ�ַ����ĳ���(�ַ���)
		int length1 = str.length();
		System.out.println(length1);

		//��ȡ�ַ����ĳ���(�ֽ���)
		int length2 = str.getBytes().length;
		System.out.println(length2);

		//10.�ж��ַ����Ƿ�Ϊ��
		boolean b7 = str.isEmpty();//������������Ϊ��
		//str = null;//����������
		System.out.println(b7);

		//11.ƥ��������ʽ
		boolean b8 = new String("ABCD").matches("[A-Z]+");
		System.out.println(b8);

		//12.�滻�ַ�������
		String s2 = str.replace("Java", "C++");
		System.out.println(s2);

		//13.�ַ����и�
		String[] strArr = new String("�й�-����ʡ-������-������-���·80��").split("-");
		System.out.println(Arrays.toString(strArr));

		//14.��ȡ�ַ���
		String s3 = new String("�й�-����ʡ-������-������-���·80��").substring(3);
		System.out.println(s3);

		String s4 = new String("�й�-����ʡ-������-������-���·80��").substring(3, 6);
		System.out.println(s4);

		//15.���ַ���ת�����ַ�����
		char[] charArr = str.toCharArray();
		System.out.println(Arrays.toString(charArr));

		//16.���ַ���ת���ɴ�Сд(����ͬCharacter)
		String s5 = new String("ABC").toLowerCase();
		String s6 = new String("abc").toUpperCase();
		System.out.println(s5);
		System.out.println(s6);

		//17.ȥ���ַ���ǰ��հ�
		String s7 = new String("  ABC   ").trim();
		System.out.println(s7);

		//ע��:trim()����һ�������ж�ĳһ���Ƿ�Ϊ����
		String line = "     ";
		if (line.length() == 0 || line.trim().length() == 0) {
			System.out.println("˵���ǿ���.");
		}

		//18.��ָ��������ת�����ַ���
		String s8 = String.valueOf(100);
		String s9 = String.valueOf(3.14);
	}
}
