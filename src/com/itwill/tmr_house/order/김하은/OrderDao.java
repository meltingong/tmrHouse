package com.itwill.tmr_house.order.김하은;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itwill.tmr_house.common.DataSource;

public class OrderDao {
	private DataSource dataSource;

	public OrderDao() throws Exception {
		dataSource = new DataSource();
	}
	
	/*
	 * 주문 전체삭제
	 */
	
	public int deleteByMemberId(String m_id) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(OrderSQL.DELETE_BY_MEMBERID);
			pstmt.setString(1, m_id);
			rowCount = pstmt.executeUpdate();
			con.commit();
		}catch (Exception e) {
			e.printStackTrace();
			con.rollback();
			throw e;
		}finally {
			if(con != null) {
				con.close();
			}
		}
		return rowCount;
	}
	
	
	/*
	 * 주문 1개 삭제
	 */
	
	/*
	 * 주문 생성
	 */
	
	
	/*
	 * 주문 전체보기 (특정사용자의)
	 */
	
	/*
	 * 주문 1개 보기
	 */
	
	
}
