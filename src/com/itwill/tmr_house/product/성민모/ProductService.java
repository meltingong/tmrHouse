package com.itwill.tmr_house.product.성민모;

import java.util.List;

public class ProductService {
	private ProductDao productDao;
	public ProductService() throws Exception{
		productDao=new ProductDao();
	}
	/*
	 * 상품 상세 조회
	 */
	public Product insert(int p_no) throws Exception{
		return productDao.insert(p_no);
	}
	/*
	 * 전체 상품 조회
	 */
	public List<Product> insert() throws Exception{
			return productDao.insert();
	}
}	