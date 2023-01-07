/**********************member insert************************/
insert into member(m_id, m_pw, m_name, m_birth, m_phone, m_address) values('aaaa','aaaa','철수','920630','1234-5698','떡잎마을');
insert into member(m_id, m_pw, m_name, m_birth, m_phone, m_address) values('bbbb','bbbb','유리','920731','4568-8547','떡잎마을');
insert into member(m_id, m_pw, m_name, m_birth, m_phone, m_address) values('cccc','dddd','짱구','921225','9512-7584','떡잎마을');

/*********************product insert*************************/
insert into product values (product_p_no_SEQ.nextval, '스틸 원형 테이블', 120000, null, '미드센추리 모던 테이블', 'N');
insert into product values (product_p_no_SEQ.nextval, '원목 사각 테이블', 90000, null, '내추럴한 원목 테이블', 'N');
insert into product values (product_p_no_SEQ.nextval, '스틸 원목 의자', 110000, null, '미드센추리 모던 감성의 미니멀한 의자', 'Y');
insert into product values (product_p_no_SEQ.nextval, '라탄 원목 의자', 50000, null, '고무나무 원목과 라탄이 조화로운 의자', 'Y');

/*********************cart insert**********************/
--aaaa
insert into cart(c_no, c_qty, m_id, p_no) values(cart_c_no_SEQ.nextval,1,'aaaa',1);
insert into cart(c_no, c_qty, m_id, p_no) values(cart_c_no_SEQ.nextval,1,'aaaa',2);

--bbbb
insert into cart(c_no, c_qty, m_id, p_no) values(cart_c_no_SEQ.nextval,2,'bbbb',3);
insert into cart(c_no, c_qty, m_id, p_no) values(cart_c_no_SEQ.nextval,1,'bbbb',1);

/*********************orders insert*********************/
/*
aaaa님이
    제품번호 1번 1개
    제품번호 3번 1개
*/
-- orders insert
insert into orders(o_no, o_desc, o_qty, o_price, o_date,m_id) values(orders_o_no_SEQ.nextval,'스틸 원형 테이블 외 1건',1,120000,sysdate,'aaaa');

-- order item insert
-- 제품번호 1번 1개 
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,1);

-- 제품번호 3번 1개
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,3);

/*
bbbb님이
    제품번호 2번 1개
    제품번호 3번 2개
    제품번호 4번 1개
*/
-- orders insert
insert into orders(o_no, o_desc, o_qty, o_price, o_date,m_id) values(orders_o_no_SEQ.nextval,'원목 사각테이블 외 1건',1,120000,sysdate,'bbbb');

-- order item insert
-- 제품번호 2번 1개
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,2);

-- 제품번호 3번 2개
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval,2,orders_o_no_SEQ.currval,3);

--제품번호 4번 1개
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,4);

commit;



