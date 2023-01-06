package com.itwill.tmr_house.cart.김혜지;

public class CartServiceTestMain {

	public static void main(String[] args) throws Exception {
		CartService cartService = new CartService();
		
		/*
		 * 1~4 insert, update
		 */
		
		//카트에 담긴 특정 상품 삭제
		System.out.println("5. deleteCartItemByCartNo");
		System.out.println(">> "+cartService.deleteCartItemByCartNo(21));
		
		//회원의 카트에 담긴 상품 전체 삭제
		System.out.println("6. deleteCartItemByUserId");
		System.out.println(">> "+cartService.deleteCartItemByUserId("aaaa"));
		
		//카트에 담긴 특정 상품 찾기(카트 번호로)
		System.out.println("7. findCartItemByCartNo");
		System.out.println(">> "+cartService.findCartItemByCartNo(23));

		//회원의 카트에 담긴 상품 전체 찾기
		System.out.println("7. findCartItemByCartNo");
		System.out.println(">> "+cartService.findCartItemByUserId("bbbb"));

	
	
	
	}
}
