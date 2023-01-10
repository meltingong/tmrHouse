package com.itwill.tmr_house.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.tmr_house.cart.*;
import com.itwill.tmr_house.member.*;
import com.itwill.tmr_house.member.ui.*;
import com.itwill.tmr_house.order.*;
import com.itwill.tmr_house.product.*;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;

public class TmrHouseMainFrame extends JFrame {
	
	private CardLayout cardLayout;
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
	
	public static final int PANEL_ORDERS = 9;
	public static final int PANEL_ORDERS_DETAIL = 10;
	
	
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
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TmrHouseMainFrame frame = new TmrHouseMainFrame();
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
	public TmrHouseMainFrame() throws Exception {
		setTitle("Tomorrow's House");
		setIconImage(Toolkit.getDefaultToolkit().getImage(TmrHouseMainFrame.class.getResource("/com/itwill/tmr_house/member/images/home(30x30).png")));
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel parentPanel = new JPanel();
		parentPanel.setBackground(new Color(255, 255, 255));
		contentPane.add(parentPanel, BorderLayout.CENTER);
		cardLayout = new CardLayout(0, 0);
		parentPanel.setLayout(cardLayout);
		
		MemberPrimaryScreenPanel_하은 memberPrimaryScreenPanel_하은 = new MemberPrimaryScreenPanel_하은();
		parentPanel.add(memberPrimaryScreenPanel_하은, "1");
		
		MemberJoinScreenPanel_하은 memberJoinScreenPanel_하은 = new MemberJoinScreenPanel_하은();
		parentPanel.add(memberJoinScreenPanel_하은, "2");
		
		MemberLoginScreenPanel_하은 memberLoginScreenPanel_하은 = new MemberLoginScreenPanel_하은();
		parentPanel.add(memberLoginScreenPanel_하은, "3");

		MemberMyPageScreenPanel_하은 = new MemberMyPageScreenPanel_하은();
		parentPanel.add(MemberMyPageScreenPanel_하은, "4");
		
		
		
		
	/******service 객체 생성******/
		memberService = new MemberService();
		cartService = new CartService();
		productService = new ProductService();
		ordersService = new OrdersService();
		
		memberPrimaryScreenPanel_하은.setFrame(this);
		memberJoinScreenPanel_하은.setFrame(this);
		memberLoginScreenPanel_하은.setFrame(this);
		memberMyPageScreenPanel_하은.setFrame(this);
		
		
	}

	
	/******************패널 체인지 메소드************************/
	
	public void changePanel(int panel_no) {
		if(panel_no == PANEL_MEMBER_PRIMARY_SCREEN) {
			
		}else if(panel_no == PANEL_MEMBER_JOIN_SCREEN) {
			
		}else if(panel_no == PANEL_MEMBER_LOGIN_SCREEN) {
			
		}else if(panel_no == PANEL_MEMBER_MY_PAGE_SCREEN) {
			
		}else if(panel_no == PANEL_PRODUCT_LIST_PANEL) {
			
		}else if(panel_no == PANEL_PRODUCT_TABLE_STEEL) {
			
		}else if(panel_no == PANEL_PRODUCT_TABLE_WOOD) {
			
		}else if(panel_no == PANEL_PRODUCT_CHAIR_STEEL) {
			
		}else if(panel_no == PANEL_PRODUCT_CHAIR_WOOD) {
			
		}else if(panel_no == PANEL_PRODUCT_LIGHTING_TABLE) {
			
		}else if(panel_no == PANEL_PRODUCT_LIGHTING_PENDANT) {
			
		}else if(panel_no == PANEL_PRODUCT_PLANT_MONSTERA) {
			
		}else if(panel_no == PANEL_PRODUCT_PLANT_OLIVE) {
			
		}
	}
}
