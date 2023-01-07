package com.itwill.tmr_house.product.성민모;

import com.itwill.tmr_house.product.ProductDao;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao productDao=new ProductDao();
		System.out.println("findByPrimaryKey >>"+productDao.findByPrimaryKey(1));
		System.out.println("findAll >>"+productDao.findAll());

	}
}	