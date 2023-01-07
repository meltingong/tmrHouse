package com.itwill.tmr_house.product.성민모;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao productDao = new ProductDao();

		/*
		 * insert,delete,update
		 */
		
		//insert 상품추가
		System.out.println("1. Product_insert");
		System.out.println(">> "+productDao.insert(1));
		
		//상품 pk로삭제
		System.out.println("2. Product_deleteByProductNo");
		System.out.println(">> "+productDao.deleteByProductNo(1));
		
		//update 상품변경
		System.out.println("3. Product_updateByProductNo");
		System.out.println(">> "+productDao.updateByProductNo(1));
	
	}

}