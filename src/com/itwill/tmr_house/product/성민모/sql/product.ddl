DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;

CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(100)		 NULL ,
		p_price                       		NUMBER(10)		 NULL ,
		p_img                         		VARCHAR2(100)		 NULL ,
		p_desc                        		VARCHAR2(100)		 NULL ,
		p_freeDelivery                		CHAR(10)		 DEFAULT 'N'		 NULL 
);

CREATE TABLE cart(
		c_no                          		NUMBER(10)		 NULL ,
		c_qty                         		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(50)		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		p_img                         		VARCHAR2(100)		 NULL ,
		p_freeDelivery                		CHAR(10)		 DEFAULT 'N'		 NULL 
);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (c_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (p_no) REFERENCES product (p_no);