package com.itwill.tmr_house.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.tmr_house.cart.*;
import com.itwill.tmr_house.member.*;
import com.itwill.tmr_house.order.*;
import com.itwill.tmr_house.product.*;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import com.itwill.tmr_house.member.ui.MemberPrimaryScreenPanel_하은;
import com.itwill.tmr_house.member.ui.MemberJoinScreenPanel_하은;
import com.itwill.tmr_house.member.ui.MemberLoginScreenPanel_하은;

public class TmrHouseMainFrame extends JFrame {
	
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
	
	
	// 카트
	
	// 오더
	
	public static final int PANEL_ORDERS = 9;
	
	
	private JPanel contentPane;
	
	/*
	 * 1. Service 객체선언
	 */
	MemberService memberService;
	CartService cartService;
	OrdersService orderService;
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
		parentPanel.setLayout(new CardLayout(0, 0));
		
		MemberPrimaryScreenPanel_하은 memberPrimaryScreenPanel_하은 = new MemberPrimaryScreenPanel_하은();
		parentPanel.add(memberPrimaryScreenPanel_하은, "1");
		
		MemberJoinScreenPanel_하은 memberJoinScreenPanel_하은 = new MemberJoinScreenPanel_하은();
		parentPanel.add(memberJoinScreenPanel_하은, "2");
		
		MemberLoginScreenPanel_하은 memberLoginScreenPanel_하은 = new MemberLoginScreenPanel_하은();
		parentPanel.add(memberLoginScreenPanel_하은, "3");
	}

	
	/******************패널 체인지 메소드************************/
	
	public void changePanel(int panel_no) {
		if(panel_no == PANEL_MEMBER_PRIMARY_SCREEN) {
			
		}else if(panel_no == PANEL_MEMBER_JOIN_SCREEN) {
			
		}else if(panel_no == PANEL_MEMBER_LOGIN_SCREEN) {
			
		}else if(panel_no == PANEL_MEMBER_MY_PAGE_SCREEN) {
			
		}
	}
	
	
}
