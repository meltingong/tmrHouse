package com.itwill.tmr_house.product.ui.김세연;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ProductDetailPanel1 extends JPanel {
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public ProductDetailPanel1() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel productDetailPanel = new JPanel();
		add(productDetailPanel, BorderLayout.CENTER);
		productDetailPanel.setLayout(null);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setIcon(new ImageIcon(ProductDetailPanel1.class.getResource("/com/itwill/tmr_house/product/images/chair_rattan_wood.png")));
		imgLabel.setBounds(35, 96, 229, 324);
		productDetailPanel.add(imgLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		textField.setText("상품명");
		textField.setBounds(25, 44, 442, 36);
		productDetailPanel.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(274, 236, 130, 26);
		productDetailPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(109, 302, 128, 23);
		productDetailPanel.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("오늘 배송(+3,000)");
		checkBox.setBounds(300, 366, 167, 23);
		productDetailPanel.add(checkBox);
		
		JLabel lblNewLabel = new JLabel("수량");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(274, 113, 61, 36);
		productDetailPanel.add(lblNewLabel);
		

	}
}
