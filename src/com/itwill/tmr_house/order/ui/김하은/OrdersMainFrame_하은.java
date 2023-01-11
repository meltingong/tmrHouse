package com.itwill.tmr_house.order.ui.김하은;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;

public class OrdersMainFrame_하은 extends JFrame {

	public static final int PANEL_ORDERS_하은3 = 8;
	public static final int PANEL_ORDERS_DETAIL_하은3 = 9;
	
	
	private JPanel contentPane;
	private JPanel parentPanel;
	
	
	CardLayout cardLayout;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrdersMainFrame_하은 frame = new OrdersMainFrame_하은();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public OrdersMainFrame_하은() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		parentPanel = new JPanel();
		contentPane.add(parentPanel, BorderLayout.CENTER);
		cardLayout = new CardLayout(0, 0);
		parentPanel.setLayout(cardLayout);
		
	
		
		
		//ordersPanel_하은2.setFrame(this);
		
		
	}
	
	

	/******************패널 체인지 메소드************************/
	
	public void changePanel(int panel_no) {
		if(panel_no == PANEL_ORDERS_하은3) {
			cardLayout.show(parentPanel, "8");
		}else if(panel_no == PANEL_ORDERS_DETAIL_하은3) {
			cardLayout.show(parentPanel, "9");
		}
		
		
		
		
	}

}
