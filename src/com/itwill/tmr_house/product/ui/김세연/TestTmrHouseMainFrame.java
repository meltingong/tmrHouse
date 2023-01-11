package com.itwill.tmr_house.product.ui.김세연;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.tmr_house.cart.*;
import com.itwill.tmr_house.member.*;
import com.itwill.tmr_house.member.MemberService;
import com.itwill.tmr_house.order.*;
import com.itwill.tmr_house.product.*;


import java.awt.BorderLayout;
import java.awt.CardLayout;

public class TestTmrHouseMainFrame extends JFrame {
	
	
	/*
	 * 패널 체인지 상수
	 */
	// 멤버
	public static final int PANEL_MEMBER_PRIMARY_SCREEN = 1;
	public static final int PANEL_MEMBER_JOIN_SCREEN = 2;
	public static final int PANEL_MEMBER_LOGIN_SCREEN = 3;
	public static final int PANEL_MEMBER_MY_PAGE_SCREEN = 4;
	
	// 상품

	public static final int PANEL_PRODUCT_PANEL = 5;
	public static final int PANEL_PRODUCT_DETAIL_OLIVE = 6;
	public static final int PANEL_PRODUCT_DETAIL_MONSTERA = 7;

	// 20부터 시작함.
	public static final int PANEL_PRODUCT_LIST_PANEL = 20;
	public static final int PANEL_PRODUCT_TABLE_STEEL = 21;
	public static final int PANEL_PRODUCT_TABLE_WOOD = 22;
	public static final int PANEL_PRODUCT_CHAIR_STEEL = 23;
	public static final int PANEL_PRODUCT_CHAIR_WOOD = 24;
	public static final int PANEL_PRODUCT_LIGHTING_TABLE = 25;
	public static final int PANEL_PRODUCT_LIGHTING_PENDANT = 26;
	public static final int PANEL_PRODUCT_PLANT_MONSTERA = 27;
	public static final int PANEL_PRODUCT_PLANT_OLIVE = 28;

	
	
	// 카트
	
	
	// 오더
	
	public static final int PANEL_ORDERS_하은2 = 8;
	public static final int PANEL_ORDERS_DETAIL_하은2 = 9;
	
	
	private CardLayout cardLayout ;
	private JPanel contentPane;
	
	/*
	 * 1. Service 객체선언
	 */
	MemberService memberService;
	CartService cartService;
	OrdersService ordersService;
	ProductService productService;
	
	/*
	 * 2. 로그인 유저 객체 선언
	 */
	
	Member loginMember = null;
	private JPanel parentPanel;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestTmrHouseMainFrame frame = new TestTmrHouseMainFrame();
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
	public TestTmrHouseMainFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		parentPanel = new JPanel();
		contentPane.add(parentPanel, BorderLayout.CENTER);
		cardLayout = new CardLayout(0, 0);
		parentPanel.setLayout(cardLayout);
		
		ProductListPanel productListPanel = new ProductListPanel();
		parentPanel.add(productListPanel, "20");
		
		ProductDetailPanelOlive productDetailPanelOlive = new ProductDetailPanelOlive();
		parentPanel.add(productDetailPanelOlive, "28");
		
		/******service 객체 생성******/
		memberService = new MemberService();
		cartService = new CartService();
		productService = new ProductService();
		ordersService = new OrdersService();
		
		productListPanel.setFrame(this);
		productDetailPanelOlive.setFrame(this);
		
	}
	
/******************패널 체인지 메소드************************/
	
	public void changePanel(int panel_no) {
		if(panel_no == PANEL_MEMBER_PRIMARY_SCREEN) {
			cardLayout.show(parentPanel, "1");
		}else if(panel_no == PANEL_MEMBER_JOIN_SCREEN) {
			cardLayout.show(parentPanel, "2");
			
		}else if(panel_no == PANEL_MEMBER_LOGIN_SCREEN) {
			cardLayout.show(parentPanel, "3");
			
		}else if(panel_no == PANEL_MEMBER_MY_PAGE_SCREEN) {
			cardLayout.show(parentPanel, "4");
			
		}else if(panel_no == PANEL_PRODUCT_LIST_PANEL) {
			cardLayout.show(parentPanel, "20");
			
		}else if(panel_no == PANEL_PRODUCT_TABLE_STEEL) {
		
			
		}else if(panel_no == PANEL_PRODUCT_TABLE_WOOD) {
			
			
		}else if(panel_no == PANEL_PRODUCT_CHAIR_STEEL) {
			
			
		}else if(panel_no == PANEL_PRODUCT_CHAIR_WOOD) {
			
			
		}else if(panel_no == PANEL_PRODUCT_LIGHTING_TABLE) {
			
			
		}else if(panel_no == PANEL_PRODUCT_LIGHTING_PENDANT) {
			
			
		}else if(panel_no == PANEL_PRODUCT_PLANT_MONSTERA) {
			
			
		}else if(panel_no == PANEL_PRODUCT_PLANT_OLIVE) {
			cardLayout.show(parentPanel, "28");
		}
	}
}
