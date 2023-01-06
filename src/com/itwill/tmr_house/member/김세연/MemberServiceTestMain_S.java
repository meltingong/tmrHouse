package com.itwill.tmr_house.member.김세연;

public class MemberServiceTestMain_S {

	public static void main(String[] args) throws Exception {
		MemberService_S memberService = new MemberService_S();
		/*
		 * 회원 로그인
		 * 	0 : 아이디 존재안함
		 * 	1 : 패스워드 불일치
		 * 	2 : 로그인 성공
		 */
		System.out.println("login test");
		memberService.login("uuuu", "aaaa");
		memberService.login("aaaa", "bbbb");
		memberService.login("aaaa", "aaaa");

	}
}
