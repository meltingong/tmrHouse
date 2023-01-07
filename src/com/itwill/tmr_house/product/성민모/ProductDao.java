package com.itwill.tmr_house.product.성민모;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.tmr_house.common.DataSource;
/*
쇼핑몰에서 상품테이블과의 데이타베이스와의 작업을 전담하는 클래스
PRODUCT 테이블에 제품 검색 등의 작업을한다.
*/
public class ProductDao {
	private DataSource dataSource;
	public ProductDao() throws Exception{
		dataSource=new DataSource();
	}
	/*
	 * selelctByPK:상품 PK로 조회
	 */
	public Product findByPrimaryKey(int p_no) throws Exception{
		Product product=null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_SELECT_BY_NO);
		pstmt.setInt(1, p_no);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			product=
					new Product(
							rs.getInt("p_no"),
							rs.getString("p_name"), 
							rs.getInt("p_price"), 
							rs.getString("p_img"), 
							rs.getString("p_desc"), 
							rs.getString(" p_freeDelivery"));
		}
		return product;
	}
	/*
	 * selectAll : 상품 전체 리스트 조회(관리자)
	 */
	public List<Product> findAll() throws Exception{
		List<Product> productList=new ArrayList<Product>();
		
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Product product=new Product(
					rs.getInt("p_no"),
					rs.getString("p_name"), 
					rs.getInt("p_price"), 
					rs.getString("p_img"), 
					rs.getString("p_desc"), 
					rs.getString(" p_freeDelivery"));
			productList.add(product);
		}
		return productList;		
	}				
}