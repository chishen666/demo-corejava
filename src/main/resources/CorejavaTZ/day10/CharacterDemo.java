package com.corejava.day10;

/**
 * ����������ʾJava��װ���ַ���
 *
 * ����:JSD1412
 * ʱ��:2015-1-16 ����4:07:37
 */
public class CharacterDemo {
	public static void main(String[] args) {
		//�ж�ָ���ַ��Ƿ�������
		System.out.println(Character.isDigit('9'));

		//�ж�ָ���ַ��Ƿ�����ĸ(ֻҪ�����ԵĻ�����ɵ�λ������ĸ)
		System.out.println(Character.isLetter('��'));

		//�ж�ָ���ַ��Ƿ��ǿհ�
		System.out.println(Character.isWhitespace(' '));

		//�ж�ָ���ַ��Ƿ��Ǵ�д��ĸ
		System.out.println(Character.isUpperCase('A'));

		//�ж�ָ���ַ��Ƿ���Сд��ĸ
		System.out.println(Character.isLowerCase('a'));

		//��ָ���ַ�ת���ɴ�д��ʽ
		System.out.println(Character.toUpperCase('a'));

		//��ָ���ַ�ת����Сд��ʽ
		System.out.println(Character.toLowerCase('A'));
	}
}
