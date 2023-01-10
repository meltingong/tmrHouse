package com.itwill.tmr_house.member.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class MemberMyPageScreenPanel_하은 extends JPanel {
	private JTextField modifyIdTF;
	private JPasswordField modifyPasswordField;
	private JPasswordField modifyPasswordCorrectField;
	private JTextField modifyNameTF;
	private JTextField modifyPhoneNumberTF;
	private JTextField modifyAddressTF;

	/**
	 * Create the panel.
	 */
	public MemberMyPageScreenPanel_하은() {
		setBackground(new Color(255, 255, 255));
		setLayout(new BorderLayout(0, 0));
		
		JPanel memberMyPageNorthPanel = new JPanel();
		memberMyPageNorthPanel.setBackground(new Color(255, 255, 255));
		add(memberMyPageNorthPanel, BorderLayout.NORTH);
		
		JLabel memberMyPageAppTitleLB = new JLabel("Tommorow's House");
		memberMyPageAppTitleLB.setFont(new Font("D2Coding", Font.BOLD, 20));
		memberMyPageNorthPanel.add(memberMyPageAppTitleLB);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel idLB = new JLabel("아이디");
		idLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		idLB.setBounds(54, 122, 152, 18);
		panel.add(idLB);
		
		JLabel pwLB = new JLabel("비밀번호");
		pwLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		pwLB.setBounds(54, 178, 152, 24);
		panel.add(pwLB);
		
		JLabel pwCorrectLB = new JLabel("비밀번호확인");
		pwCorrectLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		pwCorrectLB.setBounds(54, 244, 152, 37);
		panel.add(pwCorrectLB);
		
		JLabel name = new JLabel("이름");
		name.setFont(new Font("D2Coding", Font.PLAIN, 17));
		name.setBounds(54, 301, 152, 37);
		panel.add(name);
		
		JLabel phoneNumberLB = new JLabel("핸드폰 번호");
		phoneNumberLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		phoneNumberLB.setBounds(54, 367, 152, 24);
		panel.add(phoneNumberLB);
		
		JLabel addressLB = new JLabel("주소");
		addressLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		addressLB.setBounds(54, 432, 152, 18);
		panel.add(addressLB);
		
		modifyIdTF = new JTextField();
		modifyIdTF.setFont(new Font("D2Coding", Font.PLAIN, 17));
		modifyIdTF.setColumns(10);
		modifyIdTF.setBounds(253, 122, 205, 21);
		panel.add(modifyIdTF);
		
		modifyPasswordField = new JPasswordField();
		modifyPasswordField.setFont(new Font("D2Coding", Font.PLAIN, 17));
		modifyPasswordField.setBounds(253, 181, 205, 21);
		panel.add(modifyPasswordField);
		
		modifyPasswordCorrectField = new JPasswordField();
		modifyPasswordCorrectField.setFont(new Font("D2Coding", Font.PLAIN, 17));
		modifyPasswordCorrectField.setBounds(253, 253, 205, 21);
		panel.add(modifyPasswordCorrectField);
		
		modifyNameTF = new JTextField();
		modifyNameTF.setFont(new Font("D2Coding", Font.PLAIN, 17));
		modifyNameTF.setColumns(10);
		modifyNameTF.setBounds(253, 310, 205, 21);
		panel.add(modifyNameTF);
		
		modifyPhoneNumberTF = new JTextField();
		modifyPhoneNumberTF.setFont(new Font("D2Coding", Font.PLAIN, 17));
		modifyPhoneNumberTF.setColumns(11);
		modifyPhoneNumberTF.setBounds(253, 369, 205, 21);
		panel.add(modifyPhoneNumberTF);
		
		modifyAddressTF = new JTextField();
		modifyAddressTF.setFont(new Font("D2Coding", Font.PLAIN, 17));
		modifyAddressTF.setColumns(20);
		modifyAddressTF.setBounds(253, 432, 205, 21);
		panel.add(modifyAddressTF);
		
		JLabel lblNewLabel = new JLabel("회원정보 수정");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 30));
		lblNewLabel.setBounds(140, 42, 218, 37);
		panel.add(lblNewLabel);
		
		JButton modifyBtn = new JButton("수정");
		modifyBtn.setForeground(Color.WHITE);
		modifyBtn.setFont(new Font("D2Coding", Font.PLAIN, 17));
		modifyBtn.setBorderPainted(false);
		modifyBtn.setBackground(new Color(64, 184, 255));
		modifyBtn.setBounds(95, 535, 97, 37);
		panel.add(modifyBtn);
		
		JButton cancelBtn = new JButton("취소");
		cancelBtn.setFont(new Font("D2Coding", Font.PLAIN, 17));
		cancelBtn.setBorderPainted(false);
		cancelBtn.setBackground(Color.WHITE);
		cancelBtn.setBounds(316, 535, 97, 37);
		panel.add(cancelBtn);

	}
}
