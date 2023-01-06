package com.itwill.tmr_house.order.박주용;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.tmr_house.common.DataSource;
import com.itwill.tmr_house.order.OrderItem;

public class OrderDao {
	private DataSource dataSource;
	
	public OrderDao() throws Exception{
		dataSource = new DataSource();
	}
	
	/*
	 * 주문생성
	 */
	public int insertOrder(Order order) throws Exception{
		/*
		private int o_no;
		private String o_desc;
		private int o_qty;
		private int o_price;
		private Date o_date;
		private String m_id;
		 */
		
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		try {
			con = dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt1=con.prepareStatement(OrderSQL.ORDER_INSERT);
			pstmt1.setString(1, order.getO_desc());
			pstmt1.setInt(2, order.getO_qty());
			pstmt1.setInt(3, order.getO_price());
			pstmt1.setString(4, order.getM_id());
			pstmt1.executeUpdate();
			
			pstmt2 = con.prepareStatement(OrderSQL.ORDERITEM_INSERT);
			for(OrderItem orderItem : order.getOrderItemList()) {
				pstmt2.setInt(1, orderItem.getOi_qty());
				pstmt2.setInt(2, orderItem.getP_no());
				pstmt2.executeUpdate();
			}
			con.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
			con.rollback();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
	
		return 0;
	}
	
	/*
	 * 주문전체삭제(주문번호)
	 */
	public int deleteByOrderNo(int o_no) throws Exception{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			con = dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(OrderSQL.ORDER_DELETE_BY_O_NO);
			pstmt.setInt(1, o_no);
			rowCount = pstmt.executeUpdate();
			con.commit();
			
		}catch (Exception e) {
			con.rollback();
			e.printStackTrace();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
				
		return rowCount;
	}
	
	/*
	 * 주문전체삭제(회원아이디)
	 */
	public int deleteByMemberId(String m_id) throws Exception{
		Connection con = null;
		PreparedStatement pstmt=null;
		int rowCount = 0;
		try {
			con=dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(OrderSQL.ORDER_DELETE_BY_M_ID);
			pstmt.setString(1, m_id);
			rowCount = pstmt.executeUpdate();
			con.commit();
		}catch (Exception e) {
			con.rollback();
			e.printStackTrace();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
				
		return rowCount;
		
	}
	
	
	
}
