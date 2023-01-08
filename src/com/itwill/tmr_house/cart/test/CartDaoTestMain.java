package com.itwill.tmr_house.cart.test;

import com.itwill.tmr_house.cart.Cart;
import com.itwill.tmr_house.cart.CartDao;
import com.itwill.tmr_house.product.ProductDao;

public class CartDaoTestMain {
	public static void main(String[] args) throws Exception {
		CartDao cartDao = new CartDao();
		ProductDao productDao = new ProductDao();

		// cart객체로 insert
		System.out.println("Cart_insert");
		System.out.println(">> " + cartDao.insert(new Cart(0, 3, "bbbb", productDao.findByProductNo(2))));
		System.out.println(">> " + cartDao.insert(new Cart(0, 2, "cccc", productDao.findByProductNo(1))));

		// 카트 번호로 update
		System.out.println("Cart_updateByCartNo");
		System.out.println(">> " + cartDao.updateByCartNo(6, 10));

		// 카트의 상품번호로 update
		System.out.println("Cart_updateByProductNo");
		System.out.println(">> " + cartDao.updateByProductNo(2, 10, "bbbb"));
		// 카트 번호로 삭제
		System.out.println("Cart_deleteByCartNo");
		System.out.println(">> " + cartDao.deleteByCartNo(6));

		// 회원의 카트에 담긴 상품 전체 삭제
		System.out.println("Cart_deleteAll");
		System.out.println(">> " + cartDao.deleteByUserId("bbbb"));

		// 카트에 담긴 특정 상품 찾기(카트 번호로)
		System.out.println("Cart_findByCartNo");
		System.out.println(">> " + cartDao.findByCartNo(8));

		// 회원의 카트에 담긴 상품 전체 찾기
		System.out.println("Cart_findByUserId");
		System.out.println(">> " + cartDao.findByUserId("bbbb"));

		// 회원의 장바구니의 특정 상품 count
		System.out.println("Cart_countByProductNo");
		System.out.println(">> " + cartDao.countByProductNo("cccc", 1));
		
	}
}
