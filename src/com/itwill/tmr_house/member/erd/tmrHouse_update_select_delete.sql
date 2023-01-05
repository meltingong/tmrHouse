-- m_id, m_pw, m_name, m_birth, m_phone, m_address
/**********************member update************************/
update member set m_pw = 'abab', m_name '맹구', m_birth = '', m_pheon = '', m_address = '' where m_id = 'aaaa';

/**********************member delete************************/
delete from member;

/**********************member select by pk************************/
select * from member where m_id = 'aaaa';

/**********************member select all************************/
select * from member;
