package com.corejava.day16;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ����������ʾSwing���
 *
 * ����:JSD1412
 * ʱ��:2015-1-22 ����1:47:42
 */
public class SwingComponentDemo {
	public static void main(String[] args) {
		//�����������
		JFrame frame = new JFrame("��¼");
		
		//����������
		JPanel panel = new JPanel();
		
		//������ť����
		JButton button = new JButton("ȷ��");

		//�Ѱ�ť��ӵ������
		panel.add(button);

		//��������������
		frame.getContentPane().add(panel);

		//��ʾ֮ǰ���ÿ����С
		frame.setSize(400, 300);

		//�ѿ�����ʾ
		frame.setVisible(true);
	}
}
