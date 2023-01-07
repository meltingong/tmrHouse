package com.itwill.tmr_house.cart.성민모;

import java.util.List;
public class CartService {
	private CartDao cartDao;
	public CartService() throws Exception {
		cartDao=new CartDao();
	}
	
	/*
	 * cart추가 or 수정
	 */
	public int addCart(String sUserId,int p_no,int cart_qty)throws Exception {
		if(cartDao.countByProductNo(sUserId, p_no) > 0) {
			return cartDao.updateByProductNo(sUserId, p_no, cart_qty);
		}else {
			return cartDao.insert(sUserId, p_no, cart_qty);
		}
	}
	public int addCart(Cart cart)throws Exception {
		if(cartDao.countByProductNo(cart.getUserid(),cart.getProduct().getP_no()) > 0) {
			return cartDao.updateByProductNo(cart);
		}else {
			return cartDao.insert(cart);
		}
	}
	/*
	 *cart수량변경수정
	 */
	public int updateCart(int cart_no,int cart_qty)throws Exception {
		return cartDao.updateByCartNo(cart_no, cart_qty);
	}
	public int updateCart(Cart cart)throws Exception {
		return cartDao.updateByCartNo(cart);
	}
}	