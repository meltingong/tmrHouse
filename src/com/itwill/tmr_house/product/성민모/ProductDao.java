package com.itwill.tmr_house.product.성민모;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.itwill.tmr_house.common.DataSource;

public class ProductDao {
	private DataSource dataSource;
	public ProductDao() throws Exception {
		dataSource = new DataSource();
	}
	
	/*
	 * insert
	 */

	//상품 번호로 특정 상품 출력
	public Product insert(int p_no) throws Exception {
		Product product = null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_INSERT);
		pstmt.setInt(1, p_no);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			product = new Product(rs.getInt("p_no"),
											rs.getString("p_name"),
											rs.getInt("p_price"),
											rs.getString("p_img"),
											rs.getString("p_desc"),
											rs.getString("p_freeDelivery"));
		}
		return product;
	}
	
	
	//상품 전체 출력
	public ArrayList<Product> insert() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_INSERT);
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<Product> productList = new ArrayList<Product>();
		while(rs.next()) {
			productList.add(new Product(rs.getInt("p_no"),
										rs.getString("p_name"),
										rs.getInt("p_price"),
										rs.getString("p_img"),
										rs.getString("p_desc"),
										rs.getString("p_freeDelivery")));
		}
		return productList;
	}
	
}
