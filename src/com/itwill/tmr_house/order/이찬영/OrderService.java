package com.itwill.tmr_house.order.이찬영;

import java.util.ArrayList;

public class OrderService {
	
	private OrderDao orderDao;
	
	public OrderService() throws Exception {
		orderDao =new OrderDao();
	}
	//주문 한개 삭제
	public int deleteByOrderNo(int o_no) throws Exception {
		return orderDao.deleteByOrderNo(o_no);
	}
	//주문 전체 삭제
	public int deleteByM_id(String m_id) throws Exception {
		return orderDao.deleteById(m_id);
	}
	//주문리스트 아이디로 찾기
	public ArrayList<Order> orderList(String m_id) throws Exception {
		return orderDao.findById(m_id);
	}
	//주문상세보기
	public Order orderListDetail(String m_id,int o_no) throws Exception {
		return orderDao.findByOrderNo(m_id, o_no);
	}
	
}