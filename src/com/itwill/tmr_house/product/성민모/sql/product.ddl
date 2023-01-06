DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE cart CASCADE CONSTRAINTS;

CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL 		 PRIMARY KEY,
		p_name                        		VARCHAR2(100)		 NULL ,
		p_price                       		NUMBER(10)		 NULL ,
		p_img                         		VARCHAR2(100)		 NULL ,
		p_desc                        		VARCHAR2(100)		 NULL ,
		p_freeDelivery                		CHAR(10)		 DEFAULT 'N'		 NULL 
);

COMMENT ON TABLE product is 'product';
COMMENT ON COLUMN product.p_no is 'p_no';
COMMENT ON COLUMN product.p_name is 'p_name';
COMMENT ON COLUMN product.p_price is 'p_price';
COMMENT ON COLUMN product.p_img is 'p_img';
COMMENT ON COLUMN product.p_desc is 'p_desc';
COMMENT ON COLUMN product.p_freeDelivery is 'p_freeDelivery';

CREATE TABLE cart(
		c_no                          		NUMBER(10)		 NULL 		 PRIMARY KEY,
		c_qty                         		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(50)		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		p_img                         		VARCHAR2(100)		 NULL ,
		p_freeDelivery                		CHAR(10)		 DEFAULT 'N'		 NULL ,
  FOREIGN KEY (p_no) REFERENCES product (p_no)
);

COMMENT ON TABLE cart is 'cart';
COMMENT ON COLUMN cart.c_no is 'c_no';
COMMENT ON COLUMN cart.c_qty is 'c_qty';
COMMENT ON COLUMN cart.m_id is 'm_id';
COMMENT ON COLUMN cart.p_no is 'p_no';
COMMENT ON COLUMN cart.p_img is 'p_img';
COMMENT ON COLUMN cart.p_freeDelivery is 'p_freeDelivery';


