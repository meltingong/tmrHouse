package com.itwill.tmr_house.cart.김혜지;

public class CartSQL {
	
	
	public static final String CART_INSERT = 
			"insert into cart (c_no, c_qty, m_id, p_no) values (cart_cart_no_SEQ.nextval,1,'aaaa',1)";
//	
//	public static final String CART_COUNT_BY_USERID_PRODUCT_NO = 
//			"select count(*)  as p_count from cart c join userinfo u on c.userid=u.userid where u.userid=? and c.p_no=?";
//	//장바구니에 이미 추가된 상품을 추가할 때 (카트번호가 몇번인지 모르니까 상품번호, 회원번호로 검색)
//	public static final String CART_UPDATE_BY_CART_NO = 
//			"update cart set cart_qty=? where cart_no=?";
//	
//	public static final String CART_UPDATE_BY_PRODUCT_NO_USERID = 
//			"update cart set cart_qty=cart_qty+? where userid=? and p_no=?";
//		
		public static final String CART_DELETE_BY_USERID =
				"delete from cart where m_id = ?";
		
		public static final String CART_DELETE_BY_CART_NO =
				"delete from cart where c_no = ?";

		public static final String CART_SELECT_BY_USERID =
				"select c.c_no, c.c_qty, p.p_name, p.p_price, p.p_img from cart c join product p on c.p_no = p.p_no where m_id = ?";

		public static final String CART_SELECT_BY_CART_NO =
				"select c.c_no, c.c_qty, p.p_name, p.p_price, p.p_img from cart c join product p on c.p_no = p.p_no where c_no = ?";

	}

