package com.itwill.tmr_house.order.test;

import java.util.ArrayList;

import com.itwill.tmr_house.order.OrderItem;
import com.itwill.tmr_house.order.Orders;
import com.itwill.tmr_house.order.OrdersDao;
import com.itwill.tmr_house.product.Product;


public class OrderDaoTestMain {
	public static void main(String[] args) throws Exception {
		OrdersDao ordersDao = new OrdersDao();
		Product product = new Product();
		/*
		 *  주문 생성
		 */
		ordersDao.insertOrder(new Orders());		
		
	}
}
