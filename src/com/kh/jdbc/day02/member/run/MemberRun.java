package com.kh.jdbc.day02.member.run;

import java.util.List;

import com.kh.jdbc.day02.member.controller.MemberController;
import com.kh.jdbc.day02.member.model.vo.Member;
import com.kh.jdbc.day02.member.view.MemberView;

public class MemberRun {
	public static void main(String []args) {
		MemberView mView = new MemberView();
		MemberController mCon = new MemberController();
		Member member = null;
		int result = 0;
		String memberId = "";
		List<Member> mList = null;
		
		goodbye : 
		while(true) {
			int choice = mView.mainMenu();
			switch(choice) {
			case 0 : break goodbye;
			case 1 : 
				mList= mCon.printAll();
				mView.showAll(mList);
				break;
			case 2 :
				mList=mCon.printAll();
				mView.searchId(mList);
				break;
			case 3 :
				
				break;
			case 4 :
				member=mView.inputMember();
				result = mCon.registerMember(member);
				if(result > 0) {
					mView.displaySyccess("회원 가입 성공");
				}else {
					mView.displayError("회원 가입이 되지 않았습니다.");
				}
				
				break;
			case 5 :
				
				break;
			case 6 :
				// 회원 삭제
				memberId = mView.inputMemberId("삭제");
				result =mCon.removeMember(memberId);
				if(result>0) {
					mView.displaySyccess("회원 탈퇴 성공^^");
				}else {
					mView.displayError("회원 탈퇴가 완료되지 않았습니다.");
				}
				break;
			default :
				System.out.println("잘못된 값을 입력하였습니다");
				break;
			
			}
		}
	}

}
