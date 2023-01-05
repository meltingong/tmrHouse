package com.itwill.tmr_house.member.test;

import com.itwill.tmr_house.member.Member;
import com.itwill.tmr_house.member.MemberDao;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao = new MemberDao();
		int rowCount = memberDao.memberDelete("aaaa");
		System.out.println(">> " + rowCount + "행이 삭제되었습니다");
		
		rowCount = memberDao.memberInsert(new Member());
	}

}
