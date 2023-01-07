package com.itwill.tmr_house.product.성민모;

import java.util.List;

public class ProductService {
	private ProductDao productDao;
	public ProductService() throws Exception{
		productDao=new ProductDao();
	}
	
	/*
	 * insert, update, delete
	 */
	
	//insert 상품추가
	public Product insert(int p_no) throws Exception{
		return productDao.insert(p_no);
	}
	
	//상품 pk로삭제
	public Product deleteByProductNo(int p_no)throws Exception{
	    return productDao.deleteByProductNo(p_no);
	}
	
	//update 상품변경
	public Product updateByProductNo(int p_no)throws Exception{
	    return productDao.updateByProductNo(p_no);
	}
	
}