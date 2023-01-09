package com.itwill.tmr_house.product.ui.김세연;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductPanel extends JPanel {
	private JTextField serchField;
	private JTextField textField;
	private JTextField productTextField22;
	private JTextField productImgBtn3;
	private JTextField productTextField4;
	private JTextField productTextField5;
	private JTextField productTextField6;

	/**
	 * Create the panel.
	 */
	public ProductPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel serchPanel = new JPanel();
		add(serchPanel, BorderLayout.NORTH);
		serchPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		serchField = new JTextField();
		serchField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		serchField.setText("검색어를 입력하세요.\n");
		serchPanel.add(serchField);
		serchField.setColumns(10);
		
		JButton serchBtn = new JButton("검색");
		serchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		serchBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				productService.serchAll(---p_name---);
			}
		});
		serchBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		serchPanel.add(serchBtn);
		
		JPanel showProductPanel = new JPanel();
		showProductPanel.setBorder(null);
		showProductPanel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		add(showProductPanel, BorderLayout.CENTER);
		showProductPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setText("상품명");
		textField.setOpaque(true);
		textField.setEditable(false);
		textField.setFont(new Font("D2Coding", Font.PLAIN, 13));
		textField.setBounds(26, 200, 220, 26);
		showProductPanel.add(textField);
		textField.setColumns(10);
		
		JButton product = new JButton("New button");
		product.setIcon(new ImageIcon(ProductPanel.class.getResource("/com/itwill/tmr_house/product/images/chair_steel_wood.png")));
		product.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		product.setBorder(null);
		product.setOpaque(true);
		product.setBounds(26, 27, 220, 168);
		showProductPanel.add(product);
		
		JButton productTextField1 = new JButton("New button");
		productTextField1.setIcon(new ImageIcon("/Users/seyeonkim/Downloads/iloveimg-resized 2/300chair_steel_wood.png"));
		productTextField1.setOpaque(true);
		productTextField1.setBorder(null);
		productTextField1.setBounds(258, 27, 220, 168);
		showProductPanel.add(productTextField1);
		
		productTextField22 = new JTextField();
		productTextField22.setText("상품명");
		productTextField22.setOpaque(true);
		productTextField22.setFont(new Font("D2Coding", Font.PLAIN, 13));
		productTextField22.setEditable(false);
		productTextField22.setColumns(10);
		productTextField22.setBounds(258, 200, 220, 26);
		showProductPanel.add(productTextField22);
		
		JButton productTextField2 = new JButton("New button");
		productTextField2.setOpaque(true);
		productTextField2.setBorder(null);
		productTextField2.setBounds(26, 238, 220, 168);
		showProductPanel.add(productTextField2);
		
		productImgBtn3 = new JTextField();
		productImgBtn3.setText("상품명");
		productImgBtn3.setOpaque(true);
		productImgBtn3.setFont(new Font("D2Coding", Font.PLAIN, 13));
		productImgBtn3.setEditable(false);
		productImgBtn3.setColumns(10);
		productImgBtn3.setBounds(26, 411, 220, 26);
		showProductPanel.add(productImgBtn3);
		
		JButton productImgBtn4 = new JButton("New button");
		productImgBtn4.setOpaque(true);
		productImgBtn4.setBorder(null);
		productImgBtn4.setBounds(258, 238, 220, 168);
		showProductPanel.add(productImgBtn4);
		
		productTextField4 = new JTextField();
		productTextField4.setText("상품명");
		productTextField4.setOpaque(true);
		productTextField4.setFont(new Font("D2Coding", Font.PLAIN, 13));
		productTextField4.setEditable(false);
		productTextField4.setColumns(10);
		productTextField4.setBounds(258, 411, 220, 26);
		showProductPanel.add(productTextField4);
		
		JButton productImgBtn5 = new JButton("New button");
		productImgBtn5.setOpaque(true);
		productImgBtn5.setBorder(null);
		productImgBtn5.setBounds(26, 449, 220, 168);
		showProductPanel.add(productImgBtn5);
		
		productTextField5 = new JTextField();
		productTextField5.setText("상품명");
		productTextField5.setOpaque(true);
		productTextField5.setFont(new Font("D2Coding", Font.PLAIN, 13));
		productTextField5.setEditable(false);
		productTextField5.setColumns(10);
		productTextField5.setBounds(26, 622, 220, 26);
		showProductPanel.add(productTextField5);
		
		JButton productImgBtn6 = new JButton("New button");
		productImgBtn6.setOpaque(true);
		productImgBtn6.setBorder(null);
		productImgBtn6.setBounds(258, 446, 220, 168);
		showProductPanel.add(productImgBtn6);
		
		productTextField6 = new JTextField();
		productTextField6.setText("상품명");
		productTextField6.setOpaque(true);
		productTextField6.setFont(new Font("D2Coding", Font.PLAIN, 13));
		productTextField6.setEditable(false);
		productTextField6.setColumns(10);
		productTextField6.setBounds(258, 619, 220, 26);
		showProductPanel.add(productTextField6);
		
		JPanel southPanel = new JPanel();
		add(southPanel, BorderLayout.SOUTH);
		

	}
}
