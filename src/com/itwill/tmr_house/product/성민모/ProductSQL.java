package com.itwill.tmr_house.product.성민모;

public class ProductSQL {
	public static final String PRODUCT_INSERT = "insert into product(p_no, p_name, p_price, p_img, p_desc, p_freeDelivery) values(product_p_no_SEQ.nextval,?,?,?,?)"; // insert 상품추가
	public static final String PRODUCT_DELETE_BY_PRODUCT_NO = "delete from product where p_no = ?"; // 상품 pk로 삭제
	public static final String PRODUCT_DELETE_BY_NAME = "delete from product where p_name=?";
	public static final String PRODUCT_UPDATE_BY_PRODUCT_NO = "update product set(p_no=?, p_name=?, p_price=?, p_img=?, p_desc=?, p_freeDelivery=? where p_no=?"; // update 상품변경
	
}