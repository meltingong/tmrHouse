package com.itwill.tmr_house.order.ui.김하은;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrdersPanel_하은 extends JPanel {
	private JTable OrdersTable;

	/**
	 * Create the panel.
	 */
	public OrdersPanel_하은() {
		setBackground(new Color(255, 255, 255));
		setLayout(new BorderLayout(0, 0));
		
		JPanel OrdersNorthPanel = new JPanel();
		OrdersNorthPanel.setBackground(new Color(255, 255, 255));
		add(OrdersNorthPanel, BorderLayout.NORTH);
		
		JTextPane OrdersAppTitleTextPane = new JTextPane();
		OrdersAppTitleTextPane.setText("Tomorrow's House");
		OrdersAppTitleTextPane.setFont(new Font("D2Coding", Font.BOLD, 20));
		OrdersNorthPanel.add(OrdersAppTitleTextPane);
		
		JPanel OrdersSouthPanel = new JPanel();
		OrdersSouthPanel.setBackground(new Color(255, 255, 255));
		add(OrdersSouthPanel, BorderLayout.SOUTH);
		
		JButton OrdersHomeButton = new JButton("");
		OrdersHomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 초기화면으로 화면전환
				
			}
		});
		OrdersHomeButton.setBackground(new Color(64, 184, 255));
		OrdersHomeButton.setIcon(new ImageIcon(OrdersPanel_하은.class.getResource("/com/itwill/tmr_house/member/images/home(30x30).png")));
		OrdersSouthPanel.add(OrdersHomeButton);
		
		JPanel OrdersCenterPanel = new JPanel();
		OrdersCenterPanel.setBackground(new Color(255, 255, 255));
		add(OrdersCenterPanel, BorderLayout.CENTER);
		OrdersCenterPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주문내역");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 30));
		lblNewLabel.setBounds(107, 49, 269, 37);
		OrdersCenterPanel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(33, 210, 442, 43);
		OrdersCenterPanel.add(scrollPane);
		
		OrdersTable = new JTable();
		OrdersTable.setFont(new Font("D2Coding", Font.PLAIN, 12));
		OrdersTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"\uC8FC\uBB38\uBC88\uD638", "\uC8FC\uBB38\uC0C1\uD488", "\uC8FC\uBB38\uB0B4\uC5ED", "\uC8FC\uBB38\uAE08\uC561", "\uC8FC\uBB38\uB0A0\uC9DC", "\uC8FC\uBB38\uC544\uC774\uB514"
			}
		));
		scrollPane.setViewportView(OrdersTable);

	}
}
