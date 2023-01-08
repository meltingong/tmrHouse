package com.itwill.tmr_house.cart.성민모;

public class CartSQL {
	
	public static final String CART_UPDATE_BY_CART_NO = "update cart set cart_qty=? where cart_no=?";
	public static String CART_COUNT_BY_PRODUCT_NO = "select count(*)  as p_count from cart c join userinfo u on c.m_id=u.m_id where u.m_id=? and c.p_no=?";

}
