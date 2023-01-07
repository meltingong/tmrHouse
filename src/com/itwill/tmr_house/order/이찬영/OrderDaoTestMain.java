package com.itwill.tmr_house.order.이찬영;

import java.util.ArrayList;

import com.itwill.tmr_house.product.성민모.Product;


public class OrderDaoTestMain {

	public static void main(String[] args) throws Exception{
		OrderDao orderDao=new OrderDao();
		
		// 1. order 셋팅
		Order order = new Order();
		order.setO_desc("장롱 외 1개");	// 비고
		order.setO_price(1000);			// 가격
		order.setM_id("bbbb");		// 사용자번호
		
		// TODO 2. product 셋팅
//		Product pro = new Product();

		// 3. orderItem 셋팅
		OrderItem orderItem = new OrderItem();
		ArrayList<OrderItem> orderItemList = new ArrayList<OrderItem>();
		orderItem.setOi_qty(1);			// 수량
		orderItem.setProduct(new Product(1, "", 0, "", "", ""));	// 상품번호
		   
		orderItemList.add(orderItem);
		
		order.setOrderItemList(orderItemList);
		
		// 4. 저장
		orderDao.insert(order);
		
		
		

	}

}
