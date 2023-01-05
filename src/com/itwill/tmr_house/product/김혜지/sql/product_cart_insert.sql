desc product;

/*
이름             널?       유형            
-------------- -------- ------------- 
P_NO           NOT NULL NUMBER(10)    
P_NAME                  VARCHAR2(50)  
P_PRICE                 NUMBER(10)    
P_IMG                   VARCHAR2(50)  
P_DESC                  VARCHAR2(512) 
P_FREEDELIVERY NOT NULL CHAR(10) 
*/

/************************product insert************************/

insert into product values (1, '스틸 원형 테이블', 120000, null, '미드센추리 모던 테이블', 'N');
insert into product values (2, '원목 사각 테이블', 90000, null, '내추럴한 원목 테이블', 'N');
insert into product values (3, '스틸 원목 의자', 110000, null, '미드센추리 모던 감성의 미니멀한 의자', 'Y');
insert into product values (4, '라탄 원목 의자', 50000, null, '고무나무 원목과 라탄이 조화로운 의자', 'Y');


desc cart;
/*
이름             널?       유형           
-------------- -------- ------------ 
C_NO           NOT NULL NUMBER(10)   
M_ID                    VARCHAR2(50) 
P_NO                    NUMBER(10)   
C_QTY                   NUMBER(10)   
P_IMG                   VARCHAR2(50) 
P_FREEDELIVERY          CHAR(10)  
*/

/************************cart insert************************/
--aaaa님
insert into cart (c_no, m_id, p_no, c_qty, p_img, p_freedelivery) values (cart_cart_no_SEQ.nextval,'aaaa',1,1,null,'N');
insert into cart (c_no, m_id, p_no, c_qty, p_img, p_freedelivery) values (cart_cart_no_SEQ.nextval,'aaaa',3,2,null,'Y');

--bbbb님
insert into cart (c_no, m_id, p_no, c_qty, p_img, p_freeDelivery) values (cart_cart_no_SEQ.nextval,'bbbb',2,1,null,'N');
insert into cart (c_no, m_id, p_no, c_qty, p_img, p_freeDelivery) values (cart_cart_no_SEQ.nextval,'bbbb',4,4,null,'Y');