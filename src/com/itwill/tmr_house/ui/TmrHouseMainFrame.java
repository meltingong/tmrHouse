package com.itwill.tmr_house.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.tmr_house.cart.*;
import com.itwill.tmr_house.member.*;
import com.itwill.tmr_house.order.*;
import com.itwill.tmr_house.product.*;

public class TmrHouseMainFrame extends JFrame {
	
	/*
	 * 패널 체인지 상수
	 */
	public static final int PANEL_MEMBER_PRIMARY_SCREEN = 1;
	public static final int PANEL_MEMBER_JOIN_SCREEN = 2;
	public static final int PANEL_MEMBER_LOGIN_SCREEN = 3;
	public static final int PANEL_MEMBER_MY_PAGE_SCREEN = 4;
	
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
	 */
	public TmrHouseMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
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
