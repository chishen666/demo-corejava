package com.corejava.day09;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������˻�:");
		String username = sc.nextLine();

		//1.Pattern���matches("������ʽ","ƥ�������");
		if(Pattern.matches("[A-Z][A-Za-z0-9-]+", username)){

		//2.String���matches("������ʽ");
		//if (username.matches("[A-Z][A-Za-z0-9-]+")) {
			System.out.println("������������:");
			String password = sc.nextLine();
			if (password.matches("\\d{6}")) {
				System.out.println("ע��ɹ�!");
			} else {
				System.out.println("���벻����Ҫ��...");
			}
		} else {
			System.out.println("�˺Ų�����Ҫ��...");
		}
	}
}
