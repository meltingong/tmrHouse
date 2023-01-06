desc cart;
/*
이름             널?       유형           
-------------- -------- ------------ 
C_NO           NOT NULL NUMBER(10)   
M_ID                    VARCHAR2(50) 
P_NO                    NUMBER(10)   
C_QTY                   NUMBER(10)   
P_IMG                   VARCHAR2(100) 
P_FREEDELIVERY          CHAR(10)  
*/

/************************cart insert************************/
--xxx님
insert into cart (c_no, m_id, p_no, c_qty, p_img, p_freedelivery) values (cart_cart_no_SEQ.nextval,'xxx',1,1,null,'N');
insert into cart (c_no, m_id, p_no, c_qty, p_img, p_freedelivery) values (cart_cart_no_SEQ.nextval,'xxx',3,2,null,'Y');

--yyy님
insert into cart (c_no, m_id, p_no, c_qty, p_img, p_freeDelivery) values (cart_cart_no_SEQ.nextval,'yyy',2,1,null,'N');
insert into cart (c_no, m_id, p_no, c_qty, p_img, p_freeDelivery) values _SEQ.nextval,'yyy',4,4,null,'Y');