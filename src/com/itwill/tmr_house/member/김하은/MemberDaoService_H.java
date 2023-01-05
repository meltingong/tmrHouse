package com.itwill.tmr_house.member.김하은;

import com.itwill.tmr_house.member.MemberDao;

public class MemberDaoService_H {
	private MemberDao memberDao;
	
	public MemberDaoService_H() throws Exception {
		memberDao = new MemberDao();
	}
	/*
	 * 회원가입 아이디가 중복되는 경우 메시지
		 * 아이디 존재여부 체크
		 * 	- 아이디 존재하면 메시지
		 *  - 아이디 존재하지 않으면 가입성공
		 */
	
	/*
	 * 옵션
	 * 아이디 존재여부 체크
	 * 	- 아이디(소문자+숫자 & 4~10자 이내)조합으로 되어있는 아이디인지
	 * 		> 맞다면 아이디 존재하는지 체크
	 * 			> 아이디가 존재하면 메시지 / 존재하지 않으면 가입성공
	 * - 아이디(소문자+숫자 & 4~10자 이내)) 조합으로 되어있지 않다면 
	 * 	 올바른 아이디 형태가 아닙니다 메시지 
	 */
	
	
	/*
	 * 회원 로그인
	 * 	0 : 아이디 존재안함
	 * 	1 : 패스워드 불일치
	 * 	2 : 로그인 성공
	 */
	
	
	
}
