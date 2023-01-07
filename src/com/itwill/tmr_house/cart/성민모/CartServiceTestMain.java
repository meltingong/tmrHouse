package com.itwill.tmr_house.cart.성민모;

public class CartServiceTestMain {
	
	public static void main(String[] args) throws Exception {
	    CartService cartService=new CartService();
	    
	    /*
	     * update, count
	     */
	    
	    //카트에 존재하는 상품을 추가(수량 변경)
	    System.out.println("1. updateByCartNo");
		System.out.println(">> "+cartService.updateByCartNo(1));
		
		//카트에 제품 존재하는지 확인
		System.out.println("2. countByProductNo");
		System.out.println(">> "+cartService.countByProductNo(1));
	}

}