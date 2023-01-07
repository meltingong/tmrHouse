DROP TABLE order_item CASCADE CONSTRAINTS;
DROP TABLE orders CASCADE CONSTRAINTS;
DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;

CREATE TABLE member(
		m_id                          		VARCHAR2(50)		 NULL ,
		m_pw                          		VARCHAR2(100)		 NULL ,
		m_name                        		VARCHAR2(100)		 NULL ,
		m_birth                       		VARCHAR2(100)		 NULL ,
		m_phone                       		VARCHAR2(100)		 NULL ,
		m_address                     		VARCHAR2(200)		 NULL 
);


CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(100)		 NULL ,
		p_price                       		NUMBER(10)		 NULL ,
		p_img                         		VARCHAR2(100)		 NULL ,
		p_desc                        		VARCHAR2(100)		 NULL ,
		p_freeDelivery                		VARCHAR2(10)		 NULL 
);

DROP SEQUENCE product_p_no_SEQ;

CREATE SEQUENCE product_p_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER product_p_no_TRG
BEFORE INSERT ON product
FOR EACH ROW
BEGIN
IF :NEW.p_no IS NOT NULL THEN
  SELECT product_p_no_SEQ.NEXTVAL INTO :NEW.p_no FROM DUAL;
END IF;
END;


CREATE TABLE cart(
		c_no                          		NUMBER(10)		 NULL ,
		c_qty                         		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(50)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

DROP SEQUENCE cart_c_no_SEQ;

CREATE SEQUENCE cart_c_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER cart_c_no_TRG
BEFORE INSERT ON cart
FOR EACH ROW
BEGIN
IF :NEW.c_no IS NOT NULL THEN
  SELECT cart_c_no_SEQ.NEXTVAL INTO :NEW.c_no FROM DUAL;
END IF;
END;


CREATE TABLE orders(
		o_no                          		NUMBER(10)		 NULL ,
		o_desc                        		VARCHAR2(100)		 NULL ,
		o_qty                         		NUMBER(10)		 NULL ,
		o_price                       		NUMBER(10)		 NULL ,
		o_date                        		DATE		 DEFAULT sysdate		 NULL ,
		m_id                          		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE orders_o_no_SEQ;

CREATE SEQUENCE orders_o_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER orders_o_no_TRG
BEFORE INSERT ON orders
FOR EACH ROW
BEGIN
IF :NEW.o_no IS NOT NULL THEN
  SELECT orders_o_no_SEQ.NEXTVAL INTO :NEW.o_no FROM DUAL;
END IF;
END;


CREATE TABLE order_item(
		oi_no                         		NUMBER(10)		 NULL ,
		oi_qty                        		NUMBER(10)		 NULL ,
		o_no                          		NUMBER(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

DROP SEQUENCE order_item_oi_no_SEQ;

CREATE SEQUENCE order_item_oi_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TRIGGER order_item_oi_no_TRG
BEFORE INSERT ON order_item
FOR EACH ROW
BEGIN
IF :NEW.oi_no IS NOT NULL THEN
  SELECT order_item_oi_no_SEQ.NEXTVAL INTO :NEW.oi_no FROM DUAL;
END IF;
END;



ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (m_id);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (c_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);

ALTER TABLE orders ADD CONSTRAINT IDX_orders_PK PRIMARY KEY (o_no);
ALTER TABLE orders ADD CONSTRAINT IDX_orders_FK0 FOREIGN KEY (m_id) REFERENCES member (m_id);

ALTER TABLE order_item ADD CONSTRAINT IDX_order_item_PK PRIMARY KEY (oi_no);
ALTER TABLE order_item ADD CONSTRAINT IDX_order_item_FK0 FOREIGN KEY (o_no) REFERENCES orders (o_no);
ALTER TABLE order_item ADD CONSTRAINT IDX_order_item_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);

