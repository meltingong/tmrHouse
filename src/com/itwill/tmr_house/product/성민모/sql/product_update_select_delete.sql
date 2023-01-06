/************************product************************/
--로그인한 회원의 전체 상품 리스트를 보여주는 메소드
select * from product;

--상품 선택 시 상품의 상세페이지(ui)선택된 상품의 정보를 보여주는 메소드
--아직 상세페이지가 없어서 생략


/************************cart************************/
--회원이 담은 상품들의 정보(상품이미지, 상품명, 금액, 수량)를 보여주는 메소드
select * from cart where m_id = 'xxx';
select * from cart c join product p on c.p_no = p.p_no where m_id='xxx';

--동일 상품의 수량을 증가시키는 메소드
update cart set c_qty = 2 where c_no = 3;

--회원의 장바구니에 담긴 상품을 전체 삭제하는 메소드
delete from cart where m_id = 'xxx';

--회원의 장바구니에 담긴 상품 중 선택된 일부를 삭제하는 메소드
delete from cart where c_no = 4;