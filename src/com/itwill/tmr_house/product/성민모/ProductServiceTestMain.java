package com.itwill.tmr_house.product.성민모;

public class ProductServiceTestMain {

	public static void main(String[] args) throws Exception {
		ProductService productService = new ProductService();
		
		/*
		 * insert
		 */
		
		//상품 번호로 특정 상품 찾기
		System.out.println("5. Product_insert");
		System.out.println(">> "+productService.insert(1));
		
		
		//상품 전체 찾기
		System.out.println("6. Product_insert");
		System.out.println(">> "+productService.insert());
	}

}