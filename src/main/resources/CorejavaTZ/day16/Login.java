package com.corejava.day16;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {
	private static JTextField textField;
	private static JPasswordField passwordField;
	private static JButton btnNewButton;

	public static void main(String[] args) {
		//�����������
		final JFrame frame = new JFrame("��¼");
		
		//�˵���
		JMenuBar jmb = new JMenuBar();
		frame.setJMenuBar(jmb);
		JMenu jm1 = new JMenu("�ļ�");
		jm1.add(new JMenuItem("�½�(N)"));
		jm1.add(new JMenuItem("����"));
		jm1.add(new JMenuItem("��"));
		jm1.add(new JMenuItem("���Ϊ"));
		jmb.add(jm1);
		
		JMenu jm2 = new JMenu("�༭");
		jmb.add(jm2);
		
		//����������
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);

		//��������������
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 16));
		lblNewLabel.setBounds(76, 68, 72, 37);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\u5BC6  \u7801:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 16));
		lblNewLabel_1.setBounds(76, 126, 72, 37);
		panel.add(lblNewLabel_1);

		btnNewButton = new JButton("\u9000\u51FA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��������
				final JFrame f = new JFrame("ȷ����Ϣ");
				f.getContentPane().setLayout(null);

				JLabel lblNewLabel = new JLabel("\u786E\u5B9A\u9000\u51FA\u5417?");
				lblNewLabel.setFont(new Font("����", Font.BOLD, 20));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(26, 10, 138, 24);
				f.getContentPane().add(lblNewLabel);

				JButton btnNewButton = new JButton("\u662F");
				
				btnNewButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						f.dispose();
						frame.dispose();
					}
				});
				btnNewButton.setBounds(36, 44, 57, 24);
				f.getContentPane().add(btnNewButton);

				JButton btnNewButton_1 = new JButton("\u5426");
				btnNewButton_1.setBounds(103, 44, 57, 24);
				f.getContentPane().add(btnNewButton_1);
				
				f.setSize(197, 118);
				f.setLocation(525, 300);
				
				f.setVisible(true);
			}
		});

		btnNewButton.setBounds(210, 185, 78, 37);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u767B\u5F55");
		btnNewButton_1.setBounds(100, 185, 78, 37);
		panel.add(btnNewButton_1);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(158, 74, 139, 28);
		panel.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(158, 131, 139, 29);
		panel.add(passwordField);

		JLabel lblNewLabel_2 = new JLabel(
				"\u6B22\u8FCE\u767B\u5F55XXX\u7CFB\u7EDF");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(110, 15, 164, 43);
		panel.add(lblNewLabel_2);

		frame.setLocation(420, 200);

		//frame.setLocationRelativeTo(null);

		//��ʾ֮ǰ���ÿ����С
		frame.setSize(400, 300);

		//�ѿ�����ʾ
		frame.setVisible(true);
	}
}
