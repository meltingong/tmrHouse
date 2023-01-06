DROP TABLE cart CASCADE CONSTRAINTS;

CREATE TABLE cart(
		c_no                          		NUMBER(10)		 NULL ,
		c_qty                         		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(50)		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		p-img                         		VARCHAR2(100)		 NULL ,
		p_freeDelivery                		CHAR(10)		 DEFAULT 'N'		 NULL 
);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (c_no);