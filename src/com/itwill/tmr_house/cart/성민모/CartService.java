package com.itwill.tmr_house.cart.성민모;

public class CartService {
	
	private CartDao cartDao;
	public CartService() throws Exception {
		cartDao=new CartDao();
	}
	
	/*
	 * update, count
	 */
	
	//카트에 존재하는 상품을 추가(수량 변경)
	public int updateByCartNo(int c_no) throws Exception {
		return cartDao.updateByCartNo(null, c_no, c_no);		
	}
	
	//카트에 제품 존재하는지 확인
	public int countByProductNo(int c_no) throws Exception {
		return cartDao.countByProductNo(null, c_no, c_no);	

    }
	
}