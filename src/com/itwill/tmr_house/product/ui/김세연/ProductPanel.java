package com.itwill.tmr_house.product.ui.김세연;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.itwill.tmr_house.cart.CartService;
import com.itwill.tmr_house.member.Member;
import com.itwill.tmr_house.member.MemberService;
import com.itwill.tmr_house.order.OrdersService;
import com.itwill.tmr_house.product.Product;
import com.itwill.tmr_house.product.ProductService;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ProductPanel extends JPanel {
	private JTextField serchField;
	
	/***** 로그인한 member객체저장할 Member객체선언 **********/
	Member loginMember = null;
	Product selectedProduct = null;
	
	/************ Service객체멤버변수선언 ************/
	MemberService memberService;
	ProductService productService;
	CartService cartService;
	OrdersService ordersService;
	
	/**
	 * Create the panel.
	 */
	public ProductPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel serchPanel = new JPanel();
		serchPanel.setBorder(null);
		add(serchPanel, BorderLayout.NORTH);
		serchPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		serchField = new JTextField();
		serchField.setToolTipText("검색어를 입력하세요.");
		serchField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		serchField.setFont(new Font("D2Coding ligature", Font.PLAIN, 15));
		serchPanel.add(serchField);
		serchField.setColumns(10);
		
		JButton serchBtn = new JButton("");
		serchBtn.setIcon(new ImageIcon(ProductPanel.class.getResource("/com/itwill/tmr_house/product/images/search_25.png")));
		serchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		serchBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ProductService productService = new ProductService();
					List<Product> psList = productService.searchAll(serchField.getText());
					// 일단 콘솔에 검색결과 잘 나오나 테스트용
					for (Product product : psList) {
						System.out.println(product);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		serchBtn.setFont(new Font("Dialog", Font.PLAIN, 16));
		serchPanel.add(serchBtn);
		
		JButton cartButton = new JButton("");
		cartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (loginMember == null) {
					// login 페이지로 전환
					
				} else {
					// cart 페이지로 전환
					
				}
			}
		});
		cartButton.setIcon(new ImageIcon(ProductPanel.class.getResource("/com/itwill/tmr_house/product/images/shopping-cart_25.png")));
		cartButton.setToolTipText("카트에 담기");
		cartButton.setBorder(null);
		serchPanel.add(cartButton);
		
		JPanel showProductPanel = new JPanel();
		showProductPanel.setBorder(null);
		showProductPanel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		add(showProductPanel, BorderLayout.CENTER);
		showProductPanel.setLayout(null);
		
		JPanel productPanel1 = new JPanel();
		productPanel1.setBorder(null);
		productPanel1.setBounds(12, 10, 234, 190);
		showProductPanel.add(productPanel1);
		productPanel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton productImgBtn1_1 = new JButton("");
		productImgBtn1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 해당 상품 패널로 전환
			}
		});
		productImgBtn1_1.setIcon(new ImageIcon(ProductPanel.class.getResource("/com/itwill/tmr_house/product/images/table_steel_round_150.png")));
		productImgBtn1_1.setOpaque(true);
		productImgBtn1_1.setBorder(null);
		productPanel1.add(productImgBtn1_1);
		
		JLabel lblNewLabel_6 = new JLabel("스틸 원형 테이블\r\n 12,000원");
		productPanel1.add(lblNewLabel_6);
		
		JPanel productPanel2 = new JPanel();
		productPanel2.setBorder(null);
		productPanel2.setBounds(258, 10, 230, 190);
		showProductPanel.add(productPanel2);
		productPanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton productImgBtn2 = new JButton("");
		productImgBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 해당 상품 패널로 전환
			}
		});
		productImgBtn2.setIcon(new ImageIcon(ProductPanel.class.getResource("/com/itwill/tmr_house/product/images/chair_rattan_wood150.png")));
		productImgBtn2.setOpaque(true);
		productImgBtn2.setBorder(null);
		productPanel2.add(productImgBtn2);
		
		JLabel lblNewLabel_6_1 = new JLabel("라탄 원목 의자 50,000원");
		productPanel2.add(lblNewLabel_6_1);
		
		JPanel productPanel1_1 = new JPanel();
		productPanel1_1.setBorder(null);
		productPanel1_1.setBounds(12, 224, 236, 190);
		showProductPanel.add(productPanel1_1);
		productPanel1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton productImgBtn1_1_1 = new JButton("");
		productImgBtn1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 해당 상품 패널로 전환
			}
		});
		productImgBtn1_1_1.setIcon(new ImageIcon(ProductPanel.class.getResource("/com/itwill/tmr_house/product/images/lighting_short_table150.png")));
		productImgBtn1_1_1.setOpaque(true);
		productImgBtn1_1_1.setBorder(null);
		productPanel1_1.add(productImgBtn1_1_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("테이블 조명 10,000원");
		productPanel1_1.add(lblNewLabel_6_2);
		
		JPanel productPanel1_1_1 = new JPanel();
		productPanel1_1_1.setBorder(null);
		productPanel1_1_1.setBounds(260, 226, 228, 188);
		showProductPanel.add(productPanel1_1_1);
		productPanel1_1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton productImgBtn1_1_1_1 = new JButton("");
		productImgBtn1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 해당 상품 패널로 전환
			}
		});
		productImgBtn1_1_1_1.setIcon(new ImageIcon(ProductPanel.class.getResource("/com/itwill/tmr_house/product/images/lighting_ceiling_pendant150.png")));
		productImgBtn1_1_1_1.setOpaque(true);
		productImgBtn1_1_1_1.setBorder(null);
		productPanel1_1_1.add(productImgBtn1_1_1_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("팬턴트 조명 50,000원");
		productPanel1_1_1.add(lblNewLabel_6_2_1);
		
		JPanel productPanel1_1_2 = new JPanel();
		productPanel1_1_2.setBorder(null);
		productPanel1_1_2.setBounds(12, 429, 235, 190);
		showProductPanel.add(productPanel1_1_2);
		productPanel1_1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton productImgBtn1_1_1_2 = new JButton("");
		productImgBtn1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 해당 상품 패널로 전환
			}
		});
		productImgBtn1_1_1_2.setIcon(new ImageIcon(ProductPanel.class.getResource("/com/itwill/tmr_house/product/images/plant_olive150.png")));
		productImgBtn1_1_1_2.setOpaque(true);
		productImgBtn1_1_1_2.setBorder(null);
		productPanel1_1_2.add(productImgBtn1_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("올리브 나무 화분 30,000원");
		productPanel1_1_2.add(lblNewLabel_5);
		
		JPanel productPanel1_1_3 = new JPanel();
		productPanel1_1_3.setBorder(null);
		productPanel1_1_3.setBounds(259, 429, 229, 190);
		showProductPanel.add(productPanel1_1_3);
		productPanel1_1_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton productImgBtn1_1_1_3 = new JButton("");
		productImgBtn1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 해당 상품 패널로 전환
			}
		});
		productImgBtn1_1_1_3.setIcon(new ImageIcon(ProductPanel.class.getResource("/com/itwill/tmr_house/product/images/plant_monstera150.png")));
		productImgBtn1_1_1_3.setOpaque(true);
		productImgBtn1_1_1_3.setBorder(null);
		productPanel1_1_3.add(productImgBtn1_1_1_3);
		
		JLabel lblNewLabel_6_2_3 = new JLabel("몬스테라 화분 30,000원");
		productPanel1_1_3.add(lblNewLabel_6_2_3);
		
		JPanel southPanel = new JPanel();
		add(southPanel, BorderLayout.SOUTH);
		/************ Service객체멤버변수초기화 ************/
		try {
			productService = new ProductService();
			memberService = new MemberService();
			cartService = new CartService();
			ordersService = new OrdersService();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	/********************************* 검색된 상품 보여주기 *********************************/
	public void displaySerchResult() throws Exception {
		Product product = new Product();
		List<Product> productList = null;
		
	}
	
	/***** 선택한 상품 상세페이지 보여주기 ****/
	public void productDetail() {
		
	}
	
}
