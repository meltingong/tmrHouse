package com.itwill.tmr_house.product.성민모;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itwill.tmr_house.common.DataSource;
import com.itwill.tmr_house.product.성민모.Product;
import com.itwill.tmr_house.product.성민모.ProductSQL;

public class ProductDao {
	private DataSource dataSource;
	public ProductDao() throws Exception {
		dataSource = new DataSource();
	}
	
	/*
	 * insert 상품추가
	 */
	
	public Product insert(String p_name,int p_no,int p_price) throws Exception {
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
		return  product;
	}
	
	/*
	 * 상품pk로삭제
	 */
	
	public Product deleteByProductNo(int p_no) throws Exception {
		Product product = null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_DELETE_BY_PRODUCT_NO);
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
	
	public Product deleteByName(String p_name,int p_no,int p_price) throws Exception {
		Product product = null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_DELETE_BY_NAME);
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
	
	/*
	 * update 상품변경
	 */
	
	public Product updateByProductNo(String p_name,int p_no,int p_price) throws Exception {
		Product product = null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_UPDATE_BY_PRODUCT_NO);
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
}	