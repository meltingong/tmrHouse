DROP TABLE cart CASCADE CONSTRAINTS;

CREATE TABLE cart(
		c_no                          		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(50)		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		c_qty                         		NUMBER(10)		 NULL ,
		p_img                         		VARCHAR2(50)		 NULL ,
		p_freeDelivery                		VARCHAR2(50)		 NULL 
);



ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (c_no);

