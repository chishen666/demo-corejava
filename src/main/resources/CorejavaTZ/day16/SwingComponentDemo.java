package com.corejava.day16;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 本类用来演示Swing组件
 *
 * 作者:JSD1412
 * 时间:2015-1-22 下午1:47:42
 */
public class SwingComponentDemo {
	public static void main(String[] args) {
		//创建框体对象
		JFrame frame = new JFrame("登录");
		
		//创建面板对象
		JPanel panel = new JPanel();
		
		//创建按钮对象
		JButton button = new JButton("确认");

		//把按钮添加到面板中
		panel.add(button);

		//框体与面板的整合
		frame.getContentPane().add(panel);

		//显示之前设置框体大小
		frame.setSize(400, 300);

		//把框体显示
		frame.setVisible(true);
	}
}
