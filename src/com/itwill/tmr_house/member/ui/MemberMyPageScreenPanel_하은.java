package com.itwill.tmr_house.member.ui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class MemberMyPageScreenPanel_하은 extends JPanel {

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

	}

}
