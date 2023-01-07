package com.itwill.tmr_house.cart.성민모;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.itwill.tmr_house.cart.성민모.CartSQL;
import com.itwill.tmr_house.common.DataSource;

public class CartDao {
	private DataSource dataSource;
	public CartDao() throws Exception{
		dataSource = new DataSource();
	}
	
	/*
	 * 카트에서 존재하는 상품을 추가(수량 변경)
	 */
	
	public int updateByCartNo(String m_id, int c_qty, int p_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_UPDATE_BY_CART_NO);
		
		pstmt.setInt(1, c_qty);
		pstmt.setString(2, m_id);
		pstmt.setInt(3, p_no);
		
		int updateRowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();
		return updateRowCount;
	}
		
	/*
	 * 카트에 제품 존재하는지 확인(countByProductNo)
	 */
	
	public int countByProductNo(String m_id, int p_no, int c_qty) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_COUNT_BY_PRODUCT_NO);
		
		pstmt.setInt(1, c_qty);
		pstmt.setString(2, m_id);
		pstmt.setInt(3, p_no);
		
		int countRowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();
		return countRowCount;
	}
}	