package com.itwill.tmr_house.order.김하은;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.tmr_house.common.DataSource;
import com.itwill.tmr_house.product.김혜지.Product;

public class OrdersDao {
	private DataSource dataSource;

	public OrdersDao() throws Exception {
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
			pstmt = con.prepareStatement(OrdersSQL.DELETE_BY_MEMBERID);
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
	
	public int deleteByOrderNo(int o_no) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(OrdersSQL.DELETE_BY_ORDER_NO);
			pstmt.setInt(1, o_no);
			rowCount = pstmt.executeUpdate();
			con.commit();
		}catch(Exception e) {
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
	 * 주문 생성
	 */
	
	public int insert(Orders order) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(OrdersSQL.INSERT);
			pstmt.setString(1, order.getO_desc());
			pstmt.setInt(2, order.getO_qty());
			pstmt.setInt(3, order.getO_price());
			pstmt.setString(4, order.getM_id());
			rowCount = pstmt.executeUpdate();
		    con.commit();
		}catch(Exception e) {
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
	 * 주문 전체보기 (특정사용자의)
	 */
	
	public List<Orders> findByMember(String m_id) throws Exception{
		List<Orders> orderList = new ArrayList<Orders>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(OrdersSQL.ORDER_SELECT_BY_MEMBER);
			pstmt.setString(1, m_id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				orderList.add(new Orders(
										rs.getInt("o_no"),
										rs.getString("o_desc"),
										rs.getInt("o_qty"),
										rs.getInt("o_price"),
										rs.getDate("o_date"),
										rs.getString("m_id")
										));
			}
			
		}finally {
			if(con != null) {
				con.close();
			}
		}
		return orderList;
	}
	
	
	/*
	 * 주문 1개 보기
	 */
	public Orders findByOrderNo(String m_id, int o_no) throws Exception {
		Orders findOrder = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = dataSource.getConnection();
		pstmt = con.prepareStatement(OrdersSQL.ORDER_SELECT_WITH_PRODUCT_BY_MEMBER);
		pstmt.setString(1, m_id);
		pstmt.setInt(2, o_no);
		rs = pstmt.executeQuery();
			
			if(rs.next()) {
				findOrder = new Orders(	rs.getInt("o_no"),
										rs.getString("o_desc"),
										rs.getInt("o_qty"),
										rs.getInt("o_price"),
										rs.getDate("o_date"),
										rs.getString("m_id"));
				do {
					findOrder.getOrderItem().add(new OrderItem(	rs.getInt("oi_no"),
																rs.getInt("oi_qty"),
																rs.getInt("o_no"),
																new Product(rs.getInt("p_no"),
																			rs.getString("p_name"),
																			rs.getInt("p_price"),
																			rs.getString("p_img"),
																			rs.getString("p_desc"),
																			rs.getString("p_freedelivery"))
							));
					
					
				}while(rs.next());
			}
		return findOrder;
	}
	
	
	
	
	
}
