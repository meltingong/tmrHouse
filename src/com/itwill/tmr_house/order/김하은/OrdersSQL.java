package com.itwill.tmr_house.order.김하은;

public class OrdersSQL {
	public static final String DELETE_BY_MEMBERID = "delete from orders where m_id=?";
	public static final String DELETE_BY_ORDER_NO = "delete from orders where o_no=?";
	public static final String INSERT = "insert into orders(o_no,o_desc,o_qty,o_price,o_date,m_id) values(orders_o_no_SEQ.nextval,?,?,?,sysdate,?)";
	public static final String ORDER_SELECT_BY_MEMBER = "select * from orders where m_id=?";
	public static final String ORDER_SELECT_WITH_PRODUCT_BY_MEMBER = "select * from orders o join order_item oi on o.o_no = oi.o_no join product p on oi.p_no = p.p_no where o.m_id =? and o.o_no =?";

}
