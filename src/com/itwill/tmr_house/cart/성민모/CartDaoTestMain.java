package com.itwill.tmr_house.cart.성민모;

public class CartDaoTestMain {
	
	public static void main(String[] args) throws Exception {
	CartDao cartDao = new CartDao();
	
	/*
	 * update, delete
	 */
	
	//카트에 존재하는 상품을 추가(수량 변경)
	System.out.println("2. Cart_updateByCartNo");
	System.out.println(">> "+cartDao.updateByCartNo("aaaa", 5, 5));
	
	//카트에 재품 존재하는지 확인
	System.out.println("2. Cart_countByProductNo");
	System.out.println(">> "+cartDao.countByProductNo("aaaa", 5, 5));
	}

}