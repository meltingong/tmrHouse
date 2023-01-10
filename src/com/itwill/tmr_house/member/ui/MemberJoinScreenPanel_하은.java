package com.itwill.tmr_house.member.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class MemberJoinScreenPanel_하은 extends JPanel {
	private JTextField joinIdTF;
	private JTextField joinNameTF;
	private JTextField joinPhoneNumberTF;
	private JTextField joinAddressTF;
	private JPasswordField joinPasswordField;
	private JPasswordField joinPasswordCorrectField;

	/**
	 * Create the panel.
	 */
	public MemberJoinScreenPanel_하은() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel memberJoinNorthPanel = new JPanel();
		memberJoinNorthPanel.setBackground(new Color(255, 255, 255));
		add(memberJoinNorthPanel, BorderLayout.NORTH);
		
		JTextPane memberJoinAppTitleTextPane = new JTextPane();
		memberJoinAppTitleTextPane.setFont(new Font("D2Coding", Font.BOLD, 20));
		memberJoinAppTitleTextPane.setText("Tomorrow's House");
		memberJoinNorthPanel.add(memberJoinAppTitleTextPane);
		
		JPanel memberJoinCenterPanel = new JPanel();
		memberJoinCenterPanel.setBackground(new Color(255, 255, 255));
		add(memberJoinCenterPanel, BorderLayout.CENTER);
		memberJoinCenterPanel.setLayout(null);
		
		JLabel idLB = new JLabel("아이디");
		idLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		idLB.setBounds(47, 147, 152, 18);
		memberJoinCenterPanel.add(idLB);
		
		JLabel pwLB = new JLabel("비밀번호");
		pwLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		pwLB.setBounds(47, 203, 152, 24);
		memberJoinCenterPanel.add(pwLB);
		
		JLabel pwCorrectLB = new JLabel("비밀번호확인");
		pwCorrectLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		pwCorrectLB.setBounds(47, 269, 152, 37);
		memberJoinCenterPanel.add(pwCorrectLB);
		
		JLabel name = new JLabel("이름");
		name.setFont(new Font("D2Coding", Font.PLAIN, 17));
		name.setBounds(47, 326, 152, 37);
		memberJoinCenterPanel.add(name);
		
		JLabel phoneNumberLB = new JLabel("핸드폰 번호");
		phoneNumberLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		phoneNumberLB.setBounds(47, 391, 152, 24);
		memberJoinCenterPanel.add(phoneNumberLB);
		
		JLabel addressLB = new JLabel("주소");
		addressLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		addressLB.setBounds(47, 457, 152, 18);
		memberJoinCenterPanel.add(addressLB);
		
		JButton joinBtn = new JButton("가입");
		joinBtn.setForeground(new Color(255, 255, 255));
		joinBtn.setBorderPainted(false);
		joinBtn.setBackground(new Color(64, 184, 255));
		joinBtn.setFont(new Font("D2Coding", Font.PLAIN, 17));
		joinBtn.setBounds(102, 537, 97, 37);
		memberJoinCenterPanel.add(joinBtn);
		
		JButton joinCancelBtn = new JButton("취소");
		joinCancelBtn.setBorderPainted(false);
		joinCancelBtn.setBackground(new Color(255, 255, 255));
		joinCancelBtn.setFont(new Font("D2Coding", Font.PLAIN, 17));
		joinCancelBtn.setBounds(323, 537, 97, 37);
		memberJoinCenterPanel.add(joinCancelBtn);
		
		joinIdTF = new JTextField();
		joinIdTF.setBounds(236, 147, 205, 21);
		memberJoinCenterPanel.add(joinIdTF);
		joinIdTF.setColumns(10);
		
		joinNameTF = new JTextField();
		joinNameTF.setBounds(236, 335, 205, 21);
		memberJoinCenterPanel.add(joinNameTF);
		joinNameTF.setColumns(10);
		
		joinPhoneNumberTF = new JTextField();
		joinPhoneNumberTF.setBounds(236, 394, 205, 21);
		memberJoinCenterPanel.add(joinPhoneNumberTF);
		joinPhoneNumberTF.setColumns(11);
		
		joinAddressTF = new JTextField();
		joinAddressTF.setBounds(236, 457, 205, 21);
		memberJoinCenterPanel.add(joinAddressTF);
		joinAddressTF.setColumns(20);
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 30));
		lblNewLabel.setBounds(102, 54, 269, 37);
		memberJoinCenterPanel.add(lblNewLabel);
		
		joinPasswordField = new JPasswordField();
		joinPasswordField.setBounds(236, 206, 205, 21);
		memberJoinCenterPanel.add(joinPasswordField);
		
		joinPasswordCorrectField = new JPasswordField();
		joinPasswordCorrectField.setBounds(236, 278, 205, 21);
		memberJoinCenterPanel.add(joinPasswordCorrectField);

	}
}
