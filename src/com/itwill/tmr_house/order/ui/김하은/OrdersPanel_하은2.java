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

import com.itwill.tmr_house.order.*;
import com.itwill.tmr_house.ui.*;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OrdersPanel_하은2 extends JPanel {
	
	OrdersService ordersService;
	TmrHouseMainFrame frame;
	//OrdersMainFrame_하은 frame;
	private JTable OrdersTable;
	
	OrdersDetailPanel_하은2 ordersDetailPanel_하은2;
	
	
	public void setFrame(TmrHouseMainFrame frame) {
		this.frame = frame;
	}

	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public OrdersPanel_하은2() throws Exception {
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
				
				// 메인화면으로 화면전환
				frame.changePanel(TmrHouseMainFrame.PANEL_PRODUCT_LIST_PANEL);
				
			}
		});
		OrdersHomeButton.setBackground(new Color(64, 184, 255));
		OrdersHomeButton.setIcon(new ImageIcon(OrdersPanel_하은2.class.getResource("/com/itwill/tmr_house/member/images/home(30x30).png")));
		OrdersSouthPanel.add(OrdersHomeButton);
		
		JPanel OrdersCenterPanel = new JPanel();
		OrdersCenterPanel.setBackground(new Color(255, 255, 255));
		add(OrdersCenterPanel, BorderLayout.CENTER);
		OrdersCenterPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주문내역");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 30));
		lblNewLabel.setBounds(100, 49, 269, 37);
		OrdersCenterPanel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(23, 211, 442, 43);
		OrdersCenterPanel.add(scrollPane);
		
		OrdersTable = new JTable();
		OrdersTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.changePanel(TmrHouseMainFrame.PANEL_ORDERS_DETAIL_하은2);
				/*int rowNo=OrdersTable.getSelectedRow();
				int order_no=(Integer)OrdersTable.getValueAt(rowNo, 0);*/
				
				//ordersDetailPanel_하은2.displayOrderDetail(order_no);
			}
		});
		OrdersTable.setFont(new Font("D2Coding", Font.PLAIN, 12));
		OrdersTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"\uC8FC\uBB38\uBC88\uD638", "\uC8FC\uBB38\uC0C1\uD488", "\uC218\uB7C9", "\uC8FC\uBB38\uAE08\uC561", "\uC8FC\uBB38\uB0A0\uC9DC", "\uC8FC\uBB38\uC544\uC774\uB514"
			}
		));
		scrollPane.setViewportView(OrdersTable);
		
		ordersService = new OrdersService();
		Orders orders = new Orders();
		orders.setM_id("aaaa");
		orders.setO_no(1);
		displayOrders(orders);
	}
	
	public void displayOrders(Orders order)  {
		/**********주문데이터보기 [Jtable]*********/
		try {
			Orders curtOrder = ordersService.orderListDetail(order.getM_id(), order.getO_no());
			Vector columnVector = new Vector();
			columnVector.add("주문번호");
			columnVector.add("주문상품");
			columnVector.add("수량");
			columnVector.add("주문금액");
			columnVector.add("주문날짜");
			columnVector.add("주문아이디");
			
			Vector tableVector = new Vector();
			
			Vector rowVector = new Vector();
			rowVector.add(curtOrder.getO_no());
			rowVector.add(curtOrder.getO_desc());
			rowVector.add(curtOrder.getO_qty());
			rowVector.add(curtOrder.getO_price());
			rowVector.add(curtOrder.getO_date());
			rowVector.add(curtOrder.getM_id());
			tableVector.add(rowVector);
			
			DefaultTableModel tableModel = new DefaultTableModel(tableVector,columnVector);
			OrdersTable.setModel(tableModel);
			
		}catch(Exception e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
	
		
	}
	
	
}
