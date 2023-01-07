package com.itwill.tmr_house.product.성민모;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao productDao = new ProductDao();

		/*
		 * insert
		 */
		
		//상품번호로 특정 상품 출력
		System.out.println("5. Product_insert");
		System.out.println(">> "+productDao.insert(1));
		
		//상품 전체 출력
		System.out.println("6. Product_insert");
		System.out.println(">> "+productDao.insert());
		
		
	}

}