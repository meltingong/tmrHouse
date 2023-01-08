package com.itwill.tmr_house.order;

import com.itwill.tmr_house.cart.CartDao;
import com.itwill.tmr_house.product.ProductDao;

public class OrdersService {
	private OrdersDao orderDao;
	private ProductDao productDao;
	private CartDao cartDao;
	
	public OrdersService() throws Exception {
		orderDao = new OrdersDao();
		productDao = new ProductDao();
		cartDao = new CartDao();
	}
	
	
}
