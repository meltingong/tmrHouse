package com.itwill.tmr_house.cart.성민모;

public class Cart {
	private int c_no;
	private int c_qty;
	private int p_no;
	private String m_id;
    private String product_product;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Cart [c_no=" + c_no + ", m_id=" + m_id + ", p_no=" + p_no + ", c_qty=" + c_qty + ", product_product="+product_product
				+ "]";
	}
	

	public Cart(int c_no, int c_qty, int p_no, String m_id, String p_img, char p_freeDelivery) {
		super();
		this.c_no = c_no;
		this.c_qty = c_qty;
		this.p_no = p_no;
		this.m_id = m_id;
		this.product_product=product_product;
	
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public int getC_qty() {
		return c_qty;
	}

	public void setC_qty(int c_qty) {
		this.c_qty = c_qty;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getProduct_product() {
		return product_product;
	}
	
	public void setProduct_product(String product_product) {
		this.product_product = product_product;
	}

	public String getUserid() {
		return null;
	}

	public Cart getProduct() {
		return null;
	}

	public int getCart_qty() {
		return 0;
	}

	public int getCart_no() {
		return 0;
	}
}		