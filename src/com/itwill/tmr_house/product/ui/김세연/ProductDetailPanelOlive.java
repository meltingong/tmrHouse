package com.itwill.tmr_house.product.ui.김세연;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.itwill.tmr_house.cart.Cart;
import com.itwill.tmr_house.cart.CartService;
import com.itwill.tmr_house.member.Member;
import com.itwill.tmr_house.member.MemberService;
import com.itwill.tmr_house.order.OrdersService;
import com.itwill.tmr_house.product.Product;
import com.itwill.tmr_house.product.ProductService;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProductDetailPanelOlive extends JPanel {
	
	/************ Service객체멤버변수선언 ************/
	MemberService memberService;
	ProductService productService;
	CartService cartService;
	OrdersService ordersService;
	
	/***** 로그인한 member객체저장할 Member객체선언 **********/
	Member loginMember = null;
	Product product = null;
	
	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public ProductDetailPanelOlive() throws Exception {
		setLayout(new BorderLayout(0, 0));
		
		JPanel northPanel = new JPanel();
		add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel centerPanel = new JPanel();
		add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		centerPanel.add(panel);
		panel.setLayout(null);
		
		JLabel productImgLabel1 = new JLabel("");
		productImgLabel1.setBounds(12, 60, 250, 350);
		panel.add(productImgLabel1);
		productImgLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		productImgLabel1.setIcon(new ImageIcon(ProductDetailPanelOlive.class.getResource("/com/itwill/tmr_house/product/images/plant_olive350.png")));
		
		JLabel productNameLabel = new JLabel("올리브 나무 화분");
		productNameLabel.setBounds(288, 90, 200, 50);
		panel.add(productNameLabel);
		productNameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("수   량");
		lblNewLabel_1.setBounds(288, 176, 50, 22);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		
		JComboBox qtyComboBox = new JComboBox();
		qtyComboBox.setBounds(419, 179, 42, 22);
		panel.add(qtyComboBox);
		qtyComboBox.setFont(new Font("굴림", Font.PLAIN, 13));
		qtyComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		
		JLabel productDetailLabel = new JLabel("건조한 환경을 좋아하는 플랜테리어 식물");
		productDetailLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		productDetailLabel.setBounds(12, 511, 476, 120);
		panel.add(productDetailLabel);
		
		JButton direcOrderButton = new JButton("바로 구매");
		direcOrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		direcOrderButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		direcOrderButton.setBounds(37, 430, 200, 50);
		panel.add(direcOrderButton);
		
		JButton addCartButton = new JButton("카트 담기");
		addCartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		addCartButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		addCartButton.setBounds(261, 430, 200, 50);
		panel.add(addCartButton);
		
		JLabel shippingLabel = new JLabel("배송비");
		shippingLabel.setHorizontalAlignment(SwingConstants.LEFT);
		shippingLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		shippingLabel.setBounds(288, 240, 50, 22);
		panel.add(shippingLabel);
		
		JLabel shippingLabel_1 = new JLabel("무료배송");
		shippingLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		shippingLabel_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		shippingLabel_1.setBounds(350, 241, 111, 22);
		panel.add(shippingLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("데코/식물 > 플라워/식물 > 화분");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.ITALIC, 15));
		lblNewLabel_4.setBounds(12, 10, 235, 37);
		panel.add(lblNewLabel_4);
		
		JPanel southPanel = new JPanel();
		add(southPanel, BorderLayout.SOUTH);

		/************ Service객체멤버변수선언 ************/
		memberService = new MemberService();
		productService = new ProductService();
		cartService = new CartService();
		ordersService = new OrdersService();

	} // 생성
	
	/*	
		public void actionPerformed(ActionEvent e) {
			// 로그인한 회원이면 바로 구매 + 주문 페이지로 이동
			try {
				product = productService.findByProductNo(8);
				if (loginMember != null) {
					ordersService.directOrder(loginMember.getM_id(), product.getP_no(), qtyComboBox.getSelectedIndex());
					// 주문 화면으로 이동
					
				} else {
					// 로그인 화면으로 이동
					
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		public void actionPerformed(ActionEvent e) {
			// 로그인한 회원이면 카트에 담고 + 카트 화면으로 이동
			// 비회원이면 로그인 화면으로 이동
			if (loginMember != null) {
				try {
					// qtyComboBox.getSelectedIndex() 이건 인덱스고 콤보박스에서 선택된 값을 가져오는 방법은..?
					cartService.insertCart(new Cart(0, qtyComboBox.getSelectedIndex(), loginMember.getM_id(), product));
					// 카트로 이동
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}else {
				// 로그인 페이지로 전환
			}
		}
		*/
}
