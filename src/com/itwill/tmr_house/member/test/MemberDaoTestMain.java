package com.itwill.tmr_house.member.test;

import com.itwill.tmr_house.member.Member;
import com.itwill.tmr_house.member.MemberDao;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao = new MemberDao();
		System.out.println("회원 탈퇴");
		int rowCount = memberDao.memberDelete("aaaa");
		System.out.println(">> " + rowCount + "행이 삭제되었습니다");
		
		System.out.println("회원가입");
		rowCount = memberDao.memberInsert(new Member());
		System.out.println(">> " + rowCount + "행이 삽입되었습니다");
		
		System.out.println("회원수정");
		
		System.out.println("아이디로 회원정보 찾기");
		
		System.out.println("모든회원 리스트");
	}

}
