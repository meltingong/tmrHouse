package com.itwill.tmr_house.product.test;

import java.util.List;

import com.itwill.tmr_house.product.Product;
import com.itwill.tmr_house.product.ProductService;

public class ProductServiceTestMain {

	public static void main(String[] args) throws Exception {
		ProductService productService = new ProductService();
		/*
		 * 상품 주이름으로 상품검색
		 */
		List<Product> psList= productService.searchAll("의자");
		
		for (Product product : psList) {
			System.out.println(product);
		}

	}

}
