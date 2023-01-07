package com.itwill.tmr_house.product.성민모;

public class ProductServiceTestMain {

	public static void main(String[] args) throws Exception {
		ProductService productService = new ProductService();
		
		/*
		 * insert, update, delete
		 */
		
		//insert 상품추가
		System.out.println("1. Product_insert");
		System.out.println(">> "+productService.insert(1));
				
		//상품 pk로삭제
		System.out.println("2. Product_deleteByProductNo");
		System.out.println(">> "+productService.deleteByProductNo(1));
		
		System.out.println("3. Product_deleteByName");
		System.out.println(">> "+productService.deleteByName(1));
		
		//update 상품변경
		System.out.println("4. Product_updateByProductNo");
		System.out.println(">> "+productService.updateByProductNo(1));
	}

}