package com.itwill.tmr_house.member.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;

public class MemberMainFrame_하은 extends JFrame {

	private JPanel contentPane;
	private JPanel parentPanel;
	private CardLayout cardLayout;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame_하은 frame = new MemberMainFrame_하은();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberMainFrame_하은() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		parentPanel = new JPanel();
		contentPane.add(parentPanel, BorderLayout.CENTER);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		MemberPrimaryScreenPanel_하은 memberPrimaryScreenPanel_하은 = new MemberPrimaryScreenPanel_하은();
		parentPanel.add(memberPrimaryScreenPanel_하은, "name_1111291164044100");
		
		MemberJoinScreenPanel_하은 memberJoinScreenPanel_하은 = new MemberJoinScreenPanel_하은();
		parentPanel.add(memberJoinScreenPanel_하은, "name_1111319162628500");
		
		MemberLoginScreenPanel_하은 memberLoginScreenPanel_하은 = new MemberLoginScreenPanel_하은();
		parentPanel.add(memberLoginScreenPanel_하은, "name_1120380709217600");
		
		MemberMyPageScreenPanel_하은 memberMyPageScreenPanel_하은 = new MemberMyPageScreenPanel_하은();
		parentPanel.add(memberMyPageScreenPanel_하은, "name_1120396254812900");
		
	}

}
