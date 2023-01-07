package com.itwill.tmr_house.order.이찬영;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.itwill.tmr_house.common.DataSource;

public class OrderDao {
	
	private DataSource dataSource;
	public OrderDao() throws Exception {
		dataSource=new DataSource();
	}
	//주문실행
	public int insert(Order order) throws Exception{

		Connection con=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		try {
			con=dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt1=con.prepareStatement(OrderSQL.ORDER_INSERT);
			pstmt1.setString(1, order.getO_desc());
			pstmt1.setInt(2, order.getO_price());
			pstmt1.setString(3, order.getM_id());
			pstmt1.executeUpdate();
			
			pstmt2=con.prepareStatement(OrderSQL.ORDERITEM_INSERT);
			for(OrderItem orderItem:order.getOrderItemList()) {
				pstmt2.setInt(1, orderItem.getOi_qty());
				pstmt2.setInt(2, orderItem.getProduct().getP_no());
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
	
	
}
