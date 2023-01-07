package com.itwill.tmr_house.product.성민모;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao productDao = new ProductDao();

		/*
		 * insert,delete,update
		 */
		
		//insert 상품추가
		System.out.println("1. Product_insert");
		System.out.println(">> "+productDao.insert(null, 1, 0));
		
		//상품 pk로삭제
//		System.out.println("2. Product_deleteByProductNo");
//		System.out.println(">> "+productDao.deleteByProductNo(1));		
//       System.out.println("3. product_deleteByName");
//		System.out.println(">> "+productDao.deleteByName(null, 1, 0));			
		//update 상품변경
		System.out.println("4. Product_updateByProductNo");
		System.out.println(">> "+productDao.updateByProductNo(null, 0, 0));
	
	}

}