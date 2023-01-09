package com.itwill.tmr_house.member.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class MemberLoginScreenPanel_하은 extends JPanel {
	private JTextField loginIdTF;
	private JPasswordField loginPasswordField;

	/**
	 * Create the panel.
	 */
	public MemberLoginScreenPanel_하은() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel LoginScreenNorthAppTitlePanel = new JPanel();
		LoginScreenNorthAppTitlePanel.setBackground(new Color(255, 255, 255));
		add(LoginScreenNorthAppTitlePanel, BorderLayout.NORTH);
		
		JLabel loginScreenPanelAppTitleLB = new JLabel("Tommorow's House");
		loginScreenPanelAppTitleLB.setFont(new Font("D2Coding", Font.BOLD, 20));
		LoginScreenNorthAppTitlePanel.add(loginScreenPanelAppTitleLB);
		
		JPanel LoginScreenCenterAppTitlePanel = new JPanel();
		LoginScreenCenterAppTitlePanel.setBackground(new Color(255, 255, 255));
		add(LoginScreenCenterAppTitlePanel, BorderLayout.CENTER);
		LoginScreenCenterAppTitlePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("로그인");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 30));
		lblNewLabel.setBounds(165, 104, 165, 34);
		LoginScreenCenterAppTitlePanel.add(lblNewLabel);
		
		JLabel loginIdLB = new JLabel("아이디");
		loginIdLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		loginIdLB.setBackground(new Color(255, 255, 255));
		loginIdLB.setBounds(57, 320, 96, 24);
		LoginScreenCenterAppTitlePanel.add(loginIdLB);
		
		JLabel loginPwLB = new JLabel("비밀번호");
		loginPwLB.setFont(new Font("D2Coding", Font.PLAIN, 17));
		loginPwLB.setBackground(new Color(255, 255, 255));
		loginPwLB.setBounds(57, 386, 96, 24);
		LoginScreenCenterAppTitlePanel.add(loginPwLB);
		
		loginIdTF = new JTextField();
		loginIdTF.setFont(new Font("D2Coding", Font.PLAIN, 17));
		loginIdTF.setBounds(178, 323, 165, 21);
		LoginScreenCenterAppTitlePanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPasswordField = new JPasswordField();
		loginPasswordField.setFont(new Font("D2Coding", Font.PLAIN, 17));
		loginPasswordField.setBounds(178, 389, 165, 21);
		LoginScreenCenterAppTitlePanel.add(loginPasswordField);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.setForeground(new Color(255, 255, 255));
		loginBtn.setBorderPainted(false);
		loginBtn.setFont(new Font("D2Coding", Font.PLAIN, 17));
		loginBtn.setBackground(new Color(64, 184, 255));
		loginBtn.setBounds(366, 320, 97, 90);
		LoginScreenCenterAppTitlePanel.add(loginBtn);
		
		JButton loginBacklBtn = new JButton("");
		loginBacklBtn.setIcon(new ImageIcon(MemberLoginScreenPanel_하은.class.getResource("/com/itwill/tmr_house/member/images/left-arrow (1).png")));
		loginBacklBtn.setBorderPainted(false);
		loginBacklBtn.setFont(new Font("D2Coding", Font.PLAIN, 15));
		loginBacklBtn.setBackground(new Color(255, 255, 255));
		loginBacklBtn.setBounds(12, 23, 68, 21);
		LoginScreenCenterAppTitlePanel.add(loginBacklBtn);
		
		

	}
}
