package com.itwill.tmr_house.cart.김혜지;

public class CartSQL {
	
	public static final String CART_DELETE_BY_USERID =
			"delete from cart where m_id = ?";
	
	public static final String CART_DELETE_BY_CART_NO =
			"delete from cart where c_no = ?";

	public static final String CART_SELECT_BY_USERID =
			"select c.*,p.* from cart c join product p on c.p_no = p.p_no where m_id = ?";
	
	public static final String CART_SELECT_BY_CART_NO =
			"select c.*,p.* from cart c join product p on c.p_no = p.p_no where c_no = ?";

}
