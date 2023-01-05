/*
이름        널?       유형            
--------- -------- ------------- 
M_ID      NOT NULL VARCHAR2(50)  
M_PW               VARCHAR2(100) 
M_NAME             VARCHAR2(100) 
M_BIRTH            VARCHAR2(100) 
M_PHONE            VARCHAR2(100) 
M_ADDRESS          VARCHAR2(200)
 */

/**********************member update************************/
update member set m_pw = 'abab', m_name '맹구', m_birth = '990101', m_pheon = '1010-1010', m_address ='쌍떡잎마을' where m_id = 'aaaa';

/**********************member delete************************/
delete from member where m_id = 'aaaa';

/**********************member select by pk************************/
select * from member where m_id = 'bbbb';

/**********************member select all************************/
select * from member;
